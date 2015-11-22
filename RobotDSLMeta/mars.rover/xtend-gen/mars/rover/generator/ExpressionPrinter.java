package mars.rover.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import mars.rover.generator.RobotGenerator;
import mars.rover.generator.ValueExpressionPrinter;
import mars.rover.roverDSL.AssignExpression;
import mars.rover.roverDSL.EMotor;
import mars.rover.roverDSL.Expression;
import mars.rover.roverDSL.ForwardAction;
import mars.rover.roverDSL.Global;
import mars.rover.roverDSL.IFExpression;
import mars.rover.roverDSL.Motor;
import mars.rover.roverDSL.RotateAction;
import mars.rover.roverDSL.SAccelerationAction;
import mars.rover.roverDSL.SSpeedAction;
import mars.rover.roverDSL.StopAction;
import mars.rover.roverDSL.SubRoutine;
import mars.rover.roverDSL.SubRoutineAction;
import mars.rover.roverDSL.ValExpr;
import mars.rover.roverDSL.ValueExpression;
import mars.rover.roverDSL.WHILEExpression;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ExpressionPrinter {
  protected static CharSequence _print(final ValExpr e) {
    ValueExpression _vExpr = e.getVExpr();
    return ValueExpressionPrinter.print(_vExpr);
  }
  
  protected static CharSequence _print(final AssignExpression e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Robot.");
    Global _global = e.getGlobal();
    String _name = _global.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    ValueExpression _v = e.getV();
    CharSequence _print = ValueExpressionPrinter.print(_v);
    _builder.append(_print, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _print(final IFExpression e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(Robot.iToB(");
    ValueExpression _c = e.getC();
    CharSequence _print = ValueExpressionPrinter.print(_c);
    _builder.append(_print, "");
    _builder.append(")){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<Expression> _t = e.getT();
    CharSequence _printExprList = ExpressionPrinter.printExprList(_t);
    _builder.append(_printExprList, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t");
    EList<Expression> _e = e.getE();
    CharSequence _printExprList_1 = ExpressionPrinter.printExprList(_e);
    _builder.append(_printExprList_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  protected static CharSequence _print(final WHILEExpression e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while(Robot.iToB(");
    ValueExpression _c = e.getC();
    CharSequence _print = ValueExpressionPrinter.print(_c);
    _builder.append(_print, "");
    _builder.append(")){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<Expression> _b = e.getB();
    CharSequence _printExprList = ExpressionPrinter.printExprList(_b);
    _builder.append(_printExprList, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  protected static CharSequence _print(final ForwardAction a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _shouldSuppress = RobotGenerator.shouldSuppress();
      if (_shouldSuppress) {
        _builder.append("if(_supressed) return; ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Motor _motor = a.getMotor();
      boolean _equals = Objects.equal(_motor, null);
      if (_equals) {
        _builder.append("Robot.leftMotor.forward();");
        _builder.newLine();
        _builder.append("Robot.rightMotor.forward();");
        _builder.newLine();
      } else {
        {
          Motor _motor_1 = a.getMotor();
          EMotor _m = _motor_1.getM();
          boolean _equals_1 = Objects.equal(_m, EMotor.LEFTMOTOR);
          if (_equals_1) {
            _builder.append("Robot.leftMotor.forward();");
            _builder.newLine();
          }
        }
        {
          Motor _motor_2 = a.getMotor();
          EMotor _m_1 = _motor_2.getM();
          boolean _equals_2 = Objects.equal(_m_1, EMotor.RIGHTMOTOR);
          if (_equals_2) {
            _builder.append("Robot.rightMotor.forward();");
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    _builder.append("\t");
    return _builder;
  }
  
  protected static CharSequence _print(final RotateAction a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _shouldSuppress = RobotGenerator.shouldSuppress();
      if (_shouldSuppress) {
        _builder.append("if(_supressed) return; ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Motor _motor = a.getMotor();
      EMotor _m = _motor.getM();
      boolean _equals = Objects.equal(_m, EMotor.LEFTMOTOR);
      if (_equals) {
        _builder.append("Robot.leftMotor.rotate(");
        ValueExpression _degrees = a.getDegrees();
        CharSequence _print = ValueExpressionPrinter.print(_degrees);
        _builder.append(_print, "");
        _builder.append(",");
        {
          boolean _isBlocking = a.isBlocking();
          if (_isBlocking) {
            _builder.append("false");
          } else {
            _builder.append("true);");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Motor _motor_1 = a.getMotor();
      EMotor _m_1 = _motor_1.getM();
      boolean _equals_1 = Objects.equal(_m_1, EMotor.RIGHTMOTOR);
      if (_equals_1) {
        _builder.append("Robot.rightMotor.rotate(");
        ValueExpression _degrees_1 = a.getDegrees();
        CharSequence _print_1 = ValueExpressionPrinter.print(_degrees_1);
        _builder.append(_print_1, "");
        _builder.append(",");
        {
          boolean _isBlocking_1 = a.isBlocking();
          if (_isBlocking_1) {
            _builder.append("false");
          } else {
            _builder.append("true);");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected static CharSequence _print(final StopAction a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _shouldSuppress = RobotGenerator.shouldSuppress();
      if (_shouldSuppress) {
        _builder.append("if(_supressed) return; ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Motor _motor = a.getMotor();
      boolean _equals = Objects.equal(_motor, null);
      if (_equals) {
        _builder.append("Robot.leftMotor.stop();");
        _builder.newLine();
        _builder.append("Robot.rightMotor.sop();");
        _builder.newLine();
      } else {
        {
          Motor _motor_1 = a.getMotor();
          EMotor _m = _motor_1.getM();
          boolean _equals_1 = Objects.equal(_m, EMotor.LEFTMOTOR);
          if (_equals_1) {
            _builder.append("Robot.leftMotor.stop();");
            _builder.newLine();
          }
        }
        {
          Motor _motor_2 = a.getMotor();
          EMotor _m_1 = _motor_2.getM();
          boolean _equals_2 = Objects.equal(_m_1, EMotor.RIGHTMOTOR);
          if (_equals_2) {
            _builder.append("Robot.rightMotor.stop();");
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _print(final SAccelerationAction a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _shouldSuppress = RobotGenerator.shouldSuppress();
      if (_shouldSuppress) {
        _builder.append("if(_supressed) return; ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Motor _motor = a.getMotor();
      boolean _equals = Objects.equal(_motor, null);
      if (_equals) {
        _builder.append("Robot.leftMotor.setAcceleration(");
        ValueExpression _v = a.getV();
        CharSequence _print = ValueExpressionPrinter.print(_v);
        _builder.append(_print, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("Robot.rightMotor.setAcceleration(");
        ValueExpression _v_1 = a.getV();
        CharSequence _print_1 = ValueExpressionPrinter.print(_v_1);
        _builder.append(_print_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        {
          Motor _motor_1 = a.getMotor();
          EMotor _m = _motor_1.getM();
          boolean _equals_1 = Objects.equal(_m, EMotor.LEFTMOTOR);
          if (_equals_1) {
            _builder.append("Robot.leftMotor.setAcceleration(");
            ValueExpression _v_2 = a.getV();
            CharSequence _print_2 = ValueExpressionPrinter.print(_v_2);
            _builder.append(_print_2, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          Motor _motor_2 = a.getMotor();
          EMotor _m_1 = _motor_2.getM();
          boolean _equals_2 = Objects.equal(_m_1, EMotor.RIGHTMOTOR);
          if (_equals_2) {
            _builder.append("Robot.rightMotor.setAcceleration(");
            ValueExpression _v_3 = a.getV();
            CharSequence _print_3 = ValueExpressionPrinter.print(_v_3);
            _builder.append(_print_3, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _print(final SSpeedAction a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _shouldSuppress = RobotGenerator.shouldSuppress();
      if (_shouldSuppress) {
        _builder.append("if(_supressed) return; ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Motor _motor = a.getMotor();
      boolean _equals = Objects.equal(_motor, null);
      if (_equals) {
        _builder.append("Robot.leftMotor.setSpeed(");
        ValueExpression _v = a.getV();
        CharSequence _print = ValueExpressionPrinter.print(_v);
        _builder.append(_print, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("Robot.rightMotor.setSpeed(");
        ValueExpression _v_1 = a.getV();
        CharSequence _print_1 = ValueExpressionPrinter.print(_v_1);
        _builder.append(_print_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        {
          Motor _motor_1 = a.getMotor();
          EMotor _m = _motor_1.getM();
          boolean _equals_1 = Objects.equal(_m, EMotor.LEFTMOTOR);
          if (_equals_1) {
            _builder.append("Robot.leftMotor.setSpeed(");
            ValueExpression _v_2 = a.getV();
            CharSequence _print_2 = ValueExpressionPrinter.print(_v_2);
            _builder.append(_print_2, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          Motor _motor_2 = a.getMotor();
          EMotor _m_1 = _motor_2.getM();
          boolean _equals_2 = Objects.equal(_m_1, EMotor.RIGHTMOTOR);
          if (_equals_2) {
            _builder.append("Robot.rightMotor.setSpeed(");
            ValueExpression _v_3 = a.getV();
            CharSequence _print_3 = ValueExpressionPrinter.print(_v_3);
            _builder.append(_print_3, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _print(final SubRoutineAction a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Robot.");
    SubRoutine _routine = a.getRoutine();
    String _name = _routine.getName();
    _builder.append(_name, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence printExprList(final EList<Expression> es) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final Expression e : es) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        CharSequence _print = ExpressionPrinter.print(e);
        _builder.append(_print, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence print(final Expression a) {
    if (a instanceof ForwardAction) {
      return _print((ForwardAction)a);
    } else if (a instanceof RotateAction) {
      return _print((RotateAction)a);
    } else if (a instanceof SAccelerationAction) {
      return _print((SAccelerationAction)a);
    } else if (a instanceof SSpeedAction) {
      return _print((SSpeedAction)a);
    } else if (a instanceof StopAction) {
      return _print((StopAction)a);
    } else if (a instanceof SubRoutineAction) {
      return _print((SubRoutineAction)a);
    } else if (a instanceof AssignExpression) {
      return _print((AssignExpression)a);
    } else if (a instanceof IFExpression) {
      return _print((IFExpression)a);
    } else if (a instanceof ValExpr) {
      return _print((ValExpr)a);
    } else if (a instanceof WHILEExpression) {
      return _print((WHILEExpression)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
}
