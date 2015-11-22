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
  COLORIDSENSOR(0, "COLORIDSENSOR", "ColorIDSensor"),

  /**
   * The '<em><b>LIGHTSENSOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIGHTSENSOR_VALUE
   * @generated
   * @ordered
   */
  LIGHTSENSOR(1, "LIGHTSENSOR", "LightSensor"),

  /**
   * The '<em><b>ULTRASONICSENSOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ULTRASONICSENSOR_VALUE
   * @generated
   * @ordered
   */
  ULTRASONICSENSOR(2, "ULTRASONICSENSOR", "UltraSonicSensor"),

  /**
   * The '<em><b>TOUCHSENSORL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOUCHSENSORL_VALUE
   * @generated
   * @ordered
   */
  TOUCHSENSORL(3, "TOUCHSENSORL", "TouchSensorL"),

  /**
   * The '<em><b>TOUCHSENSORR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOUCHSENSORR_VALUE
   * @generated
   * @ordered
   */
  TOUCHSENSORR(4, "TOUCHSENSORR", "TouchSensorR");

  /**
   * The '<em><b>COLORIDSENSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COLORIDSENSOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COLORIDSENSOR
   * @model literal="ColorIDSensor"
   * @generated
   * @ordered
   */
  public static final int COLORIDSENSOR_VALUE = 0;

  /**
   * The '<em><b>LIGHTSENSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LIGHTSENSOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LIGHTSENSOR
   * @model literal="LightSensor"
   * @generated
   * @ordered
   */
  public static final int LIGHTSENSOR_VALUE = 1;

  /**
   * The '<em><b>ULTRASONICSENSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ULTRASONICSENSOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ULTRASONICSENSOR
   * @model literal="UltraSonicSensor"
   * @generated
   * @ordered
   */
  public static final int ULTRASONICSENSOR_VALUE = 2;

  /**
   * The '<em><b>TOUCHSENSORL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TOUCHSENSORL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOUCHSENSORL
   * @model literal="TouchSensorL"
   * @generated
   * @ordered
   */
  public static final int TOUCHSENSORL_VALUE = 3;

  /**
   * The '<em><b>TOUCHSENSORR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TOUCHSENSORR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOUCHSENSORR
   * @model literal="TouchSensorR"
   * @generated
   * @ordered
   */
  public static final int TOUCHSENSORR_VALUE = 4;

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
      LIGHTSENSOR,
      ULTRASONICSENSOR,
      TOUCHSENSORL,
      TOUCHSENSORR,
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
      case LIGHTSENSOR_VALUE: return LIGHTSENSOR;
      case ULTRASONICSENSOR_VALUE: return ULTRASONICSENSOR;
      case TOUCHSENSORL_VALUE: return TOUCHSENSORL;
      case TOUCHSENSORR_VALUE: return TOUCHSENSORR;
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
