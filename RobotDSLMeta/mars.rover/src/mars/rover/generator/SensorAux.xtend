package mars.rover.generator

import mars.rover.roverDSL.Sensor

class SensorAux {
	def static CharSequence printVal(Sensor s){
		switch(s){
			case Sensor::COLORIDSENSOR:			return '''Robot.colorSample'''
			case Sensor::LEFTLIGHTSENSOR: 		return '''Robot.leftLightSamples[0]'''
			case Sensor::RIGHTLIGHTSENSOR:		return '''Robot.rightLightSamples[0]'''
			case Sensor::FRONTULTRASONICSENSOR:	return '''Robot.frontUSSample'''
			case Sensor::REARULTRASONICSENSOR:  return '''Robot.rearUSSamples[0]'''
			case Sensor::TOUCHSENSORL: 			return '''Robot.touchLeftSample'''
			case Sensor::TOUCHSENSORR:			return '''Robot.touchRightSample'''
			case Sensor::ANGLESENSOR:			return '''Robot.gyroSamples[0]'''
		}
	}
}