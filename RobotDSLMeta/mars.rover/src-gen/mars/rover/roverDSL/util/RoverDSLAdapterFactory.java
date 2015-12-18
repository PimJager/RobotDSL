/**
 */
package mars.rover.roverDSL.util;

import mars.rover.roverDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mars.rover.roverDSL.RoverDSLPackage
 * @generated
 */
public class RoverDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RoverDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoverDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RoverDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoverDSLSwitch<Adapter> modelSwitch =
    new RoverDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseRobot(Robot object)
      {
        return createRobotAdapter();
      }
      @Override
      public Adapter caseBehaviorName(BehaviorName object)
      {
        return createBehaviorNameAdapter();
      }
      @Override
      public Adapter caseMotor(Motor object)
      {
        return createMotorAdapter();
      }
      @Override
      public Adapter caseGlobal(Global object)
      {
        return createGlobalAdapter();
      }
      @Override
      public Adapter caseStatic(Static object)
      {
        return createStaticAdapter();
      }
      @Override
      public Adapter caseImplementation(Implementation object)
      {
        return createImplementationAdapter();
      }
      @Override
      public Adapter caseSubRoutine(SubRoutine object)
      {
        return createSubRoutineAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseValExpr(ValExpr object)
      {
        return createValExprAdapter();
      }
      @Override
      public Adapter caseIFExpression(IFExpression object)
      {
        return createIFExpressionAdapter();
      }
      @Override
      public Adapter caseWHILEExpression(WHILEExpression object)
      {
        return createWHILEExpressionAdapter();
      }
      @Override
      public Adapter caseAssignExpression(AssignExpression object)
      {
        return createAssignExpressionAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseForwardAction(ForwardAction object)
      {
        return createForwardActionAdapter();
      }
      @Override
      public Adapter caseRotateAction(RotateAction object)
      {
        return createRotateActionAdapter();
      }
      @Override
      public Adapter caseStopAction(StopAction object)
      {
        return createStopActionAdapter();
      }
      @Override
      public Adapter caseSAccelerationAction(SAccelerationAction object)
      {
        return createSAccelerationActionAdapter();
      }
      @Override
      public Adapter caseSSpeedAction(SSpeedAction object)
      {
        return createSSpeedActionAdapter();
      }
      @Override
      public Adapter caseSubRoutineAction(SubRoutineAction object)
      {
        return createSubRoutineActionAdapter();
      }
      @Override
      public Adapter caseMeasureAction(MeasureAction object)
      {
        return createMeasureActionAdapter();
      }
      @Override
      public Adapter caseShowAction(ShowAction object)
      {
        return createShowActionAdapter();
      }
      @Override
      public Adapter caseSoundAction(SoundAction object)
      {
        return createSoundActionAdapter();
      }
      @Override
      public Adapter caseFreeAction(FreeAction object)
      {
        return createFreeActionAdapter();
      }
      @Override
      public Adapter caseValueExpression(ValueExpression object)
      {
        return createValueExpressionAdapter();
      }
      @Override
      public Adapter caseBNotExpr(BNotExpr object)
      {
        return createBNotExprAdapter();
      }
      @Override
      public Adapter caseBVLiteral(BVLiteral object)
      {
        return createBVLiteralAdapter();
      }
      @Override
      public Adapter caseBBLiteral(BBLiteral object)
      {
        return createBBLiteralAdapter();
      }
      @Override
      public Adapter caseBVarLiteral(BVarLiteral object)
      {
        return createBVarLiteralAdapter();
      }
      @Override
      public Adapter caseBSensorLiteral(BSensorLiteral object)
      {
        return createBSensorLiteralAdapter();
      }
      @Override
      public Adapter caseBVBracket(BVBracket object)
      {
        return createBVBracketAdapter();
      }
      @Override
      public Adapter caseColorLiteral(ColorLiteral object)
      {
        return createColorLiteralAdapter();
      }
      @Override
      public Adapter caseExpressionBinOp(ExpressionBinOp object)
      {
        return createExpressionBinOpAdapter();
      }
      @Override
      public Adapter caseExpressionBinComp(ExpressionBinComp object)
      {
        return createExpressionBinCompAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.Robot
   * @generated
   */
  public Adapter createRobotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.BehaviorName <em>Behavior Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.BehaviorName
   * @generated
   */
  public Adapter createBehaviorNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.Motor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.Motor
   * @generated
   */
  public Adapter createMotorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.Global <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.Global
   * @generated
   */
  public Adapter createGlobalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.Static <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.Static
   * @generated
   */
  public Adapter createStaticAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.Implementation <em>Implementation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.Implementation
   * @generated
   */
  public Adapter createImplementationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.SubRoutine <em>Sub Routine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.SubRoutine
   * @generated
   */
  public Adapter createSubRoutineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.ValExpr <em>Val Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.ValExpr
   * @generated
   */
  public Adapter createValExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.IFExpression <em>IF Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.IFExpression
   * @generated
   */
  public Adapter createIFExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.WHILEExpression <em>WHILE Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.WHILEExpression
   * @generated
   */
  public Adapter createWHILEExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.AssignExpression <em>Assign Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.AssignExpression
   * @generated
   */
  public Adapter createAssignExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.ForwardAction <em>Forward Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.ForwardAction
   * @generated
   */
  public Adapter createForwardActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.RotateAction <em>Rotate Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.RotateAction
   * @generated
   */
  public Adapter createRotateActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.StopAction <em>Stop Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.StopAction
   * @generated
   */
  public Adapter createStopActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.SAccelerationAction <em>SAcceleration Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.SAccelerationAction
   * @generated
   */
  public Adapter createSAccelerationActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.SSpeedAction <em>SSpeed Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.SSpeedAction
   * @generated
   */
  public Adapter createSSpeedActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.SubRoutineAction <em>Sub Routine Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.SubRoutineAction
   * @generated
   */
  public Adapter createSubRoutineActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.MeasureAction <em>Measure Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.MeasureAction
   * @generated
   */
  public Adapter createMeasureActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.ShowAction <em>Show Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.ShowAction
   * @generated
   */
  public Adapter createShowActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.SoundAction <em>Sound Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.SoundAction
   * @generated
   */
  public Adapter createSoundActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.FreeAction <em>Free Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.FreeAction
   * @generated
   */
  public Adapter createFreeActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.ValueExpression <em>Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.ValueExpression
   * @generated
   */
  public Adapter createValueExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.BNotExpr <em>BNot Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.BNotExpr
   * @generated
   */
  public Adapter createBNotExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.BVLiteral <em>BV Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.BVLiteral
   * @generated
   */
  public Adapter createBVLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.BBLiteral <em>BB Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.BBLiteral
   * @generated
   */
  public Adapter createBBLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.BVarLiteral <em>BVar Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.BVarLiteral
   * @generated
   */
  public Adapter createBVarLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.BSensorLiteral <em>BSensor Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.BSensorLiteral
   * @generated
   */
  public Adapter createBSensorLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.BVBracket <em>BV Bracket</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.BVBracket
   * @generated
   */
  public Adapter createBVBracketAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.ColorLiteral <em>Color Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.ColorLiteral
   * @generated
   */
  public Adapter createColorLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.ExpressionBinOp <em>Expression Bin Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.ExpressionBinOp
   * @generated
   */
  public Adapter createExpressionBinOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mars.rover.roverDSL.ExpressionBinComp <em>Expression Bin Comp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mars.rover.roverDSL.ExpressionBinComp
   * @generated
   */
  public Adapter createExpressionBinCompAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RoverDSLAdapterFactory
