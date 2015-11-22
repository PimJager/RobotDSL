/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BV Bracket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.BVBracket#getBsub <em>Bsub</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getBVBracket()
 * @model
 * @generated
 */
public interface BVBracket extends ValueExpression
{
  /**
   * Returns the value of the '<em><b>Bsub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bsub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bsub</em>' containment reference.
   * @see #setBsub(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getBVBracket_Bsub()
   * @model containment="true"
   * @generated
   */
  ValueExpression getBsub();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.BVBracket#getBsub <em>Bsub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bsub</em>' containment reference.
   * @see #getBsub()
   * @generated
   */
  void setBsub(ValueExpression value);

} // BVBracket
