/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.BVLiteral;
import mars.rover.roverDSL.RoverDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BV Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.BVLiteralImpl#isNeg <em>Neg</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.BVLiteralImpl#getAValue <em>AValue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BVLiteralImpl extends ValueExpressionImpl implements BVLiteral
{
  /**
   * The default value of the '{@link #isNeg() <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNeg()
   * @generated
   * @ordered
   */
  protected static final boolean NEG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNeg() <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNeg()
   * @generated
   * @ordered
   */
  protected boolean neg = NEG_EDEFAULT;

  /**
   * The default value of the '{@link #getAValue() <em>AValue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAValue()
   * @generated
   * @ordered
   */
  protected static final int AVALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAValue() <em>AValue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAValue()
   * @generated
   * @ordered
   */
  protected int aValue = AVALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BVLiteralImpl()
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
    return RoverDSLPackage.Literals.BV_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNeg()
  {
    return neg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeg(boolean newNeg)
  {
    boolean oldNeg = neg;
    neg = newNeg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.BV_LITERAL__NEG, oldNeg, neg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAValue()
  {
    return aValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAValue(int newAValue)
  {
    int oldAValue = aValue;
    aValue = newAValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.BV_LITERAL__AVALUE, oldAValue, aValue));
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
      case RoverDSLPackage.BV_LITERAL__NEG:
        return isNeg();
      case RoverDSLPackage.BV_LITERAL__AVALUE:
        return getAValue();
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
      case RoverDSLPackage.BV_LITERAL__NEG:
        setNeg((Boolean)newValue);
        return;
      case RoverDSLPackage.BV_LITERAL__AVALUE:
        setAValue((Integer)newValue);
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
      case RoverDSLPackage.BV_LITERAL__NEG:
        setNeg(NEG_EDEFAULT);
        return;
      case RoverDSLPackage.BV_LITERAL__AVALUE:
        setAValue(AVALUE_EDEFAULT);
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
      case RoverDSLPackage.BV_LITERAL__NEG:
        return neg != NEG_EDEFAULT;
      case RoverDSLPackage.BV_LITERAL__AVALUE:
        return aValue != AVALUE_EDEFAULT;
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
    result.append(" (neg: ");
    result.append(neg);
    result.append(", aValue: ");
    result.append(aValue);
    result.append(')');
    return result.toString();
  }

} //BVLiteralImpl
