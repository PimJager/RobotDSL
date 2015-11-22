/**
 */
package mars.rover.roverDSL.impl;

import java.util.Collection;

import mars.rover.roverDSL.Expression;
import mars.rover.roverDSL.IFExpression;
import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.ValueExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IF Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.IFExpressionImpl#getC <em>C</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.IFExpressionImpl#getT <em>T</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.IFExpressionImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IFExpressionImpl extends ExpressionImpl implements IFExpression
{
  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected ValueExpression c;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected EList<Expression> t;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected EList<Expression> e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IFExpressionImpl()
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
    return RoverDSLPackage.Literals.IF_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(ValueExpression newC, NotificationChain msgs)
  {
    ValueExpression oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.IF_EXPRESSION__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(ValueExpression newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.IF_EXPRESSION__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.IF_EXPRESSION__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.IF_EXPRESSION__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getT()
  {
    if (t == null)
    {
      t = new EObjectContainmentEList<Expression>(Expression.class, this, RoverDSLPackage.IF_EXPRESSION__T);
    }
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getE()
  {
    if (e == null)
    {
      e = new EObjectContainmentEList<Expression>(Expression.class, this, RoverDSLPackage.IF_EXPRESSION__E);
    }
    return e;
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
      case RoverDSLPackage.IF_EXPRESSION__C:
        return basicSetC(null, msgs);
      case RoverDSLPackage.IF_EXPRESSION__T:
        return ((InternalEList<?>)getT()).basicRemove(otherEnd, msgs);
      case RoverDSLPackage.IF_EXPRESSION__E:
        return ((InternalEList<?>)getE()).basicRemove(otherEnd, msgs);
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
      case RoverDSLPackage.IF_EXPRESSION__C:
        return getC();
      case RoverDSLPackage.IF_EXPRESSION__T:
        return getT();
      case RoverDSLPackage.IF_EXPRESSION__E:
        return getE();
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
      case RoverDSLPackage.IF_EXPRESSION__C:
        setC((ValueExpression)newValue);
        return;
      case RoverDSLPackage.IF_EXPRESSION__T:
        getT().clear();
        getT().addAll((Collection<? extends Expression>)newValue);
        return;
      case RoverDSLPackage.IF_EXPRESSION__E:
        getE().clear();
        getE().addAll((Collection<? extends Expression>)newValue);
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
      case RoverDSLPackage.IF_EXPRESSION__C:
        setC((ValueExpression)null);
        return;
      case RoverDSLPackage.IF_EXPRESSION__T:
        getT().clear();
        return;
      case RoverDSLPackage.IF_EXPRESSION__E:
        getE().clear();
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
      case RoverDSLPackage.IF_EXPRESSION__C:
        return c != null;
      case RoverDSLPackage.IF_EXPRESSION__T:
        return t != null && !t.isEmpty();
      case RoverDSLPackage.IF_EXPRESSION__E:
        return e != null && !e.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IFExpressionImpl
