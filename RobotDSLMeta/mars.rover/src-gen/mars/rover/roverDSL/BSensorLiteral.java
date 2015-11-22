/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSensor Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.BSensorLiteral#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getBSensorLiteral()
 * @model
 * @generated
 */
public interface BSensorLiteral extends ValueExpression
{
  /**
   * Returns the value of the '<em><b>Sensor</b></em>' attribute.
   * The literals are from the enumeration {@link mars.rover.roverDSL.Sensor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' attribute.
   * @see mars.rover.roverDSL.Sensor
   * @see #setSensor(Sensor)
   * @see mars.rover.roverDSL.RoverDSLPackage#getBSensorLiteral_Sensor()
   * @model
   * @generated
   */
  Sensor getSensor();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.BSensorLiteral#getSensor <em>Sensor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor</em>' attribute.
   * @see mars.rover.roverDSL.Sensor
   * @see #getSensor()
   * @generated
   */
  void setSensor(Sensor value);

} // BSensorLiteral
