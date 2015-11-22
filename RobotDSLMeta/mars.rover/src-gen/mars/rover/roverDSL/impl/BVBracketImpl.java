/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.BVBracket;
import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.ValueExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BV Bracket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.BVBracketImpl#getBsub <em>Bsub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BVBracketImpl extends ValueExpressionImpl implements BVBracket
{
  /**
   * The cached value of the '{@link #getBsub() <em>Bsub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBsub()
   * @generated
   * @ordered
   */
  protected ValueExpression bsub;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BVBracketImpl()
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
    return RoverDSLPackage.Literals.BV_BRACKET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getBsub()
  {
    return bsub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBsub(ValueExpression newBsub, NotificationChain msgs)
  {
    ValueExpression oldBsub = bsub;
    bsub = newBsub;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.BV_BRACKET__BSUB, oldBsub, newBsub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBsub(ValueExpression newBsub)
  {
    if (newBsub != bsub)
    {
      NotificationChain msgs = null;
      if (bsub != null)
        msgs = ((InternalEObject)bsub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.BV_BRACKET__BSUB, null, msgs);
      if (newBsub != null)
        msgs = ((InternalEObject)newBsub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.BV_BRACKET__BSUB, null, msgs);
      msgs = basicSetBsub(newBsub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.BV_BRACKET__BSUB, newBsub, newBsub));
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
      case RoverDSLPackage.BV_BRACKET__BSUB:
        return basicSetBsub(null, msgs);
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
      case RoverDSLPackage.BV_BRACKET__BSUB:
        return getBsub();
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
      case RoverDSLPackage.BV_BRACKET__BSUB:
        setBsub((ValueExpression)newValue);
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
      case RoverDSLPackage.BV_BRACKET__BSUB:
        setBsub((ValueExpression)null);
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
      case RoverDSLPackage.BV_BRACKET__BSUB:
        return bsub != null;
    }
    return super.eIsSet(featureID);
  }

} //BVBracketImpl
