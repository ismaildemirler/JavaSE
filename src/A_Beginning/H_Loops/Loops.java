package A_Beginning.H_Loops;

import java.util.Scanner;

public class Loops {

	public void forLoops() {

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

	public void whileLoops() {
		
		/*
		 * While Loops
		 */
		
		/*
		   while(condition){
		   		as long as the condition in while parenthesis is fit this code block will run 
		   }
		   
		   Difference between for and while, in while loops developer must handle condition changing and 
		   increment or decrement loop variables or the while loop goes into infinitive loop.
		   But in for loop, increment or decrement variables and changing conditions are being done automatically by for loop.
		 */
		
		int i = 0;
		while(i < 10) {
			System.out.println("i = " + i);
			i++;
		}
		
		System.out.println("*******************");
		
		/*
		 * While loop equivalent code of factorial program which is coded with for loop. 
		 */
		
		int number = 6;
		int faktorial = 1;
		i = 1;
		while(i < number) {
			faktorial *= i;
			i++; //if we forget to control i variable the while loop goes into infinitive loop;
				 //or if we control variable impractically like 'i--' here, so while loop goes into infinitive loop.  
		}
		
		System.out.println("The factorial of the number = " + faktorial);
		System.out.println("*******************");
	}

	public void doWhileLoops() {
		
		/*
		 * Do-While Loop
		 */
		
		/*
		   do {
		   		Firstly, without controlling the condition is true or not this code block will run once.
		   		And the As long as condition in while parenthesis is fit this code block will run.
		   } while(condition)
		 */
		
		/*
		 * We see that it is working like for and while loops just one difference which is that
		 * without controlling the condition is true or not do block will run just for once. After that while condition is fit
		 * it will keep running until the condition is not fit.
		 */
		int i = 0;
		do {
			System.out.println("i = " + i);
			i++;
		} while (i < 5);

		System.out.println("*******************");
		
		/*
		 * We see here without controlling the condition is true or not do block run just for once. 
		 * After that because while condition is not fit program stopped working.
		 */
		i = 5; 
		do {
			System.out.println("i = " + i);
		} while (i > 5);

		System.out.println("*******************");
		
		/*
		 * In some cases, do-while loop is the most suitable the situation. For instance let's assume that we want to find
		 * sum of digits of a number. Do-while loop is really nice solution. Because we always have at least one digit in a number.
		 * So loop must run at least for once. After that if we have more digits the loop will keep running.
		 */
		int number = 15439;
		int total = 0;
		do {
			int retainNumber = number % 10;
			total += retainNumber;
			number = number / 10;
		} while (number > 0);

		System.out.println("Total of digits of the number = " + total);

		System.out.println("*******************");
	}

	public void breakAndContinue() {
		
		/*
		 * Break And Continue Keywords in Java
		 */
		
		/*
		 * Break : 
		   When 'break' keyword was encountered in somewhere and sometime in the loop, Loop will be stopped. 
		   So the loop has been stopped without controlling any condition or situation. 
		   Break gets the loop stopped if and only if this loop which break takes place inside. 
		   If there are chain loops and break was used inside of the internal loop just internal loop will stop.
		   Outside loop will keep running.
		 
		 * Continue: 
		   When 'continue' keyword was encountered in somewhere and sometime in the loop, 
		   loop will goes to beginning of the block without executing code blocks after continue keyword. 
		 */
		
		/*
		 * We can see that when i equals 5 the loop encounters break keyword in this example. So when i equals 5 loop stopped working.
		 */
		int i = 0;
		while (i < 10) {
			
			if(i == 5) {
				break;
			}
			
			System.out.println("i = " + i);
			i++;
		}
		
		System.out.println("*******************");
		
		/*
		 * This loop block will run until the user enter -1. 
		 */
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Please enter the process number: ");
			int process = scanner.nextInt();
			if (process == -1) {
				System.out.println("Stopping the programme");
				break;
			}
			System.out.println("Process : " + process);
		}

		System.out.println("*******************");
		
		/*
		 * When j equals 3 or 5 the program will encounter continue keyword 
		 * so the programme will go back to beginning without executing system.out.println code. 
		 */
		for (int j = 0; j < 7; j++) {
			
			if(j == 3 || j == 5) {
				continue;
			}
			
			System.out.println("Printing j if j is not equal 3 or 5 : " + j);
		}

		System.out.println("*******************");
		
		/*
		 * But in while loop programmers have to be careful when using continue keyword.
		 * Because of that in while loop programmers have to handle changing variable and increasing or decreasing the loop condition variable
		 * programmers have to change condition when loop encountered continue keyword. If not because of that code block after continue keyword 
		 * was not executed condition will not be changed and loop will goes into infinitive loop.
		 */
		int variable = 0;
		while (variable < 10) {
			
			if(variable == 3 || variable == 5) {
				variable++;
				continue;
			}
			
			System.out.println("Printing variable if variable is not equal 3 or 5 : " + variable);
			variable++;
		}
		
		System.out.println("*******************");
	}
}
