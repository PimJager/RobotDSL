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
import mars.rover.roverDSL.Color;
import mars.rover.roverDSL.ColorLiteral;
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
    int _aValue = e.getAValue();
    _builder.append(_aValue, "");
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
  
  protected static CharSequence _print(final ColorLiteral e) {
    Color _color = e.getColor();
    if (_color != null) {
      switch (_color) {
        case BLACK:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Color.BLACK");
          return _builder;
        case BLUE:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Color.BLUE");
          return _builder_1;
        case BROWN:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("Color.BROWN");
          return _builder_2;
        case CYAN:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("Color.CYAN");
          return _builder_3;
        case DARK_GRAY:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("Color.DARK_GRAY");
          return _builder_4;
        case GRAY:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("Color.GRAY");
          return _builder_5;
        case GREEN:
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("Color.GREEN");
          return _builder_6;
        case LIGHT_GRAY:
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("Color.LIGHT_GRAY");
          return _builder_7;
        case MAGENTA:
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append("Color.MAGENTA");
          return _builder_8;
        case ORANGE:
          StringConcatenation _builder_9 = new StringConcatenation();
          _builder_9.append("Color.ORANGE");
          return _builder_9;
        case PINK:
          StringConcatenation _builder_10 = new StringConcatenation();
          _builder_10.append("Color.PINK");
          return _builder_10;
        case RED:
          StringConcatenation _builder_11 = new StringConcatenation();
          _builder_11.append("Color.RED");
          return _builder_11;
        case WHITE:
          StringConcatenation _builder_12 = new StringConcatenation();
          _builder_12.append("Color.WHITE");
          return _builder_12;
        case YELLOW:
          StringConcatenation _builder_13 = new StringConcatenation();
          _builder_13.append("Color.YELLOW");
          return _builder_13;
        default:
          break;
      }
    }
    return null;
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
    } else if (e instanceof ColorLiteral) {
      return _print((ColorLiteral)e);
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
