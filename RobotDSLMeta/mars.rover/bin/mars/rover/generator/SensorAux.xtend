package mars.rover.generator

import mars.rover.roverDSL.Sensor

class SensorAux {
	def static CharSequence printVal(Sensor s){
		switch(s){
			case Sensor::COLORIDSENSOR:			return '''Robot.colorSample'''
			case Sensor::LEFTLIGHTSENSOR: 		return '''Robot.leftLightSample'''
			case Sensor::RIGHTLIGHTSENSOR:		return '''Robot.rightLightSample'''
			case Sensor::FRONTULTRASONICSENSOR:	return '''Robot.frontUSSample'''
			case Sensor::REARULTRASONICSENSOR:  return '''Robot.rearUSSample'''
			case Sensor::TOUCHSENSORL: 			return '''Robot.touchLeftSample'''
			case Sensor::TOUCHSENSORR:			return '''Robot.touchRightSample'''
			case Sensor::ANGLESENSOR:			return '''Robot.gyroSample'''
		}
	}
}