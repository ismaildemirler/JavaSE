package A_Beginning.H_Loops;

import java.util.Scanner;

public class Loops {

	public void ForLoops() {

		/*
		 * For Loops
		 */

		/*
		 * for (initialisation; condition; incrementing or decrementing) {
		 * 		as long as condition is fit, this code block will execute.
		 * }
		 */

		/*
		 * In this example i is incrementing one by one.
		 * as long as i is smaller than 5 the code in for loop will work.
		 * when i is equal to 5, for loop will finish without executing anymore.
		 * In this example i variable is global.
		 */

		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("Number: " + i);
		}

		System.out.println("*********************");

		// In here j variable is defined just for for loop.
		for (int j = 0; j < 5; j++) {
			System.out.println("Number: " + j);
		}

		System.out.println("*********************");

		// We can reverse the counting.
		for (int j = 4; j >= 0; j--) {
			System.out.println("Number: " + j);
		}

		System.out.println("*********************");

		/*
		 * We can use the variable which is defined earlier in the program.
		 * And leave empty first field. 
		 */

		int item = 1;
		for (; item < 7; item++) {
			System.out.println("Number: " + item);
		}

		System.out.println("*********************");

		/*
		 * We can use multiple variable and multiple conditions in one for loop.
		 */

		for (int j = 0, k = 10; j < 10 && k > 0; j++, k--) {
			System.out.println("First Number: " + j);
			System.out.println("Second Number: " + k);
			System.out.println("--------------------");
		}

		System.out.println("*********************");

		/*
		 * We can use other asistant mathematical operators in decremental field of for.
		 * For example we can increment the number by adding 2 each time --> j += 2 For
		 * example we can increment the number by multiplying 2 each time --> j *= 2
		 * etc...
		 */

		for (int j = 2; j < 20; j *= 2) {
			System.out.println("Number: " + j);
		}

		System.out.println("*********************");

		/*
		 * A program which calculate factorial of given number
		 */

		System.out.print("Give a number you want to know factorial of it: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int factorial = 1;

		for (int j = number; j > 1; j--) {
			factorial *= j;
		}
		System.out.println("Factorial result = " + factorial);

		System.out.println("*********************");

	}
}
