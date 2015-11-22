/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BB Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.BBLiteral#isBValue <em>BValue</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getBBLiteral()
 * @model
 * @generated
 */
public interface BBLiteral extends ValueExpression
{
  /**
   * Returns the value of the '<em><b>BValue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>BValue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>BValue</em>' attribute.
   * @see #setBValue(boolean)
   * @see mars.rover.roverDSL.RoverDSLPackage#getBBLiteral_BValue()
   * @model
   * @generated
   */
  boolean isBValue();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.BBLiteral#isBValue <em>BValue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BValue</em>' attribute.
   * @see #isBValue()
   * @generated
   */
  void setBValue(boolean value);

} // BBLiteral
