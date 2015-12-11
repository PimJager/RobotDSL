/**
 */
package mars.rover.roverDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mars.rover.roverDSL.RoverDSLFactory
 * @model kind="package"
 * @generated
 */
public interface RoverDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "roverDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.rover.mars/RoverDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "roverDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RoverDSLPackage eINSTANCE = mars.rover.roverDSL.impl.RoverDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.RobotImpl <em>Robot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.RobotImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getRobot()
   * @generated
   */
  int ROBOT = 0;

  /**
   * The feature id for the '<em><b>Behavior Order</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__BEHAVIOR_ORDER = 0;

  /**
   * The feature id for the '<em><b>Globals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__GLOBALS = 1;

  /**
   * The feature id for the '<em><b>Statics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__STATICS = 2;

  /**
   * The feature id for the '<em><b>Stop Behaviour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__STOP_BEHAVIOUR = 3;

  /**
   * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__BEHAVIORS = 4;

  /**
   * The feature id for the '<em><b>Sub Routines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__SUB_ROUTINES = 5;

  /**
   * The number of structural features of the '<em>Robot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.BehaviorNameImpl <em>Behavior Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.BehaviorNameImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBehaviorName()
   * @generated
   */
  int BEHAVIOR_NAME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Behavior Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.MotorImpl <em>Motor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.MotorImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getMotor()
   * @generated
   */
  int MOTOR = 2;

  /**
   * The feature id for the '<em><b>M</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR__M = 0;

  /**
   * The number of structural features of the '<em>Motor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.GlobalImpl <em>Global</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.GlobalImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getGlobal()
   * @generated
   */
  int GLOBAL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL__NAME = 0;

  /**
   * The number of structural features of the '<em>Global</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.StaticImpl <em>Static</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.StaticImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getStatic()
   * @generated
   */
  int STATIC = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC__VALUE = 1;

  /**
   * The number of structural features of the '<em>Static</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.ImplementationImpl <em>Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.ImplementationImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getImplementation()
   * @generated
   */
  int IMPLEMENTATION = 5;

  /**
   * The feature id for the '<em><b>For</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION__FOR = 0;

  /**
   * The feature id for the '<em><b>Control Check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION__CONTROL_CHECK = 1;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION__EXPRESSIONS = 2;

  /**
   * The number of structural features of the '<em>Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.SubRoutineImpl <em>Sub Routine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.SubRoutineImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSubRoutine()
   * @generated
   */
  int SUB_ROUTINE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ROUTINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ROUTINE__EXPRESSIONS = 1;

  /**
   * The number of structural features of the '<em>Sub Routine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ROUTINE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.ExpressionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.ValExprImpl <em>Val Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.ValExprImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getValExpr()
   * @generated
   */
  int VAL_EXPR = 8;

  /**
   * The feature id for the '<em><b>VExpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_EXPR__VEXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Val Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.IFExpressionImpl <em>IF Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.IFExpressionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getIFExpression()
   * @generated
   */
  int IF_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__C = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__T = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__E = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>IF Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.WHILEExpressionImpl <em>WHILE Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.WHILEExpressionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getWHILEExpression()
   * @generated
   */
  int WHILE_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EXPRESSION__C = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EXPRESSION__B = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>WHILE Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.AssignExpressionImpl <em>Assign Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.AssignExpressionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getAssignExpression()
   * @generated
   */
  int ASSIGN_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Global</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_EXPRESSION__GLOBAL = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_EXPRESSION__V = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.ActionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 12;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.ForwardActionImpl <em>Forward Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.ForwardActionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getForwardAction()
   * @generated
   */
  int FORWARD_ACTION = 13;

  /**
   * The feature id for the '<em><b>Motor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_ACTION__MOTOR = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Forward Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.RotateActionImpl <em>Rotate Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.RotateActionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getRotateAction()
   * @generated
   */
  int ROTATE_ACTION = 14;

  /**
   * The feature id for the '<em><b>Motor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_ACTION__MOTOR = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Degrees</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_ACTION__DEGREES = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Blocking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_ACTION__BLOCKING = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rotate Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.StopActionImpl <em>Stop Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.StopActionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getStopAction()
   * @generated
   */
  int STOP_ACTION = 15;

  /**
   * The feature id for the '<em><b>Motor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_ACTION__MOTOR = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stop Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.SAccelerationActionImpl <em>SAcceleration Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.SAccelerationActionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSAccelerationAction()
   * @generated
   */
  int SACCELERATION_ACTION = 16;

  /**
   * The feature id for the '<em><b>Motor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SACCELERATION_ACTION__MOTOR = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SACCELERATION_ACTION__V = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SAcceleration Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SACCELERATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.SSpeedActionImpl <em>SSpeed Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.SSpeedActionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSSpeedAction()
   * @generated
   */
  int SSPEED_ACTION = 17;

  /**
   * The feature id for the '<em><b>Motor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSPEED_ACTION__MOTOR = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSPEED_ACTION__V = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SSpeed Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSPEED_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.SubRoutineActionImpl <em>Sub Routine Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.SubRoutineActionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSubRoutineAction()
   * @generated
   */
  int SUB_ROUTINE_ACTION = 18;

  /**
   * The feature id for the '<em><b>Routine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ROUTINE_ACTION__ROUTINE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sub Routine Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ROUTINE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.MeasureActionImpl <em>Measure Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.MeasureActionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getMeasureAction()
   * @generated
   */
  int MEASURE_ACTION = 19;

  /**
   * The number of structural features of the '<em>Measure Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASURE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.ValueExpressionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getValueExpression()
   * @generated
   */
  int VALUE_EXPRESSION = 20;

  /**
   * The number of structural features of the '<em>Value Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.BNotExprImpl <em>BNot Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.BNotExprImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBNotExpr()
   * @generated
   */
  int BNOT_EXPR = 21;

  /**
   * The feature id for the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BNOT_EXPR__SUB = VALUE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BNot Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BNOT_EXPR_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.BVLiteralImpl <em>BV Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.BVLiteralImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBVLiteral()
   * @generated
   */
  int BV_LITERAL = 22;

  /**
   * The feature id for the '<em><b>Neg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BV_LITERAL__NEG = VALUE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>AValue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BV_LITERAL__AVALUE = VALUE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BV Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BV_LITERAL_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.BBLiteralImpl <em>BB Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.BBLiteralImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBBLiteral()
   * @generated
   */
  int BB_LITERAL = 23;

  /**
   * The feature id for the '<em><b>BValue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BB_LITERAL__BVALUE = VALUE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BB Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BB_LITERAL_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.BVarLiteralImpl <em>BVar Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.BVarLiteralImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBVarLiteral()
   * @generated
   */
  int BVAR_LITERAL = 24;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BVAR_LITERAL__VAR = VALUE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BVar Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BVAR_LITERAL_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.BSensorLiteralImpl <em>BSensor Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.BSensorLiteralImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBSensorLiteral()
   * @generated
   */
  int BSENSOR_LITERAL = 25;

  /**
   * The feature id for the '<em><b>Sensor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSENSOR_LITERAL__SENSOR = VALUE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BSensor Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSENSOR_LITERAL_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.BVBracketImpl <em>BV Bracket</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.BVBracketImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBVBracket()
   * @generated
   */
  int BV_BRACKET = 26;

  /**
   * The feature id for the '<em><b>Bsub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BV_BRACKET__BSUB = VALUE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BV Bracket</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BV_BRACKET_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.ExpressionBinOpImpl <em>Expression Bin Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.ExpressionBinOpImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getExpressionBinOp()
   * @generated
   */
  int EXPRESSION_BIN_OP = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BIN_OP__LEFT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BIN_OP__BOP = VALUE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BIN_OP__RIGHT = VALUE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression Bin Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BIN_OP_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.ExpressionBinCompImpl <em>Expression Bin Comp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.ExpressionBinCompImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getExpressionBinComp()
   * @generated
   */
  int EXPRESSION_BIN_COMP = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BIN_COMP__LEFT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bcomp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BIN_COMP__BCOMP = VALUE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BIN_COMP__RIGHT = VALUE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression Bin Comp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BIN_COMP_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.Sensor <em>Sensor</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.Sensor
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSensor()
   * @generated
   */
  int SENSOR = 29;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.EMotor <em>EMotor</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.EMotor
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getEMotor()
   * @generated
   */
  int EMOTOR = 30;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.BBinaryOp <em>BBinary Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.BBinaryOp
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBBinaryOp()
   * @generated
   */
  int BBINARY_OP = 31;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.CompareOp <em>Compare Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.CompareOp
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getCompareOp()
   * @generated
   */
  int COMPARE_OP = 32;


  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Robot</em>'.
   * @see mars.rover.roverDSL.Robot
   * @generated
   */
  EClass getRobot();

  /**
   * Returns the meta object for the containment reference list '{@link mars.rover.roverDSL.Robot#getBehaviorOrder <em>Behavior Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behavior Order</em>'.
   * @see mars.rover.roverDSL.Robot#getBehaviorOrder()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_BehaviorOrder();

  /**
   * Returns the meta object for the containment reference list '{@link mars.rover.roverDSL.Robot#getGlobals <em>Globals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Globals</em>'.
   * @see mars.rover.roverDSL.Robot#getGlobals()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_Globals();

  /**
   * Returns the meta object for the containment reference list '{@link mars.rover.roverDSL.Robot#getStatics <em>Statics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statics</em>'.
   * @see mars.rover.roverDSL.Robot#getStatics()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_Statics();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.Robot#getStopBehaviour <em>Stop Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stop Behaviour</em>'.
   * @see mars.rover.roverDSL.Robot#getStopBehaviour()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_StopBehaviour();

  /**
   * Returns the meta object for the containment reference list '{@link mars.rover.roverDSL.Robot#getBehaviors <em>Behaviors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behaviors</em>'.
   * @see mars.rover.roverDSL.Robot#getBehaviors()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_Behaviors();

  /**
   * Returns the meta object for the containment reference list '{@link mars.rover.roverDSL.Robot#getSubRoutines <em>Sub Routines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Routines</em>'.
   * @see mars.rover.roverDSL.Robot#getSubRoutines()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_SubRoutines();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.BehaviorName <em>Behavior Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior Name</em>'.
   * @see mars.rover.roverDSL.BehaviorName
   * @generated
   */
  EClass getBehaviorName();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.BehaviorName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mars.rover.roverDSL.BehaviorName#getName()
   * @see #getBehaviorName()
   * @generated
   */
  EAttribute getBehaviorName_Name();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.Motor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Motor</em>'.
   * @see mars.rover.roverDSL.Motor
   * @generated
   */
  EClass getMotor();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Motor#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>M</em>'.
   * @see mars.rover.roverDSL.Motor#getM()
   * @see #getMotor()
   * @generated
   */
  EAttribute getMotor_M();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.Global <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global</em>'.
   * @see mars.rover.roverDSL.Global
   * @generated
   */
  EClass getGlobal();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Global#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mars.rover.roverDSL.Global#getName()
   * @see #getGlobal()
   * @generated
   */
  EAttribute getGlobal_Name();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.Static <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static</em>'.
   * @see mars.rover.roverDSL.Static
   * @generated
   */
  EClass getStatic();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Static#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mars.rover.roverDSL.Static#getName()
   * @see #getStatic()
   * @generated
   */
  EAttribute getStatic_Name();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.Static#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see mars.rover.roverDSL.Static#getValue()
   * @see #getStatic()
   * @generated
   */
  EReference getStatic_Value();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.Implementation <em>Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implementation</em>'.
   * @see mars.rover.roverDSL.Implementation
   * @generated
   */
  EClass getImplementation();

  /**
   * Returns the meta object for the reference '{@link mars.rover.roverDSL.Implementation#getFor <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>For</em>'.
   * @see mars.rover.roverDSL.Implementation#getFor()
   * @see #getImplementation()
   * @generated
   */
  EReference getImplementation_For();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.Implementation#getControlCheck <em>Control Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Control Check</em>'.
   * @see mars.rover.roverDSL.Implementation#getControlCheck()
   * @see #getImplementation()
   * @generated
   */
  EReference getImplementation_ControlCheck();

  /**
   * Returns the meta object for the containment reference list '{@link mars.rover.roverDSL.Implementation#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see mars.rover.roverDSL.Implementation#getExpressions()
   * @see #getImplementation()
   * @generated
   */
  EReference getImplementation_Expressions();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.SubRoutine <em>Sub Routine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Routine</em>'.
   * @see mars.rover.roverDSL.SubRoutine
   * @generated
   */
  EClass getSubRoutine();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.SubRoutine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mars.rover.roverDSL.SubRoutine#getName()
   * @see #getSubRoutine()
   * @generated
   */
  EAttribute getSubRoutine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link mars.rover.roverDSL.SubRoutine#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see mars.rover.roverDSL.SubRoutine#getExpressions()
   * @see #getSubRoutine()
   * @generated
   */
  EReference getSubRoutine_Expressions();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see mars.rover.roverDSL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.ValExpr <em>Val Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Val Expr</em>'.
   * @see mars.rover.roverDSL.ValExpr
   * @generated
   */
  EClass getValExpr();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.ValExpr#getVExpr <em>VExpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VExpr</em>'.
   * @see mars.rover.roverDSL.ValExpr#getVExpr()
   * @see #getValExpr()
   * @generated
   */
  EReference getValExpr_VExpr();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.IFExpression <em>IF Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IF Expression</em>'.
   * @see mars.rover.roverDSL.IFExpression
   * @generated
   */
  EClass getIFExpression();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.IFExpression#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see mars.rover.roverDSL.IFExpression#getC()
   * @see #getIFExpression()
   * @generated
   */
  EReference getIFExpression_C();

  /**
   * Returns the meta object for the containment reference list '{@link mars.rover.roverDSL.IFExpression#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T</em>'.
   * @see mars.rover.roverDSL.IFExpression#getT()
   * @see #getIFExpression()
   * @generated
   */
  EReference getIFExpression_T();

  /**
   * Returns the meta object for the containment reference list '{@link mars.rover.roverDSL.IFExpression#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see mars.rover.roverDSL.IFExpression#getE()
   * @see #getIFExpression()
   * @generated
   */
  EReference getIFExpression_E();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.WHILEExpression <em>WHILE Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WHILE Expression</em>'.
   * @see mars.rover.roverDSL.WHILEExpression
   * @generated
   */
  EClass getWHILEExpression();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.WHILEExpression#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see mars.rover.roverDSL.WHILEExpression#getC()
   * @see #getWHILEExpression()
   * @generated
   */
  EReference getWHILEExpression_C();

  /**
   * Returns the meta object for the containment reference list '{@link mars.rover.roverDSL.WHILEExpression#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>B</em>'.
   * @see mars.rover.roverDSL.WHILEExpression#getB()
   * @see #getWHILEExpression()
   * @generated
   */
  EReference getWHILEExpression_B();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.AssignExpression <em>Assign Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Expression</em>'.
   * @see mars.rover.roverDSL.AssignExpression
   * @generated
   */
  EClass getAssignExpression();

  /**
   * Returns the meta object for the reference '{@link mars.rover.roverDSL.AssignExpression#getGlobal <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Global</em>'.
   * @see mars.rover.roverDSL.AssignExpression#getGlobal()
   * @see #getAssignExpression()
   * @generated
   */
  EReference getAssignExpression_Global();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.AssignExpression#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see mars.rover.roverDSL.AssignExpression#getV()
   * @see #getAssignExpression()
   * @generated
   */
  EReference getAssignExpression_V();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see mars.rover.roverDSL.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.ForwardAction <em>Forward Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Forward Action</em>'.
   * @see mars.rover.roverDSL.ForwardAction
   * @generated
   */
  EClass getForwardAction();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.ForwardAction#getMotor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Motor</em>'.
   * @see mars.rover.roverDSL.ForwardAction#getMotor()
   * @see #getForwardAction()
   * @generated
   */
  EReference getForwardAction_Motor();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.RotateAction <em>Rotate Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rotate Action</em>'.
   * @see mars.rover.roverDSL.RotateAction
   * @generated
   */
  EClass getRotateAction();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.RotateAction#getMotor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Motor</em>'.
   * @see mars.rover.roverDSL.RotateAction#getMotor()
   * @see #getRotateAction()
   * @generated
   */
  EReference getRotateAction_Motor();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.RotateAction#getDegrees <em>Degrees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Degrees</em>'.
   * @see mars.rover.roverDSL.RotateAction#getDegrees()
   * @see #getRotateAction()
   * @generated
   */
  EReference getRotateAction_Degrees();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.RotateAction#isBlocking <em>Blocking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Blocking</em>'.
   * @see mars.rover.roverDSL.RotateAction#isBlocking()
   * @see #getRotateAction()
   * @generated
   */
  EAttribute getRotateAction_Blocking();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.StopAction <em>Stop Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stop Action</em>'.
   * @see mars.rover.roverDSL.StopAction
   * @generated
   */
  EClass getStopAction();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.StopAction#getMotor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Motor</em>'.
   * @see mars.rover.roverDSL.StopAction#getMotor()
   * @see #getStopAction()
   * @generated
   */
  EReference getStopAction_Motor();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.SAccelerationAction <em>SAcceleration Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SAcceleration Action</em>'.
   * @see mars.rover.roverDSL.SAccelerationAction
   * @generated
   */
  EClass getSAccelerationAction();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.SAccelerationAction#getMotor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Motor</em>'.
   * @see mars.rover.roverDSL.SAccelerationAction#getMotor()
   * @see #getSAccelerationAction()
   * @generated
   */
  EReference getSAccelerationAction_Motor();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.SAccelerationAction#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see mars.rover.roverDSL.SAccelerationAction#getV()
   * @see #getSAccelerationAction()
   * @generated
   */
  EReference getSAccelerationAction_V();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.SSpeedAction <em>SSpeed Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SSpeed Action</em>'.
   * @see mars.rover.roverDSL.SSpeedAction
   * @generated
   */
  EClass getSSpeedAction();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.SSpeedAction#getMotor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Motor</em>'.
   * @see mars.rover.roverDSL.SSpeedAction#getMotor()
   * @see #getSSpeedAction()
   * @generated
   */
  EReference getSSpeedAction_Motor();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.SSpeedAction#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see mars.rover.roverDSL.SSpeedAction#getV()
   * @see #getSSpeedAction()
   * @generated
   */
  EReference getSSpeedAction_V();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.SubRoutineAction <em>Sub Routine Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Routine Action</em>'.
   * @see mars.rover.roverDSL.SubRoutineAction
   * @generated
   */
  EClass getSubRoutineAction();

  /**
   * Returns the meta object for the reference '{@link mars.rover.roverDSL.SubRoutineAction#getRoutine <em>Routine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Routine</em>'.
   * @see mars.rover.roverDSL.SubRoutineAction#getRoutine()
   * @see #getSubRoutineAction()
   * @generated
   */
  EReference getSubRoutineAction_Routine();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.MeasureAction <em>Measure Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measure Action</em>'.
   * @see mars.rover.roverDSL.MeasureAction
   * @generated
   */
  EClass getMeasureAction();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.ValueExpression <em>Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Expression</em>'.
   * @see mars.rover.roverDSL.ValueExpression
   * @generated
   */
  EClass getValueExpression();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.BNotExpr <em>BNot Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BNot Expr</em>'.
   * @see mars.rover.roverDSL.BNotExpr
   * @generated
   */
  EClass getBNotExpr();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.BNotExpr#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub</em>'.
   * @see mars.rover.roverDSL.BNotExpr#getSub()
   * @see #getBNotExpr()
   * @generated
   */
  EReference getBNotExpr_Sub();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.BVLiteral <em>BV Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BV Literal</em>'.
   * @see mars.rover.roverDSL.BVLiteral
   * @generated
   */
  EClass getBVLiteral();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.BVLiteral#isNeg <em>Neg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Neg</em>'.
   * @see mars.rover.roverDSL.BVLiteral#isNeg()
   * @see #getBVLiteral()
   * @generated
   */
  EAttribute getBVLiteral_Neg();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.BVLiteral#getAValue <em>AValue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AValue</em>'.
   * @see mars.rover.roverDSL.BVLiteral#getAValue()
   * @see #getBVLiteral()
   * @generated
   */
  EAttribute getBVLiteral_AValue();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.BBLiteral <em>BB Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BB Literal</em>'.
   * @see mars.rover.roverDSL.BBLiteral
   * @generated
   */
  EClass getBBLiteral();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.BBLiteral#isBValue <em>BValue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>BValue</em>'.
   * @see mars.rover.roverDSL.BBLiteral#isBValue()
   * @see #getBBLiteral()
   * @generated
   */
  EAttribute getBBLiteral_BValue();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.BVarLiteral <em>BVar Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BVar Literal</em>'.
   * @see mars.rover.roverDSL.BVarLiteral
   * @generated
   */
  EClass getBVarLiteral();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.BVarLiteral#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see mars.rover.roverDSL.BVarLiteral#getVar()
   * @see #getBVarLiteral()
   * @generated
   */
  EAttribute getBVarLiteral_Var();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.BSensorLiteral <em>BSensor Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BSensor Literal</em>'.
   * @see mars.rover.roverDSL.BSensorLiteral
   * @generated
   */
  EClass getBSensorLiteral();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.BSensorLiteral#getSensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sensor</em>'.
   * @see mars.rover.roverDSL.BSensorLiteral#getSensor()
   * @see #getBSensorLiteral()
   * @generated
   */
  EAttribute getBSensorLiteral_Sensor();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.BVBracket <em>BV Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BV Bracket</em>'.
   * @see mars.rover.roverDSL.BVBracket
   * @generated
   */
  EClass getBVBracket();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.BVBracket#getBsub <em>Bsub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bsub</em>'.
   * @see mars.rover.roverDSL.BVBracket#getBsub()
   * @see #getBVBracket()
   * @generated
   */
  EReference getBVBracket_Bsub();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.ExpressionBinOp <em>Expression Bin Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Bin Op</em>'.
   * @see mars.rover.roverDSL.ExpressionBinOp
   * @generated
   */
  EClass getExpressionBinOp();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.ExpressionBinOp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see mars.rover.roverDSL.ExpressionBinOp#getLeft()
   * @see #getExpressionBinOp()
   * @generated
   */
  EReference getExpressionBinOp_Left();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.ExpressionBinOp#getBop <em>Bop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bop</em>'.
   * @see mars.rover.roverDSL.ExpressionBinOp#getBop()
   * @see #getExpressionBinOp()
   * @generated
   */
  EAttribute getExpressionBinOp_Bop();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.ExpressionBinOp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see mars.rover.roverDSL.ExpressionBinOp#getRight()
   * @see #getExpressionBinOp()
   * @generated
   */
  EReference getExpressionBinOp_Right();

  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.ExpressionBinComp <em>Expression Bin Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Bin Comp</em>'.
   * @see mars.rover.roverDSL.ExpressionBinComp
   * @generated
   */
  EClass getExpressionBinComp();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.ExpressionBinComp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see mars.rover.roverDSL.ExpressionBinComp#getLeft()
   * @see #getExpressionBinComp()
   * @generated
   */
  EReference getExpressionBinComp_Left();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.ExpressionBinComp#getBcomp <em>Bcomp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bcomp</em>'.
   * @see mars.rover.roverDSL.ExpressionBinComp#getBcomp()
   * @see #getExpressionBinComp()
   * @generated
   */
  EAttribute getExpressionBinComp_Bcomp();

  /**
   * Returns the meta object for the containment reference '{@link mars.rover.roverDSL.ExpressionBinComp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see mars.rover.roverDSL.ExpressionBinComp#getRight()
   * @see #getExpressionBinComp()
   * @generated
   */
  EReference getExpressionBinComp_Right();

  /**
   * Returns the meta object for enum '{@link mars.rover.roverDSL.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sensor</em>'.
   * @see mars.rover.roverDSL.Sensor
   * @generated
   */
  EEnum getSensor();

  /**
   * Returns the meta object for enum '{@link mars.rover.roverDSL.EMotor <em>EMotor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>EMotor</em>'.
   * @see mars.rover.roverDSL.EMotor
   * @generated
   */
  EEnum getEMotor();

  /**
   * Returns the meta object for enum '{@link mars.rover.roverDSL.BBinaryOp <em>BBinary Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BBinary Op</em>'.
   * @see mars.rover.roverDSL.BBinaryOp
   * @generated
   */
  EEnum getBBinaryOp();

  /**
   * Returns the meta object for enum '{@link mars.rover.roverDSL.CompareOp <em>Compare Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Compare Op</em>'.
   * @see mars.rover.roverDSL.CompareOp
   * @generated
   */
  EEnum getCompareOp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RoverDSLFactory getRoverDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.RobotImpl <em>Robot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.RobotImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getRobot()
     * @generated
     */
    EClass ROBOT = eINSTANCE.getRobot();

    /**
     * The meta object literal for the '<em><b>Behavior Order</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__BEHAVIOR_ORDER = eINSTANCE.getRobot_BehaviorOrder();

    /**
     * The meta object literal for the '<em><b>Globals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__GLOBALS = eINSTANCE.getRobot_Globals();

    /**
     * The meta object literal for the '<em><b>Statics</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__STATICS = eINSTANCE.getRobot_Statics();

    /**
     * The meta object literal for the '<em><b>Stop Behaviour</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__STOP_BEHAVIOUR = eINSTANCE.getRobot_StopBehaviour();

    /**
     * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__BEHAVIORS = eINSTANCE.getRobot_Behaviors();

    /**
     * The meta object literal for the '<em><b>Sub Routines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__SUB_ROUTINES = eINSTANCE.getRobot_SubRoutines();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.BehaviorNameImpl <em>Behavior Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.BehaviorNameImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBehaviorName()
     * @generated
     */
    EClass BEHAVIOR_NAME = eINSTANCE.getBehaviorName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOR_NAME__NAME = eINSTANCE.getBehaviorName_Name();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.MotorImpl <em>Motor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.MotorImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getMotor()
     * @generated
     */
    EClass MOTOR = eINSTANCE.getMotor();

    /**
     * The meta object literal for the '<em><b>M</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOTOR__M = eINSTANCE.getMotor_M();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.GlobalImpl <em>Global</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.GlobalImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getGlobal()
     * @generated
     */
    EClass GLOBAL = eINSTANCE.getGlobal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL__NAME = eINSTANCE.getGlobal_Name();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.StaticImpl <em>Static</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.StaticImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getStatic()
     * @generated
     */
    EClass STATIC = eINSTANCE.getStatic();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC__NAME = eINSTANCE.getStatic_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC__VALUE = eINSTANCE.getStatic_Value();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.ImplementationImpl <em>Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.ImplementationImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getImplementation()
     * @generated
     */
    EClass IMPLEMENTATION = eINSTANCE.getImplementation();

    /**
     * The meta object literal for the '<em><b>For</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION__FOR = eINSTANCE.getImplementation_For();

    /**
     * The meta object literal for the '<em><b>Control Check</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION__CONTROL_CHECK = eINSTANCE.getImplementation_ControlCheck();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION__EXPRESSIONS = eINSTANCE.getImplementation_Expressions();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.SubRoutineImpl <em>Sub Routine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.SubRoutineImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSubRoutine()
     * @generated
     */
    EClass SUB_ROUTINE = eINSTANCE.getSubRoutine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_ROUTINE__NAME = eINSTANCE.getSubRoutine_Name();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_ROUTINE__EXPRESSIONS = eINSTANCE.getSubRoutine_Expressions();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.ExpressionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.ValExprImpl <em>Val Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.ValExprImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getValExpr()
     * @generated
     */
    EClass VAL_EXPR = eINSTANCE.getValExpr();

    /**
     * The meta object literal for the '<em><b>VExpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAL_EXPR__VEXPR = eINSTANCE.getValExpr_VExpr();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.IFExpressionImpl <em>IF Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.IFExpressionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getIFExpression()
     * @generated
     */
    EClass IF_EXPRESSION = eINSTANCE.getIFExpression();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__C = eINSTANCE.getIFExpression_C();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__T = eINSTANCE.getIFExpression_T();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__E = eINSTANCE.getIFExpression_E();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.WHILEExpressionImpl <em>WHILE Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.WHILEExpressionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getWHILEExpression()
     * @generated
     */
    EClass WHILE_EXPRESSION = eINSTANCE.getWHILEExpression();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_EXPRESSION__C = eINSTANCE.getWHILEExpression_C();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_EXPRESSION__B = eINSTANCE.getWHILEExpression_B();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.AssignExpressionImpl <em>Assign Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.AssignExpressionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getAssignExpression()
     * @generated
     */
    EClass ASSIGN_EXPRESSION = eINSTANCE.getAssignExpression();

    /**
     * The meta object literal for the '<em><b>Global</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_EXPRESSION__GLOBAL = eINSTANCE.getAssignExpression_Global();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_EXPRESSION__V = eINSTANCE.getAssignExpression_V();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.ActionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.ForwardActionImpl <em>Forward Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.ForwardActionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getForwardAction()
     * @generated
     */
    EClass FORWARD_ACTION = eINSTANCE.getForwardAction();

    /**
     * The meta object literal for the '<em><b>Motor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORWARD_ACTION__MOTOR = eINSTANCE.getForwardAction_Motor();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.RotateActionImpl <em>Rotate Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.RotateActionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getRotateAction()
     * @generated
     */
    EClass ROTATE_ACTION = eINSTANCE.getRotateAction();

    /**
     * The meta object literal for the '<em><b>Motor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROTATE_ACTION__MOTOR = eINSTANCE.getRotateAction_Motor();

    /**
     * The meta object literal for the '<em><b>Degrees</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROTATE_ACTION__DEGREES = eINSTANCE.getRotateAction_Degrees();

    /**
     * The meta object literal for the '<em><b>Blocking</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROTATE_ACTION__BLOCKING = eINSTANCE.getRotateAction_Blocking();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.StopActionImpl <em>Stop Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.StopActionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getStopAction()
     * @generated
     */
    EClass STOP_ACTION = eINSTANCE.getStopAction();

    /**
     * The meta object literal for the '<em><b>Motor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STOP_ACTION__MOTOR = eINSTANCE.getStopAction_Motor();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.SAccelerationActionImpl <em>SAcceleration Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.SAccelerationActionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSAccelerationAction()
     * @generated
     */
    EClass SACCELERATION_ACTION = eINSTANCE.getSAccelerationAction();

    /**
     * The meta object literal for the '<em><b>Motor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SACCELERATION_ACTION__MOTOR = eINSTANCE.getSAccelerationAction_Motor();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SACCELERATION_ACTION__V = eINSTANCE.getSAccelerationAction_V();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.SSpeedActionImpl <em>SSpeed Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.SSpeedActionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSSpeedAction()
     * @generated
     */
    EClass SSPEED_ACTION = eINSTANCE.getSSpeedAction();

    /**
     * The meta object literal for the '<em><b>Motor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SSPEED_ACTION__MOTOR = eINSTANCE.getSSpeedAction_Motor();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SSPEED_ACTION__V = eINSTANCE.getSSpeedAction_V();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.SubRoutineActionImpl <em>Sub Routine Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.SubRoutineActionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSubRoutineAction()
     * @generated
     */
    EClass SUB_ROUTINE_ACTION = eINSTANCE.getSubRoutineAction();

    /**
     * The meta object literal for the '<em><b>Routine</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_ROUTINE_ACTION__ROUTINE = eINSTANCE.getSubRoutineAction_Routine();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.MeasureActionImpl <em>Measure Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.MeasureActionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getMeasureAction()
     * @generated
     */
    EClass MEASURE_ACTION = eINSTANCE.getMeasureAction();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.ValueExpressionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getValueExpression()
     * @generated
     */
    EClass VALUE_EXPRESSION = eINSTANCE.getValueExpression();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.BNotExprImpl <em>BNot Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.BNotExprImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBNotExpr()
     * @generated
     */
    EClass BNOT_EXPR = eINSTANCE.getBNotExpr();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BNOT_EXPR__SUB = eINSTANCE.getBNotExpr_Sub();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.BVLiteralImpl <em>BV Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.BVLiteralImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBVLiteral()
     * @generated
     */
    EClass BV_LITERAL = eINSTANCE.getBVLiteral();

    /**
     * The meta object literal for the '<em><b>Neg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BV_LITERAL__NEG = eINSTANCE.getBVLiteral_Neg();

    /**
     * The meta object literal for the '<em><b>AValue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BV_LITERAL__AVALUE = eINSTANCE.getBVLiteral_AValue();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.BBLiteralImpl <em>BB Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.BBLiteralImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBBLiteral()
     * @generated
     */
    EClass BB_LITERAL = eINSTANCE.getBBLiteral();

    /**
     * The meta object literal for the '<em><b>BValue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BB_LITERAL__BVALUE = eINSTANCE.getBBLiteral_BValue();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.BVarLiteralImpl <em>BVar Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.BVarLiteralImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBVarLiteral()
     * @generated
     */
    EClass BVAR_LITERAL = eINSTANCE.getBVarLiteral();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BVAR_LITERAL__VAR = eINSTANCE.getBVarLiteral_Var();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.BSensorLiteralImpl <em>BSensor Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.BSensorLiteralImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBSensorLiteral()
     * @generated
     */
    EClass BSENSOR_LITERAL = eINSTANCE.getBSensorLiteral();

    /**
     * The meta object literal for the '<em><b>Sensor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BSENSOR_LITERAL__SENSOR = eINSTANCE.getBSensorLiteral_Sensor();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.BVBracketImpl <em>BV Bracket</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.BVBracketImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBVBracket()
     * @generated
     */
    EClass BV_BRACKET = eINSTANCE.getBVBracket();

    /**
     * The meta object literal for the '<em><b>Bsub</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BV_BRACKET__BSUB = eINSTANCE.getBVBracket_Bsub();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.ExpressionBinOpImpl <em>Expression Bin Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.ExpressionBinOpImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getExpressionBinOp()
     * @generated
     */
    EClass EXPRESSION_BIN_OP = eINSTANCE.getExpressionBinOp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_BIN_OP__LEFT = eINSTANCE.getExpressionBinOp_Left();

    /**
     * The meta object literal for the '<em><b>Bop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_BIN_OP__BOP = eINSTANCE.getExpressionBinOp_Bop();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_BIN_OP__RIGHT = eINSTANCE.getExpressionBinOp_Right();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.ExpressionBinCompImpl <em>Expression Bin Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.ExpressionBinCompImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getExpressionBinComp()
     * @generated
     */
    EClass EXPRESSION_BIN_COMP = eINSTANCE.getExpressionBinComp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_BIN_COMP__LEFT = eINSTANCE.getExpressionBinComp_Left();

    /**
     * The meta object literal for the '<em><b>Bcomp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_BIN_COMP__BCOMP = eINSTANCE.getExpressionBinComp_Bcomp();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_BIN_COMP__RIGHT = eINSTANCE.getExpressionBinComp_Right();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.Sensor <em>Sensor</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.Sensor
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSensor()
     * @generated
     */
    EEnum SENSOR = eINSTANCE.getSensor();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.EMotor <em>EMotor</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.EMotor
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getEMotor()
     * @generated
     */
    EEnum EMOTOR = eINSTANCE.getEMotor();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.BBinaryOp <em>BBinary Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.BBinaryOp
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getBBinaryOp()
     * @generated
     */
    EEnum BBINARY_OP = eINSTANCE.getBBinaryOp();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.CompareOp <em>Compare Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.CompareOp
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getCompareOp()
     * @generated
     */
    EEnum COMPARE_OP = eINSTANCE.getCompareOp();

  }

} //RoverDSLPackage
