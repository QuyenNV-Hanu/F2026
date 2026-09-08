package converter;


/*
 * ============================================================
 * CLASS NAME: CoinConverter
 * ============================================================
 *
 * "CoinConverter" is a noun phrase that describes what this
 * class does: converting a number of "xu" into larger currency
 * units such as quan, dong, and hao.
 *
 * Naming convention:
 * - Class names use PascalCase.
 * - Class names should be nouns or noun phrases.
 * - The name should be descriptive.
 *
 * Examples:
 *     CoinConverter
 *     TemperatureConverter
 *     CurrencyConverter
 *
 */

public class CoinConverter {

	public static void main(String[] args) {

		/*
		 * ====================================================
		 * 1. DECLARE AND INITIALIZE A VARIABLE
		 * ====================================================
		 *
		 * We declare an integer variable named "xu":
		 *
		 *     int xu = 483274;
		 *
		 * "int" is the data type.
		 *
		 * It is used to store whole numbers without decimal
		 * places.
		 *
		 * "xu" is the variable name.
		 *
		 * "483274" is the initial value assigned to the variable.
		 *
		 * Therefore:
		 *
		 *     xu = 483274
		 *
		 * means that the variable "xu" currently stores
		 * 483,274 xu.
		 */

		int xu = 483274;


		/*
		 * ====================================================
		 * 2. PRINT THE ORIGINAL VALUE
		 * ====================================================
		 *
		 * The + operator is used to concatenate a String
		 * with the value stored in the variable "xu".
		 *
		 *     xu + " xu converts into:"
		 *
		 * Since " xu converts into:" is a String, Java converts
		 * the value of xu into text and joins the two parts.
		 *
		 * If:
		 *
		 *     xu = 483274
		 *
		 * the output is:
		 *
		 *     483274 xu converts into:
		 */

		System.out.println(xu + " xu converts into:");


		/*
		 * ====================================================
		 * 3. PROCESS DATA
		 * ====================================================
		 *
		 * The purpose of the following statements is to
		 * convert 483274 xu into different currency units.
		 *
		 * The conversion is performed from the smallest unit
		 * to larger units.
		 *
		 * The program uses two important integer operators:
		 *
		 *     /   Integer division
		 *     %   Remainder (modulus)
		 *
		 * Integer division discards the decimal part.
		 *
		 * For example:
		 *
		 *     483274 / 10 = 48327
		 *
		 * NOT:
		 *
		 *     48327.4
		 *
		 * because both operands are integers.
		 *
		 *
		 * The remainder operator (%) gives the remainder after
		 * division.
		 *
		 * For example:
		 *
		 *     483274 % 10 = 4
		 *
		 * because:
		 *
		 *     483274 = 48327 * 10 + 4
		 *
		 * Therefore:
		 *
		 *     /  -> gives the quotient
		 *     %  -> gives the remainder
		 *
		 * These two operators are very useful when we need to
		 * separate digits or convert units.
		 */


		/*
		 * ====================================================
		 * 4. REMOVE THE "XU" PART
		 * ====================================================
		 *
		 * First, we divide xu by 10:
		 *
		 *     int remainder = xu / 10;
		 *
		 * Since xu is an int, this is integer division.
		 *
		 *     483274 / 10 = 48327
		 *
		 * Therefore:
		 *
		 *     remainder = 48327
		 *
		 * The last digit, 4, is removed from the quotient.
		 *
		 * At this point:
		 *
		 *     remainder = 48327
		 *     xu        = 483274
		 */

		int remainder = xu / 10;


		/*
		 * ====================================================
		 * 5. GET THE REMAINING XU
		 * ====================================================
		 *
		 * The following statement:
		 *
		 *     xu %= 10;
		 *
		 * is a shorthand form of:
		 *
		 *     xu = xu % 10;
		 *
		 * The % operator gives the remainder after division.
		 *
		 * Therefore:
		 *
		 *     483274 % 10 = 4
		 *
		 * So after this statement:
		 *
		 *     xu = 4
		 *
		 * We have extracted the number of xu.
		 *
		 * At the same time:
		 *
		 *     remainder = 48327
		 *
		 * contains the value that still needs to be converted.
		 */

		xu %= 10;


		/*
		 * ====================================================
		 * 6. EXTRACT THE HAO VALUE
		 * ====================================================
		 *
		 * Now we want to extract the next unit: hao.
		 *
		 * We use:
		 *
		 *     int hao = remainder % 10;
		 *
		 * Currently:
		 *
		 *     remainder = 48327
		 *
		 * Therefore:
		 *
		 *     48327 % 10 = 7
		 *
		 * So:
		 *
		 *     hao = 7
		 *
		 * The % 10 operation extracts the last digit.
		 */

		int hao = remainder % 10;


		/*
		 * ====================================================
		 * 7. REMOVE THE HAO PART
		 * ====================================================
		 *
		 * We now remove the last digit from remainder:
		 *
		 *     remainder /= 10;
		 *
		 * This is a shorthand form of:
		 *
		 *     remainder = remainder / 10;
		 *
		 * Since remainder is an int:
		 *
		 *     48327 / 10 = 4832
		 *
		 * The decimal part is discarded.
		 *
		 * Therefore:
		 *
		 *     remainder = 4832
		 *
		 * At this point:
		 *
		 *     hao       = 7
		 *     remainder = 4832
		 */

		remainder /= 10;


		/*
		 * ====================================================
		 * 8. EXTRACT THE DONG VALUE
		 * ====================================================
		 *
		 * Now we extract the next unit: dong.
		 *
		 * We use:
		 *
		 *     int dong = remainder % 100;
		 *
		 * Currently:
		 *
		 *     remainder = 4832
		 *
		 * Therefore:
		 *
		 *     4832 % 100 = 32
		 *
		 * So:
		 *
		 *     dong = 32
		 *
		 * Why % 100?
		 *
		 * Because we want to extract the last TWO digits.
		 *
		 *     % 10   -> extracts the last 1 digit
		 *     % 100  -> extracts the last 2 digits
		 *     % 1000 -> extracts the last 3 digits
		 */

		int dong = remainder % 100;


		/*
		 * ====================================================
		 * 9. REMOVE THE DONG PART
		 * ====================================================
		 *
		 * We now remove the last two digits from remainder:
		 *
		 *     remainder /= 100;
		 *
		 * This is equivalent to:
		 *
		 *     remainder = remainder / 100;
		 *
		 * Since remainder is an int:
		 *
		 *     4832 / 100 = 48
		 *
		 * The decimal part is discarded.
		 *
		 * Therefore:
		 *
		 *     remainder = 48
		 *
		 * At this point:
		 *
		 *     xu        = 4
		 *     hao       = 7
		 *     dong      = 32
		 *     remainder = 48
		 */

		remainder /= 100;


		/*
		 * ====================================================
		 * 10. EXTRACT THE QUAN VALUE
		 * ====================================================
		 *
		 * Finally, we extract the remaining value as quan:
		 *
		 *     int quan = remainder % 100;
		 *
		 * Currently:
		 *
		 *     remainder = 48
		 *
		 * Therefore:
		 *
		 *     48 % 100 = 48
		 *
		 * So:
		 *
		 *     quan = 48
		 *
		 * Because 48 is already smaller than 100, the remainder
		 * is simply 48.
		 */

		int quan = remainder % 100;


		/*
		 * ====================================================
		 * 11. PRINT THE RESULT
		 * ====================================================
		 *
		 * We now have all the converted values:
		 *
		 *     quan = 48
		 *     dong = 32
		 *     hao  = 7
		 *     xu   = 4
		 *
		 * The + operator concatenates Strings and variable
		 * values into one String.
		 *
		 * The output will be:
		 *
		 *     48 quan, 32 dong, 7 hao, 4 xu.
		 *
		 * Notice that the variables are evaluated from left
		 * to right and combined with the surrounding Strings.
		 */

		System.out.println(
				quan + " quan, "
						+ dong + " dong, "
						+ hao + " hao, "
						+ xu + " xu."
		);


		/*
		 * ====================================================
		 * 12. TRACE THE VALUES
		 * ====================================================
		 *
		 * It is useful to trace the value of each variable
		 * after every operation.
		 *
		 * Initial:
		 *
		 *     xu = 483274
		 *
		 * After:
		 *
		 *     remainder = xu / 10
		 *
		 * we have:
		 *
		 *     remainder = 48327
		 *
		 * After:
		 *
		 *     xu %= 10
		 *
		 * we have:
		 *
		 *     xu = 4
		 *
		 * After:
		 *
		 *     hao = remainder % 10
		 *
		 * we have:
		 *
		 *     hao = 7
		 *
		 * After:
		 *
		 *     remainder /= 10
		 *
		 * we have:
		 *
		 *     remainder = 4832
		 *
		 * After:
		 *
		 *     dong = remainder % 100
		 *
		 * we have:
		 *
		 *     dong = 32
		 *
		 * After:
		 *
		 *     remainder /= 100
		 *
		 * we have:
		 *
		 *     remainder = 48
		 *
		 * Finally:
		 *
		 *     quan = remainder % 100
		 *
		 * gives:
		 *
		 *     quan = 48
		 *
		 * Final result:
		 *
		 *     48 quan, 32 dong, 7 hao, 4 xu.
		 */


		/*
		 * ====================================================
		 * 13. IMPORTANT OPERATORS IN THIS EXAMPLE
		 * ====================================================
		 *
		 * /   Integer division
		 *
		 *     483274 / 10 = 48327
		 *
		 *     The decimal part is discarded because the
		 *     calculation uses int values.
		 *
		 *
		 * %   Remainder / Modulus
		 *
		 *     483274 % 10 = 4
		 *
		 *     It gives the remainder after division.
		 *
		 *
		 * %=  Compound assignment operator
		 *
		 *     xu %= 10;
		 *
		 * is equivalent to:
		 *
		 *     xu = xu % 10;
		 *
		 *
		 * /=  Compound assignment operator
		 *
		 *     remainder /= 10;
		 *
		 * is equivalent to:
		 *
		 *     remainder = remainder / 10;
		 *
		 *
		 * These operators are especially useful when working
		 * with digits, counters, unit conversion, and algorithms.
		 */

	} // End of main()

} // End of CoinConverter