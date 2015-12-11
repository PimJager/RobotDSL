package mars.rover.generator;

import java.util.Arrays;
import mars.rover.generator.SensorAux;
import mars.rover.roverDSL.BBLiteral;
import mars.rover.roverDSL.BBinaryOp;
import mars.rover.roverDSL.BNotExpr;
import mars.rover.roverDSL.BSensorLiteral;
import mars.rover.roverDSL.BVBracket;
import mars.rover.roverDSL.BVLiteral;
import mars.rover.roverDSL.BVarLiteral;
import mars.rover.roverDSL.CompareOp;
import mars.rover.roverDSL.ExpressionBinComp;
import mars.rover.roverDSL.ExpressionBinOp;
import mars.rover.roverDSL.Sensor;
import mars.rover.roverDSL.ValueExpression;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ValueExpressionPrinter {
  protected static CharSequence _print(final ExpressionBinOp e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Robot.normalise(Robot.makeBool(");
    ValueExpression _left = e.getLeft();
    CharSequence _print = ValueExpressionPrinter.print(_left);
    _builder.append(_print, "");
    _builder.append(") ");
    BBinaryOp _bop = e.getBop();
    String _printBOp = ValueExpressionPrinter.printBOp(_bop);
    _builder.append(_printBOp, "");
    _builder.append(" Robot.makeBool(");
    ValueExpression _right = e.getRight();
    CharSequence _print_1 = ValueExpressionPrinter.print(_right);
    _builder.append(_print_1, "");
    _builder.append("))");
    return _builder;
  }
  
  protected static CharSequence _print(final BNotExpr e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Robot.normalise(!Robot.makeBool(");
    ValueExpression _sub = e.getSub();
    CharSequence _print = ValueExpressionPrinter.print(_sub);
    _builder.append(_print, "");
    _builder.append("))");
    return _builder;
  }
  
  protected static CharSequence _print(final ExpressionBinComp e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Robot.normalise(");
    ValueExpression _left = e.getLeft();
    CharSequence _print = ValueExpressionPrinter.print(_left);
    _builder.append(_print, "");
    _builder.append(" ");
    CompareOp _bcomp = e.getBcomp();
    String _printCOP = ValueExpressionPrinter.printCOP(_bcomp);
    _builder.append(_printCOP, "");
    _builder.append(" ");
    ValueExpression _right = e.getRight();
    CharSequence _print_1 = ValueExpressionPrinter.print(_right);
    _builder.append(_print_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _print(final BVLiteral e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      boolean _isNeg = e.isNeg();
      if (_isNeg) {
        _builder.append("-");
      }
    }
    {
      int _fraction = e.getFraction();
      boolean _notEquals = (_fraction != 0);
      if (_notEquals) {
        _builder.append("(float)");
        int _aValue = e.getAValue();
        _builder.append(_aValue, "");
        _builder.append("/(float)");
        int _fraction_1 = e.getFraction();
        _builder.append(_fraction_1, "");
      } else {
        int _aValue_1 = e.getAValue();
        _builder.append(_aValue_1, "");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _print(final BBLiteral e) {
    boolean _isBValue = e.isBValue();
    if (_isBValue) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("1");
      return _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("0");
      return _builder_1;
    }
  }
  
  protected static CharSequence _print(final BVarLiteral e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(Robot.");
    String _var = e.getVar();
    _builder.append(_var, "");
    _builder.append(")");
    return _builder;
  }
  
  /**
   * for now all variables are global
   */
  protected static CharSequence _print(final BSensorLiteral e) {
    Sensor _sensor = e.getSensor();
    return SensorAux.printVal(_sensor);
  }
  
  protected static CharSequence _print(final BVBracket e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    ValueExpression _bsub = e.getBsub();
    CharSequence _print = ValueExpressionPrinter.print(_bsub);
    _builder.append(_print, "");
    _builder.append(")");
    return _builder;
  }
  
  public static String printBOp(final BBinaryOp op) {
    if (op != null) {
      switch (op) {
        case AND:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("&&");
          return _builder.toString();
        case OR:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("||");
          return _builder_1.toString();
        default:
          break;
      }
    }
    return null;
  }
  
  public static String printCOP(final CompareOp op) {
    if (op != null) {
      switch (op) {
        case EQ:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("==");
          return _builder.toString();
        case NEQ:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("!=");
          return _builder_1.toString();
        case GEQ:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(">=");
          return _builder_2.toString();
        case GT:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append(">");
          return _builder_3.toString();
        case LEQ:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("<=");
          return _builder_4.toString();
        case LT:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("<");
          return _builder_5.toString();
        default:
          break;
      }
    }
    return null;
  }
  
  public static CharSequence print(final ValueExpression e) {
    if (e instanceof BBLiteral) {
      return _print((BBLiteral)e);
    } else if (e instanceof BNotExpr) {
      return _print((BNotExpr)e);
    } else if (e instanceof BSensorLiteral) {
      return _print((BSensorLiteral)e);
    } else if (e instanceof BVBracket) {
      return _print((BVBracket)e);
    } else if (e instanceof BVLiteral) {
      return _print((BVLiteral)e);
    } else if (e instanceof BVarLiteral) {
      return _print((BVarLiteral)e);
    } else if (e instanceof ExpressionBinComp) {
      return _print((ExpressionBinComp)e);
    } else if (e instanceof ExpressionBinOp) {
      return _print((ExpressionBinOp)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
