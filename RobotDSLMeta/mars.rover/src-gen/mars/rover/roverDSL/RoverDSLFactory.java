/**
 */
package mars.rover.roverDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mars.rover.roverDSL.RoverDSLPackage
 * @generated
 */
public interface RoverDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RoverDSLFactory eINSTANCE = mars.rover.roverDSL.impl.RoverDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Robot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Robot</em>'.
   * @generated
   */
  Robot createRobot();

  /**
   * Returns a new object of class '<em>Behavior Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Behavior Name</em>'.
   * @generated
   */
  BehaviorName createBehaviorName();

  /**
   * Returns a new object of class '<em>Motor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Motor</em>'.
   * @generated
   */
  Motor createMotor();

  /**
   * Returns a new object of class '<em>Global</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global</em>'.
   * @generated
   */
  Global createGlobal();

  /**
   * Returns a new object of class '<em>Static</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static</em>'.
   * @generated
   */
  Static createStatic();

  /**
   * Returns a new object of class '<em>Implementation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implementation</em>'.
   * @generated
   */
  Implementation createImplementation();

  /**
   * Returns a new object of class '<em>Sub Routine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Routine</em>'.
   * @generated
   */
  SubRoutine createSubRoutine();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Val Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Val Expr</em>'.
   * @generated
   */
  ValExpr createValExpr();

  /**
   * Returns a new object of class '<em>IF Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IF Expression</em>'.
   * @generated
   */
  IFExpression createIFExpression();

  /**
   * Returns a new object of class '<em>WHILE Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WHILE Expression</em>'.
   * @generated
   */
  WHILEExpression createWHILEExpression();

  /**
   * Returns a new object of class '<em>Assign Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign Expression</em>'.
   * @generated
   */
  AssignExpression createAssignExpression();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Forward Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Forward Action</em>'.
   * @generated
   */
  ForwardAction createForwardAction();

  /**
   * Returns a new object of class '<em>Rotate Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rotate Action</em>'.
   * @generated
   */
  RotateAction createRotateAction();

  /**
   * Returns a new object of class '<em>Stop Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stop Action</em>'.
   * @generated
   */
  StopAction createStopAction();

  /**
   * Returns a new object of class '<em>SAcceleration Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SAcceleration Action</em>'.
   * @generated
   */
  SAccelerationAction createSAccelerationAction();

  /**
   * Returns a new object of class '<em>SSpeed Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SSpeed Action</em>'.
   * @generated
   */
  SSpeedAction createSSpeedAction();

  /**
   * Returns a new object of class '<em>Sub Routine Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Routine Action</em>'.
   * @generated
   */
  SubRoutineAction createSubRoutineAction();

  /**
   * Returns a new object of class '<em>Value Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Expression</em>'.
   * @generated
   */
  ValueExpression createValueExpression();

  /**
   * Returns a new object of class '<em>BNot Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BNot Expr</em>'.
   * @generated
   */
  BNotExpr createBNotExpr();

  /**
   * Returns a new object of class '<em>BV Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BV Literal</em>'.
   * @generated
   */
  BVLiteral createBVLiteral();

  /**
   * Returns a new object of class '<em>BB Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BB Literal</em>'.
   * @generated
   */
  BBLiteral createBBLiteral();

  /**
   * Returns a new object of class '<em>BVar Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BVar Literal</em>'.
   * @generated
   */
  BVarLiteral createBVarLiteral();

  /**
   * Returns a new object of class '<em>BSensor Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BSensor Literal</em>'.
   * @generated
   */
  BSensorLiteral createBSensorLiteral();

  /**
   * Returns a new object of class '<em>BV Bracket</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BV Bracket</em>'.
   * @generated
   */
  BVBracket createBVBracket();

  /**
   * Returns a new object of class '<em>Expression Bin Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Bin Op</em>'.
   * @generated
   */
  ExpressionBinOp createExpressionBinOp();

  /**
   * Returns a new object of class '<em>Expression Bin Comp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Bin Comp</em>'.
   * @generated
   */
  ExpressionBinComp createExpressionBinComp();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RoverDSLPackage getRoverDSLPackage();

} //RoverDSLFactory
