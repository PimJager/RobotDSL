package mars.rover.generator;

import mars.rover.roverDSL.Sensor;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SensorAux {
  public static CharSequence printVal(final Sensor s) {
    if (s != null) {
      switch (s) {
        case COLORIDSENSOR:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Robot.colorSample");
          return _builder;
        case LEFTLIGHTSENSOR:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Robot.leftLightSample");
          return _builder_1;
        case RIGHTLIGHTSENSOR:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("Robot.rightLightSample");
          return _builder_2;
        case FRONTULTRASONICSENSOR:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("Robot.frontUSSample");
          return _builder_3;
        case REARULTRASONICSENSOR:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("Robot.rearUSSample");
          return _builder_4;
        case TOUCHSENSORL:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("Robot.touchLeftSample");
          return _builder_5;
        case TOUCHSENSORR:
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("Robot.touchRightSample");
          return _builder_6;
        case ANGLESENSOR:
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("Robot.gyroSample");
          return _builder_7;
        default:
          break;
      }
    }
    return null;
  }
}
