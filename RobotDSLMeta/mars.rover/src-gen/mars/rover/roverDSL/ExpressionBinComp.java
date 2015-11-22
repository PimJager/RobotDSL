/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Bin Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.ExpressionBinComp#getLeft <em>Left</em>}</li>
 *   <li>{@link mars.rover.roverDSL.ExpressionBinComp#getBcomp <em>Bcomp</em>}</li>
 *   <li>{@link mars.rover.roverDSL.ExpressionBinComp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getExpressionBinComp()
 * @model
 * @generated
 */
public interface ExpressionBinComp extends ValueExpression
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
   * @see mars.rover.roverDSL.RoverDSLPackage#getExpressionBinComp_Left()
   * @model containment="true"
   * @generated
   */
  ValueExpression getLeft();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ExpressionBinComp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ValueExpression value);

  /**
   * Returns the value of the '<em><b>Bcomp</b></em>' attribute.
   * The literals are from the enumeration {@link mars.rover.roverDSL.CompareOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bcomp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bcomp</em>' attribute.
   * @see mars.rover.roverDSL.CompareOp
   * @see #setBcomp(CompareOp)
   * @see mars.rover.roverDSL.RoverDSLPackage#getExpressionBinComp_Bcomp()
   * @model
   * @generated
   */
  CompareOp getBcomp();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ExpressionBinComp#getBcomp <em>Bcomp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bcomp</em>' attribute.
   * @see mars.rover.roverDSL.CompareOp
   * @see #getBcomp()
   * @generated
   */
  void setBcomp(CompareOp value);

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
   * @see mars.rover.roverDSL.RoverDSLPackage#getExpressionBinComp_Right()
   * @model containment="true"
   * @generated
   */
  ValueExpression getRight();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ExpressionBinComp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ValueExpression value);

} // ExpressionBinComp
