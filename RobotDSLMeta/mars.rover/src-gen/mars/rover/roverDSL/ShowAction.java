/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Show Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.ShowAction#getString <em>String</em>}</li>
 *   <li>{@link mars.rover.roverDSL.ShowAction#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getShowAction()
 * @model
 * @generated
 */
public interface ShowAction extends Action
{
  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see mars.rover.roverDSL.RoverDSLPackage#getShowAction_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ShowAction#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

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
   * @see mars.rover.roverDSL.RoverDSLPackage#getShowAction_Sensor()
   * @model
   * @generated
   */
  Sensor getSensor();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ShowAction#getSensor <em>Sensor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor</em>' attribute.
   * @see mars.rover.roverDSL.Sensor
   * @see #getSensor()
   * @generated
   */
  void setSensor(Sensor value);

} // ShowAction
