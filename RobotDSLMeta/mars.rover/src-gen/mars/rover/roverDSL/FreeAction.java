/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.FreeAction#getMotor <em>Motor</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getFreeAction()
 * @model
 * @generated
 */
public interface FreeAction extends Action
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
   * @see mars.rover.roverDSL.RoverDSLPackage#getFreeAction_Motor()
   * @model containment="true"
   * @generated
   */
  Motor getMotor();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.FreeAction#getMotor <em>Motor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Motor</em>' containment reference.
   * @see #getMotor()
   * @generated
   */
  void setMotor(Motor value);

} // FreeAction
