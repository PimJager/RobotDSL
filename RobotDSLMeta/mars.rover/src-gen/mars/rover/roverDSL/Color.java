/**
 */
package mars.rover.roverDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mars.rover.roverDSL.RoverDSLPackage#getColor()
 * @model
 * @generated
 */
public enum Color implements Enumerator
{
  /**
   * The '<em><b>BLACK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLACK_VALUE
   * @generated
   * @ordered
   */
  BLACK(0, "BLACK", "BLACK"),

  /**
   * The '<em><b>BLUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLUE_VALUE
   * @generated
   * @ordered
   */
  BLUE(1, "BLUE", "BLUE"),

  /**
   * The '<em><b>BROWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BROWN_VALUE
   * @generated
   * @ordered
   */
  BROWN(2, "BROWN", "BROWN"),

  /**
   * The '<em><b>CYAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CYAN_VALUE
   * @generated
   * @ordered
   */
  CYAN(3, "CYAN", "CYAN"),

  /**
   * The '<em><b>DARK GRAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DARK_GRAY_VALUE
   * @generated
   * @ordered
   */
  DARK_GRAY(4, "DARK_GRAY", "DARKGRAY"),

  /**
   * The '<em><b>GRAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GRAY_VALUE
   * @generated
   * @ordered
   */
  GRAY(5, "GRAY", "GRAY"),

  /**
   * The '<em><b>GREEN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREEN_VALUE
   * @generated
   * @ordered
   */
  GREEN(6, "GREEN", "GREEN"),

  /**
   * The '<em><b>LIGHT GRAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIGHT_GRAY_VALUE
   * @generated
   * @ordered
   */
  LIGHT_GRAY(7, "LIGHT_GRAY", "LIGHTGRAY"),

  /**
   * The '<em><b>MAGENTA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAGENTA_VALUE
   * @generated
   * @ordered
   */
  MAGENTA(8, "MAGENTA", "MAGENTA"),

  /**
   * The '<em><b>ORANGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ORANGE_VALUE
   * @generated
   * @ordered
   */
  ORANGE(9, "ORANGE", "ORANGE"),

  /**
   * The '<em><b>PINK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PINK_VALUE
   * @generated
   * @ordered
   */
  PINK(10, "PINK", "PINK"),

  /**
   * The '<em><b>RED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RED_VALUE
   * @generated
   * @ordered
   */
  RED(11, "RED", "RED"),

  /**
   * The '<em><b>WHITE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WHITE_VALUE
   * @generated
   * @ordered
   */
  WHITE(12, "WHITE", "WHITE"),

  /**
   * The '<em><b>YELLOW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YELLOW_VALUE
   * @generated
   * @ordered
   */
  YELLOW(13, "YELLOW", "YELLOW");

  /**
   * The '<em><b>BLACK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BLACK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLACK
   * @model
   * @generated
   * @ordered
   */
  public static final int BLACK_VALUE = 0;

  /**
   * The '<em><b>BLUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BLUE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLUE
   * @model
   * @generated
   * @ordered
   */
  public static final int BLUE_VALUE = 1;

  /**
   * The '<em><b>BROWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BROWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BROWN
   * @model
   * @generated
   * @ordered
   */
  public static final int BROWN_VALUE = 2;

  /**
   * The '<em><b>CYAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CYAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CYAN
   * @model
   * @generated
   * @ordered
   */
  public static final int CYAN_VALUE = 3;

  /**
   * The '<em><b>DARK GRAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DARK GRAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DARK_GRAY
   * @model literal="DARKGRAY"
   * @generated
   * @ordered
   */
  public static final int DARK_GRAY_VALUE = 4;

  /**
   * The '<em><b>GRAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GRAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GRAY
   * @model
   * @generated
   * @ordered
   */
  public static final int GRAY_VALUE = 5;

  /**
   * The '<em><b>GREEN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GREEN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREEN
   * @model
   * @generated
   * @ordered
   */
  public static final int GREEN_VALUE = 6;

  /**
   * The '<em><b>LIGHT GRAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LIGHT GRAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LIGHT_GRAY
   * @model literal="LIGHTGRAY"
   * @generated
   * @ordered
   */
  public static final int LIGHT_GRAY_VALUE = 7;

  /**
   * The '<em><b>MAGENTA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAGENTA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAGENTA
   * @model
   * @generated
   * @ordered
   */
  public static final int MAGENTA_VALUE = 8;

  /**
   * The '<em><b>ORANGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ORANGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ORANGE
   * @model
   * @generated
   * @ordered
   */
  public static final int ORANGE_VALUE = 9;

  /**
   * The '<em><b>PINK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PINK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PINK
   * @model
   * @generated
   * @ordered
   */
  public static final int PINK_VALUE = 10;

  /**
   * The '<em><b>RED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RED
   * @model
   * @generated
   * @ordered
   */
  public static final int RED_VALUE = 11;

  /**
   * The '<em><b>WHITE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WHITE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WHITE
   * @model
   * @generated
   * @ordered
   */
  public static final int WHITE_VALUE = 12;

  /**
   * The '<em><b>YELLOW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>YELLOW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #YELLOW
   * @model
   * @generated
   * @ordered
   */
  public static final int YELLOW_VALUE = 13;

  /**
   * An array of all the '<em><b>Color</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Color[] VALUES_ARRAY =
    new Color[]
    {
      BLACK,
      BLUE,
      BROWN,
      CYAN,
      DARK_GRAY,
      GRAY,
      GREEN,
      LIGHT_GRAY,
      MAGENTA,
      ORANGE,
      PINK,
      RED,
      WHITE,
      YELLOW,
    };

  /**
   * A public read-only list of all the '<em><b>Color</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Color</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Color get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Color result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Color</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Color getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Color result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Color</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Color get(int value)
  {
    switch (value)
    {
      case BLACK_VALUE: return BLACK;
      case BLUE_VALUE: return BLUE;
      case BROWN_VALUE: return BROWN;
      case CYAN_VALUE: return CYAN;
      case DARK_GRAY_VALUE: return DARK_GRAY;
      case GRAY_VALUE: return GRAY;
      case GREEN_VALUE: return GREEN;
      case LIGHT_GRAY_VALUE: return LIGHT_GRAY;
      case MAGENTA_VALUE: return MAGENTA;
      case ORANGE_VALUE: return ORANGE;
      case PINK_VALUE: return PINK;
      case RED_VALUE: return RED;
      case WHITE_VALUE: return WHITE;
      case YELLOW_VALUE: return YELLOW;
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
  private Color(int value, String name, String literal)
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
  
} //Color
