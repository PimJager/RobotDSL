/**
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.SubRoutine;
import mars.rover.roverDSL.SubRoutineAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Routine Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.SubRoutineActionImpl#getRoutine <em>Routine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubRoutineActionImpl extends ActionImpl implements SubRoutineAction
{
  /**
   * The cached value of the '{@link #getRoutine() <em>Routine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoutine()
   * @generated
   * @ordered
   */
  protected SubRoutine routine;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubRoutineActionImpl()
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
    return RoverDSLPackage.Literals.SUB_ROUTINE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubRoutine getRoutine()
  {
    if (routine != null && routine.eIsProxy())
    {
      InternalEObject oldRoutine = (InternalEObject)routine;
      routine = (SubRoutine)eResolveProxy(oldRoutine);
      if (routine != oldRoutine)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverDSLPackage.SUB_ROUTINE_ACTION__ROUTINE, oldRoutine, routine));
      }
    }
    return routine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubRoutine basicGetRoutine()
  {
    return routine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoutine(SubRoutine newRoutine)
  {
    SubRoutine oldRoutine = routine;
    routine = newRoutine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.SUB_ROUTINE_ACTION__ROUTINE, oldRoutine, routine));
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
      case RoverDSLPackage.SUB_ROUTINE_ACTION__ROUTINE:
        if (resolve) return getRoutine();
        return basicGetRoutine();
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
      case RoverDSLPackage.SUB_ROUTINE_ACTION__ROUTINE:
        setRoutine((SubRoutine)newValue);
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
      case RoverDSLPackage.SUB_ROUTINE_ACTION__ROUTINE:
        setRoutine((SubRoutine)null);
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
      case RoverDSLPackage.SUB_ROUTINE_ACTION__ROUTINE:
        return routine != null;
    }
    return super.eIsSet(featureID);
  }

} //SubRoutineActionImpl
