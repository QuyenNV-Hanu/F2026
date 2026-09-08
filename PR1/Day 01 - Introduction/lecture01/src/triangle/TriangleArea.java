package triangle;


/*
 * ============================================================
 * 1. PACKAGE
 * ============================================================
 *
 * The package declaration tells Java that this class belongs
 * to the "triangle" package.
 *
 *     package triangle;
 *
 * Packages are used to:
 * - Organize classes into groups.
 * - Avoid naming conflicts between classes.
 * - Control access between classes and packages.
 *
 * The package name is normally written in lowercase.
 *
 * For example:
 *
 *     package triangle;
 *
 * means that TriangleArea belongs to the triangle package.
 *
 * ============================================================
 */


/*
 * ============================================================
 * 2. CLASS
 * ============================================================
 *
 * This program is defined inside a class named TriangleArea.
 *
 * Class naming convention:
 * - Use a noun or noun phrase.
 * - Use PascalCase.
 * - Choose a descriptive name.
 *
 *     TriangleArea
 *
 * is a good class name because it describes what the program
 * is about.
 */

public class TriangleArea {


	/*
	 * ========================================================
	 * 3. MAIN METHOD
	 * ========================================================
	 *
	 * The main() method is the entry point of this application.
	 *
	 * The program starts executing from:
	 *
	 *     public static void main(String[] args)
	 *
	 * The statements inside the main() method are executed
	 * from top to bottom.
	 */

	public static void main(String[] args) {


		/*
		 * ====================================================
		 * 4. DECLARE AND INITIALIZE VARIABLES
		 * ====================================================
		 *
		 * A variable is a named memory location used to store
		 * a value.
		 *
		 * The general syntax is:
		 *
		 *     dataType variableName = value;
		 *
		 * For example:
		 *
		 *     double base = 3;
		 *
		 * Here:
		 *
		 *     double
		 *         The data type of the variable.
		 *
		 *     base
		 *         The variable name.
		 *
		 *     =
		 *         The assignment operator.
		 *
		 *     3
		 *         The initial value assigned to the variable.
		 *
		 * The declaration and initialization happen together.
		 *
		 *     double base = 3;
		 *
		 * means:
		 *
		 *     "Create a variable named base that can store
		 *      a double value, and give it the initial value 3."
		 */

		double base = 3;

		double height = 1.5;


		/*
		 * ====================================================
		 * 5. WHY DO WE USE double?
		 * ====================================================
		 *
		 * double is a Java data type used to store decimal
		 * numbers.
		 *
		 * Examples:
		 *
		 *     3
		 *     1.5
		 *     10.25
		 *     3.14159
		 *
		 * In this program:
		 *
		 *     base = 3
		 *     height = 1.5
		 *
		 * We use double because the height of a triangle may
		 * contain a decimal value.
		 *
		 * For example:
		 *
		 *     height = 1.5;
		 *
		 * If we used int instead, decimal values such as 1.5
		 * could not be stored.
		 */


		/*
		 * ====================================================
		 * 6. INPUT - PROCESS - OUTPUT
		 * ====================================================
		 *
		 * A simple program can often be understood using the
		 * IPO model:
		 *
		 *     INPUT  ->  PROCESS  ->  OUTPUT
		 *
		 * INPUT:
		 *     base
		 *     height
		 *
		 * PROCESS:
		 *     Calculate the area of the triangle.
		 *
		 * OUTPUT:
		 *     Display the base, height, and area.
		 *
		 * In this particular example, the input values are
		 * directly assigned in the source code.
		 *
		 * The program does NOT ask the user to enter values yet.
		 *
		 * Later, we will learn how to use Scanner to get input
		 * from the keyboard.
		 */


		/*
		 * ====================================================
		 * 7. PROCESS DATA
		 * ====================================================
		 *
		 * The area of a triangle is calculated using:
		 *
		 *     area = base * height / 2
		 *
		 * In Java:
		 *
		 *     double area = height * base / 2;
		 *
		 * The expression on the right-hand side is evaluated
		 * first.
		 *
		 * With:
		 *
		 *     height = 1.5
		 *     base   = 3
		 *
		 * Java calculates:
		 *
		 *     1.5 * 3 / 2
		 *
		 * which gives:
		 *
		 *     2.25
		 *
		 * The result is then assigned to the variable "area".
		 */

		double area = height * base / 2;


		/*
		 * ====================================================
		 * 8. PRINT THE RESULT
		 * ====================================================
		 *
		 * System.out.println() prints a value to the console
		 * and moves to the next line.
		 *
		 * In the following statement, the + operator is used
		 * to concatenate Strings and values.
		 *
		 *     "The triangle's base is " + base
		 *
		 * If:
		 *
		 *     base = 3
		 *
		 * the result becomes:
		 *
		 *     "The triangle's base is 3"
		 *
		 * We can continue concatenating more text and values:
		 *
		 *     "The triangle's base is "
		 *     + base
		 *     + " (cm) and height is "
		 *     + height
		 *     + " (cm)."
		 *
		 * This produces one complete String before it is
		 * printed to the console.
		 */

		System.out.println(
				"The triangle's base is "
						+ base
						+ " (cm) and height is "
						+ height
						+ " (cm)."
		);


		/*
		 * This statement prints a text message.
		 *
		 * Notice that there is no variable in this statement.
		 * We are simply printing a String literal.
		 */

		System.out.println("Its area (cm2) is:");


		/*
		 * This statement prints the value stored in the
		 * variable "area".
		 *
		 * Because area is a double and its value is 2.25,
		 * the output will be:
		 *
		 *     2.25
		 */

		System.out.println(area);


		/*
		 * ====================================================
		 * 9. EXPECTED OUTPUT
		 * ====================================================
		 *
		 * With:
		 *
		 *     base = 3
		 *     height = 1.5
		 *
		 * the program produces:
		 *
		 *     The triangle's base is 3.0 (cm) and height is 1.5 (cm).
		 *     Its area (cm2) is:
		 *     2.25
		 *
		 * Notice that base was initialized with:
		 *
		 *     double base = 3;
		 *
		 * but Java displays:
		 *
		 *     3.0
		 *
		 * because the variable "base" has the type double.
		 *
		 * The value is therefore treated as a floating-point
		 * number.
		 */

	} // End of main() method

} // End of TriangleArea class


/*
 * ============================================================
 * 10. IMPORTANT CONCEPTS FROM THIS PROGRAM
 * ============================================================
 *
 * This small program introduces several important Java concepts:
 *
 * 1. package
 *      Organizes classes into packages.
 *
 * 2. class
 *      The basic building block of Java programs.
 *
 * 3. main()
 *      The entry point of a Java application.
 *
 * 4. variable
 *      Stores a value that can be used by the program.
 *
 * 5. data type
 *      Defines what kind of value a variable can store.
 *
 * 6. double
 *      Stores decimal numbers.
 *
 * 7. assignment operator (=)
 *      Assigns a value to a variable.
 *
 * 8. arithmetic operators
 *      *, /, +, -
 *
 * 9. String concatenation
 *      The + operator can join Strings and values together.
 *
 * 10. System.out.println()
 *      Displays information on the console.
 *
 *
 * The overall logic of this program is:
 *
 *     Declare variables
 *            ↓
 *     Store input values
 *            ↓
 *     Calculate the area
 *            ↓
 *     Display the result
 *
 * ============================================================
 */