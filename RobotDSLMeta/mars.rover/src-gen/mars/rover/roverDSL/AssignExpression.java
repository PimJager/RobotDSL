/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.AssignExpression#getGlobal <em>Global</em>}</li>
 *   <li>{@link mars.rover.roverDSL.AssignExpression#getV <em>V</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getAssignExpression()
 * @model
 * @generated
 */
public interface AssignExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Global</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Global</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Global</em>' reference.
   * @see #setGlobal(Global)
   * @see mars.rover.roverDSL.RoverDSLPackage#getAssignExpression_Global()
   * @model
   * @generated
   */
  Global getGlobal();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.AssignExpression#getGlobal <em>Global</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Global</em>' reference.
   * @see #getGlobal()
   * @generated
   */
  void setGlobal(Global value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getAssignExpression_V()
   * @model containment="true"
   * @generated
   */
  ValueExpression getV();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.AssignExpression#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(ValueExpression value);

} // AssignExpression
