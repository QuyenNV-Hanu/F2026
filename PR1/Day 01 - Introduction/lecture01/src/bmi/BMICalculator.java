package bmi;

public class BMICalculator {
	public static void main(String[] args) {
		// Declare variables
		double height = 1.7;
		double weight = 68.5;

		// Prompt user to input sth
		// Process the input
		double bmi = weight / (height * height);

		// Return/Print the result
		System.out.println("My BMI is: " + bmi);
	}
}
