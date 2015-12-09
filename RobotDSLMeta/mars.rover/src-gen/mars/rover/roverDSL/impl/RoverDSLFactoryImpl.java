/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoverDSLFactoryImpl extends EFactoryImpl implements RoverDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RoverDSLFactory init()
  {
    try
    {
      RoverDSLFactory theRoverDSLFactory = (RoverDSLFactory)EPackage.Registry.INSTANCE.getEFactory(RoverDSLPackage.eNS_URI);
      if (theRoverDSLFactory != null)
      {
        return theRoverDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RoverDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoverDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RoverDSLPackage.ROBOT: return createRobot();
      case RoverDSLPackage.BEHAVIOR_NAME: return createBehaviorName();
      case RoverDSLPackage.MOTOR: return createMotor();
      case RoverDSLPackage.GLOBAL: return createGlobal();
      case RoverDSLPackage.STATIC: return createStatic();
      case RoverDSLPackage.IMPLEMENTATION: return createImplementation();
      case RoverDSLPackage.SUB_ROUTINE: return createSubRoutine();
      case RoverDSLPackage.EXPRESSION: return createExpression();
      case RoverDSLPackage.VAL_EXPR: return createValExpr();
      case RoverDSLPackage.IF_EXPRESSION: return createIFExpression();
      case RoverDSLPackage.WHILE_EXPRESSION: return createWHILEExpression();
      case RoverDSLPackage.ASSIGN_EXPRESSION: return createAssignExpression();
      case RoverDSLPackage.ACTION: return createAction();
      case RoverDSLPackage.FORWARD_ACTION: return createForwardAction();
      case RoverDSLPackage.ROTATE_ACTION: return createRotateAction();
      case RoverDSLPackage.STOP_ACTION: return createStopAction();
      case RoverDSLPackage.SACCELERATION_ACTION: return createSAccelerationAction();
      case RoverDSLPackage.SSPEED_ACTION: return createSSpeedAction();
      case RoverDSLPackage.SUB_ROUTINE_ACTION: return createSubRoutineAction();
      case RoverDSLPackage.MEASURE_ACTION: return createMeasureAction();
      case RoverDSLPackage.VALUE_EXPRESSION: return createValueExpression();
      case RoverDSLPackage.BNOT_EXPR: return createBNotExpr();
      case RoverDSLPackage.BV_LITERAL: return createBVLiteral();
      case RoverDSLPackage.BB_LITERAL: return createBBLiteral();
      case RoverDSLPackage.BVAR_LITERAL: return createBVarLiteral();
      case RoverDSLPackage.BSENSOR_LITERAL: return createBSensorLiteral();
      case RoverDSLPackage.BV_BRACKET: return createBVBracket();
      case RoverDSLPackage.EXPRESSION_BIN_OP: return createExpressionBinOp();
      case RoverDSLPackage.EXPRESSION_BIN_COMP: return createExpressionBinComp();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RoverDSLPackage.SENSOR:
        return createSensorFromString(eDataType, initialValue);
      case RoverDSLPackage.EMOTOR:
        return createEMotorFromString(eDataType, initialValue);
      case RoverDSLPackage.BBINARY_OP:
        return createBBinaryOpFromString(eDataType, initialValue);
      case RoverDSLPackage.COMPARE_OP:
        return createCompareOpFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RoverDSLPackage.SENSOR:
        return convertSensorToString(eDataType, instanceValue);
      case RoverDSLPackage.EMOTOR:
        return convertEMotorToString(eDataType, instanceValue);
      case RoverDSLPackage.BBINARY_OP:
        return convertBBinaryOpToString(eDataType, instanceValue);
      case RoverDSLPackage.COMPARE_OP:
        return convertCompareOpToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Robot createRobot()
  {
    RobotImpl robot = new RobotImpl();
    return robot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorName createBehaviorName()
  {
    BehaviorNameImpl behaviorName = new BehaviorNameImpl();
    return behaviorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Motor createMotor()
  {
    MotorImpl motor = new MotorImpl();
    return motor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Global createGlobal()
  {
    GlobalImpl global = new GlobalImpl();
    return global;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Static createStatic()
  {
    StaticImpl static_ = new StaticImpl();
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implementation createImplementation()
  {
    ImplementationImpl implementation = new ImplementationImpl();
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubRoutine createSubRoutine()
  {
    SubRoutineImpl subRoutine = new SubRoutineImpl();
    return subRoutine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValExpr createValExpr()
  {
    ValExprImpl valExpr = new ValExprImpl();
    return valExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IFExpression createIFExpression()
  {
    IFExpressionImpl ifExpression = new IFExpressionImpl();
    return ifExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WHILEExpression createWHILEExpression()
  {
    WHILEExpressionImpl whileExpression = new WHILEExpressionImpl();
    return whileExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignExpression createAssignExpression()
  {
    AssignExpressionImpl assignExpression = new AssignExpressionImpl();
    return assignExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForwardAction createForwardAction()
  {
    ForwardActionImpl forwardAction = new ForwardActionImpl();
    return forwardAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RotateAction createRotateAction()
  {
    RotateActionImpl rotateAction = new RotateActionImpl();
    return rotateAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StopAction createStopAction()
  {
    StopActionImpl stopAction = new StopActionImpl();
    return stopAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SAccelerationAction createSAccelerationAction()
  {
    SAccelerationActionImpl sAccelerationAction = new SAccelerationActionImpl();
    return sAccelerationAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SSpeedAction createSSpeedAction()
  {
    SSpeedActionImpl sSpeedAction = new SSpeedActionImpl();
    return sSpeedAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubRoutineAction createSubRoutineAction()
  {
    SubRoutineActionImpl subRoutineAction = new SubRoutineActionImpl();
    return subRoutineAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeasureAction createMeasureAction()
  {
    MeasureActionImpl measureAction = new MeasureActionImpl();
    return measureAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression createValueExpression()
  {
    ValueExpressionImpl valueExpression = new ValueExpressionImpl();
    return valueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BNotExpr createBNotExpr()
  {
    BNotExprImpl bNotExpr = new BNotExprImpl();
    return bNotExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BVLiteral createBVLiteral()
  {
    BVLiteralImpl bvLiteral = new BVLiteralImpl();
    return bvLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BBLiteral createBBLiteral()
  {
    BBLiteralImpl bbLiteral = new BBLiteralImpl();
    return bbLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BVarLiteral createBVarLiteral()
  {
    BVarLiteralImpl bVarLiteral = new BVarLiteralImpl();
    return bVarLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSensorLiteral createBSensorLiteral()
  {
    BSensorLiteralImpl bSensorLiteral = new BSensorLiteralImpl();
    return bSensorLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BVBracket createBVBracket()
  {
    BVBracketImpl bvBracket = new BVBracketImpl();
    return bvBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionBinOp createExpressionBinOp()
  {
    ExpressionBinOpImpl expressionBinOp = new ExpressionBinOpImpl();
    return expressionBinOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionBinComp createExpressionBinComp()
  {
    ExpressionBinCompImpl expressionBinComp = new ExpressionBinCompImpl();
    return expressionBinComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor createSensorFromString(EDataType eDataType, String initialValue)
  {
    Sensor result = Sensor.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSensorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMotor createEMotorFromString(EDataType eDataType, String initialValue)
  {
    EMotor result = EMotor.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEMotorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BBinaryOp createBBinaryOpFromString(EDataType eDataType, String initialValue)
  {
    BBinaryOp result = BBinaryOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBBinaryOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareOp createCompareOpFromString(EDataType eDataType, String initialValue)
  {
    CompareOp result = CompareOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompareOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoverDSLPackage getRoverDSLPackage()
  {
    return (RoverDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RoverDSLPackage getPackage()
  {
    return RoverDSLPackage.eINSTANCE;
  }

} //RoverDSLFactoryImpl
