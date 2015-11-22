/**
 */
package mars.rover.roverDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.Motor#getM <em>M</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getMotor()
 * @model
 * @generated
 */
public interface Motor extends EObject
{
  /**
   * Returns the value of the '<em><b>M</b></em>' attribute.
   * The literals are from the enumeration {@link mars.rover.roverDSL.EMotor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' attribute.
   * @see mars.rover.roverDSL.EMotor
   * @see #setM(EMotor)
   * @see mars.rover.roverDSL.RoverDSLPackage#getMotor_M()
   * @model
   * @generated
   */
  EMotor getM();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.Motor#getM <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' attribute.
   * @see mars.rover.roverDSL.EMotor
   * @see #getM()
   * @generated
   */
  void setM(EMotor value);

} // Motor
