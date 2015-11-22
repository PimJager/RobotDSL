package mars.rover.generator

import mars.rover.roverDSL.Robot

class RobotGenerator {
	
	var static suppressContext = false;
	def static shouldSuppress(){
		return suppressContext;
	}
	
	def static toJava(Robot root)'''
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
	    «FOR constant : root.statics»
	    public static int «constant.name» = «ValueExpressionPrinter.print(constant.value)»;
	    «ENDFOR»
	    
	    //GLOBALS
	    //To implement quit
	    public static int _running = 1;
	    //generated from globals list
	    «FOR gName : root.globals»
	    public static int «gName.name»;
	    «ENDFOR»
	    
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
									«FOR bName : root.behaviorOrder SEPARATOR ","»
										new «bName.name»()
									«ENDFOR»,new DefaultQuitBehaviour_() 
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
		«FOR routine : root.subRoutines»
		public static void «routine.name»(){
			«ExpressionPrinter.printExprList(routine.expressions)»	
		}
		«ENDFOR»	
	}
		
	public class QDefaultQuitBehaviour_ extends Behavior {
		@Override
		public boolean takeControl() {
			return Robot.iToB(«ValueExpressionPrinter.print(root.stopBehaviour)»);
		}
		@Override
		public void action() {
			Robot._running = 0;
		}
		@Override
		public void suppress() {}
	}
	
	//Generated behaviours
	«FOR impl : root.behaviors»
	public class «impl.^for.name» extends Behavior {
		private boolean _supressed = true;
		@Override
		public boolean takeControl() {
			Robot.updateSensor();
			return 	Robot.iToB(Robot._running) &&
					Robot.iToB(«ValueExpressionPrinter.print(impl.controlCheck)»);
		}
		@Override
		public void action() {
			_supressed = false;
			Robot.updateSensor();
			//TODO: update sensors more often?
			// supressioncontext = «suppressContext = true»
			«ExpressionPrinter.printExprList(impl.expressions)»
			// supressioncontext = «suppressContext = false»
		}
		@Override
		public void suppress() {_supressed = true;}
	}
	«ENDFOR»
	'''
	
}