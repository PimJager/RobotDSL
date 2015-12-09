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
    
    //GLOBALS
    //To implement quit
    public static int _running = 1;
    //generated from globals list
    
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
								new DriveForward(),
																	new DetectLine()
									,new DefaultQuitBehaviour() 
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
}
	
public class DefaultQuitBehaviour extends Behavior {
	@Override
	public boolean takeControl() {
		return Robot.iToB(0);
	}
	@Override
	public void action() {
		Robot._running = 0;
	}
	@Override
	public void suppress() {}
}

//Generated behaviours
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
		// supressioncontext = true
		if(_supressed) return; 
		Robot.leftMotor.forward();
		Robot.rightMotor.forward();
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
public class DetectLine extends Behavior {
	private boolean _supressed = true;
	@Override
	public boolean takeControl() {
		Robot.updateSensor();
		return 	Robot.iToB(Robot._running) &&
				Robot.iToB(Robot.bToI(Robot.iToB((Robot.leftLightSamples[0] < (3/10))) || Robot.iToB((Robot.rightLightSamples[0] < (3/10))));
	}
	@Override
	public void action() {
		_supressed = false;
		Robot.updateSensor();
		// supressioncontext = true
		if(_supressed) return; 
		Robot.leftMotor.stop();
		Robot.rightMotor.sop();
		// supressioncontext = false
	}
	@Override
	public void suppress() {_supressed = true;}
}
