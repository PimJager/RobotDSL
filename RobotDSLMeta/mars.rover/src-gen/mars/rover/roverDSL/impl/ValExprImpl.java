/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.ValExpr;
import mars.rover.roverDSL.ValueExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Val Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.ValExprImpl#getVExpr <em>VExpr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValExprImpl extends ExpressionImpl implements ValExpr
{
  /**
   * The cached value of the '{@link #getVExpr() <em>VExpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVExpr()
   * @generated
   * @ordered
   */
  protected ValueExpression vExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValExprImpl()
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
    return RoverDSLPackage.Literals.VAL_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getVExpr()
  {
    return vExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVExpr(ValueExpression newVExpr, NotificationChain msgs)
  {
    ValueExpression oldVExpr = vExpr;
    vExpr = newVExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.VAL_EXPR__VEXPR, oldVExpr, newVExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVExpr(ValueExpression newVExpr)
  {
    if (newVExpr != vExpr)
    {
      NotificationChain msgs = null;
      if (vExpr != null)
        msgs = ((InternalEObject)vExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.VAL_EXPR__VEXPR, null, msgs);
      if (newVExpr != null)
        msgs = ((InternalEObject)newVExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.VAL_EXPR__VEXPR, null, msgs);
      msgs = basicSetVExpr(newVExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.VAL_EXPR__VEXPR, newVExpr, newVExpr));
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
      case RoverDSLPackage.VAL_EXPR__VEXPR:
        return basicSetVExpr(null, msgs);
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
      case RoverDSLPackage.VAL_EXPR__VEXPR:
        return getVExpr();
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
      case RoverDSLPackage.VAL_EXPR__VEXPR:
        setVExpr((ValueExpression)newValue);
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
      case RoverDSLPackage.VAL_EXPR__VEXPR:
        setVExpr((ValueExpression)null);
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
      case RoverDSLPackage.VAL_EXPR__VEXPR:
        return vExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //ValExprImpl
