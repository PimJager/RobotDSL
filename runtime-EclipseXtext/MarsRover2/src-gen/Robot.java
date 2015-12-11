import java.io.DataInputStream;

import lejos.hardware.Sound;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;
import lejos.robotics.SampleProvider;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Robot {

	public static EV3LargeRegulatedMotor leftMotor 	= new EV3LargeRegulatedMotor(MotorPort.A);
    public static EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.B);
    public static EV3LargeRegulatedMotor mesMotor 	= new EV3LargeRegulatedMotor(MotorPort.C);
    
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
    public static int LINE_TRESHOLD = (50);
    public static int ROTATE_SPEED = (100);
    public static int ROTATE_ACC = (6000);
    public static int DEFAULT_SPEED = (300);
    public static int DEFAULT_ACC = (800);
    
    //GLOBALS
    //To implement quit
    public static int _running = 1;
    //generated from globals list
    
    	    
    public static void main(String[] args) {
		init();
		
		Behavior[] bList = {
								new DriveForward(),
																	new DetectOutsideLine()
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
    	rightLightSample = (int) (leftLightSamples[0] * 100);
    	rearUSSample = (int) (rearUSSamples[0] * 100);
    	gyroSample = (int) gyroSamples[0];
    	synchronized (valsLock) {
			frontUSSample = (int) (vals.frontUS * 100);
			touchLeftSample = vals.touchLeft > 0.9 ? 1 : 0;
			touchRightSample = vals.touchRight > 0.9 ? 1 : 0;
			colorSample = (int) vals.color;
		}
	}
	
	public static void init(){
    	btSetup();
    	gyroSensor.reset();
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
				LCD.drawString("LeftL: " + leftLightSample, 0, 0);
				LCD.drawString("RightL: " + rightLightSample, 0, 1);
				LCD.drawString("RearUs: " + rearUSSample, 0, 2);
				LCD.drawString("Gyro: " + gyroSample, 0, 3);
				LCD.drawString("Touch L:"+touchLeftSample+" R:"+touchRightSample, 0, 4);
				LCD.drawString("FrontUS: " + frontUSSample, 0, 5);
				LCD.drawString("color:" + colorSample, 0, 6);
				LCD.drawString("" + Robot.normalise(_running), 0, 7);	
				LCD.drawString(currentBehaviour, 1, 7);
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
					}
				} catch(Exception e) {
					e.printStackTrace();
					while(true) {}
				}
			}
		}	
	});
	
	//Generated list of subroutines
	public static void beforeRatate(){
		Robot.leftMotor.setAcceleration((Robot.ROTATE_ACC));
		Robot.rightMotor.setAcceleration((Robot.ROTATE_ACC));
		
		Robot.leftMotor.stop();
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
	@Override
	public boolean takeControl() {
		return Robot.makeBool(0);
	}
	@Override
	public void action() {
		Robot._running = 0;
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
				Robot.makeBool(1);
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "DriveForward";
		// supressioncontext = true
		Robot.setDefaults();
		
		if(_supressed) return; 
		Robot.leftMotor.forward();
		Robot.rightMotor.forward();
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
				Robot.makeBool(Robot.normalise(Robot.makeBool(Robot.normalise(Robot.leftLightSample > (Robot.LINE_TRESHOLD))) || Robot.makeBool(Robot.normalise(Robot.rightLightSample > (Robot.LINE_TRESHOLD)))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensors();
		Robot.currentBehaviour = "DetectOutsideLine";
		// supressioncontext = true
		Robot.beforeRatate();
		
		if(Robot.makeBool(Robot.normalise(Robot.leftLightSample > (Robot.LINE_TRESHOLD)))){
			if(_supressed) return; 
			Robot.leftMotor.rotate((-300),true);
			
			if(_supressed) return; 
			Robot.rightMotor.rotate((-130),false);
		} else {
		}
		if(Robot.makeBool(Robot.normalise(Robot.rightLightSample > (Robot.LINE_TRESHOLD)))){
			if(_supressed) return; 
			Robot.leftMotor.rotate((-300),true);
			
			if(_supressed) return; 
			Robot.rightMotor.rotate((-130),false);
		} else {
		}
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

