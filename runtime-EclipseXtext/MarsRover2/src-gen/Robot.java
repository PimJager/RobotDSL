import java.io.DataInputStream;

import lejos.hardware.Sound;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;
import lejos.robotics.SampleProvider;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
import lejos.robotics.Color;

public class Robot {

	public static EV3LargeRegulatedMotor leftMotor 	= new EV3LargeRegulatedMotor(MotorPort.A);
    public static EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.B);
    public static EV3MediumRegulatedMotor mesMotor 	= new EV3MediumRegulatedMotor(MotorPort.C); 
    
    public static NXTLightSensor leftLightSensor 	= new NXTLightSensor(LocalEV3.get().getPort("S1"));
    public static NXTLightSensor rightLightSensor 	= new NXTLightSensor(LocalEV3.get().getPort("S2"));
    public static EV3UltrasonicSensor rearUSSensor 	= new EV3UltrasonicSensor(LocalEV3.get().getPort("S3"));
    public static EV3GyroSensor gyroSensor			= new EV3GyroSensor(LocalEV3.get().getPort("S4"));
    
    //local sensor providers and samples
    static SampleProvider llsProvider  				= Robot.leftLightSensor.getRedMode();
	static float[] leftLightSamples 				= new float[llsProvider.sampleSize()];
	static SampleProvider rlsProvider  				= Robot.rightLightSensor.getRedMode();
	static float[] rightLightSamples 				= new float[rlsProvider.sampleSize()];
	static SampleProvider rearUSProvider 		 	= Robot.rearUSSensor.getDistanceMode();
	static float[] rearUSSamples 					= new float[rearUSProvider.sampleSize()];
	static SampleProvider gyroProvider 				= Robot.gyroSensor.getAngleAndRateMode();
	static float[] gyroSamples 						= new float[gyroProvider.sampleSize()];
	//remote sensor values
    static int frontUSSample;
    static int touchLeftSample;
    static int touchRightSample;
    static int colorSample;
    static int leftLightSample;
    static int rightLightSample;
    static int rearUSSample;
    static int gyroSample;

	//bluetooth
	public static NXTConnection connection;
	private static DataInputStream btIn;
	private static SensorValues vals = new SensorValues();
	private static Object valsLock = new Object();
	
	public static String currentBehaviour = "Setup";

	//CONSTANTS
    //generated from constant list
    public static int OUTSIDE_LINE_TRESHOLD = (47);
    public static int LAKE_LINE_TRESHOLD = (40);
    public static int BLOCK_TRESHOLD = (23);
    public static int CLIFF_TRESHOLD = (5);
    public static int ROTATE_SPEED = (100);
    public static int ROTATE_ACC = (6000);
    public static int DEFAULT_SPEED = (300);
    public static int DEFAULT_ACC = (800);
    
    //GLOBALS
    //To implement quit
    public static int _running = 1;
    //generated from globals list
    public static int searchingForCorner;
    public static int doingSafety;
    public static int foundRed;
    public static int foundBlue;
    public static int foundGreen;
    
    	    
    public static void main(String[] args) {
		init();
		
		Behavior[] bList = {
								new DriveForward(),
																	new DetectLakeLineLeft(),
																	new FollowLine2(),
																	new FollowLine1(),
																	new DetectOutsideLineColor(),
																	new DetectLakeLineRight(),
																	new DetectLakeColor(),
																	new AvoidBlock(),
																	new DetectCliff(),
																	new DetectOutsideLine(),
																	new MeasureBlueLake(),
																	new MeasureRedLake(),
																	new MeasureGreenLake()
									,new DefaultQuitBehaviour() 
							};
		Arbitrator ar = new Arbitrator(bList);
		ar.start();
	}
	
	public static void updateSensors(){
		llsProvider.fetchSample(leftLightSamples, 0);
    	rlsProvider.fetchSample(rightLightSamples, 0);
    	rearUSProvider.fetchSample(rearUSSamples, 0);
    	gyroProvider.fetchSample(gyroSamples, 0);
    	leftLightSample = (int) (leftLightSamples[0] * 100);
    	rightLightSample = (int) (rightLightSamples[0] * 100);
    	rearUSSample = (int) (rearUSSamples[0] * 100);
    	gyroSample = (int) gyroSamples[0];
	}
	
	public static void init(){
    	btSetup();
    	gyroSensor.reset();
    	mesMotor.setSpeed(100);
    	listener.start();
    	updateLCD.start();
	}
	
    public static void btSetup(){
    	LCD.drawString("Connecting to brick2", 0, 8);
    	
    	BTConnector connector = new BTConnector();
    	connection = connector.waitForConnection(10000, NXTConnection.RAW);
    	
    	LCD.clear();
    	if(connection == null) {
    		LCD.drawString("CONNECTION CANCELLED!!!", 0, 8);
    		Sound.buzz();
    		while(true) {}
    	} else {
    		btIn = connection.openDataInputStream();
    		Sound.beep();
    	}
    }
	
	public static int normalise(int i){
		return i;
	}
	public static int normalise(boolean b){
		if(b) return 1;
		else return 0;
	}
	public static boolean makeBool(int i){
		return i > 0;
	}
	public static boolean makeBool(boolean b){
		return b;
	}
	
    static Thread updateLCD = new Thread(new Runnable() {
		@Override
		public void run() {
			while(true) {
				updateSensors();				
				LCD.clear();	
				LCD.drawString("LeftL: " + leftLightSample, 0, 0);
				LCD.drawString("RightL: " + rightLightSample, 0, 1);
				LCD.drawString("RearUs: " + rearUSSample, 0, 2);
				LCD.drawString("Gyro: " + gyroSample, 0, 3);
				LCD.drawString("Touch L:"+touchLeftSample+" R:"+touchRightSample, 0, 4);
				LCD.drawString("FrontUS: " + frontUSSample, 0, 5);
				LCD.drawString("color:" + colorSample, 0, 6);
				LCD.drawString("" + Robot.normalise(_running), 0, 7);	
				LCD.drawString(currentBehaviour, 1, 7);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) { }
			}
		}	
	});
	
	static Thread listener = new Thread(new Runnable() {
		@Override
		public void run() {
			while(true) {
				byte[] buffer = new byte[256]; //allows for 128char strings
				int i = 0;
				byte b;
				try{
					while ((b = btIn.readByte()) != '\n') {
						buffer[i] = b;
						i++;
					}
					String rec = new String(buffer);
					synchronized (valsLock) {
						vals = SensorValues.fromString(rec);
						if(vals == null) Sound.buzz();
						else {
							frontUSSample = (int) (vals.frontUS * 100);
							touchLeftSample = vals.touchLeft > 0.9 ? 1 : 0;
							touchRightSample = vals.touchRight > 0.9 ? 1 : 0;
							colorSample = (int) vals.color;	
						}
					}
				} catch(Exception e) {
					e.printStackTrace();
					while(true) {}
				}
			}
		}	
	});
	
	//measurement function
	public static void measure(){
		mesMotor.backward();
		while(!mesMotor.isStalled()) {} //wait for arm to touch something
		mesMotor.forward();
		while(!mesMotor.isStalled()) {} //wait for arm to go all the way back up
		mesMotor.stop();
	}
	
	//Generated list of subroutines
	public static void turnRight(){
		Robot.rightMotor.rotate((-130),true);
		
		Robot.leftMotor.rotate((130),false);
	}
	public static void backup(){
		Robot.leftMotor.rotate((-100),true);
		
		Robot.rightMotor.rotate((-100),false);
	}
	public static void frontup(){
		Robot.leftMotor.rotate((100),true);
		
		Robot.rightMotor.rotate((100),false);
	}
	public static void beforeRatate(){
		Robot.leftMotor.setAcceleration((Robot.ROTATE_ACC));
		Robot.rightMotor.setAcceleration((Robot.ROTATE_ACC));
		
		Robot.leftMotor.stop(true);
		Robot.rightMotor.stop();
		
		Robot.leftMotor.setSpeed((Robot.ROTATE_SPEED));
		Robot.rightMotor.setSpeed((Robot.ROTATE_SPEED));
	}
	public static void setDefaults(){
		Robot.leftMotor.setSpeed((Robot.DEFAULT_SPEED));
		Robot.rightMotor.setSpeed((Robot.DEFAULT_SPEED));
		
		Robot.leftMotor.setAcceleration((Robot.DEFAULT_ACC));
		Robot.rightMotor.setAcceleration((Robot.DEFAULT_ACC));
	}
}
	
