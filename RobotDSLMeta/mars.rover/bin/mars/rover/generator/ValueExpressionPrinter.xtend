package mars.rover.generator

import mars.rover.roverDSL.BBLiteral
import mars.rover.roverDSL.BBinaryOp
import mars.rover.roverDSL.BNotExpr
import mars.rover.roverDSL.BSensorLiteral
import mars.rover.roverDSL.BVBracket
import mars.rover.roverDSL.BVLiteral
import mars.rover.roverDSL.BVarLiteral
import mars.rover.roverDSL.CompareOp
import mars.rover.roverDSL.ExpressionBinComp
import mars.rover.roverDSL.ExpressionBinOp
import mars.rover.roverDSL.ColorLiteral
import mars.rover.roverDSL.Color

class ValueExpressionPrinter {
	
	def static dispatch CharSequence print(ExpressionBinOp e)'''
		Robot.normalise(Robot.makeBool(«print(e.left)») «printBOp(e.bop)» Robot.makeBool(«print(e.right)»))'''
	
	def static dispatch CharSequence print(BNotExpr e)'''
		Robot.normalise(!Robot.makeBool(«print(e.sub)»))'''
	
	def static dispatch CharSequence print(ExpressionBinComp e)'''
		Robot.normalise(«print(e.left)» «printCOP(e.bcomp)» «print(e.right)»)'''
	
	def static dispatch CharSequence print(BVLiteral e)'''
		(«IF e.neg »-«ENDIF»«/*IF e.fraction != 0»(float)«e.AValue»/(float)«e.fraction»«ELSE*/»«e.AValue»«/*ENDIF*/»)'''
		// remove comments to reenable fractions (also remove them in RoverDSL.xtext)
	
	def static dispatch CharSequence print(BBLiteral e){
		if(e.BValue){
			return '''1'''
		} else {
			return '''0'''
		}
	}
	
	def static dispatch CharSequence print(BVarLiteral e)'''
		(Robot.«e.^var»)''' /*for now all variables are global*/
	
	def static dispatch CharSequence print(BSensorLiteral e){
		return SensorAux.printVal(e.sensor);
	}
	
	def static dispatch CharSequence print (BVBracket e)'''
		(«print(e.bsub)»)'''
	
	def static dispatch CharSequence print (ColorLiteral e) {
		switch(e.color){
			case Color::BLACK:		return '''Color.BLACK'''
			case Color::BLUE:		return '''Color.BLUE'''
			case Color::BROWN: 		return '''Color.BROWN'''
			case Color::CYAN:		return '''Color.CYAN'''
			case Color::DARK_GRAY:	return '''Color.DARK_GRAY'''
			case Color::GRAY:		return '''Color.GRAY'''
			case Color::GREEN:		return '''Color.GREEN'''
			case Color::LIGHT_GRAY: return '''Color.LIGHT_GRAY'''
			case Color::MAGENTA:	return '''Color.MAGENTA'''
			case Color:: ORANGE: 	return '''Color.ORANGE'''
			case Color::PINK:		return '''Color.PINK'''
			case Color::RED:		return '''Color.RED'''
			case Color::WHITE:		return '''Color.WHITE'''
			case Color::YELLOW:		return '''Color.YELLOW'''
		}
	}
	
	def static printBOp(BBinaryOp op){
		switch(op){
			case BBinaryOp::AND: 	return '''&&'''
			case BBinaryOp::OR: 	return '''||'''
		}
	}
	
	def static printCOP(CompareOp op) {
		switch(op){
			case CompareOp::EQ: 	return '''=='''
			case CompareOp::NEQ: 	return '''!='''
			case CompareOp::GEQ: 	return '''>='''
			case CompareOp::GT:		return '''>'''
			case CompareOp::LEQ:	return '''<='''
			case CompareOp::LT:		return '''<'''
		}		
	}
	
}