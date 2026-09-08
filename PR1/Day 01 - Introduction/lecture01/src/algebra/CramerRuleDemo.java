package algebra;


/*
 * ============================================================
 * CLASS NAME: CramerRuleDemo
 * ============================================================
 *
 * "CramerRuleDemo" is a noun phrase that describes this class.
 *
 * - CramerRule refers to Cramer's Rule, a method for solving
 *   a system of linear equations.
 * - Demo indicates that this class is a demonstration/example.
 *
 * Naming convention:
 * - Class names use PascalCase.
 * - Class names should be descriptive.
 *
 */


public class CramerRuleDemo {

	public static void main(String[] args) {

		/*
		 * ====================================================
		 * 1. THE PROBLEM
		 * ====================================================
		 *
		 * This program solves a system of two linear equations
		 * with two unknowns, x and y.
		 *
		 * The general form of the system is:
		 *
		 *     ax + by = e
		 *     cx + dy = f
		 *
		 * In this example:
		 *
		 *     3.4x + 50.2y = 44.5
		 *     2.1x +  5.5y =  5.9
		 *
		 * We want to find the values of:
		 *
		 *     x
		 *     y
		 *
		 * Cramer's Rule provides formulas for calculating x and y
		 * directly from the coefficients of the equations.
		 *
		 * ====================================================
		 */


		/*
		 * ====================================================
		 * 2. DECLARE THE VARIABLES
		 * ====================================================
		 *
		 * We use six variables to represent the coefficients
		 * and constants in the two equations:
		 *
		 *     ax + by = e
		 *     cx + dy = f
		 *
		 * Therefore:
		 *
		 *     a = 3.4
		 *     b = 50.2
		 *     c = 2.1
		 *     d = 5.5
		 *     e = 44.5
		 *     f = 5.9
		 *
		 * We use double because the coefficients and constants
		 * can contain decimal values.
		 */

		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 5.5;
		double e = 44.5;
		double f = 5.9;


		/*
		 * ====================================================
		 * 3. REPRESENTING THE EQUATIONS
		 * ====================================================
		 *
		 * The six variables correspond to the system:
		 *
		 *     ax + by = e
		 *     cx + dy = f
		 *
		 * Substituting the values:
		 *
		 *     3.4x + 50.2y = 44.5
		 *     2.1x +  5.5y =  5.9
		 *
		 * Notice how the variables in the mathematical formula
		 * correspond directly to variables in the Java program.
		 *
		 * This is an important programming skill:
		 *
		 *     Mathematical model
		 *             ↓
		 *     Variables in a program
		 *             ↓
		 *     Algorithm / Formula
		 *             ↓
		 *     Result
		 */


		/*
		 * ====================================================
		 * 4. CRAMER'S RULE
		 * ====================================================
		 *
		 * For the system:
		 *
		 *     ax + by = e
		 *     cx + dy = f
		 *
		 * Cramer's Rule gives:
		 *
		 *                 ed - bf
		 *     x = ---------------------
		 *                 ad - bc
		 *
		 *
		 *                 af - ec
		 *     y = ---------------------
		 *                 ad - bc
		 *
		 * The program implements these two formulas directly.
		 *
		 * ====================================================
		 */


		/*
		 * ====================================================
		 * 5. CALCULATE x
		 * ====================================================
		 *
		 * The mathematical formula is:
		 *
		 *                 ed - bf
		 *     x = ---------------------
		 *                 ad - bc
		 *
		 * The corresponding Java code is:
		 *
		 *     double x = (e * d - b * f) / (a * d - b * c);
		 *
		 * Let's map the Java expression to the formula:
		 *
		 *     e * d       -> ed
		 *     b * f       -> bf
		 *     a * d       -> ad
		 *     b * c       -> bc
		 *
		 * Therefore:
		 *
		 *     (e * d - b * f)
		 *
		 * represents the numerator.
		 *
		 *     (a * d - b * c)
		 *
		 * represents the denominator.
		 *
		 * Parentheses are important because they tell Java
		 * exactly which parts belong to the numerator and
		 * denominator.
		 *
		 * Without parentheses, the expression would not represent
		 * the mathematical formula correctly.
		 */

		double x = (e * d - b * f) / (a * d - b * c);


		/*
		 * ====================================================
		 * 6. CALCULATE y
		 * ====================================================
		 *
		 * The mathematical formula is:
		 *
		 *                 af - ec
		 *     y = ---------------------
		 *                 ad - bc
		 *
		 * The corresponding Java code is:
		 *
		 *     double y = (a * f - e * c) / (a * d - b * c);
		 *
		 * Again, we can map each part directly:
		 *
		 *     a * f       -> af
		 *     e * c       -> ec
		 *     a * d       -> ad
		 *     b * c       -> bc
		 *
		 * Therefore:
		 *
		 *     (a * f - e * c)
		 *
		 * is the numerator, and:
		 *
		 *     (a * d - b * c)
		 *
		 * is the denominator.
		 *
		 * Notice that the denominator is the same as the
		 * denominator in the formula for x.
		 */

		double y = (a * f - e * c) / (a * d - b * c);


		/*
		 * ====================================================
		 * 7. PRINT THE RESULT
		 * ====================================================
		 *
		 * We use System.out.println() to display the values
		 * calculated for x and y.
		 *
		 * The + operator is used to concatenate a String with
		 * the value of a variable.
		 *
		 * For example:
		 *
		 *     "x = " + x
		 *
		 * combines the text "x = " with the value stored in x.
		 *
		 * The same idea is used for y.
		 */

		System.out.println("x = " + x);
		System.out.println("y = " + y);


		/*
		 * ====================================================
		 * 8. INPUT - PROCESS - OUTPUT
		 * ====================================================
		 *
		 * This program can also be understood using the
		 * IPO model:
		 *
		 *     INPUT
		 *         a, b, c, d, e, f
		 *
		 *             ↓
		 *
		 *     PROCESS
		 *         Apply Cramer's Rule
		 *
		 *             ↓
		 *
		 *     OUTPUT
		 *         x and y
		 *
		 * Notice that this program does not ask the user to
		 * enter the values yet.
		 *
		 * The input values are directly assigned in the source
		 * code:
		 *
		 *     double a = 3.4;
		 *     double b = 50.2;
		 *     ...
		 *
		 * Later, we can replace these fixed values with values
		 * entered by the user using Scanner.
		 */


		/*
		 * ====================================================
		 * 9. IMPORTANT JAVA CONCEPTS IN THIS EXAMPLE
		 * ====================================================
		 *
		 * This small program introduces several important
		 * programming concepts:
		 *
		 * 1. Variables
		 *      a, b, c, d, e, f, x, y
		 *
		 * 2. Data type
		 *      double
		 *
		 * 3. Assignment
		 *      =
		 *
		 * 4. Arithmetic operators
		 *      +, -, *, /
		 *
		 * 5. Mathematical expressions
		 *      (e * d - b * f) / (a * d - b * c)
		 *
		 * 6. Parentheses
		 *      Used to control the order in which parts of an
		 *      expression are evaluated.
		 *
		 * 7. String concatenation
		 *      "x = " + x
		 *
		 * 8. Output
		 *      System.out.println()
		 *
		 *
		 * The key idea is:
		 *
		 *     A mathematical formula can be translated
		 *     directly into a programming expression.
		 *
		 * For example:
		 *
		 *     Mathematical:
		 *
		 *         (ed - bf) / (ad - bc)
		 *
		 *     Java:
		 *
		 *         (e * d - b * f) / (a * d - b * c)
		 *
		 * ====================================================
		 */

	} // End of main()

} // End of CramerRuleDemo