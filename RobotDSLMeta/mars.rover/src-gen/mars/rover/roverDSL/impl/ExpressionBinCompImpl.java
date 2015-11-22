/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.CompareOp;
import mars.rover.roverDSL.ExpressionBinComp;
import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.ValueExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Bin Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.ExpressionBinCompImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.ExpressionBinCompImpl#getBcomp <em>Bcomp</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.ExpressionBinCompImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionBinCompImpl extends ValueExpressionImpl implements ExpressionBinComp
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected ValueExpression left;

  /**
   * The default value of the '{@link #getBcomp() <em>Bcomp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBcomp()
   * @generated
   * @ordered
   */
  protected static final CompareOp BCOMP_EDEFAULT = CompareOp.EQ;

  /**
   * The cached value of the '{@link #getBcomp() <em>Bcomp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBcomp()
   * @generated
   * @ordered
   */
  protected CompareOp bcomp = BCOMP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected ValueExpression right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionBinCompImpl()
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
    return RoverDSLPackage.Literals.EXPRESSION_BIN_COMP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(ValueExpression newLeft, NotificationChain msgs)
  {
    ValueExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.EXPRESSION_BIN_COMP__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(ValueExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.EXPRESSION_BIN_COMP__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.EXPRESSION_BIN_COMP__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.EXPRESSION_BIN_COMP__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareOp getBcomp()
  {
    return bcomp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBcomp(CompareOp newBcomp)
  {
    CompareOp oldBcomp = bcomp;
    bcomp = newBcomp == null ? BCOMP_EDEFAULT : newBcomp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.EXPRESSION_BIN_COMP__BCOMP, oldBcomp, bcomp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(ValueExpression newRight, NotificationChain msgs)
  {
    ValueExpression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.EXPRESSION_BIN_COMP__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(ValueExpression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.EXPRESSION_BIN_COMP__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.EXPRESSION_BIN_COMP__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.EXPRESSION_BIN_COMP__RIGHT, newRight, newRight));
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
      case RoverDSLPackage.EXPRESSION_BIN_COMP__LEFT:
        return basicSetLeft(null, msgs);
      case RoverDSLPackage.EXPRESSION_BIN_COMP__RIGHT:
        return basicSetRight(null, msgs);
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
      case RoverDSLPackage.EXPRESSION_BIN_COMP__LEFT:
        return getLeft();
      case RoverDSLPackage.EXPRESSION_BIN_COMP__BCOMP:
        return getBcomp();
      case RoverDSLPackage.EXPRESSION_BIN_COMP__RIGHT:
        return getRight();
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
      case RoverDSLPackage.EXPRESSION_BIN_COMP__LEFT:
        setLeft((ValueExpression)newValue);
        return;
      case RoverDSLPackage.EXPRESSION_BIN_COMP__BCOMP:
        setBcomp((CompareOp)newValue);
        return;
      case RoverDSLPackage.EXPRESSION_BIN_COMP__RIGHT:
        setRight((ValueExpression)newValue);
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
      case RoverDSLPackage.EXPRESSION_BIN_COMP__LEFT:
        setLeft((ValueExpression)null);
        return;
      case RoverDSLPackage.EXPRESSION_BIN_COMP__BCOMP:
        setBcomp(BCOMP_EDEFAULT);
        return;
      case RoverDSLPackage.EXPRESSION_BIN_COMP__RIGHT:
        setRight((ValueExpression)null);
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
      case RoverDSLPackage.EXPRESSION_BIN_COMP__LEFT:
        return left != null;
      case RoverDSLPackage.EXPRESSION_BIN_COMP__BCOMP:
        return bcomp != BCOMP_EDEFAULT;
      case RoverDSLPackage.EXPRESSION_BIN_COMP__RIGHT:
        return right != null;
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
    result.append(" (bcomp: ");
    result.append(bcomp);
    result.append(')');
    return result.toString();
  }

} //ExpressionBinCompImpl
