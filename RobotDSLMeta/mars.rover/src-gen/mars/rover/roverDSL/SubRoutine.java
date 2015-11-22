/**
 */
package mars.rover.roverDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Routine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.SubRoutine#getName <em>Name</em>}</li>
 *   <li>{@link mars.rover.roverDSL.SubRoutine#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getSubRoutine()
 * @model
 * @generated
 */
public interface SubRoutine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see mars.rover.roverDSL.RoverDSLPackage#getSubRoutine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.SubRoutine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see mars.rover.roverDSL.RoverDSLPackage#getSubRoutine_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // SubRoutine
