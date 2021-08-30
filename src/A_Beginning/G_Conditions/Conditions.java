package A_Beginning.G_Conditions;

public class Conditions {

	public void ifElseBlocks() {

		/*
		 * If-Else In Java
		 */
		
		/*
		 * if(condition) {
		 *		When this condition is fit, this code blocks will run. 
		 *		And else conditions below will be skipped. 
		 * } 
		 * else { 
		 * 		When above condition is not fit, codes of this else block will run. 
		 * } 
		 */

		int age = 19;
		if (age > 18) {
			// if age > 18 this block will run.
			System.out.println("Welcome this website!");
		}
		else {
			// if age < 18 or age = 18 the condition is not fit so this block will run.
			System.out.println("You can not enter this website!");
		}

		System.out.println("**************************************");

		String username = "admin";
		String password = "123";
		if (username == "admin" && password == "1234") {
			/*
			 * In this example both of conditions must fit. Because we have && operator.
			 * So if user name is admin and password is 1234 this code block will run.
			 */
			System.out.println("Welcome, You are allowed to enter!");
		}
		else {
			/*
			 * if user name is not admin or password is not 1234 this code block will run.
			 */
			System.out.println("You are not autehticated!");
		}
		
		System.out.println("**************************************");

		/* 
		 * Below example has multiple else condition. In these conditions we want to control 
		 * other cases which they are not fit in their above conditions. And we left last "else" condition 
		 * because of that our case can not be fit all of the above conditions. So we can be able to control all possibilities. 
		 */

		int midTermPoint = 80;
		int finalPoint = 55;
		double average = (midTermPoint + finalPoint) / 2;
		
		if (average >= 60) {

			/*
			 * In this example if average is greater or equal to 60, we can say that our condition is fit first option. 
			 * So if user name is admin and password is 1234 this code block will run. 
			 * And else conditions below will be skipped. 
			 */

			System.out.println("You succeeded!"); 
		}
		else if (average < 60 && average >= 50) {

			/*
			 * If the average value is not greater or equal to 60, then we control the other possibility
			 * which is the average value is between 50 and 60 in this block. If it is true this block will run. 
			 * If not below conditions will be controlled.
			 */

			System.out.println("You succeeded conditionally!");
		}
		else {

			/*
			 * If the average value is not fit all of the above conditions, this last else block will run. 
			 */

			System.out.println("You failed!");
		}
		System.out.println("**************************************");
	}

	public void switchCaseBlocks() {

		/*
		 * Switch-Case In Java
		 */
		
		/*
		 * A switch statement can replace multiple if checks.
		 * It gives a more descriptive way to compare a value with multiple variants.
		 * The switch has one or more case blocks and an optional default.
		 * 
		 * switch(x) {
		 * 		case 'value1': // if (x === 'value1') 
		 * 		... 
		 *		[break] 
		 * 		
		 * 		case 'value2': // if (x === 'value2') 
		 * 		... 
		 * 		[break] 
		 * 
		 * 		default: 
		 *		... 
		 * 		[break] 
		 * } 
		 * 
		 * The value of x is checked for a strict equality to the value from the first case (that is, value1) 
		 * then to the second (value2) and so on.
		 * 
		 * If the equality is found, switch starts to execute the code starting from the corresponding case,
		 * until the nearest break (or until the end of switch). 
		 * If no case is matched then the default code is executed (if it exists). 
		 */

		/* 
		 * Deciding whether to use if-then-else statements or a switch statement is based on readability 
		 * and the expression that the statement is testing. An if-then-else statement can test expressions 
		 * based on ranges of values or conditions, whereas a switch statement tests expressions based only on 
		 * a single integer, enumerated value, or String object. 
		 */

		/* 
		 * Below example prints to screen 'August'. Every case is controlled and found matched one. 
		 * After that condition run break has been seen and stopped iterating in switch block. 
		 */

		int monthNumber = 8;
		switch (monthNumber) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			break;
		}
		System.out.println("**************************************");

		/*
		 * Another point of interest is the break statement. Each break statement terminates the enclosing 
		 * switch statement. Control flow continues with the first statement following the switch block. 
		 * The break statements are necessary because without them, statements in switch blocks fall through: 
		 * All statements after the matching case label are executed in sequence, regardless of the expression 
		 * of subsequent case labels, until a break statement is encountered. 
		 */

		monthNumber = 7;

		switch (monthNumber) {
		case 1:
			System.out.println("January");
		case 2:
			System.out.println("February");
		case 3:
			System.out.println("March");
		case 4:
			System.out.println("April");
		case 5:
			System.out.println("May");
		case 6:
			System.out.println("June");
		case 7:
			System.out.println("July");
		case 8:
			System.out.println("August");
		case 9:
			System.out.println("September");
		case 10:
			System.out.println("October");
		case 11:
			System.out.println("November");
		case 12:
			System.out.println("December");
			break;
		default:
			break;
		}
		System.out.println("**************************************");

		/*
		 * In Java SE 7 and later, you can use a String object in the switch statement's expression.  
		 */

		String monthName = "September";
		switch (monthName.toLowerCase()) {
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
			break;
		case "june":
			monthNumber = 6;
			break;
		case "july":
			monthNumber = 7;
			break;
		case "august":
			monthNumber = 8;
			break;
		case "september":
			monthNumber = 9;
			break;
		case "october":
			monthNumber = 10;
			break;
		case "november":
			monthNumber = 11;
			break;
		case "december":
			monthNumber = 12;
			break;
		default:
			monthNumber = 0;
			break;
		}

		System.out.println("Month Number: " + monthNumber);
		System.out.println("**************************************");
	}
}
