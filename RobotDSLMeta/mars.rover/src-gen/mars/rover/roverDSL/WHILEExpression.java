/**
 */
package mars.rover.roverDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WHILE Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.WHILEExpression#getC <em>C</em>}</li>
 *   <li>{@link mars.rover.roverDSL.WHILEExpression#getB <em>B</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getWHILEExpression()
 * @model
 * @generated
 */
public interface WHILEExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getWHILEExpression_C()
   * @model containment="true"
   * @generated
   */
  ValueExpression getC();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.WHILEExpression#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(ValueExpression value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference list.
   * The list contents are of type {@link mars.rover.roverDSL.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference list.
   * @see mars.rover.roverDSL.RoverDSLPackage#getWHILEExpression_B()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getB();

} // WHILEExpression
