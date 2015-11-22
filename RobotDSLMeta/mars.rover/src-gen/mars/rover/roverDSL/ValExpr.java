/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Val Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.ValExpr#getVExpr <em>VExpr</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getValExpr()
 * @model
 * @generated
 */
public interface ValExpr extends Expression
{
  /**
   * Returns the value of the '<em><b>VExpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VExpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VExpr</em>' containment reference.
   * @see #setVExpr(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getValExpr_VExpr()
   * @model containment="true"
   * @generated
   */
  ValueExpression getVExpr();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.ValExpr#getVExpr <em>VExpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VExpr</em>' containment reference.
   * @see #getVExpr()
   * @generated
   */
  void setVExpr(ValueExpression value);

} // ValExpr
