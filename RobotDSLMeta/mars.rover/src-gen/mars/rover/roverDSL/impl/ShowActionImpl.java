/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.Sensor;
import mars.rover.roverDSL.ShowAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Show Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.ShowActionImpl#getString <em>String</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.ShowActionImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShowActionImpl extends ActionImpl implements ShowAction
{
  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getSensor() <em>Sensor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensor()
   * @generated
   * @ordered
   */
  protected static final Sensor SENSOR_EDEFAULT = Sensor.COLORIDSENSOR;

  /**
   * The cached value of the '{@link #getSensor() <em>Sensor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensor()
   * @generated
   * @ordered
   */
  protected Sensor sensor = SENSOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShowActionImpl()
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
    return RoverDSLPackage.Literals.SHOW_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.SHOW_ACTION__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor getSensor()
  {
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSensor(Sensor newSensor)
  {
    Sensor oldSensor = sensor;
    sensor = newSensor == null ? SENSOR_EDEFAULT : newSensor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.SHOW_ACTION__SENSOR, oldSensor, sensor));
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
      case RoverDSLPackage.SHOW_ACTION__STRING:
        return getString();
      case RoverDSLPackage.SHOW_ACTION__SENSOR:
        return getSensor();
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
      case RoverDSLPackage.SHOW_ACTION__STRING:
        setString((String)newValue);
        return;
      case RoverDSLPackage.SHOW_ACTION__SENSOR:
        setSensor((Sensor)newValue);
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
      case RoverDSLPackage.SHOW_ACTION__STRING:
        setString(STRING_EDEFAULT);
        return;
      case RoverDSLPackage.SHOW_ACTION__SENSOR:
        setSensor(SENSOR_EDEFAULT);
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
      case RoverDSLPackage.SHOW_ACTION__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case RoverDSLPackage.SHOW_ACTION__SENSOR:
        return sensor != SENSOR_EDEFAULT;
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
    result.append(" (string: ");
    result.append(string);
    result.append(", sensor: ");
    result.append(sensor);
    result.append(')');
    return result.toString();
  }

} //ShowActionImpl
