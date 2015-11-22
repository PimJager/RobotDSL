/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAcceleration Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.SAccelerationAction#getMotor <em>Motor</em>}</li>
 *   <li>{@link mars.rover.roverDSL.SAccelerationAction#getV <em>V</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getSAccelerationAction()
 * @model
 * @generated
 */
public interface SAccelerationAction extends Action
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
   * @see mars.rover.roverDSL.RoverDSLPackage#getSAccelerationAction_Motor()
   * @model containment="true"
   * @generated
   */
  Motor getMotor();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.SAccelerationAction#getMotor <em>Motor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Motor</em>' containment reference.
   * @see #getMotor()
   * @generated
   */
  void setMotor(Motor value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getSAccelerationAction_V()
   * @model containment="true"
   * @generated
   */
  ValueExpression getV();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.SAccelerationAction#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(ValueExpression value);

} // SAccelerationAction
