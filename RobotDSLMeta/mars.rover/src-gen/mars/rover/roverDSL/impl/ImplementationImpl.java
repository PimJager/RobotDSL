/**
 */
package mars.rover.roverDSL.impl;

import java.util.Collection;

import mars.rover.roverDSL.BehaviorName;
import mars.rover.roverDSL.Expression;
import mars.rover.roverDSL.Implementation;
import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.ValueExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.ImplementationImpl#getFor <em>For</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.ImplementationImpl#getControlCheck <em>Control Check</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.ImplementationImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationImpl extends MinimalEObjectImpl.Container implements Implementation
{
  /**
   * The cached value of the '{@link #getFor() <em>For</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected BehaviorName for_;

  /**
   * The cached value of the '{@link #getControlCheck() <em>Control Check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlCheck()
   * @generated
   * @ordered
   */
  protected ValueExpression controlCheck;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementationImpl()
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
    return RoverDSLPackage.Literals.IMPLEMENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorName getFor()
  {
    if (for_ != null && for_.eIsProxy())
    {
      InternalEObject oldFor = (InternalEObject)for_;
      for_ = (BehaviorName)eResolveProxy(oldFor);
      if (for_ != oldFor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverDSLPackage.IMPLEMENTATION__FOR, oldFor, for_));
      }
    }
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorName basicGetFor()
  {
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor(BehaviorName newFor)
  {
    BehaviorName oldFor = for_;
    for_ = newFor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.IMPLEMENTATION__FOR, oldFor, for_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getControlCheck()
  {
    return controlCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControlCheck(ValueExpression newControlCheck, NotificationChain msgs)
  {
    ValueExpression oldControlCheck = controlCheck;
    controlCheck = newControlCheck;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.IMPLEMENTATION__CONTROL_CHECK, oldControlCheck, newControlCheck);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControlCheck(ValueExpression newControlCheck)
  {
    if (newControlCheck != controlCheck)
    {
      NotificationChain msgs = null;
      if (controlCheck != null)
        msgs = ((InternalEObject)controlCheck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.IMPLEMENTATION__CONTROL_CHECK, null, msgs);
      if (newControlCheck != null)
        msgs = ((InternalEObject)newControlCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.IMPLEMENTATION__CONTROL_CHECK, null, msgs);
      msgs = basicSetControlCheck(newControlCheck, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.IMPLEMENTATION__CONTROL_CHECK, newControlCheck, newControlCheck));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<Expression>(Expression.class, this, RoverDSLPackage.IMPLEMENTATION__EXPRESSIONS);
    }
    return expressions;
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
      case RoverDSLPackage.IMPLEMENTATION__CONTROL_CHECK:
        return basicSetControlCheck(null, msgs);
      case RoverDSLPackage.IMPLEMENTATION__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
      case RoverDSLPackage.IMPLEMENTATION__FOR:
        if (resolve) return getFor();
        return basicGetFor();
      case RoverDSLPackage.IMPLEMENTATION__CONTROL_CHECK:
        return getControlCheck();
      case RoverDSLPackage.IMPLEMENTATION__EXPRESSIONS:
        return getExpressions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RoverDSLPackage.IMPLEMENTATION__FOR:
        setFor((BehaviorName)newValue);
        return;
      case RoverDSLPackage.IMPLEMENTATION__CONTROL_CHECK:
        setControlCheck((ValueExpression)newValue);
        return;
      case RoverDSLPackage.IMPLEMENTATION__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends Expression>)newValue);
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
      case RoverDSLPackage.IMPLEMENTATION__FOR:
        setFor((BehaviorName)null);
        return;
      case RoverDSLPackage.IMPLEMENTATION__CONTROL_CHECK:
        setControlCheck((ValueExpression)null);
        return;
      case RoverDSLPackage.IMPLEMENTATION__EXPRESSIONS:
        getExpressions().clear();
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
      case RoverDSLPackage.IMPLEMENTATION__FOR:
        return for_ != null;
      case RoverDSLPackage.IMPLEMENTATION__CONTROL_CHECK:
        return controlCheck != null;
      case RoverDSLPackage.IMPLEMENTATION__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ImplementationImpl
