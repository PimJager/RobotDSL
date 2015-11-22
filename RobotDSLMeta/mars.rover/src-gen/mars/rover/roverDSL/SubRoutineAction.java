/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Routine Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.SubRoutineAction#getRoutine <em>Routine</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getSubRoutineAction()
 * @model
 * @generated
 */
public interface SubRoutineAction extends Action
{
  /**
   * Returns the value of the '<em><b>Routine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Routine</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Routine</em>' reference.
   * @see #setRoutine(SubRoutine)
   * @see mars.rover.roverDSL.RoverDSLPackage#getSubRoutineAction_Routine()
   * @model
   * @generated
   */
  SubRoutine getRoutine();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.SubRoutineAction#getRoutine <em>Routine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Routine</em>' reference.
   * @see #getRoutine()
   * @generated
   */
  void setRoutine(SubRoutine value);

} // SubRoutineAction
