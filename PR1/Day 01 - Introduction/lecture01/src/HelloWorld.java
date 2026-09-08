/*
 * ============================================================
 * 1. JAVA PROGRAM AND CLASS
 * ============================================================
 *
 * In Java, source code is organized into classes.
 *
 * In this example, we have a class named HelloWorld.
 *
 * Naming convention for a class:
 * - Use a noun or noun phrase.
 * - Use PascalCase.
 * - Choose a descriptive name.
 *
 * Examples:
 *     Student
 *     BankAccount
 *     StudentManager
 *     HelloWorld
 *
 * ============================================================
 */

/*
 * Because this is a public class:
 *
 *     public class HelloWorld
 *
 * the source file must be named:
 *
 *     HelloWorld.java
 *
 * The file name and the public class name must match exactly,
 * including uppercase and lowercase letters.
 *
 * Correct:
 *     HelloWorld.java
 *
 * Incorrect:
 *     helloworld.java
 *     Hello.java
 *
 * Java is case-sensitive:
 *
 *     HelloWorld != helloworld
 *
 * ============================================================
 */

public class HelloWorld {

	/*
	 * The main() method is the ENTRY POINT of a Java application.
	 *
	 * When we run:
	 *
	 *     java HelloWorld
	 *
	 * the JVM looks for a main() method with the standard form:
	 *
	 *     public static void main(String[] args)
	 *
	 * and starts executing the program from there.
	 *
	 * IMPORTANT:
	 * A Java project can contain more than one main() method.
	 * However, when we run a particular class as an application,
	 * that class needs a valid main() method.
	 *
	 * You should remember this syntax because you will use it
	 * very frequently in Java programs.
	 */

	public static void main(String[] args) {

		/*
		 * The statements that are executed by main() are written
		 * inside its curly braces { }.
		 *
		 * In this example, there is one statement:
		 *
		 *     System.out.println("Hello World!");
		 *
		 * The program executes this statement when main() starts.
		 */

		/*
		 * System.out.println() is used to print something
		 * to the console.
		 *
		 *     System.out.println("Hello World!");
		 *
		 * println means "print line".
		 *
		 * After printing the value, the cursor moves to
		 * the next line.
		 *
		 * For example:
		 *
		 *     System.out.println("Hello");
		 *     System.out.println("World");
		 *
		 * Output:
		 *
		 *     Hello
		 *     World
		 */

		System.out.println("Hello World!");

		/*
		 * "Hello World!" is a String literal.
		 *
		 * Text enclosed in double quotation marks " " is
		 * treated as a String.
		 *
		 * Examples:
		 *
		 *     "Hello"
		 *     "Java"
		 *     "Hello World!"
		 *     "123"
		 *
		 * Notice the difference:
		 *
		 *     123
		 *
		 * is a number, while:
		 *
		 *     "123"
		 *
		 * is a String.
		 *
		 * This distinction will become important when we
		 * work with variables and data types.
		 */

		/*
		 * The following is a single statement:
		 *
		 *     System.out.println("Hello World!");
		 *
		 * In Java, a statement normally ends with a semicolon:
		 *
		 *     ;
		 *
		 * Think of the semicolon as telling Java:
		 *
		 *     "This statement is finished."
		 *
		 * For example:
		 *
		 *     int age = 20;
		 *     age = age + 1;
		 *     System.out.println(age);
		 *
		 * Each of these is a separate statement.
		 */

	} // End of main() method


	/*
	 * ============================================================
	 * CURLY BRACES { }
	 * ============================================================
	 *
	 * Curly braces define a BLOCK of code.
	 *
	 * The outer pair of braces belongs to the class:
	 *
	 *     public class HelloWorld {
	 *         ...
	 *     }
	 *
	 * The inner pair belongs to the main() method:
	 *
	 *     public static void main(String[] args) {
	 *         ...
	 *     }
	 *
	 * Notice that a block does NOT end with a semicolon.
	 *
	 * Statement:
	 *
	 *     System.out.println("Hello");
	 *
	 * Block:
	 *
	 *     {
	 *         System.out.println("Hello");
	 *     }
	 */

} // End of HelloWorld class


/*
 * ============================================================
 * public static void main(String[] args)
 * ============================================================
 *
 * At the beginning, you do not need to memorize all the
 * theoretical details. However, you should recognize the
 * role of each part.
 *
 *     public
 *         The method can be accessed by the JVM.
 *
 *     static
 *         The method belongs to the class itself, so Java
 *         can call it without creating an object first.
 *
 *     void
 *         The method does not return a value.
 *
 *     main
 *         The special method name recognized as the entry
 *         point of a Java application.
 *
 *     String[] args
 *         An array of String values that can receive
 *         command-line arguments.
 *
 * For now, remember the complete pattern:
 *
 *     public static void main(String[] args)
 *
 * You will learn more about each part later.
 */


/*
 * ============================================================
 * COMPILE THE PROGRAM
 * ============================================================
 *
 * Suppose the source file is:
 *
 *     HelloWorld.java
 *
 * Open the terminal in the directory containing the file.
 *
 * Compile the source code:
 *
 *     javac HelloWorld.java
 *
 * javac means Java Compiler.
 *
 * The compiler translates Java source code into Java bytecode:
 *
 *     HelloWorld.java
 *            |
 *            | javac
 *            v
 *     HelloWorld.class
 *
 * The .class file contains Java bytecode, which can be
 * executed by the Java Virtual Machine (JVM).
 */


/*
 * ============================================================
 * RUN THE PROGRAM
 * ============================================================
 *
 * After successful compilation, run:
 *
 *     java HelloWorld
 *
 * Notice that we do NOT write .java or .class:
 *
 *     java HelloWorld          <-- Correct
 *
 *     java HelloWorld.java     <-- Not in the traditional
 *                                  compile-then-run process
 *
 *     java HelloWorld.class    <-- Incorrect
 *
 * The JVM loads the compiled class and starts execution
 * from the main() method.
 *
 * Expected output:
 *
 *     Hello World!
 */


/*
 * ============================================================
 * WHAT IF THERE IS NO main() METHOD?
 * ============================================================
 *
 * Consider:
 *
 *     public class HelloWorld {
 *
 *     }
 *
 * This class can still be compiled:
 *
 *     javac HelloWorld.java
 *
 * However, if we try to run it:
 *
 *     java HelloWorld
 *
 * the JVM cannot find a valid main() method.
 *
 * Therefore, remember this important distinction:
 *
 *     Compilation != Execution
 *
 * A class can be successfully compiled without main().
 *
 * However, a class that we want to run directly as a
 * Java application needs a valid main() method.
 */


/*
 * ============================================================
 * THE BIG PICTURE
 * ============================================================
 *
 * A simple Java program can be understood as:
 *
 *     Java source code
 *            |
 *            | javac
 *            v
 *     Java bytecode (.class)
 *            |
 *            | java
 *            v
 *     JVM executes main()
 *            |
 *            v
 *     Program output
 *
 *
 * In this example:
 *
 *     HelloWorld.java
 *            |
 *            v
 *     javac HelloWorld.java
 *            |
 *            v
 *     HelloWorld.class
 *            |
 *            v
 *     java HelloWorld
 *            |
 *            v
 *     main()
 *            |
 *            v
 *     System.out.println("Hello World!");
 *            |
 *            v
 *     Hello World!
 *
 * ============================================================
 */