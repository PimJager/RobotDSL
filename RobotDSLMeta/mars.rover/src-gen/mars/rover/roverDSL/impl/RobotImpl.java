/**
 */
package mars.rover.roverDSL.impl;

import java.util.Collection;

import mars.rover.roverDSL.BehaviorName;
import mars.rover.roverDSL.Global;
import mars.rover.roverDSL.Implementation;
import mars.rover.roverDSL.Robot;
import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.Static;
import mars.rover.roverDSL.SubRoutine;
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
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.rover.roverDSL.impl.RobotImpl#getBehaviorOrder <em>Behavior Order</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.RobotImpl#getGlobals <em>Globals</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.RobotImpl#getStatics <em>Statics</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.RobotImpl#getStopBehaviour <em>Stop Behaviour</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.RobotImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link mars.rover.roverDSL.impl.RobotImpl#getSubRoutines <em>Sub Routines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot
{
  /**
   * The cached value of the '{@link #getBehaviorOrder() <em>Behavior Order</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviorOrder()
   * @generated
   * @ordered
   */
  protected EList<BehaviorName> behaviorOrder;

  /**
   * The cached value of the '{@link #getGlobals() <em>Globals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobals()
   * @generated
   * @ordered
   */
  protected EList<Global> globals;

  /**
   * The cached value of the '{@link #getStatics() <em>Statics</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatics()
   * @generated
   * @ordered
   */
  protected EList<Static> statics;

  /**
   * The cached value of the '{@link #getStopBehaviour() <em>Stop Behaviour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopBehaviour()
   * @generated
   * @ordered
   */
  protected ValueExpression stopBehaviour;

  /**
   * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviors()
   * @generated
   * @ordered
   */
  protected EList<Implementation> behaviors;

  /**
   * The cached value of the '{@link #getSubRoutines() <em>Sub Routines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubRoutines()
   * @generated
   * @ordered
   */
  protected EList<SubRoutine> subRoutines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RobotImpl()
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
    return RoverDSLPackage.Literals.ROBOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BehaviorName> getBehaviorOrder()
  {
    if (behaviorOrder == null)
    {
      behaviorOrder = new EObjectContainmentEList<BehaviorName>(BehaviorName.class, this, RoverDSLPackage.ROBOT__BEHAVIOR_ORDER);
    }
    return behaviorOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Global> getGlobals()
  {
    if (globals == null)
    {
      globals = new EObjectContainmentEList<Global>(Global.class, this, RoverDSLPackage.ROBOT__GLOBALS);
    }
    return globals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Static> getStatics()
  {
    if (statics == null)
    {
      statics = new EObjectContainmentEList<Static>(Static.class, this, RoverDSLPackage.ROBOT__STATICS);
    }
    return statics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getStopBehaviour()
  {
    return stopBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStopBehaviour(ValueExpression newStopBehaviour, NotificationChain msgs)
  {
    ValueExpression oldStopBehaviour = stopBehaviour;
    stopBehaviour = newStopBehaviour;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverDSLPackage.ROBOT__STOP_BEHAVIOUR, oldStopBehaviour, newStopBehaviour);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStopBehaviour(ValueExpression newStopBehaviour)
  {
    if (newStopBehaviour != stopBehaviour)
    {
      NotificationChain msgs = null;
      if (stopBehaviour != null)
        msgs = ((InternalEObject)stopBehaviour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.ROBOT__STOP_BEHAVIOUR, null, msgs);
      if (newStopBehaviour != null)
        msgs = ((InternalEObject)newStopBehaviour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverDSLPackage.ROBOT__STOP_BEHAVIOUR, null, msgs);
      msgs = basicSetStopBehaviour(newStopBehaviour, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoverDSLPackage.ROBOT__STOP_BEHAVIOUR, newStopBehaviour, newStopBehaviour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Implementation> getBehaviors()
  {
    if (behaviors == null)
    {
      behaviors = new EObjectContainmentEList<Implementation>(Implementation.class, this, RoverDSLPackage.ROBOT__BEHAVIORS);
    }
    return behaviors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubRoutine> getSubRoutines()
  {
    if (subRoutines == null)
    {
      subRoutines = new EObjectContainmentEList<SubRoutine>(SubRoutine.class, this, RoverDSLPackage.ROBOT__SUB_ROUTINES);
    }
    return subRoutines;
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
      case RoverDSLPackage.ROBOT__BEHAVIOR_ORDER:
        return ((InternalEList<?>)getBehaviorOrder()).basicRemove(otherEnd, msgs);
      case RoverDSLPackage.ROBOT__GLOBALS:
        return ((InternalEList<?>)getGlobals()).basicRemove(otherEnd, msgs);
      case RoverDSLPackage.ROBOT__STATICS:
        return ((InternalEList<?>)getStatics()).basicRemove(otherEnd, msgs);
      case RoverDSLPackage.ROBOT__STOP_BEHAVIOUR:
        return basicSetStopBehaviour(null, msgs);
      case RoverDSLPackage.ROBOT__BEHAVIORS:
        return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
      case RoverDSLPackage.ROBOT__SUB_ROUTINES:
        return ((InternalEList<?>)getSubRoutines()).basicRemove(otherEnd, msgs);
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
      case RoverDSLPackage.ROBOT__BEHAVIOR_ORDER:
        return getBehaviorOrder();
      case RoverDSLPackage.ROBOT__GLOBALS:
        return getGlobals();
      case RoverDSLPackage.ROBOT__STATICS:
        return getStatics();
      case RoverDSLPackage.ROBOT__STOP_BEHAVIOUR:
        return getStopBehaviour();
      case RoverDSLPackage.ROBOT__BEHAVIORS:
        return getBehaviors();
      case RoverDSLPackage.ROBOT__SUB_ROUTINES:
        return getSubRoutines();
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
      case RoverDSLPackage.ROBOT__BEHAVIOR_ORDER:
        getBehaviorOrder().clear();
        getBehaviorOrder().addAll((Collection<? extends BehaviorName>)newValue);
        return;
      case RoverDSLPackage.ROBOT__GLOBALS:
        getGlobals().clear();
        getGlobals().addAll((Collection<? extends Global>)newValue);
        return;
      case RoverDSLPackage.ROBOT__STATICS:
        getStatics().clear();
        getStatics().addAll((Collection<? extends Static>)newValue);
        return;
      case RoverDSLPackage.ROBOT__STOP_BEHAVIOUR:
        setStopBehaviour((ValueExpression)newValue);
        return;
      case RoverDSLPackage.ROBOT__BEHAVIORS:
        getBehaviors().clear();
        getBehaviors().addAll((Collection<? extends Implementation>)newValue);
        return;
      case RoverDSLPackage.ROBOT__SUB_ROUTINES:
        getSubRoutines().clear();
        getSubRoutines().addAll((Collection<? extends SubRoutine>)newValue);
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
      case RoverDSLPackage.ROBOT__BEHAVIOR_ORDER:
        getBehaviorOrder().clear();
        return;
      case RoverDSLPackage.ROBOT__GLOBALS:
        getGlobals().clear();
        return;
      case RoverDSLPackage.ROBOT__STATICS:
        getStatics().clear();
        return;
      case RoverDSLPackage.ROBOT__STOP_BEHAVIOUR:
        setStopBehaviour((ValueExpression)null);
        return;
      case RoverDSLPackage.ROBOT__BEHAVIORS:
        getBehaviors().clear();
        return;
      case RoverDSLPackage.ROBOT__SUB_ROUTINES:
        getSubRoutines().clear();
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
      case RoverDSLPackage.ROBOT__BEHAVIOR_ORDER:
        return behaviorOrder != null && !behaviorOrder.isEmpty();
      case RoverDSLPackage.ROBOT__GLOBALS:
        return globals != null && !globals.isEmpty();
      case RoverDSLPackage.ROBOT__STATICS:
        return statics != null && !statics.isEmpty();
      case RoverDSLPackage.ROBOT__STOP_BEHAVIOUR:
        return stopBehaviour != null;
      case RoverDSLPackage.ROBOT__BEHAVIORS:
        return behaviors != null && !behaviors.isEmpty();
      case RoverDSLPackage.ROBOT__SUB_ROUTINES:
        return subRoutines != null && !subRoutines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RobotImpl
