/**
 */
package mars.rover.roverDSL.util;

import mars.rover.roverDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mars.rover.roverDSL.RoverDSLPackage
 * @generated
 */
public class RoverDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RoverDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoverDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RoverDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RoverDSLPackage.ROBOT:
      {
        Robot robot = (Robot)theEObject;
        T result = caseRobot(robot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.BEHAVIOR_NAME:
      {
        BehaviorName behaviorName = (BehaviorName)theEObject;
        T result = caseBehaviorName(behaviorName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.MOTOR:
      {
        Motor motor = (Motor)theEObject;
        T result = caseMotor(motor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.GLOBAL:
      {
        Global global = (Global)theEObject;
        T result = caseGlobal(global);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.STATIC:
      {
        Static static_ = (Static)theEObject;
        T result = caseStatic(static_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.IMPLEMENTATION:
      {
        Implementation implementation = (Implementation)theEObject;
        T result = caseImplementation(implementation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.SUB_ROUTINE:
      {
        SubRoutine subRoutine = (SubRoutine)theEObject;
        T result = caseSubRoutine(subRoutine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.VAL_EXPR:
      {
        ValExpr valExpr = (ValExpr)theEObject;
        T result = caseValExpr(valExpr);
        if (result == null) result = caseExpression(valExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.IF_EXPRESSION:
      {
        IFExpression ifExpression = (IFExpression)theEObject;
        T result = caseIFExpression(ifExpression);
        if (result == null) result = caseExpression(ifExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.WHILE_EXPRESSION:
      {
        WHILEExpression whileExpression = (WHILEExpression)theEObject;
        T result = caseWHILEExpression(whileExpression);
        if (result == null) result = caseExpression(whileExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.ASSIGN_EXPRESSION:
      {
        AssignExpression assignExpression = (AssignExpression)theEObject;
        T result = caseAssignExpression(assignExpression);
        if (result == null) result = caseExpression(assignExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = caseExpression(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.FORWARD_ACTION:
      {
        ForwardAction forwardAction = (ForwardAction)theEObject;
        T result = caseForwardAction(forwardAction);
        if (result == null) result = caseAction(forwardAction);
        if (result == null) result = caseExpression(forwardAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.ROTATE_ACTION:
      {
        RotateAction rotateAction = (RotateAction)theEObject;
        T result = caseRotateAction(rotateAction);
        if (result == null) result = caseAction(rotateAction);
        if (result == null) result = caseExpression(rotateAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.STOP_ACTION:
      {
        StopAction stopAction = (StopAction)theEObject;
        T result = caseStopAction(stopAction);
        if (result == null) result = caseAction(stopAction);
        if (result == null) result = caseExpression(stopAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.SACCELERATION_ACTION:
      {
        SAccelerationAction sAccelerationAction = (SAccelerationAction)theEObject;
        T result = caseSAccelerationAction(sAccelerationAction);
        if (result == null) result = caseAction(sAccelerationAction);
        if (result == null) result = caseExpression(sAccelerationAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.SSPEED_ACTION:
      {
        SSpeedAction sSpeedAction = (SSpeedAction)theEObject;
        T result = caseSSpeedAction(sSpeedAction);
        if (result == null) result = caseAction(sSpeedAction);
        if (result == null) result = caseExpression(sSpeedAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.SUB_ROUTINE_ACTION:
      {
        SubRoutineAction subRoutineAction = (SubRoutineAction)theEObject;
        T result = caseSubRoutineAction(subRoutineAction);
        if (result == null) result = caseAction(subRoutineAction);
        if (result == null) result = caseExpression(subRoutineAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.MEASURE_ACTION:
      {
        MeasureAction measureAction = (MeasureAction)theEObject;
        T result = caseMeasureAction(measureAction);
        if (result == null) result = caseAction(measureAction);
        if (result == null) result = caseExpression(measureAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.SHOW_ACTION:
      {
        ShowAction showAction = (ShowAction)theEObject;
        T result = caseShowAction(showAction);
        if (result == null) result = caseAction(showAction);
        if (result == null) result = caseExpression(showAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.SOUND_ACTION:
      {
        SoundAction soundAction = (SoundAction)theEObject;
        T result = caseSoundAction(soundAction);
        if (result == null) result = caseAction(soundAction);
        if (result == null) result = caseExpression(soundAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.FREE_ACTION:
      {
        FreeAction freeAction = (FreeAction)theEObject;
        T result = caseFreeAction(freeAction);
        if (result == null) result = caseAction(freeAction);
        if (result == null) result = caseExpression(freeAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.VALUE_EXPRESSION:
      {
        ValueExpression valueExpression = (ValueExpression)theEObject;
        T result = caseValueExpression(valueExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.BNOT_EXPR:
      {
        BNotExpr bNotExpr = (BNotExpr)theEObject;
        T result = caseBNotExpr(bNotExpr);
        if (result == null) result = caseValueExpression(bNotExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.BV_LITERAL:
      {
        BVLiteral bvLiteral = (BVLiteral)theEObject;
        T result = caseBVLiteral(bvLiteral);
        if (result == null) result = caseValueExpression(bvLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.BB_LITERAL:
      {
        BBLiteral bbLiteral = (BBLiteral)theEObject;
        T result = caseBBLiteral(bbLiteral);
        if (result == null) result = caseValueExpression(bbLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.BVAR_LITERAL:
      {
        BVarLiteral bVarLiteral = (BVarLiteral)theEObject;
        T result = caseBVarLiteral(bVarLiteral);
        if (result == null) result = caseValueExpression(bVarLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.BSENSOR_LITERAL:
      {
        BSensorLiteral bSensorLiteral = (BSensorLiteral)theEObject;
        T result = caseBSensorLiteral(bSensorLiteral);
        if (result == null) result = caseValueExpression(bSensorLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.BV_BRACKET:
      {
        BVBracket bvBracket = (BVBracket)theEObject;
        T result = caseBVBracket(bvBracket);
        if (result == null) result = caseValueExpression(bvBracket);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.COLOR_LITERAL:
      {
        ColorLiteral colorLiteral = (ColorLiteral)theEObject;
        T result = caseColorLiteral(colorLiteral);
        if (result == null) result = caseValueExpression(colorLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.EXPRESSION_BIN_OP:
      {
        ExpressionBinOp expressionBinOp = (ExpressionBinOp)theEObject;
        T result = caseExpressionBinOp(expressionBinOp);
        if (result == null) result = caseValueExpression(expressionBinOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoverDSLPackage.EXPRESSION_BIN_COMP:
      {
        ExpressionBinComp expressionBinComp = (ExpressionBinComp)theEObject;
        T result = caseExpressionBinComp(expressionBinComp);
        if (result == null) result = caseValueExpression(expressionBinComp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRobot(Robot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehaviorName(BehaviorName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Motor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Motor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMotor(Motor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobal(Global object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatic(Static object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementation(Implementation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Routine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Routine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubRoutine(SubRoutine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Val Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Val Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValExpr(ValExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IF Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IF Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIFExpression(IFExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WHILE Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WHILE Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWHILEExpression(WHILEExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignExpression(AssignExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forward Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forward Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForwardAction(ForwardAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotate Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotate Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotateAction(RotateAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stop Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stop Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStopAction(StopAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SAcceleration Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SAcceleration Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSAccelerationAction(SAccelerationAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SSpeed Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SSpeed Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSSpeedAction(SSpeedAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Routine Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Routine Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubRoutineAction(SubRoutineAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Measure Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measure Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeasureAction(MeasureAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Show Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Show Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShowAction(ShowAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sound Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sound Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoundAction(SoundAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Free Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Free Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFreeAction(FreeAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueExpression(ValueExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BNot Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BNot Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBNotExpr(BNotExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BV Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BV Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBVLiteral(BVLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BB Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BB Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBBLiteral(BBLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BVar Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BVar Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBVarLiteral(BVarLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BSensor Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BSensor Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSensorLiteral(BSensorLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BV Bracket</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BV Bracket</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBVBracket(BVBracket object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorLiteral(ColorLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Bin Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Bin Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionBinOp(ExpressionBinOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Bin Comp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Bin Comp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionBinComp(ExpressionBinComp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RoverDSLSwitch
