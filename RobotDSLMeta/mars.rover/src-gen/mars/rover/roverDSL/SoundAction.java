/**
 */
package mars.rover.roverDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sound Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.SoundAction#getSound <em>Sound</em>}</li>
 * </ul>
 *
 * @see mars.rover.roverDSL.RoverDSLPackage#getSoundAction()
 * @model
 * @generated
 */
public interface SoundAction extends Action
{
  /**
   * Returns the value of the '<em><b>Sound</b></em>' attribute.
   * The literals are from the enumeration {@link mars.rover.roverDSL.Sound}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sound</em>' attribute.
   * @see mars.rover.roverDSL.Sound
   * @see #setSound(Sound)
   * @see mars.rover.roverDSL.RoverDSLPackage#getSoundAction_Sound()
   * @model
   * @generated
   */
  Sound getSound();

  /**
   * Sets the value of the '{@link mars.rover.roverDSL.SoundAction#getSound <em>Sound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sound</em>' attribute.
   * @see mars.rover.roverDSL.Sound
   * @see #getSound()
   * @generated
   */
  void setSound(Sound value);

} // SoundAction