class DefaultQuitBehaviour implements Behavior {
	
	private boolean beeped = false;
	
	@Override
	public boolean takeControl() {
		return Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.rightLightSample > (Robot.OUTSIDE_LINE_TRESHOLD))) && Robot.makeBool((Robot.searchingForCorner))));
	}
	@Override
	public void action() {
		Robot._running = 0;
		if(!beeped) {
			Sound.beep();
			Sound.beep();
			Sound.beep();
		} 
		beeped = true;
	}
	@Override
	public void suppress() {}
}

//Generated behaviours
class DriveForward implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(!Robot.makeBool((Robot.searchingForCorner)))) && Robot.makeBool(Robot.normalise(!Robot.makeBool((Robot.doingSafety))))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "DriveForward";
		// supressioncontext = true
		if(_supressed) return; 
		Robot.setDefaults();
		
		if(_supressed) return; 
		Robot.leftMotor.forward();
		Robot.rightMotor.forward();
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class DetectLakeLineLeft implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.leftLightSample > (Robot.LAKE_LINE_TRESHOLD)));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "DetectLakeLineLeft";
		// supressioncontext = true
		Robot.doingSafety = 1;
		Robot.searchingForCorner = 0;
		if(_supressed) return; 
		Robot.beforeRatate();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.turnRight();
		
		Robot.doingSafety = 0;
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class DetectLakeLineRight implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.rightLightSample > (Robot.LAKE_LINE_TRESHOLD)));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "DetectLakeLineRight";
		// supressioncontext = true
		Robot.doingSafety = 1;
		Robot.searchingForCorner = 0;
		if(_supressed) return; 
		Robot.beforeRatate();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.turnRight();
		
		Robot.doingSafety = 0;
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class DetectLakeColor implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.colorSample == Color.BLUE)) || Robot.makeBool(Robot.normalise(Robot.colorSample == Color.RED)))) || Robot.makeBool(Robot.normalise(Robot.colorSample == Color.GREEN))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "DetectLakeColor";
		// supressioncontext = true
		Robot.doingSafety = 1;
		Robot.searchingForCorner = 0;
		if(_supressed) return; 
		Robot.beforeRatate();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.turnRight();
		
		Robot.doingSafety = 0;
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class DetectCliff implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.rearUSSample > (Robot.CLIFF_TRESHOLD)));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "DetectCliff";
		// supressioncontext = true
		Robot.doingSafety = 1;
		Robot.searchingForCorner = 0;
		if(_supressed) return; 
		Robot.beforeRatate();
		
		if(_supressed) return; 
		Robot.frontup();
		
		if(_supressed) return; 
		Robot.frontup();
		
		if(_supressed) return; 
		Robot.turnRight();
		
		Robot.doingSafety = 0;
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class AvoidBlock implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.frontUSSample < (Robot.BLOCK_TRESHOLD))) || Robot.makeBool(Robot.touchLeftSample))) || Robot.makeBool(Robot.touchRightSample)));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "AvoidBlock";
		// supressioncontext = true
		Robot.doingSafety = 1;
		Robot.searchingForCorner = 0;
		if(_supressed) return; 
		Robot.beforeRatate();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.turnRight();
		
		Robot.doingSafety = 0;
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class DetectOutsideLine implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.leftLightSample > (Robot.OUTSIDE_LINE_TRESHOLD))) && Robot.makeBool(Robot.normalise(!Robot.makeBool((Robot.searchingForCorner))))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "DetectOutsideLine";
		// supressioncontext = true
		if(_supressed) return; 
		Robot.beforeRatate();
		
		if(Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.makeBool((Robot.foundRed)) && Robot.makeBool((Robot.foundGreen)))) && Robot.makeBool((Robot.foundBlue))))){
			System.out.println("Detected line");
			
			Robot.searchingForCorner = 1;
		} else {
			Robot.doingSafety = 1;
			if(_supressed) return; 
			Robot.beforeRatate();
			
			if(_supressed) return; 
			Robot.backup();
			
			if(_supressed) return; 
			Robot.backup();
			
			if(_supressed) return; 
			Robot.backup();
			
			if(_supressed) return; 
			Robot.turnRight();
			
			Robot.doingSafety = 0;
		}
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class MeasureBlueLake implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.colorSample == Color.BLUE)) && Robot.makeBool(Robot.normalise(!Robot.makeBool((Robot.foundBlue))))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "MeasureBlueLake";
		// supressioncontext = true
		if(_supressed) return; 
		Robot.beforeRatate();
		
		if(_supressed) return; 
		Robot.measure();
		
		System.out.println("Blue lake found!");
		
		if(_supressed) return; 
		Sound.beep();
		
		Robot.foundBlue = 1;
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.turnRight();
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class MeasureRedLake implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.colorSample == Color.RED)) && Robot.makeBool(Robot.normalise(!Robot.makeBool((Robot.foundRed))))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "MeasureRedLake";
		// supressioncontext = true
		if(_supressed) return; 
		Robot.beforeRatate();
		
		if(_supressed) return; 
		Robot.measure();
		
		System.out.println("Red lake found!");
		
		if(_supressed) return; 
		Sound.beep();
		
		Robot.foundRed = 1;
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.turnRight();
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class MeasureGreenLake implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.colorSample == Color.GREEN)) && Robot.makeBool(Robot.normalise(!Robot.makeBool((Robot.foundGreen))))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "MeasureGreenLake";
		// supressioncontext = true
		if(_supressed) return; 
		Robot.beforeRatate();
		
		if(_supressed) return; 
		Robot.measure();
		
		System.out.println("Green lake found!");
		
		if(_supressed) return; 
		Sound.beep();
		
		Robot.foundGreen = 1;
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.turnRight();
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class DetectOutsideLineColor implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(!Robot.makeBool((Robot.normalise(Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.colorSample == Color.BLACK)) || Robot.makeBool(Robot.normalise(Robot.colorSample == Color.RED)))) || Robot.makeBool(Robot.normalise(Robot.colorSample == Color.BLUE)))) || Robot.makeBool(Robot.normalise(Robot.colorSample == Color.GREEN))))))) && Robot.makeBool((Robot.searchingForCorner))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "DetectOutsideLineColor";
		// supressioncontext = true
		Robot.doingSafety = 1;
		Robot.searchingForCorner = 0;
		if(_supressed) return; 
		Robot.beforeRatate();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.backup();
		
		if(_supressed) return; 
		Robot.turnRight();
		
		Robot.doingSafety = 0;
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class FollowLine1 implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.leftLightSample > (Robot.OUTSIDE_LINE_TRESHOLD))) && Robot.makeBool((Robot.searchingForCorner))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "FollowLine1";
		// supressioncontext = true
		if(_supressed) return; 
		Robot.leftMotor.rotate((10),true);
		
		if(_supressed) return; 
		Robot.leftMotor.flt(true);
		
		if(_supressed) return; 
		Robot.rightMotor.rotate((-30),false);
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
class FollowLine2 implements Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensors();
		return 	Robot.makeBool(Robot._running) &&
				Robot.makeBool((Robot.searchingForCorner));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "FollowLine2";
		// supressioncontext = true
		if(_supressed) return; 
		Robot.leftMotor.rotate((50),true);
		
		if(_supressed) return; 
		Robot.rightMotor.rotate((50),false);
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}

class SensorValues {

	float touchLeft;
	float touchRight;
	float frontUS;
	float color;
	
	static SensorValues fromString(String s){
		String[] parts = s.split(";");
		if(parts.length < 4) return null;
		SensorValues ret = new SensorValues();
		ret.touchLeft = Float.parseFloat(parts[0]);
		ret.touchRight = Float.parseFloat(parts[1]);
		ret.frontUS = Float.parseFloat(parts[2]);
		ret.color = Float.parseFloat(parts[3]);
		return ret;
	}
	
	static String toString(SensorValues s){
		int touchL = s.touchLeft > 0.9 ? 1 : 0;
		int touchR = s.touchRight > 0.9 ? 1 : 0;
		return ""+touchL+";"+touchR+";"+Float.toString(s.frontUS)+";"+Float.toString(s.color);
	}
	
}

