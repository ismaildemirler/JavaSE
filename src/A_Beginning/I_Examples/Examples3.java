package A_Beginning.I_Examples;

import java.util.Scanner;

public class Examples3 {
	
	public void ATMProgram() {
		
		/*
		 * ATM Example in Java
		 */
		
		/*
		 * This example is about ATM operations which is developed by using loops.
		 * 
		 * Operations:
		   1) Learning balance of account: b
		   2) Withdraw money             : m
		   3) Making deposit             : d
		   4) Quit the process           : q
		 */
		
		/*
		 * In this example if you use if - else block you don't have to use continue keyword.
		 */
		Scanner scanner = new Scanner(System.in);		
		while (true) {
			System.out.print("Please, enter your process keyword: ");
			String operation = scanner.nextLine();
			if(operation.equals("b")) {
				System.out.println("You are learning balance of your account");
				continue;
			}
			if(operation.equals("m")) {
				System.out.println("You are withdrawing money");
				continue;
			}
			if(operation.equals("d")) {
				System.out.println("You are making deposit your money");
				continue;
			}
			if(operation.equals("q")) {
				System.out.println("You are about the quit of your process");
				break;
			}
			
			System.out.println("Please, enter valid request!");

			System.out.println("**************************************");
		}
	}

	public void ArmstrongNumber() {
		
		/*
		 * Armstrong Number in Java
		 */
		
		/*
		 * This example finds if the given number is Armstrong number or not.
		 * For instance;
		 * 371 is an Armstrong number because:
		   371 = 3^3 + 7^3 + 1^3 ---> 3 is digit count
		 * 1634 is an Armstrong number because:
		   1634 = 1^4 + 6^4 + 3^3 + 4^4 ---> 4 is digit count  
		 */
		
		/*
		 * Because the given number will have at least 1 digit so we can use do-while loop in this example. 
		 * Here we will use two do-while loops. In first one digit count will be found.
		 * In second one it will be controlled that the number is an Armstrong number or not.
		 */
		
		int number = 372;
		int tempNumber = number;
		int digitCount = 0;
		do {
			tempNumber /= 10;
			digitCount++;
		} while (tempNumber > 0);
		

		System.out.println("Digit count: " + digitCount);
		
		tempNumber = number;
		int counter = 0;
		int total = 0;
		do {
			int retainedNumber = tempNumber % 10;
			tempNumber /= 10;
			total += Math.pow(retainedNumber, digitCount);
			counter++;
		} while (counter < digitCount);
		
		if (total == number) {
			System.out.println("The number is an Armstrong number");
		}
		else{
			System.out.println("The number is not an Armstrong number");
		}
	} 

	public void Login() {
		
		/*
		 * Login Example
		 */
		
		/*
		 * User authentication example by while loop 
		 */
		
		Scanner scanner = new Scanner(System.in);
		String validUsername = "admin";
		String validPassword = "12345";
		int tryingCounter = 3;
		
		while (true) {
			System.out.print("Please enter your username");
			String username = scanner.nextLine();
			
			System.out.print("Please enter your password");
			String password = scanner.nextLine();
			
			if (username.equals(validUsername) && password.equals(validPassword)) {
				System.out.println("You logged in successfully!");
				break;
			}
			else if(tryingCounter > 1) {
				tryingCounter--;
				System.out.println("Username or password is wrong! Your have " + tryingCounter + " right to try!");
			}
			else {
				System.out.println("You couldn't logged in! You have no right to attempt");
				break;
			}
		}
		System.out.println("**************************************");
	}
}
