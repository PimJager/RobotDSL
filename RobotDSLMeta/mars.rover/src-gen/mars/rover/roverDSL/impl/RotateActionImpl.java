/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.Motor;
import mars.rover.roverDSL.RotateAction;
import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.ValueExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotate Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.RotateActionImpl#getMotor <em>Motor</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.RotateActionImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.RotateActionImpl#isBlocking <em>Blocking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotateActionImpl extends ActionImpl implements RotateAction
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
   * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegrees()
   * @generated
   * @ordered
   */
  protected ValueExpression degrees;

  /**
   * The default value of the '{@link #isBlocking() <em>Blocking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBlocking()
   * @generated
   * @ordered
   */
  protected static final boolean BLOCKING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBlocking() <em>Blocking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBlocking()
   * @generated
   * @ordered
   */
  protected boolean blocking = BLOCKING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RotateActionImpl()
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
    return RoverDSLPackage.Literals.ROTATE_ACTION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.ROTATE_ACTION__MOTOR, oldMotor, newMotor);
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
        msgs = ((InternalEObject)motor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.ROTATE_ACTION__MOTOR, null, msgs);
      if (newMotor != null)
        msgs = ((InternalEObject)newMotor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.ROTATE_ACTION__MOTOR, null, msgs);
      msgs = basicSetMotor(newMotor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.ROTATE_ACTION__MOTOR, newMotor, newMotor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getDegrees()
  {
    return degrees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDegrees(ValueExpression newDegrees, NotificationChain msgs)
  {
    ValueExpression oldDegrees = degrees;
    degrees = newDegrees;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.ROTATE_ACTION__DEGREES, oldDegrees, newDegrees);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDegrees(ValueExpression newDegrees)
  {
    if (newDegrees != degrees)
    {
      NotificationChain msgs = null;
      if (degrees != null)
        msgs = ((InternalEObject)degrees).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.ROTATE_ACTION__DEGREES, null, msgs);
      if (newDegrees != null)
        msgs = ((InternalEObject)newDegrees).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.ROTATE_ACTION__DEGREES, null, msgs);
      msgs = basicSetDegrees(newDegrees, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.ROTATE_ACTION__DEGREES, newDegrees, newDegrees));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBlocking()
  {
    return blocking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocking(boolean newBlocking)
  {
    boolean oldBlocking = blocking;
    blocking = newBlocking;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.ROTATE_ACTION__BLOCKING, oldBlocking, blocking));
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
      case RoverDSLPackage.ROTATE_ACTION__MOTOR:
        return basicSetMotor(null, msgs);
      case RoverDSLPackage.ROTATE_ACTION__DEGREES:
        return basicSetDegrees(null, msgs);
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
      case RoverDSLPackage.ROTATE_ACTION__MOTOR:
        return getMotor();
      case RoverDSLPackage.ROTATE_ACTION__DEGREES:
        return getDegrees();
      case RoverDSLPackage.ROTATE_ACTION__BLOCKING:
        return isBlocking();
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
      case RoverDSLPackage.ROTATE_ACTION__MOTOR:
        setMotor((Motor)newValue);
        return;
      case RoverDSLPackage.ROTATE_ACTION__DEGREES:
        setDegrees((ValueExpression)newValue);
        return;
      case RoverDSLPackage.ROTATE_ACTION__BLOCKING:
        setBlocking((Boolean)newValue);
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
      case RoverDSLPackage.ROTATE_ACTION__MOTOR:
        setMotor((Motor)null);
        return;
      case RoverDSLPackage.ROTATE_ACTION__DEGREES:
        setDegrees((ValueExpression)null);
        return;
      case RoverDSLPackage.ROTATE_ACTION__BLOCKING:
        setBlocking(BLOCKING_EDEFAULT);
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
      case RoverDSLPackage.ROTATE_ACTION__MOTOR:
        return motor != null;
      case RoverDSLPackage.ROTATE_ACTION__DEGREES:
        return degrees != null;
      case RoverDSLPackage.ROTATE_ACTION__BLOCKING:
        return blocking != BLOCKING_EDEFAULT;
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
    result.append(" (blocking: ");
    result.append(blocking);
    result.append(')');
    return result.toString();
  }

} //RotateActionImpl
