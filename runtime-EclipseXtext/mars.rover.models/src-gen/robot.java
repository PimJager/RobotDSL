import lejos.hardware.ev3.LocalEV3;
import lejos.utility.Delay;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.robotics.SampleProvider;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Robot {

	public static EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.A);
    public static EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.D);
    
    public static EV3TouchSensor touchLeftSensor = new EV3TouchSensor(LocalEV3.get().getPort("S1"));
    public static EV3TouchSensor touchRightSensor = new EV3TouchSensor(LocalEV3.get().getPort("S4"));
    public static EV3ColorSensor colorSensor = new EV3ColorSensor(LocalEV3.get().getPort("S2"));
    public static EV3UltrasonicSensor distanceSensor = new EV3UltrasonicSensor(LocalEV3.get().getPort("S3"));

	//CONSTANTS
    //generated from constant list
    public static int ROTATE_SPEED = (100);
    public static int ROTATE_ACC = (6000);
    public static int DEFAULT_SPEED = (300);
    public static int DEFAULT_ACC = (800);
    public static int LINE_TRESHOLD = (3/10);
    public static int US_TRESHOLD = (1/10);
    public static int YELLOW = (1);
    public static int RED = (0);
    public static int BLUE = (2);
    
    //GLOBALS
    //To implement quit
    public static int _running = 1;
    //generated from globals list
    public static int yellowFound;
    public static int redFound;
    public static int blueFound;
    
    private static SampleProvider color  		= colorSensor.getColorIDMode();
    private static SampleProvider light  		= colorSensor.getColorIDMode(); //TODO: change to light mode
    private static SampleProvider touchL 		= touchLeftSensor.getTouchMode();
	private static SampleProvider touchR 		= touchRightSensor.getTouchMode();
	private static SampleProvider distance  	= distanceSensor.getDistanceMode();
	public static float[] colorSensorSample 	= new float[color.sampleSize()];
	public static float[] lightSensorSample 	= new float[light.sampleSize()];
	public static float[] touchSensorLSample 	= new float[touchL.sampleSize()];
	public static float[] touchSensorRSample	= new float[touchR.sampleSize()];
	public static float[] ultraSonicSensorSample = new float[distance.sampleSize()];
    
    	    
    public static void main(String[] args) {
		init();
		
		Behavior[] bList = {
								new DetectLine(),
																	new DetectObject(),
																	new DetectColor(),
																	new DriveForward()
									,new DefaultQuitBehaviour_() 
							};
		Arbitrator ar = new Arbitrator(bList);
		ar.start();
	}
	
	public static void updateSensor(){
		touchL.fetchSample(touchSensorLSample, 0);
		touchR.fetchSample(touchSensorRSample, 0);
		distance.fetchSample(ultraSonicSensorSample, 0);
		color.fetchSample(colorSensorSample, 0);
		//TODO: Update light sensor
	}
	
	public static void init(){
		leftMotor.rotateTo(0);
		rightMotor.rotateTo(0);
	}
	
	public static int bToI(boolean b){
		if(b) return 1;
		elese return 0;
	}
	public static boolean iToB(boolean i){
		return i > 0;	
	}
	
	//Generated list of subroutines
	public static void beforeRotate(){
		Robot.leftMotor.setSpeed((Robot.ROTATE_SPEED));
		Robot.rightMotor.setSpeed((Robot.ROTATE_SPEED));
		
		Robot.leftMotor.setAcceleration((Robot.ROTATE_ACC));
		Robot.rightMotor.setAcceleration((Robot.ROTATE_ACC));
	}
	public static void setDefaults(){
		Robot.leftMotor.setSpeed((Robot.DEFAULT_SPEED));
		Robot.rightMotor.setSpeed((Robot.DEFAULT_SPEED));
		
		Robot.leftMotor.setAcceleration((Robot.DEFAULT_ACC));
		Robot.rightMotor.setAcceleration((Robot.DEFAULT_ACC));
	}
}
	
public class QDefaultQuitBehaviour_ extends Behavior {
	@Override
	public boolean takeControl() {
		return Robot.iToB(Robot.bToI(Robot.iToB(Robot.bToI(Robot.iToB((Robot.yellowFound)) && Robot.iToB((Robot.redFound))) && Robot.iToB((Robot.blueFound)));
	}
	@Override
	public void action() {
		Robot._running = 0;
	}
	@Override
	public void suppress() {}
}

//Generated behaviours
public class DetectLine extends Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensor();
		return 	Robot.iToB(Robot._running) &&
				Robot.iToB(((4) < Robot.touchSensorLSample[0]));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensor();
		//TODO: update sensors more often?
		// supressioncontext = true
		Robot.beforeRotate();
		
		if(_supressed) return; 
		Robot.leftMotor.stop();
		Robot.rightMotor.sop();
		
		if(_supressed) return; 
		Robot.leftMotor.rotate((-130),true););
		
		if(_supressed) return; 
		Robot.rightMotor.rotate((-20),false);
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
public class DetectObject extends Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensor();
		return 	Robot.iToB(Robot._running) &&
				Robot.iToB(Robot.bToI(Robot.iToB(Robot.bToI(Robot.iToB((Robot.ultraSonicSensorSample[0] < (Robot.US_TRESHOLD))) OR Robot.iToB(Robot.touchSensorLSample[0])) OR Robot.iToB(Robot.touchSensorRSample[0]));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensor();
		//TODO: update sensors more often?
		// supressioncontext = true
		Robot.beforeRotate();
		
		if(_supressed) return; 
		Robot.leftMotor.stop();
		Robot.rightMotor.sop();
		
		if(_supressed) return; 
		Robot.leftMotor.rotate((-80),true););
		
		if(_supressed) return; 
		Robot.rightMotor.rotate((-80),false);
		
		if(Robot.iToB(Robot.bToI(!Robot.iToB(Robot.touchSensorLSample[0])))){
			if(_supressed) return; 
			Robot.leftMotor.rotate((-130),true););
			
			if(_supressed) return; 
			Robot.rightMotor.rotate((-20),false);
		} else {
			if(_supressed) return; 
			Robot.leftMotor.rotate((-20),true););
			
			if(_supressed) return; 
			Robot.rightMotor.rotate((-130),false);
		}
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
public class DriveForward extends Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensor();
		return 	Robot.iToB(Robot._running) &&
				Robot.iToB(1);
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensor();
		//TODO: update sensors more often?
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
public class DetectColor extends Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensor();
		return 	Robot.iToB(Robot._running) &&
				Robot.iToB(Robot.bToI(Robot.iToB(Robot.bToI(Robot.iToB((Robot.colorSensorSample[0] == (Robot.RED))) OR Robot.iToB((Robot.colorSensorSample[0] == (Robot.YELLOW)))) OR Robot.iToB((Robot.colorSensorSample[0] == (Robot.BLUE))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensor();
		//TODO: update sensors more often?
		// supressioncontext = true
		if(Robot.iToB((Robot.colorSensorSample[0] == (Robot.RED)))){
			Robot.redFound = 1;
		} else {
		}
		if(Robot.iToB((Robot.colorSensorSample[0] == (Robot.BLUE)))){
			Robot.blueFound = 1;
		} else {
		}
		if(Robot.iToB((Robot.colorSensorSample[0] == (Robot.YELLOW)))){
			Robot.yellowFound = 1;
		} else {
		}
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
