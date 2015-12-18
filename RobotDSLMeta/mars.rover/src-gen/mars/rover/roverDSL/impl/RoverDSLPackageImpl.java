/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.Action;
import mars.rover.roverDSL.AssignExpression;
import mars.rover.roverDSL.BBLiteral;
import mars.rover.roverDSL.BBinaryOp;
import mars.rover.roverDSL.BNotExpr;
import mars.rover.roverDSL.BSensorLiteral;
import mars.rover.roverDSL.BVBracket;
import mars.rover.roverDSL.BVLiteral;
import mars.rover.roverDSL.BVarLiteral;
import mars.rover.roverDSL.BehaviorName;
import mars.rover.roverDSL.Color;
import mars.rover.roverDSL.ColorLiteral;
import mars.rover.roverDSL.CompareOp;
import mars.rover.roverDSL.EMotor;
import mars.rover.roverDSL.Expression;
import mars.rover.roverDSL.ExpressionBinComp;
import mars.rover.roverDSL.ExpressionBinOp;
import mars.rover.roverDSL.ForwardAction;
import mars.rover.roverDSL.FreeAction;
import mars.rover.roverDSL.Global;
import mars.rover.roverDSL.IFExpression;
import mars.rover.roverDSL.Implementation;
import mars.rover.roverDSL.MeasureAction;
import mars.rover.roverDSL.Motor;
import mars.rover.roverDSL.Robot;
import mars.rover.roverDSL.RotateAction;
import mars.rover.roverDSL.RoverDSLFactory;
import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.SAccelerationAction;
import mars.rover.roverDSL.SSpeedAction;
import mars.rover.roverDSL.Sensor;
import mars.rover.roverDSL.ShowAction;
import mars.rover.roverDSL.Sound;
import mars.rover.roverDSL.SoundAction;
import mars.rover.roverDSL.Static;
import mars.rover.roverDSL.StopAction;
import mars.rover.roverDSL.SubRoutine;
import mars.rover.roverDSL.SubRoutineAction;
import mars.rover.roverDSL.ValExpr;
import mars.rover.roverDSL.ValueExpression;
import mars.rover.roverDSL.WHILEExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoverDSLPackageImpl extends EPackageImpl implements RoverDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass robotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass behaviorNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass motorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implementationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subRoutineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forwardActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rotateActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stopActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sAccelerationActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sSpeedActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subRoutineActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass measureActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass soundActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass freeActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bNotExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bvLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bbLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bVarLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bSensorLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bvBracketEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionBinOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionBinCompEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sensorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum eMotorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum soundEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum bBinaryOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum compareOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see mars.rover.roverDSL.RoverDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RoverDSLPackageImpl()
  {
    super(eNS_URI, RoverDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RoverDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RoverDSLPackage init()
  {
    if (isInited) return (RoverDSLPackage)EPackage.Registry.INSTANCE.getEPackage(RoverDSLPackage.eNS_URI);

    // Obtain or create and register package
    RoverDSLPackageImpl theRoverDSLPackage = (RoverDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RoverDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RoverDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRoverDSLPackage.createPackageContents();

    // Initialize created meta-data
    theRoverDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRoverDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RoverDSLPackage.eNS_URI, theRoverDSLPackage);
    return theRoverDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRobot()
  {
    return robotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobot_BehaviorOrder()
  {
    return (EReference)robotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobot_Globals()
  {
    return (EReference)robotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobot_Statics()
  {
    return (EReference)robotEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobot_StopBehaviour()
  {
    return (EReference)robotEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobot_Behaviors()
  {
    return (EReference)robotEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobot_SubRoutines()
  {
    return (EReference)robotEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBehaviorName()
  {
    return behaviorNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBehaviorName_Name()
  {
    return (EAttribute)behaviorNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMotor()
  {
    return motorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMotor_M()
  {
    return (EAttribute)motorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobal()
  {
    return globalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobal_Name()
  {
    return (EAttribute)globalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatic()
  {
    return staticEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatic_Name()
  {
    return (EAttribute)staticEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatic_Value()
  {
    return (EReference)staticEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplementation()
  {
    return implementationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementation_For()
  {
    return (EReference)implementationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementation_ControlCheck()
  {
    return (EReference)implementationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementation_Expressions()
  {
    return (EReference)implementationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubRoutine()
  {
    return subRoutineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubRoutine_Name()
  {
    return (EAttribute)subRoutineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubRoutine_Expressions()
  {
    return (EReference)subRoutineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValExpr()
  {
    return valExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValExpr_VExpr()
  {
    return (EReference)valExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIFExpression()
  {
    return ifExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIFExpression_C()
  {
    return (EReference)ifExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIFExpression_T()
  {
    return (EReference)ifExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIFExpression_E()
  {
    return (EReference)ifExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWHILEExpression()
  {
    return whileExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWHILEExpression_C()
  {
    return (EReference)whileExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWHILEExpression_B()
  {
    return (EReference)whileExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignExpression()
  {
    return assignExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignExpression_Global()
  {
    return (EReference)assignExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignExpression_V()
  {
    return (EReference)assignExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForwardAction()
  {
    return forwardActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForwardAction_Motor()
  {
    return (EReference)forwardActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRotateAction()
  {
    return rotateActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRotateAction_Motor()
  {
    return (EReference)rotateActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRotateAction_Degrees()
  {
    return (EReference)rotateActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRotateAction_Blocking()
  {
    return (EAttribute)rotateActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStopAction()
  {
    return stopActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStopAction_Motor()
  {
    return (EReference)stopActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSAccelerationAction()
  {
    return sAccelerationActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSAccelerationAction_Motor()
  {
    return (EReference)sAccelerationActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSAccelerationAction_V()
  {
    return (EReference)sAccelerationActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSSpeedAction()
  {
    return sSpeedActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSSpeedAction_Motor()
  {
    return (EReference)sSpeedActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSSpeedAction_V()
  {
    return (EReference)sSpeedActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubRoutineAction()
  {
    return subRoutineActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubRoutineAction_Routine()
  {
    return (EReference)subRoutineActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMeasureAction()
  {
    return measureActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShowAction()
  {
    return showActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShowAction_String()
  {
    return (EAttribute)showActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShowAction_Sensor()
  {
    return (EAttribute)showActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSoundAction()
  {
    return soundActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSoundAction_Sound()
  {
    return (EAttribute)soundActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFreeAction()
  {
    return freeActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFreeAction_Motor()
  {
    return (EReference)freeActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueExpression()
  {
    return valueExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBNotExpr()
  {
    return bNotExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBNotExpr_Sub()
  {
    return (EReference)bNotExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBVLiteral()
  {
    return bvLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBVLiteral_Neg()
  {
    return (EAttribute)bvLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBVLiteral_AValue()
  {
    return (EAttribute)bvLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBBLiteral()
  {
    return bbLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBBLiteral_BValue()
  {
    return (EAttribute)bbLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBVarLiteral()
  {
    return bVarLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBVarLiteral_Var()
  {
    return (EAttribute)bVarLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSensorLiteral()
  {
    return bSensorLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSensorLiteral_Sensor()
  {
    return (EAttribute)bSensorLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBVBracket()
  {
    return bvBracketEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBVBracket_Bsub()
  {
    return (EReference)bvBracketEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorLiteral()
  {
    return colorLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorLiteral_Color()
  {
    return (EAttribute)colorLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionBinOp()
  {
    return expressionBinOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionBinOp_Left()
  {
    return (EReference)expressionBinOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionBinOp_Bop()
  {
    return (EAttribute)expressionBinOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionBinOp_Right()
  {
    return (EReference)expressionBinOpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionBinComp()
  {
    return expressionBinCompEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionBinComp_Left()
  {
    return (EReference)expressionBinCompEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionBinComp_Bcomp()
  {
    return (EAttribute)expressionBinCompEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionBinComp_Right()
  {
    return (EReference)expressionBinCompEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSensor()
  {
    return sensorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEMotor()
  {
    return eMotorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSound()
  {
    return soundEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBBinaryOp()
  {
    return bBinaryOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCompareOp()
  {
    return compareOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColor()
  {
    return colorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoverDSLFactory getRoverDSLFactory()
  {
    return (RoverDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    robotEClass = createEClass(ROBOT);
    createEReference(robotEClass, ROBOT__BEHAVIOR_ORDER);
    createEReference(robotEClass, ROBOT__GLOBALS);
    createEReference(robotEClass, ROBOT__STATICS);
    createEReference(robotEClass, ROBOT__STOP_BEHAVIOUR);
    createEReference(robotEClass, ROBOT__BEHAVIORS);
    createEReference(robotEClass, ROBOT__SUB_ROUTINES);

    behaviorNameEClass = createEClass(BEHAVIOR_NAME);
    createEAttribute(behaviorNameEClass, BEHAVIOR_NAME__NAME);

    motorEClass = createEClass(MOTOR);
    createEAttribute(motorEClass, MOTOR__M);

    globalEClass = createEClass(GLOBAL);
    createEAttribute(globalEClass, GLOBAL__NAME);

    staticEClass = createEClass(STATIC);
    createEAttribute(staticEClass, STATIC__NAME);
    createEReference(staticEClass, STATIC__VALUE);

    implementationEClass = createEClass(IMPLEMENTATION);
    createEReference(implementationEClass, IMPLEMENTATION__FOR);
    createEReference(implementationEClass, IMPLEMENTATION__CONTROL_CHECK);
    createEReference(implementationEClass, IMPLEMENTATION__EXPRESSIONS);

    subRoutineEClass = createEClass(SUB_ROUTINE);
    createEAttribute(subRoutineEClass, SUB_ROUTINE__NAME);
    createEReference(subRoutineEClass, SUB_ROUTINE__EXPRESSIONS);

    expressionEClass = createEClass(EXPRESSION);

    valExprEClass = createEClass(VAL_EXPR);
    createEReference(valExprEClass, VAL_EXPR__VEXPR);

    ifExpressionEClass = createEClass(IF_EXPRESSION);
    createEReference(ifExpressionEClass, IF_EXPRESSION__C);
    createEReference(ifExpressionEClass, IF_EXPRESSION__T);
    createEReference(ifExpressionEClass, IF_EXPRESSION__E);

    whileExpressionEClass = createEClass(WHILE_EXPRESSION);
    createEReference(whileExpressionEClass, WHILE_EXPRESSION__C);
    createEReference(whileExpressionEClass, WHILE_EXPRESSION__B);

    assignExpressionEClass = createEClass(ASSIGN_EXPRESSION);
    createEReference(assignExpressionEClass, ASSIGN_EXPRESSION__GLOBAL);
    createEReference(assignExpressionEClass, ASSIGN_EXPRESSION__V);

    actionEClass = createEClass(ACTION);

    forwardActionEClass = createEClass(FORWARD_ACTION);
    createEReference(forwardActionEClass, FORWARD_ACTION__MOTOR);

    rotateActionEClass = createEClass(ROTATE_ACTION);
    createEReference(rotateActionEClass, ROTATE_ACTION__MOTOR);
    createEReference(rotateActionEClass, ROTATE_ACTION__DEGREES);
    createEAttribute(rotateActionEClass, ROTATE_ACTION__BLOCKING);

    stopActionEClass = createEClass(STOP_ACTION);
    createEReference(stopActionEClass, STOP_ACTION__MOTOR);

    sAccelerationActionEClass = createEClass(SACCELERATION_ACTION);
    createEReference(sAccelerationActionEClass, SACCELERATION_ACTION__MOTOR);
    createEReference(sAccelerationActionEClass, SACCELERATION_ACTION__V);

    sSpeedActionEClass = createEClass(SSPEED_ACTION);
    createEReference(sSpeedActionEClass, SSPEED_ACTION__MOTOR);
    createEReference(sSpeedActionEClass, SSPEED_ACTION__V);

    subRoutineActionEClass = createEClass(SUB_ROUTINE_ACTION);
    createEReference(subRoutineActionEClass, SUB_ROUTINE_ACTION__ROUTINE);

    measureActionEClass = createEClass(MEASURE_ACTION);

    showActionEClass = createEClass(SHOW_ACTION);
    createEAttribute(showActionEClass, SHOW_ACTION__STRING);
    createEAttribute(showActionEClass, SHOW_ACTION__SENSOR);

    soundActionEClass = createEClass(SOUND_ACTION);
    createEAttribute(soundActionEClass, SOUND_ACTION__SOUND);

    freeActionEClass = createEClass(FREE_ACTION);
    createEReference(freeActionEClass, FREE_ACTION__MOTOR);

    valueExpressionEClass = createEClass(VALUE_EXPRESSION);

    bNotExprEClass = createEClass(BNOT_EXPR);
    createEReference(bNotExprEClass, BNOT_EXPR__SUB);

    bvLiteralEClass = createEClass(BV_LITERAL);
    createEAttribute(bvLiteralEClass, BV_LITERAL__NEG);
    createEAttribute(bvLiteralEClass, BV_LITERAL__AVALUE);

    bbLiteralEClass = createEClass(BB_LITERAL);
    createEAttribute(bbLiteralEClass, BB_LITERAL__BVALUE);

    bVarLiteralEClass = createEClass(BVAR_LITERAL);
    createEAttribute(bVarLiteralEClass, BVAR_LITERAL__VAR);

    bSensorLiteralEClass = createEClass(BSENSOR_LITERAL);
    createEAttribute(bSensorLiteralEClass, BSENSOR_LITERAL__SENSOR);

    bvBracketEClass = createEClass(BV_BRACKET);
    createEReference(bvBracketEClass, BV_BRACKET__BSUB);

    colorLiteralEClass = createEClass(COLOR_LITERAL);
    createEAttribute(colorLiteralEClass, COLOR_LITERAL__COLOR);

    expressionBinOpEClass = createEClass(EXPRESSION_BIN_OP);
    createEReference(expressionBinOpEClass, EXPRESSION_BIN_OP__LEFT);
    createEAttribute(expressionBinOpEClass, EXPRESSION_BIN_OP__BOP);
    createEReference(expressionBinOpEClass, EXPRESSION_BIN_OP__RIGHT);

    expressionBinCompEClass = createEClass(EXPRESSION_BIN_COMP);
    createEReference(expressionBinCompEClass, EXPRESSION_BIN_COMP__LEFT);
    createEAttribute(expressionBinCompEClass, EXPRESSION_BIN_COMP__BCOMP);
    createEReference(expressionBinCompEClass, EXPRESSION_BIN_COMP__RIGHT);

    // Create enums
    sensorEEnum = createEEnum(SENSOR);
    eMotorEEnum = createEEnum(EMOTOR);
    soundEEnum = createEEnum(SOUND);
    bBinaryOpEEnum = createEEnum(BBINARY_OP);
    compareOpEEnum = createEEnum(COMPARE_OP);
    colorEEnum = createEEnum(COLOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    valExprEClass.getESuperTypes().add(this.getExpression());
    ifExpressionEClass.getESuperTypes().add(this.getExpression());
    whileExpressionEClass.getESuperTypes().add(this.getExpression());
    assignExpressionEClass.getESuperTypes().add(this.getExpression());
    actionEClass.getESuperTypes().add(this.getExpression());
    forwardActionEClass.getESuperTypes().add(this.getAction());
    rotateActionEClass.getESuperTypes().add(this.getAction());
    stopActionEClass.getESuperTypes().add(this.getAction());
    sAccelerationActionEClass.getESuperTypes().add(this.getAction());
    sSpeedActionEClass.getESuperTypes().add(this.getAction());
    subRoutineActionEClass.getESuperTypes().add(this.getAction());
    measureActionEClass.getESuperTypes().add(this.getAction());
    showActionEClass.getESuperTypes().add(this.getAction());
    soundActionEClass.getESuperTypes().add(this.getAction());
    freeActionEClass.getESuperTypes().add(this.getAction());
    bNotExprEClass.getESuperTypes().add(this.getValueExpression());
    bvLiteralEClass.getESuperTypes().add(this.getValueExpression());
    bbLiteralEClass.getESuperTypes().add(this.getValueExpression());
    bVarLiteralEClass.getESuperTypes().add(this.getValueExpression());
    bSensorLiteralEClass.getESuperTypes().add(this.getValueExpression());
    bvBracketEClass.getESuperTypes().add(this.getValueExpression());
    colorLiteralEClass.getESuperTypes().add(this.getValueExpression());
    expressionBinOpEClass.getESuperTypes().add(this.getValueExpression());
    expressionBinCompEClass.getESuperTypes().add(this.getValueExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRobot_BehaviorOrder(), this.getBehaviorName(), null, "behaviorOrder", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRobot_Globals(), this.getGlobal(), null, "globals", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRobot_Statics(), this.getStatic(), null, "statics", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRobot_StopBehaviour(), this.getValueExpression(), null, "stopBehaviour", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRobot_Behaviors(), this.getImplementation(), null, "behaviors", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRobot_SubRoutines(), this.getSubRoutine(), null, "subRoutines", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(behaviorNameEClass, BehaviorName.class, "BehaviorName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBehaviorName_Name(), ecorePackage.getEString(), "name", null, 0, 1, BehaviorName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(motorEClass, Motor.class, "Motor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMotor_M(), this.getEMotor(), "m", null, 0, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(globalEClass, Global.class, "Global", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Global.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(staticEClass, Static.class, "Static", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatic_Name(), ecorePackage.getEString(), "name", null, 0, 1, Static.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatic_Value(), this.getValueExpression(), null, "value", null, 0, 1, Static.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplementation_For(), this.getBehaviorName(), null, "for", null, 0, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplementation_ControlCheck(), this.getValueExpression(), null, "controlCheck", null, 0, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplementation_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subRoutineEClass, SubRoutine.class, "SubRoutine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubRoutine_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubRoutine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubRoutine_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, SubRoutine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valExprEClass, ValExpr.class, "ValExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValExpr_VExpr(), this.getValueExpression(), null, "vExpr", null, 0, 1, ValExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifExpressionEClass, IFExpression.class, "IFExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIFExpression_C(), this.getValueExpression(), null, "c", null, 0, 1, IFExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIFExpression_T(), this.getExpression(), null, "t", null, 0, -1, IFExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIFExpression_E(), this.getExpression(), null, "e", null, 0, -1, IFExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileExpressionEClass, WHILEExpression.class, "WHILEExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWHILEExpression_C(), this.getValueExpression(), null, "c", null, 0, 1, WHILEExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWHILEExpression_B(), this.getExpression(), null, "b", null, 0, -1, WHILEExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignExpressionEClass, AssignExpression.class, "AssignExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignExpression_Global(), this.getGlobal(), null, "global", null, 0, 1, AssignExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignExpression_V(), this.getValueExpression(), null, "v", null, 0, 1, AssignExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forwardActionEClass, ForwardAction.class, "ForwardAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForwardAction_Motor(), this.getMotor(), null, "motor", null, 0, 1, ForwardAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rotateActionEClass, RotateAction.class, "RotateAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRotateAction_Motor(), this.getMotor(), null, "motor", null, 0, 1, RotateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRotateAction_Degrees(), this.getValueExpression(), null, "degrees", null, 0, 1, RotateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRotateAction_Blocking(), ecorePackage.getEBoolean(), "blocking", null, 0, 1, RotateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stopActionEClass, StopAction.class, "StopAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStopAction_Motor(), this.getMotor(), null, "motor", null, 0, 1, StopAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sAccelerationActionEClass, SAccelerationAction.class, "SAccelerationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSAccelerationAction_Motor(), this.getMotor(), null, "motor", null, 0, 1, SAccelerationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSAccelerationAction_V(), this.getValueExpression(), null, "v", null, 0, 1, SAccelerationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sSpeedActionEClass, SSpeedAction.class, "SSpeedAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSSpeedAction_Motor(), this.getMotor(), null, "motor", null, 0, 1, SSpeedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSSpeedAction_V(), this.getValueExpression(), null, "v", null, 0, 1, SSpeedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subRoutineActionEClass, SubRoutineAction.class, "SubRoutineAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubRoutineAction_Routine(), this.getSubRoutine(), null, "routine", null, 0, 1, SubRoutineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(measureActionEClass, MeasureAction.class, "MeasureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(showActionEClass, ShowAction.class, "ShowAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getShowAction_String(), ecorePackage.getEString(), "string", null, 0, 1, ShowAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getShowAction_Sensor(), this.getSensor(), "sensor", null, 0, 1, ShowAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(soundActionEClass, SoundAction.class, "SoundAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSoundAction_Sound(), this.getSound(), "sound", null, 0, 1, SoundAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(freeActionEClass, FreeAction.class, "FreeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFreeAction_Motor(), this.getMotor(), null, "motor", null, 0, 1, FreeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bNotExprEClass, BNotExpr.class, "BNotExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBNotExpr_Sub(), this.getValueExpression(), null, "sub", null, 0, 1, BNotExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bvLiteralEClass, BVLiteral.class, "BVLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBVLiteral_Neg(), ecorePackage.getEBoolean(), "neg", null, 0, 1, BVLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBVLiteral_AValue(), ecorePackage.getEInt(), "aValue", null, 0, 1, BVLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bbLiteralEClass, BBLiteral.class, "BBLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBBLiteral_BValue(), ecorePackage.getEBoolean(), "bValue", null, 0, 1, BBLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bVarLiteralEClass, BVarLiteral.class, "BVarLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBVarLiteral_Var(), ecorePackage.getEString(), "var", null, 0, 1, BVarLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bSensorLiteralEClass, BSensorLiteral.class, "BSensorLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSensorLiteral_Sensor(), this.getSensor(), "sensor", null, 0, 1, BSensorLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bvBracketEClass, BVBracket.class, "BVBracket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBVBracket_Bsub(), this.getValueExpression(), null, "bsub", null, 0, 1, BVBracket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorLiteralEClass, ColorLiteral.class, "ColorLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorLiteral_Color(), this.getColor(), "color", null, 0, 1, ColorLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionBinOpEClass, ExpressionBinOp.class, "ExpressionBinOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionBinOp_Left(), this.getValueExpression(), null, "left", null, 0, 1, ExpressionBinOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionBinOp_Bop(), this.getBBinaryOp(), "bop", null, 0, 1, ExpressionBinOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionBinOp_Right(), this.getValueExpression(), null, "right", null, 0, 1, ExpressionBinOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionBinCompEClass, ExpressionBinComp.class, "ExpressionBinComp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionBinComp_Left(), this.getValueExpression(), null, "left", null, 0, 1, ExpressionBinComp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionBinComp_Bcomp(), this.getCompareOp(), "bcomp", null, 0, 1, ExpressionBinComp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionBinComp_Right(), this.getValueExpression(), null, "right", null, 0, 1, ExpressionBinComp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(sensorEEnum, Sensor.class, "Sensor");
    addEEnumLiteral(sensorEEnum, Sensor.COLORIDSENSOR);
    addEEnumLiteral(sensorEEnum, Sensor.LEFTLIGHTSENSOR);
    addEEnumLiteral(sensorEEnum, Sensor.RIGHTLIGHTSENSOR);
    addEEnumLiteral(sensorEEnum, Sensor.FRONTULTRASONICSENSOR);
    addEEnumLiteral(sensorEEnum, Sensor.REARULTRASONICSENSOR);
    addEEnumLiteral(sensorEEnum, Sensor.TOUCHSENSORL);
    addEEnumLiteral(sensorEEnum, Sensor.TOUCHSENSORR);
    addEEnumLiteral(sensorEEnum, Sensor.ANGLESENSOR);

    initEEnum(eMotorEEnum, EMotor.class, "EMotor");
    addEEnumLiteral(eMotorEEnum, EMotor.LEFTMOTOR);
    addEEnumLiteral(eMotorEEnum, EMotor.RIGHTMOTOR);

    initEEnum(soundEEnum, Sound.class, "Sound");
    addEEnumLiteral(soundEEnum, Sound.BEEP);
    addEEnumLiteral(soundEEnum, Sound.BUZZ);

    initEEnum(bBinaryOpEEnum, BBinaryOp.class, "BBinaryOp");
    addEEnumLiteral(bBinaryOpEEnum, BBinaryOp.AND);
    addEEnumLiteral(bBinaryOpEEnum, BBinaryOp.OR);

    initEEnum(compareOpEEnum, CompareOp.class, "CompareOp");
    addEEnumLiteral(compareOpEEnum, CompareOp.EQ);
    addEEnumLiteral(compareOpEEnum, CompareOp.NEQ);
    addEEnumLiteral(compareOpEEnum, CompareOp.GEQ);
    addEEnumLiteral(compareOpEEnum, CompareOp.GT);
    addEEnumLiteral(compareOpEEnum, CompareOp.LEQ);
    addEEnumLiteral(compareOpEEnum, CompareOp.LT);

    initEEnum(colorEEnum, Color.class, "Color");
    addEEnumLiteral(colorEEnum, Color.BLACK);
    addEEnumLiteral(colorEEnum, Color.BLUE);
    addEEnumLiteral(colorEEnum, Color.BROWN);
    addEEnumLiteral(colorEEnum, Color.CYAN);
    addEEnumLiteral(colorEEnum, Color.DARK_GRAY);
    addEEnumLiteral(colorEEnum, Color.GRAY);
    addEEnumLiteral(colorEEnum, Color.GREEN);
    addEEnumLiteral(colorEEnum, Color.LIGHT_GRAY);
    addEEnumLiteral(colorEEnum, Color.MAGENTA);
    addEEnumLiteral(colorEEnum, Color.ORANGE);
    addEEnumLiteral(colorEEnum, Color.PINK);
    addEEnumLiteral(colorEEnum, Color.RED);
    addEEnumLiteral(colorEEnum, Color.WHITE);
    addEEnumLiteral(colorEEnum, Color.YELLOW);

    // Create resource
    createResource(eNS_URI);
  }

} //RoverDSLPackageImpl
