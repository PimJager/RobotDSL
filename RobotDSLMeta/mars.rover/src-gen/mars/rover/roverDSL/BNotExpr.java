/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BNot Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.BNotExpr#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getBNotExpr()
 * @model
 * @generated
 */
public interface BNotExpr extends ValueExpression
{
  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getBNotExpr_Sub()
   * @model containment="true"
   * @generated
   */
  ValueExpression getSub();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.BNotExpr#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(ValueExpression value);

} // BNotExpr
