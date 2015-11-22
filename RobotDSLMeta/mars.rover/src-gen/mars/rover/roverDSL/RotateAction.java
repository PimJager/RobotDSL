/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.RotateAction#getMotor <em>Motor</em>}</li>
 *   <li>{@link mars.rover.roverDSL.RotateAction#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link mars.rover.roverDSL.RotateAction#isBlocking <em>Blocking</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getRotateAction()
 * @model
 * @generated
 */
public interface RotateAction extends Action
{
  /**
   * Returns the value of the '<em><b>Motor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Motor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Motor</em>' containment reference.
   * @see #setMotor(Motor)
   * @see mars.rover.roverDSL.RoverDSLPackage#getRotateAction_Motor()
   * @model containment="true"
   * @generated
   */
  Motor getMotor();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.RotateAction#getMotor <em>Motor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Motor</em>' containment reference.
   * @see #getMotor()
   * @generated
   */
  void setMotor(Motor value);

  /**
   * Returns the value of the '<em><b>Degrees</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Degrees</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Degrees</em>' containment reference.
   * @see #setDegrees(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getRotateAction_Degrees()
   * @model containment="true"
   * @generated
   */
  ValueExpression getDegrees();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.RotateAction#getDegrees <em>Degrees</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Degrees</em>' containment reference.
   * @see #getDegrees()
   * @generated
   */
  void setDegrees(ValueExpression value);

  /**
   * Returns the value of the '<em><b>Blocking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocking</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocking</em>' attribute.
   * @see #setBlocking(boolean)
   * @see mars.rover.roverDSL.RoverDSLPackage#getRotateAction_Blocking()
   * @model
   * @generated
   */
  boolean isBlocking();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.RotateAction#isBlocking <em>Blocking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Blocking</em>' attribute.
   * @see #isBlocking()
   * @generated
   */
  void setBlocking(boolean value);

} // RotateAction
