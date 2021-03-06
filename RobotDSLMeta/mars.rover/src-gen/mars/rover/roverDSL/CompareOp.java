/**
 */
package mars.rover.roverDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Compare Op</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mars.rover.roverDSL.RoverDSLPackage#getCompareOp()
 * @model
 * @generated
 */
public enum CompareOp implements Enumerator
{
  /**
   * The '<em><b>EQ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQ_VALUE
   * @generated
   * @ordered
   */
  EQ(0, "EQ", "equals"),

  /**
   * The '<em><b>NEQ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEQ_VALUE
   * @generated
   * @ordered
   */
  NEQ(1, "NEQ", "!="),

  /**
   * The '<em><b>GEQ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GEQ_VALUE
   * @generated
   * @ordered
   */
  GEQ(2, "GEQ", ">="),

  /**
   * The '<em><b>GT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GT_VALUE
   * @generated
   * @ordered
   */
  GT(3, "GT", ">"),

  /**
   * The '<em><b>LEQ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEQ_VALUE
   * @generated
   * @ordered
   */
  LEQ(4, "LEQ", "<="),

  /**
   * The '<em><b>LT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LT_VALUE
   * @generated
   * @ordered
   */
  LT(5, "LT", "<");

  /**
   * The '<em><b>EQ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EQ</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQ
   * @model literal="equals"
   * @generated
   * @ordered
   */
  public static final int EQ_VALUE = 0;

  /**
   * The '<em><b>NEQ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NEQ</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEQ
   * @model literal="!="
   * @generated
   * @ordered
   */
  public static final int NEQ_VALUE = 1;

  /**
   * The '<em><b>GEQ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GEQ</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GEQ
   * @model literal=">="
   * @generated
   * @ordered
   */
  public static final int GEQ_VALUE = 2;

  /**
   * The '<em><b>GT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GT
   * @model literal=">"
   * @generated
   * @ordered
   */
  public static final int GT_VALUE = 3;

  /**
   * The '<em><b>LEQ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LEQ</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEQ
   * @model literal="<="
   * @generated
   * @ordered
   */
  public static final int LEQ_VALUE = 4;

  /**
   * The '<em><b>LT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LT
   * @model literal="<"
   * @generated
   * @ordered
   */
  public static final int LT_VALUE = 5;

  /**
   * An array of all the '<em><b>Compare Op</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CompareOp[] VALUES_ARRAY =
    new CompareOp[]
    {
      EQ,
      NEQ,
      GEQ,
      GT,
      LEQ,
      LT,
    };

  /**
   * A public read-only list of all the '<em><b>Compare Op</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CompareOp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Compare Op</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CompareOp get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CompareOp result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Compare Op</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CompareOp getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CompareOp result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Compare Op</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CompareOp get(int value)
  {
    switch (value)
    {
      case EQ_VALUE: return EQ;
      case NEQ_VALUE: return NEQ;
      case GEQ_VALUE: return GEQ;
      case GT_VALUE: return GT;
      case LEQ_VALUE: return LEQ;
      case LT_VALUE: return LT;
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
  private CompareOp(int value, String name, String literal)
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
  
} //CompareOp
