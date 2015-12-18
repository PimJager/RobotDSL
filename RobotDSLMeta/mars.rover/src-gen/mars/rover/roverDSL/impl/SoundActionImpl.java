/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.Sound;
import mars.rover.roverDSL.SoundAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sound Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.SoundActionImpl#getSound <em>Sound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoundActionImpl extends ActionImpl implements SoundAction
{
  /**
   * The default value of the '{@link #getSound() <em>Sound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSound()
   * @generated
   * @ordered
   */
  protected static final Sound SOUND_EDEFAULT = Sound.BEEP;

  /**
   * The cached value of the '{@link #getSound() <em>Sound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSound()
   * @generated
   * @ordered
   */
  protected Sound sound = SOUND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SoundActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RoverDSLPackage.Literals.SOUND_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sound getSound()
  {
    return sound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSound(Sound newSound)
  {
    Sound oldSound = sound;
    sound = newSound == null ? SOUND_EDEFAULT : newSound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.SOUND_ACTION__SOUND, oldSound, sound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RoverDSLPackage.SOUND_ACTION__SOUND:
        return getSound();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RoverDSLPackage.SOUND_ACTION__SOUND:
        setSound((Sound)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RoverDSLPackage.SOUND_ACTION__SOUND:
        setSound(SOUND_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RoverDSLPackage.SOUND_ACTION__SOUND:
        return sound != SOUND_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sound: ");
    result.append(sound);
    result.append(')');
    return result.toString();
  }

} //SoundActionImpl
