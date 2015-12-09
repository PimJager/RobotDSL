/**
 */
package mars.rover.roverDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mars.rover.roverDSL.RoverDSLPackage#getSensor()
 * @model
 * @generated
 */
public enum Sensor implements Enumerator
{
  /**
   * The '<em><b>COLORIDSENSOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COLORIDSENSOR_VALUE
   * @generated
   * @ordered
   */
  COLORIDSENSOR(0, "COLORIDSENSOR", "ColorID"),

  /**
   * The '<em><b>LEFTLIGHTSENSOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFTLIGHTSENSOR_VALUE
   * @generated
   * @ordered
   */
  LEFTLIGHTSENSOR(1, "LEFTLIGHTSENSOR", "LeftLight"),

  /**
   * The '<em><b>RIGHTLIGHTSENSOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHTLIGHTSENSOR_VALUE
   * @generated
   * @ordered
   */
  RIGHTLIGHTSENSOR(2, "RIGHTLIGHTSENSOR", "RightLight"),

  /**
   * The '<em><b>FRONTULTRASONICSENSOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRONTULTRASONICSENSOR_VALUE
   * @generated
   * @ordered
   */
  FRONTULTRASONICSENSOR(3, "FRONTULTRASONICSENSOR", "FrontUS"),

  /**
   * The '<em><b>REARULTRASONICSENSOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REARULTRASONICSENSOR_VALUE
   * @generated
   * @ordered
   */
  REARULTRASONICSENSOR(4, "REARULTRASONICSENSOR", "RearUS"),

  /**
   * The '<em><b>TOUCHSENSORL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOUCHSENSORL_VALUE
   * @generated
   * @ordered
   */
  TOUCHSENSORL(5, "TOUCHSENSORL", "LeftTouch"),

  /**
   * The '<em><b>TOUCHSENSORR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOUCHSENSORR_VALUE
   * @generated
   * @ordered
   */
  TOUCHSENSORR(6, "TOUCHSENSORR", "RightTouch"),

  /**
   * The '<em><b>ANGLESENSOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANGLESENSOR_VALUE
   * @generated
   * @ordered
   */
  ANGLESENSOR(7, "ANGLESENSOR", "Angle");

  /**
   * The '<em><b>COLORIDSENSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COLORIDSENSOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COLORIDSENSOR
   * @model literal="ColorID"
   * @generated
   * @ordered
   */
  public static final int COLORIDSENSOR_VALUE = 0;

  /**
   * The '<em><b>LEFTLIGHTSENSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LEFTLIGHTSENSOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEFTLIGHTSENSOR
   * @model literal="LeftLight"
   * @generated
   * @ordered
   */
  public static final int LEFTLIGHTSENSOR_VALUE = 1;

  /**
   * The '<em><b>RIGHTLIGHTSENSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RIGHTLIGHTSENSOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RIGHTLIGHTSENSOR
   * @model literal="RightLight"
   * @generated
   * @ordered
   */
  public static final int RIGHTLIGHTSENSOR_VALUE = 2;

  /**
   * The '<em><b>FRONTULTRASONICSENSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FRONTULTRASONICSENSOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRONTULTRASONICSENSOR
   * @model literal="FrontUS"
   * @generated
   * @ordered
   */
  public static final int FRONTULTRASONICSENSOR_VALUE = 3;

  /**
   * The '<em><b>REARULTRASONICSENSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REARULTRASONICSENSOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REARULTRASONICSENSOR
   * @model literal="RearUS"
   * @generated
   * @ordered
   */
  public static final int REARULTRASONICSENSOR_VALUE = 4;

  /**
   * The '<em><b>TOUCHSENSORL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TOUCHSENSORL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOUCHSENSORL
   * @model literal="LeftTouch"
   * @generated
   * @ordered
   */
  public static final int TOUCHSENSORL_VALUE = 5;

  /**
   * The '<em><b>TOUCHSENSORR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TOUCHSENSORR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOUCHSENSORR
   * @model literal="RightTouch"
   * @generated
   * @ordered
   */
  public static final int TOUCHSENSORR_VALUE = 6;

  /**
   * The '<em><b>ANGLESENSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANGLESENSOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANGLESENSOR
   * @model literal="Angle"
   * @generated
   * @ordered
   */
  public static final int ANGLESENSOR_VALUE = 7;

  /**
   * An array of all the '<em><b>Sensor</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Sensor[] VALUES_ARRAY =
    new Sensor[]
    {
      COLORIDSENSOR,
      LEFTLIGHTSENSOR,
      RIGHTLIGHTSENSOR,
      FRONTULTRASONICSENSOR,
      REARULTRASONICSENSOR,
      TOUCHSENSORL,
      TOUCHSENSORR,
      ANGLESENSOR,
    };

  /**
   * A public read-only list of all the '<em><b>Sensor</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Sensor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Sensor</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Sensor get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Sensor result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Sensor</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Sensor getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Sensor result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Sensor</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Sensor get(int value)
  {
    switch (value)
    {
      case COLORIDSENSOR_VALUE: return COLORIDSENSOR;
      case LEFTLIGHTSENSOR_VALUE: return LEFTLIGHTSENSOR;
      case RIGHTLIGHTSENSOR_VALUE: return RIGHTLIGHTSENSOR;
      case FRONTULTRASONICSENSOR_VALUE: return FRONTULTRASONICSENSOR;
      case REARULTRASONICSENSOR_VALUE: return REARULTRASONICSENSOR;
      case TOUCHSENSORL_VALUE: return TOUCHSENSORL;
      case TOUCHSENSORR_VALUE: return TOUCHSENSORR;
      case ANGLESENSOR_VALUE: return ANGLESENSOR;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Sensor(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Sensor
