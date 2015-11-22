/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Bin Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.ExpressionBinOp#getLeft <em>Left</em>}</li>
 *   <li>{@link mars.rover.roverDSL.ExpressionBinOp#getBop <em>Bop</em>}</li>
 *   <li>{@link mars.rover.roverDSL.ExpressionBinOp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getExpressionBinOp()
 * @model
 * @generated
 */
public interface ExpressionBinOp extends ValueExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getExpressionBinOp_Left()
   * @model containment="true"
   * @generated
   */
  ValueExpression getLeft();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ExpressionBinOp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ValueExpression value);

  /**
   * Returns the value of the '<em><b>Bop</b></em>' attribute.
   * The literals are from the enumeration {@link mars.rover.roverDSL.BBinaryOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bop</em>' attribute.
   * @see mars.rover.roverDSL.BBinaryOp
   * @see #setBop(BBinaryOp)
   * @see mars.rover.roverDSL.RoverDSLPackage#getExpressionBinOp_Bop()
   * @model
   * @generated
   */
  BBinaryOp getBop();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ExpressionBinOp#getBop <em>Bop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bop</em>' attribute.
   * @see mars.rover.roverDSL.BBinaryOp
   * @see #getBop()
   * @generated
   */
  void setBop(BBinaryOp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getExpressionBinOp_Right()
   * @model containment="true"
   * @generated
   */
  ValueExpression getRight();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ExpressionBinOp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ValueExpression value);

} // ExpressionBinOp
