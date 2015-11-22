package mars.rover.generator

import mars.rover.roverDSL.Sensor

class SensorAux {
	def static CharSequence printVal(Sensor s){
		switch(s){
			case Sensor::COLORIDSENSOR: 	return '''Robot.colorSensorSample[0]'''
			case Sensor::LIGHTSENSOR: 		return '''Robot.lightSensorSample[0]'''
			case Sensor::ULTRASONICSENSOR: 	return '''Robot.ultraSonicSensorSample[0]'''
			case Sensor::TOUCHSENSORL:		return '''Robot.touchSensorLSample[0]'''
			case Sensor::TOUCHSENSORR:		return '''Robot.touchSensorRSample[0]''' 
		}
	}
}