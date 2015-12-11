/*
 * generated by Xtext
 */
package mars.rover.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import mars.rover.services.RoverDSLGrammarAccess;

public class RoverDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private RoverDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected mars.rover.ui.contentassist.antlr.internal.InternalRoverDSLParser createParser() {
		mars.rover.ui.contentassist.antlr.internal.InternalRoverDSLParser result = new mars.rover.ui.contentassist.antlr.internal.InternalRoverDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives_0_0(), "rule__Expression__Alternatives_0_0");
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getBlevel2Access().getAlternatives(), "rule__Blevel2__Alternatives");
					put(grammarAccess.getBlevel4Access().getAlternatives(), "rule__Blevel4__Alternatives");
					put(grammarAccess.getSensorAccess().getAlternatives(), "rule__Sensor__Alternatives");
					put(grammarAccess.getEMotorAccess().getAlternatives(), "rule__EMotor__Alternatives");
					put(grammarAccess.getBBinaryOpAccess().getAlternatives(), "rule__BBinaryOp__Alternatives");
					put(grammarAccess.getCompareOpAccess().getAlternatives(), "rule__CompareOp__Alternatives");
					put(grammarAccess.getRobotAccess().getGroup(), "rule__Robot__Group__0");
					put(grammarAccess.getRobotAccess().getGroup_2(), "rule__Robot__Group_2__0");
					put(grammarAccess.getRobotAccess().getGroup_3(), "rule__Robot__Group_3__0");
					put(grammarAccess.getStaticAccess().getGroup(), "rule__Static__Group__0");
					put(grammarAccess.getImplementationAccess().getGroup(), "rule__Implementation__Group__0");
					put(grammarAccess.getSubRoutineAccess().getGroup(), "rule__SubRoutine__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_0(), "rule__Expression__Group_0__0");
					put(grammarAccess.getIFExpressionAccess().getGroup(), "rule__IFExpression__Group__0");
					put(grammarAccess.getIFExpressionAccess().getGroup_5(), "rule__IFExpression__Group_5__0");
					put(grammarAccess.getWHILEExpressionAccess().getGroup(), "rule__WHILEExpression__Group__0");
					put(grammarAccess.getAssignExpressionAccess().getGroup(), "rule__AssignExpression__Group__0");
					put(grammarAccess.getForwardActionAccess().getGroup(), "rule__ForwardAction__Group__0");
					put(grammarAccess.getRotateActionAccess().getGroup(), "rule__RotateAction__Group__0");
					put(grammarAccess.getStopActionAccess().getGroup(), "rule__StopAction__Group__0");
					put(grammarAccess.getSAccelerationActionAccess().getGroup(), "rule__SAccelerationAction__Group__0");
					put(grammarAccess.getSSpeedActionAccess().getGroup(), "rule__SSpeedAction__Group__0");
					put(grammarAccess.getSubRoutineActionAccess().getGroup(), "rule__SubRoutineAction__Group__0");
					put(grammarAccess.getMeasureActionAccess().getGroup(), "rule__MeasureAction__Group__0");
					put(grammarAccess.getBlevel1Access().getGroup(), "rule__Blevel1__Group__0");
					put(grammarAccess.getBlevel1Access().getGroup_1(), "rule__Blevel1__Group_1__0");
					put(grammarAccess.getBNotExprAccess().getGroup(), "rule__BNotExpr__Group__0");
					put(grammarAccess.getBlevel3Access().getGroup(), "rule__Blevel3__Group__0");
					put(grammarAccess.getBlevel3Access().getGroup_1(), "rule__Blevel3__Group_1__0");
					put(grammarAccess.getBVLiteralAccess().getGroup(), "rule__BVLiteral__Group__0");
					put(grammarAccess.getBVBracketAccess().getGroup(), "rule__BVBracket__Group__0");
					put(grammarAccess.getRobotAccess().getBehaviorOrderAssignment_1(), "rule__Robot__BehaviorOrderAssignment_1");
					put(grammarAccess.getRobotAccess().getGlobalsAssignment_2_1(), "rule__Robot__GlobalsAssignment_2_1");
					put(grammarAccess.getRobotAccess().getStaticsAssignment_3_1(), "rule__Robot__StaticsAssignment_3_1");
					put(grammarAccess.getRobotAccess().getStopBehaviourAssignment_5(), "rule__Robot__StopBehaviourAssignment_5");
					put(grammarAccess.getRobotAccess().getBehaviorsAssignment_6(), "rule__Robot__BehaviorsAssignment_6");
					put(grammarAccess.getRobotAccess().getSubRoutinesAssignment_7(), "rule__Robot__SubRoutinesAssignment_7");
					put(grammarAccess.getBehaviorNameAccess().getNameAssignment(), "rule__BehaviorName__NameAssignment");
					put(grammarAccess.getMotorAccess().getMAssignment(), "rule__Motor__MAssignment");
					put(grammarAccess.getGlobalAccess().getNameAssignment(), "rule__Global__NameAssignment");
					put(grammarAccess.getStaticAccess().getNameAssignment_0(), "rule__Static__NameAssignment_0");
					put(grammarAccess.getStaticAccess().getValueAssignment_2(), "rule__Static__ValueAssignment_2");
					put(grammarAccess.getImplementationAccess().getForAssignment_1(), "rule__Implementation__ForAssignment_1");
					put(grammarAccess.getImplementationAccess().getControlCheckAssignment_4(), "rule__Implementation__ControlCheckAssignment_4");
					put(grammarAccess.getImplementationAccess().getExpressionsAssignment_6(), "rule__Implementation__ExpressionsAssignment_6");
					put(grammarAccess.getSubRoutineAccess().getNameAssignment_1(), "rule__SubRoutine__NameAssignment_1");
					put(grammarAccess.getSubRoutineAccess().getExpressionsAssignment_3(), "rule__SubRoutine__ExpressionsAssignment_3");
					put(grammarAccess.getValExprAccess().getVExprAssignment(), "rule__ValExpr__VExprAssignment");
					put(grammarAccess.getIFExpressionAccess().getCAssignment_1(), "rule__IFExpression__CAssignment_1");
					put(grammarAccess.getIFExpressionAccess().getTAssignment_3(), "rule__IFExpression__TAssignment_3");
					put(grammarAccess.getIFExpressionAccess().getEAssignment_5_2(), "rule__IFExpression__EAssignment_5_2");
					put(grammarAccess.getWHILEExpressionAccess().getCAssignment_1(), "rule__WHILEExpression__CAssignment_1");
					put(grammarAccess.getWHILEExpressionAccess().getBAssignment_3(), "rule__WHILEExpression__BAssignment_3");
					put(grammarAccess.getAssignExpressionAccess().getGlobalAssignment_0(), "rule__AssignExpression__GlobalAssignment_0");
					put(grammarAccess.getAssignExpressionAccess().getVAssignment_2(), "rule__AssignExpression__VAssignment_2");
					put(grammarAccess.getForwardActionAccess().getMotorAssignment_2(), "rule__ForwardAction__MotorAssignment_2");
					put(grammarAccess.getRotateActionAccess().getMotorAssignment_1(), "rule__RotateAction__MotorAssignment_1");
					put(grammarAccess.getRotateActionAccess().getDegreesAssignment_2(), "rule__RotateAction__DegreesAssignment_2");
					put(grammarAccess.getRotateActionAccess().getBlockingAssignment_3(), "rule__RotateAction__BlockingAssignment_3");
					put(grammarAccess.getStopActionAccess().getMotorAssignment_2(), "rule__StopAction__MotorAssignment_2");
					put(grammarAccess.getSAccelerationActionAccess().getMotorAssignment_1(), "rule__SAccelerationAction__MotorAssignment_1");
					put(grammarAccess.getSAccelerationActionAccess().getVAssignment_2(), "rule__SAccelerationAction__VAssignment_2");
					put(grammarAccess.getSSpeedActionAccess().getMotorAssignment_1(), "rule__SSpeedAction__MotorAssignment_1");
					put(grammarAccess.getSSpeedActionAccess().getVAssignment_2(), "rule__SSpeedAction__VAssignment_2");
					put(grammarAccess.getSubRoutineActionAccess().getRoutineAssignment_1(), "rule__SubRoutineAction__RoutineAssignment_1");
					put(grammarAccess.getBlevel1Access().getBopAssignment_1_1(), "rule__Blevel1__BopAssignment_1_1");
					put(grammarAccess.getBlevel1Access().getRightAssignment_1_2(), "rule__Blevel1__RightAssignment_1_2");
					put(grammarAccess.getBNotExprAccess().getSubAssignment_1(), "rule__BNotExpr__SubAssignment_1");
					put(grammarAccess.getBlevel3Access().getBcompAssignment_1_1(), "rule__Blevel3__BcompAssignment_1_1");
					put(grammarAccess.getBlevel3Access().getRightAssignment_1_2(), "rule__Blevel3__RightAssignment_1_2");
					put(grammarAccess.getBVLiteralAccess().getNegAssignment_0(), "rule__BVLiteral__NegAssignment_0");
					put(grammarAccess.getBVLiteralAccess().getAValueAssignment_1(), "rule__BVLiteral__AValueAssignment_1");
					put(grammarAccess.getBBLiteralAccess().getBValueAssignment(), "rule__BBLiteral__BValueAssignment");
					put(grammarAccess.getBVarLiteralAccess().getVarAssignment(), "rule__BVarLiteral__VarAssignment");
					put(grammarAccess.getBSensorLiteralAccess().getSensorAssignment(), "rule__BSensorLiteral__SensorAssignment");
					put(grammarAccess.getBVBracketAccess().getBsubAssignment_1(), "rule__BVBracket__BsubAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			mars.rover.ui.contentassist.antlr.internal.InternalRoverDSLParser typedParser = (mars.rover.ui.contentassist.antlr.internal.InternalRoverDSLParser) parser;
			typedParser.entryRuleRobot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RoverDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RoverDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
