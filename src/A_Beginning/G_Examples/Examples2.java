package A_Beginning.G_Examples;

import java.util.Scanner;

public class Examples2 {
	
	public void findMaximumNumber() {

		/*
		 * Finding maximum number of three numbers.
		 */

		/*
		 * First step, we assume that first number is maximum and assign to maximum
		 * number variable And then compare with another numbers. We use only if block
		 * instead of if - else blocks. Because we want to control all numbers.
		 */

		int number1 = 1534;
		int number2 = 1454;
		int number3 = 1543;
		int maximumNumber = number1;
		
		if (number2 > maximumNumber) {
			maximumNumber = number2;
		}
		
		if (number3 > maximumNumber) {
			maximumNumber = number3;
		}
		System.out.println("Maximum Number : " + maximumNumber);
		System.out.println("**************************************");

	}

	public void bodyIndexConditionally() {

		/*
		 * This algorithm calculates body index by using height and weight of a person. 
		 * Body Index : Weight / (Height * Height) 
		 */

		float weight = 78.7f;
		float height = 1.75f;
		float bodyIndex = weight / (height * height);
		
		if (bodyIndex < 18.5) {
			System.out.println("Body Index : " + bodyIndex + " Body Structure : Skinny");
		} else if (18.5 <= bodyIndex && bodyIndex < 25) {
			System.out.println("Body Index : " + bodyIndex + " Body Structure : Normal");
		} else if (25 <= bodyIndex && bodyIndex < 30) {
			System.out.println("Body Index : " + bodyIndex + " Body Structure : Overweight");
		} else if (30 <= bodyIndex) {
			System.out.println("Body Index : " + bodyIndex + " Body Structure : Obese");
		}
		
		System.out.println("**************************************");
	}

	public void simpleCalculator() {

		/*
		 * Simple Calculator Program
		 */

		/*
		 * By using switch - case blocks making simple calculator which can calculate
		 * four mathematical operations.
		 */

		System.out.print("Enter first number: ");
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		
		System.out.print("Which operation do you want: ");
		scanner = new Scanner(System.in);
		String operation = scanner.nextLine();

		System.out.print("Enter second number: ");
		scanner = new Scanner(System.in);
		int number2 = scanner.nextInt();

		switch (operation) {
		case "+":
			System.out.println("Result of the sum operation : " + (number1 + number2));
			break;
		case "-":
			System.out.println("Result of the substraction operation : " + (number1 - number2));
			break;
		case "*":
			System.out.println("Result of the multiplication operation : " + (number1 * number2));
			break;
		case "/":
			System.out.println("Result of the division operation : " + ((double) number1 / number2));
			break;
		default:
			System.out.println("Geçersiz işlem");
			break;
		}

		System.out.println("**************************************");
	}

	public void gradeCalculation() {

		/*
		 * Simple Grade Calculation Program
		 */

		/*
		 * First midterm exam %30 percent of final grade
		 * Second midterm exam %30 percent of final grade
		 * Final exam %40 percent of final grade
		 */

		System.out.print("Enter first exam grade: ");
		Scanner scanner = new Scanner(System.in);
		int firstMidtermExam = scanner.nextInt();

		System.out.print("Enter second exam grade: ");
		scanner = new Scanner(System.in);
		int secondMidtermExam = scanner.nextInt();

		System.out.print("Enter final exam grade: ");
		scanner = new Scanner(System.in);
		int finalExam = scanner.nextInt();

		float averageGrade = (firstMidtermExam * 0.30f) + (secondMidtermExam * 0.30f) + (finalExam * 0.40f);
		
		if (averageGrade >= 90) {
			System.out.print("Your grade: AA");
		}
		else if (averageGrade >= 85) {
			System.out.print("Your grade: AB");
		}
		else if (averageGrade >= 80) {
			System.out.print("Your grade: BB");
		}
		else if (averageGrade >= 75) {
			System.out.print("Your grade: CB");
		}
		else if (averageGrade >= 70) {
			System.out.print("Your grade: CC");
		}
		else if (averageGrade >= 65) {
			System.out.print("Your grade: DC");
		}
		else if (averageGrade >= 60) {
			System.out.print("Your grade: DD");
		}
		else if (averageGrade >= 55) {
			System.out.print("Your grade: FD. You failed!");
		}
		else {
			System.out.print("Your grade: FF. You failed!");
		}

		System.out.println("**************************************");
	}
}
