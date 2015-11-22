/**
 */
package mars.rover.roverDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.Robot#getBehaviorOrder <em>Behavior Order</em>}</li>
 *   <li>{@link mars.rover.roverDSL.Robot#getGlobals <em>Globals</em>}</li>
 *   <li>{@link mars.rover.roverDSL.Robot#getStatics <em>Statics</em>}</li>
 *   <li>{@link mars.rover.roverDSL.Robot#getStopBehaviour <em>Stop Behaviour</em>}</li>
 *   <li>{@link mars.rover.roverDSL.Robot#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link mars.rover.roverDSL.Robot#getSubRoutines <em>Sub Routines</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject
{
  /**
   * Returns the value of the '<em><b>Behavior Order</b></em>' containment reference list.
   * The list contents are of type {@link mars.rover.roverDSL.BehaviorName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior Order</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior Order</em>' containment reference list.
   * @see mars.rover.roverDSL.RoverDSLPackage#getRobot_BehaviorOrder()
   * @model containment="true"
   * @generated
   */
  EList<BehaviorName> getBehaviorOrder();

  /**
   * Returns the value of the '<em><b>Globals</b></em>' containment reference list.
   * The list contents are of type {@link mars.rover.roverDSL.Global}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Globals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Globals</em>' containment reference list.
   * @see mars.rover.roverDSL.RoverDSLPackage#getRobot_Globals()
   * @model containment="true"
   * @generated
   */
  EList<Global> getGlobals();

  /**
   * Returns the value of the '<em><b>Statics</b></em>' containment reference list.
   * The list contents are of type {@link mars.rover.roverDSL.Static}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statics</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statics</em>' containment reference list.
   * @see mars.rover.roverDSL.RoverDSLPackage#getRobot_Statics()
   * @model containment="true"
   * @generated
   */
  EList<Static> getStatics();

  /**
   * Returns the value of the '<em><b>Stop Behaviour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop Behaviour</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop Behaviour</em>' containment reference.
   * @see #setStopBehaviour(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getRobot_StopBehaviour()
   * @model containment="true"
   * @generated
   */
  ValueExpression getStopBehaviour();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.Robot#getStopBehaviour <em>Stop Behaviour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop Behaviour</em>' containment reference.
   * @see #getStopBehaviour()
   * @generated
   */
  void setStopBehaviour(ValueExpression value);

  /**
   * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
   * The list contents are of type {@link mars.rover.roverDSL.Implementation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviors</em>' containment reference list.
   * @see mars.rover.roverDSL.RoverDSLPackage#getRobot_Behaviors()
   * @model containment="true"
   * @generated
   */
  EList<Implementation> getBehaviors();

  /**
   * Returns the value of the '<em><b>Sub Routines</b></em>' containment reference list.
   * The list contents are of type {@link mars.rover.roverDSL.SubRoutine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Routines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Routines</em>' containment reference list.
   * @see mars.rover.roverDSL.RoverDSLPackage#getRobot_SubRoutines()
   * @model containment="true"
   * @generated
   */
  EList<SubRoutine> getSubRoutines();

} // Robot
