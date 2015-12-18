/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.ColorLiteral#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getColorLiteral()
 * @model
 * @generated
 */
public interface ColorLiteral extends ValueExpression
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link mars.rover.roverDSL.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see mars.rover.roverDSL.Color
   * @see #setColor(Color)
   * @see mars.rover.roverDSL.RoverDSLPackage#getColorLiteral_Color()
   * @model
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ColorLiteral#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see mars.rover.roverDSL.Color
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

} // ColorLiteral
