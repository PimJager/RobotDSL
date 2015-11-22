/**
 */
package mars.rover.roverDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EMotor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mars.rover.roverDSL.RoverDSLPackage#getEMotor()
 * @model
 * @generated
 */
public enum EMotor implements Enumerator
{
  /**
   * The '<em><b>LEFTMOTOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFTMOTOR_VALUE
   * @generated
   * @ordered
   */
  LEFTMOTOR(0, "LEFTMOTOR", "LeftMotor"),

  /**
   * The '<em><b>RIGHTMOTOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHTMOTOR_VALUE
   * @generated
   * @ordered
   */
  RIGHTMOTOR(1, "RIGHTMOTOR", "RightMotor");

  /**
   * The '<em><b>LEFTMOTOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LEFTMOTOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEFTMOTOR
   * @model literal="LeftMotor"
   * @generated
   * @ordered
   */
  public static final int LEFTMOTOR_VALUE = 0;

  /**
   * The '<em><b>RIGHTMOTOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RIGHTMOTOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RIGHTMOTOR
   * @model literal="RightMotor"
   * @generated
   * @ordered
   */
  public static final int RIGHTMOTOR_VALUE = 1;

  /**
   * An array of all the '<em><b>EMotor</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EMotor[] VALUES_ARRAY =
    new EMotor[]
    {
      LEFTMOTOR,
      RIGHTMOTOR,
    };

  /**
   * A public read-only list of all the '<em><b>EMotor</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EMotor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>EMotor</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EMotor get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EMotor result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>EMotor</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EMotor getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EMotor result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>EMotor</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EMotor get(int value)
  {
    switch (value)
    {
      case LEFTMOTOR_VALUE: return LEFTMOTOR;
      case RIGHTMOTOR_VALUE: return RIGHTMOTOR;
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
  private EMotor(int value, String name, String literal)
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
  
} //EMotor
