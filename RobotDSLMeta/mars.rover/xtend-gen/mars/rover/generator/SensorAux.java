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
          _builder.append("Robot.colorSensorSample[0]");
          return _builder;
        case LIGHTSENSOR:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Robot.lightSensorSample[0]");
          return _builder_1;
        case ULTRASONICSENSOR:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("Robot.ultraSonicSensorSample[0]");
          return _builder_2;
        case TOUCHSENSORL:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("Robot.touchSensorLSample[0]");
          return _builder_3;
        case TOUCHSENSORR:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("Robot.touchSensorRSample[0]");
          return _builder_4;
        default:
          break;
      }
    }
    return null;
  }
}
