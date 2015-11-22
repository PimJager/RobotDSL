package mars.rover.generator

import mars.rover.roverDSL.AssignExpression
import mars.rover.roverDSL.EMotor
import mars.rover.roverDSL.Expression
import mars.rover.roverDSL.ForwardAction
import mars.rover.roverDSL.IFExpression
import mars.rover.roverDSL.RotateAction
import mars.rover.roverDSL.SAccelerationAction
import mars.rover.roverDSL.SSpeedAction
import mars.rover.roverDSL.StopAction
import mars.rover.roverDSL.SubRoutineAction
import mars.rover.roverDSL.ValExpr
import mars.rover.roverDSL.WHILEExpression
import org.eclipse.emf.common.util.EList

class ExpressionPrinter  {
	
	def static dispatch CharSequence print(ValExpr e){
		ValueExpressionPrinter.print(e.VExpr);
	}
	
	def static dispatch CharSequence print(AssignExpression e)'''
		Robot.«e.global.name» = «ValueExpressionPrinter.print(e.v)»;'''
	
	def static dispatch CharSequence print(IFExpression e)'''
	if(Robot.iToB(«ValueExpressionPrinter.print(e.c)»)){
		«ExpressionPrinter.printExprList(e.t)»
	} else {
		«ExpressionPrinter.printExprList(e.e)»
	}'''
	
	def static dispatch CharSequence print(WHILEExpression e)'''
	while(Robot.iToB(«ValueExpressionPrinter.print(e.c)»)){
		«ExpressionPrinter.printExprList(e.b)»
	}'''
	
	def static dispatch CharSequence print(ForwardAction a)'''
		«IF RobotGenerator.shouldSuppress»if(_supressed) return; «ENDIF»
		«IF a.motor == null»
		Robot.leftMotor.forward();
		Robot.rightMotor.forward();
		«ELSE»
			«IF a.motor.m == EMotor::LEFTMOTOR»
			Robot.leftMotor.forward();
			«ENDIF»
			«IF a.motor.m == EMotor::RIGHTMOTOR»
			Robot.rightMotor.forward();
			«ENDIF»
		«ENDIF»	'''
	
	def static dispatch CharSequence print(RotateAction a)'''
		«IF RobotGenerator.shouldSuppress»if(_supressed) return; «ENDIF»
		«IF a.motor.m == EMotor::LEFTMOTOR»
		Robot.leftMotor.rotate(«ValueExpressionPrinter.print(a.degrees)»,«IF a.blocking»false«ELSE»true);«ENDIF»);
		«ENDIF»
		«IF a.motor.m == EMotor::RIGHTMOTOR»
		Robot.rightMotor.rotate(«ValueExpressionPrinter.print(a.degrees)»,«IF a.blocking»false«ELSE»true);«ENDIF»);
		«ENDIF»
	'''
	
	def static dispatch CharSequence print(StopAction a)'''
		«IF RobotGenerator.shouldSuppress»if(_supressed) return; «ENDIF»
		«IF a.motor == null»
		Robot.leftMotor.stop();
		Robot.rightMotor.sop();
		«ELSE»
			«IF a.motor.m == EMotor::LEFTMOTOR»
			Robot.leftMotor.stop();
			«ENDIF»
			«IF a.motor.m == EMotor::RIGHTMOTOR»
			Robot.rightMotor.stop();
			«ENDIF»
		«ENDIF»'''
		
	def static dispatch CharSequence print(SAccelerationAction a)'''
		«IF RobotGenerator.shouldSuppress»if(_supressed) return; «ENDIF»
		«IF a.motor == null»
		Robot.leftMotor.setAcceleration(«ValueExpressionPrinter.print(a.v)»);
		Robot.rightMotor.setAcceleration(«ValueExpressionPrinter.print(a.v)»);
		«ELSE»
			«IF a.motor.m == EMotor::LEFTMOTOR»
			Robot.leftMotor.setAcceleration(«ValueExpressionPrinter.print(a.v)»);
			«ENDIF»
			«IF a.motor.m == EMotor::RIGHTMOTOR»
			Robot.rightMotor.setAcceleration(«ValueExpressionPrinter.print(a.v)»);
			«ENDIF»
		«ENDIF»'''

	def static dispatch CharSequence print(SSpeedAction a)'''
		«IF RobotGenerator.shouldSuppress»if(_supressed) return; «ENDIF»
		«IF a.motor == null»
		Robot.leftMotor.setSpeed(«ValueExpressionPrinter.print(a.v)»);
		Robot.rightMotor.setSpeed(«ValueExpressionPrinter.print(a.v)»);
		«ELSE»
				«IF a.motor.m == EMotor::LEFTMOTOR»
				Robot.leftMotor.setSpeed(«ValueExpressionPrinter.print(a.v)»);
				«ENDIF»
				«IF a.motor.m == EMotor::RIGHTMOTOR»
				Robot.rightMotor.setSpeed(«ValueExpressionPrinter.print(a.v)»);
				«ENDIF»
		«ENDIF»'''
		
	def static dispatch CharSequence print(SubRoutineAction a)'''
		Robot.«a.routine.name»();
	'''
	
	def static CharSequence printExprList(EList<Expression> es)'''
		«FOR e : es SEPARATOR "\n"»«print(e)»«ENDFOR»
	'''
}























