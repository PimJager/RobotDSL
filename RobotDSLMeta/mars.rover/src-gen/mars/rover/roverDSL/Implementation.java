/**
 */
package mars.rover.roverDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.Implementation#getFor <em>For</em>}</li>
 *   <li>{@link mars.rover.roverDSL.Implementation#getControlCheck <em>Control Check</em>}</li>
 *   <li>{@link mars.rover.roverDSL.Implementation#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends EObject
{
  /**
   * Returns the value of the '<em><b>For</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For</em>' reference.
   * @see #setFor(BehaviorName)
   * @see mars.rover.roverDSL.RoverDSLPackage#getImplementation_For()
   * @model
   * @generated
   */
  BehaviorName getFor();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.Implementation#getFor <em>For</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For</em>' reference.
   * @see #getFor()
   * @generated
   */
  void setFor(BehaviorName value);

  /**
   * Returns the value of the '<em><b>Control Check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control Check</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Check</em>' containment reference.
   * @see #setControlCheck(ValueExpression)
   * @see mars.rover.roverDSL.RoverDSLPackage#getImplementation_ControlCheck()
   * @model containment="true"
   * @generated
   */
  ValueExpression getControlCheck();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.Implementation#getControlCheck <em>Control Check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Check</em>' containment reference.
   * @see #getControlCheck()
   * @generated
   */
  void setControlCheck(ValueExpression value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link mars.rover.roverDSL.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see mars.rover.roverDSL.RoverDSLPackage#getImplementation_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // Implementation
