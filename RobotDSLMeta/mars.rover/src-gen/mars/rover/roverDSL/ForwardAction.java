/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.ForwardAction#getMotor <em>Motor</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getForwardAction()
 * @model
 * @generated
 */
public interface ForwardAction extends Action
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
   * @see mars.rover.roverDSL.RoverDSLPackage#getForwardAction_Motor()
   * @model containment="true"
   * @generated
   */
  Motor getMotor();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ForwardAction#getMotor <em>Motor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Motor</em>' containment reference.
   * @see #getMotor()
   * @generated
   */
  void setMotor(Motor value);

} // ForwardAction
