/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.Motor;
import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.SAccelerationAction;
import mars.rover.roverDSL.ValueExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAcceleration Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.SAccelerationActionImpl#getMotor <em>Motor</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.SAccelerationActionImpl#getV <em>V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SAccelerationActionImpl extends ActionImpl implements SAccelerationAction
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
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected ValueExpression v;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SAccelerationActionImpl()
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
    return RoverDSLPackage.Literals.SACCELERATION_ACTION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.SACCELERATION_ACTION__MOTOR, oldMotor, newMotor);
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
        msgs = ((InternalEObject)motor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.SACCELERATION_ACTION__MOTOR, null, msgs);
      if (newMotor != null)
        msgs = ((InternalEObject)newMotor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.SACCELERATION_ACTION__MOTOR, null, msgs);
      msgs = basicSetMotor(newMotor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.SACCELERATION_ACTION__MOTOR, newMotor, newMotor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(ValueExpression newV, NotificationChain msgs)
  {
    ValueExpression oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.SACCELERATION_ACTION__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(ValueExpression newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.SACCELERATION_ACTION__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.SACCELERATION_ACTION__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.SACCELERATION_ACTION__V, newV, newV));
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
      case RoverDSLPackage.SACCELERATION_ACTION__MOTOR:
        return basicSetMotor(null, msgs);
      case RoverDSLPackage.SACCELERATION_ACTION__V:
        return basicSetV(null, msgs);
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
      case RoverDSLPackage.SACCELERATION_ACTION__MOTOR:
        return getMotor();
      case RoverDSLPackage.SACCELERATION_ACTION__V:
        return getV();
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
      case RoverDSLPackage.SACCELERATION_ACTION__MOTOR:
        setMotor((Motor)newValue);
        return;
      case RoverDSLPackage.SACCELERATION_ACTION__V:
        setV((ValueExpression)newValue);
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
      case RoverDSLPackage.SACCELERATION_ACTION__MOTOR:
        setMotor((Motor)null);
        return;
      case RoverDSLPackage.SACCELERATION_ACTION__V:
        setV((ValueExpression)null);
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
      case RoverDSLPackage.SACCELERATION_ACTION__MOTOR:
        return motor != null;
      case RoverDSLPackage.SACCELERATION_ACTION__V:
        return v != null;
    }
    return super.eIsSet(featureID);
  }

} //SAccelerationActionImpl
