/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BV Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.BVLiteral#isNeg <em>Neg</em>}</li>
 *   <li>{@link mars.rover.roverDSL.BVLiteral#getAValue <em>AValue</em>}</li>
 *   <li>{@link mars.rover.roverDSL.BVLiteral#getFraction <em>Fraction</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getBVLiteral()
 * @model
 * @generated
 */
public interface BVLiteral extends ValueExpression
{
  /**
   * Returns the value of the '<em><b>Neg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Neg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Neg</em>' attribute.
   * @see #setNeg(boolean)
   * @see mars.rover.roverDSL.RoverDSLPackage#getBVLiteral_Neg()
   * @model
   * @generated
   */
  boolean isNeg();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.BVLiteral#isNeg <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Neg</em>' attribute.
   * @see #isNeg()
   * @generated
   */
  void setNeg(boolean value);

  /**
   * Returns the value of the '<em><b>AValue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AValue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AValue</em>' attribute.
   * @see #setAValue(int)
   * @see mars.rover.roverDSL.RoverDSLPackage#getBVLiteral_AValue()
   * @model
   * @generated
   */
  int getAValue();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.BVLiteral#getAValue <em>AValue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AValue</em>' attribute.
   * @see #getAValue()
   * @generated
   */
  void setAValue(int value);

  /**
   * Returns the value of the '<em><b>Fraction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fraction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fraction</em>' attribute.
   * @see #setFraction(int)
   * @see mars.rover.roverDSL.RoverDSLPackage#getBVLiteral_Fraction()
   * @model
   * @generated
   */
  int getFraction();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.BVLiteral#getFraction <em>Fraction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fraction</em>' attribute.
   * @see #getFraction()
   * @generated
   */
  void setFraction(int value);

} // BVLiteral
