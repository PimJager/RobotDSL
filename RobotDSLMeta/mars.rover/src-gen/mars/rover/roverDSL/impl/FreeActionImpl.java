/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.FreeAction;
import mars.rover.roverDSL.Motor;
import mars.rover.roverDSL.RoverDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.FreeActionImpl#getMotor <em>Motor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreeActionImpl extends ActionImpl implements FreeAction
{
  /**
   * The cached value of the '{@link #getMotor() <em>Motor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMotor()
   * @generated
   * @ordered
   */
  protected Motor motor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FreeActionImpl()
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
    return RoverDSLPackage.Literals.FREE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Motor getMotor()
  {
    return motor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMotor(Motor newMotor, NotificationChain msgs)
  {
    Motor oldMotor = motor;
    motor = newMotor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.FREE_ACTION__MOTOR, oldMotor, newMotor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMotor(Motor newMotor)
  {
    if (newMotor != motor)
    {
      NotificationChain msgs = null;
      if (motor != null)
        msgs = ((InternalEObject)motor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.FREE_ACTION__MOTOR, null, msgs);
      if (newMotor != null)
        msgs = ((InternalEObject)newMotor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.FREE_ACTION__MOTOR, null, msgs);
      msgs = basicSetMotor(newMotor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.FREE_ACTION__MOTOR, newMotor, newMotor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RoverDSLPackage.FREE_ACTION__MOTOR:
        return basicSetMotor(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RoverDSLPackage.FREE_ACTION__MOTOR:
        return getMotor();
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
      case RoverDSLPackage.FREE_ACTION__MOTOR:
        setMotor((Motor)newValue);
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
      case RoverDSLPackage.FREE_ACTION__MOTOR:
        setMotor((Motor)null);
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
      case RoverDSLPackage.FREE_ACTION__MOTOR:
        return motor != null;
    }
    return super.eIsSet(featureID);
  }

} //FreeActionImpl
