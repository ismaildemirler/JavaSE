package A_Beginning.F_Operators;

public class Operators {

	public void MathematicalOperators() {

		// Mathematical Operators in Java

		/*
		 * + ---> Addition Operator
		 * - ---> Subtraction Operator
		 * / ---> Division Operator
		 * ---> Multiplication Operator
		 * % ---> Remainder/Modulo Operator
		 */

		/*
		 * Once you start combining the Java math operators in math expressions it
		 * becomes important to control
		 * 
		 * what calculations are to be executed when, in order to get the desired
		 * result. The Java math operators have a natural operator precedence which is similar to the precedence of
		 * standard math operators.
		 * 
		 * The math operators * and / for multiplication and division takes precedence
		 * over the + and - operators.
		 * 
		 * That means, that multiplications and divisions are evaluated before addition and subtraction in math expressions. 
		 * In case there are multiple * and / operators they will be calculated from left to right.
		 */

		int mathOperation1 = 3 + 4;
		System.out.println("Addition of two integers: " + mathOperation1);		
		System.out.println("**************************************");

		float mathOperation2 = 3 + 5.3f;
		System.out.println("Addition of integer and float: " + mathOperation2);
		System.out.println("**************************************");

		double mathOperation3 = 7 + 3.4;
		System.out.println("Addition of integer and double: " + mathOperation3);
		System.out.println("**************************************");

		int mathOperation4 = 2 - 5;
		System.out.println("Substraction of two integers: " + mathOperation4);
		System.out.println("**************************************");

		float mathOperation5 = 3 - 7.2f;
		System.out.println("Substraction of integer and float: " + mathOperation5);
		System.out.println("**************************************");

		double mathOperation6 = 2 - 8.3;
		System.out.println("Substraction of integer and double: " + mathOperation6);
		System.out.println("**************************************");

		int mathOperation7 = 10 / 4;
		System.out.println("Division of two integers: " + mathOperation7);
		System.out.println("**************************************");

		double mathOperation8 = 10d / 4;
		System.out.println("Division of integer and double: " + mathOperation8);
		System.out.println("**************************************");

		double mathOperation9 = 10 / 4.0;
		System.out.println("Division of integer and double: " + mathOperation9);
		System.out.println("**************************************");

		int mathOperation10 = 3 * 5;
		System.out.println("Multiplication of two integers: " + mathOperation10);
		System.out.println("**************************************");

		float mathOperation11 = 3 * 5.7f;
		System.out.println("Multiplication of integer and float: " + mathOperation11);
		System.out.println("**************************************");

		double mathOperation12 = 3 * 5.7;
		System.out.println("Multiplication of integer and double: " + mathOperation12);
		System.out.println("**************************************");

		int mathOperation13 = 15 % 4;
		System.out.println("Remainder of two integers' division: " + mathOperation13);
		System.out.println("**************************************");

		float mathOperation14 = 15 % 4.7f;
		System.out.println("Remainder of division of integer and float: " + mathOperation14);
		System.out.println("**************************************");

		double mathOperation15 = 15 % 4.7;
		System.out.println("Remainder of division of integer and double: " + mathOperation15);
		System.out.println("**************************************");
	}

	public void OtherMathematicalAsistantOperators() {

		// Mathematical Asistant Operators in Java

		// = ---> assigning operator

		int number1 = 4;
		System.out.println("Result of = operator: " + number1);
		System.out.println("**************************************");

		// += operator

		int number2 = 10;
		number2 += 4; // means that ---> number2 = number2 + 4
		System.out.println("Result of += operator: " + number2);
		System.out.println("**************************************");

		// *= operator
		int number3 = 2;
		number3 *= 4; // means that ---> number3 = number3 * 4
		System.out.println("Result of *= operator: " + number3);
		System.out.println("**************************************");

		// x++ (postfix) operator
		int number4 = 2;
		number4++; // means that number4++ <---> number4 += 1 <---> number4 = number4 + 1
		System.out.println("Result of ++ operator: " + number4);
		System.out.println("**************************************");

		// x-- (postfix) operator
		int number5 = 5;
		number5--; // means that number5-- <---> number5 -= 1 <---> number5 = number5 - 1
		System.out.println("Result of ++ operator: " + number5);
		System.out.println("**************************************");

		int number6 = 10;

		/*
		 * We see that number6 is printing 10 still. Because postfix ++ operator implies
		 * variable after operation which is printing screen in the current scenario.
		 */

		System.out.println("Postfix ++ operator: " + number6++);
		System.out.println("**************************************");

		int number7 = 5;

		/*
		 * We see that number7 is printing 6. Because prefix ++ operator implies
		 * variable before operation and then the process uses new value of the variable which the process is printing screen 
		 * in the current scenario. Postfix -- and prefix -- operators have same behavioral features. 
		 */

		System.out.println("Prefix ++ operator: " + ++number7);
		System.out.println("**************************************");

	}

	public void ComparingOperators() {

		// Comparing Operators in Java

		/*
		 * == operator ---> asks if is equal or not?		 * 
		 * if (5 == 5) returns true, goes inside of if block and execute operations inside of if block.
		 * {
		 * 		some logical operations
		 * }
		 * 
		 * if (6 == 5) returns false, does not go inside of if block and does not
		 * execute operations inside of if block.
		 * {
		 * 		some logical operations
		 * }
		 */

		System.out.println("Result of '5 == 5' : " + (5 == 5));
		System.out.println("**************************************");

		System.out.println("Result of '6 == 5' : " + (6 == 5));
		System.out.println("**************************************");

		System.out.println("Result of 'Java == Java' : " + ("Java" == "Java"));
		System.out.println("**************************************");

		/*
		 * != operator ---> asks if is not equal or not?
		 * if (6 != 5) returns true, goes inside of if block and execute operations inside of if block.
		 * { 
		 * 		some logical operations 
		 * }
		 * 
		 * if (5 != 5) returns false, does not go inside of if block and does not execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * } 
		 */

		System.out.println("Result of '6 != 5' : " + (6 != 5));
		System.out.println("**************************************");

		System.out.println("Result of '5 != 5' : " + (5 != 5));
		System.out.println("**************************************");

		System.out.println("Result of 'Java != Java' : " + ("Java" != "Java"));
		System.out.println("**************************************");

		/* 
		 * > operator ---> asks if bigger or not? 
		 * if (6 > 5) returns true, goes inside of if block and execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * }
		 * 
		 * if (5 > 5) returns false, does not go inside of if block and does not execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * } 
		 */

		System.out.println("Result of '5 > 5' : " + (5 > 5));
		System.out.println("**************************************");

		System.out.println("Result of '6 > 5' : " + (6 > 5));
		System.out.println("**************************************");

		/* 
		 * >= operator ---> asks if bigger or equal or not? 
		 * if (6 >= 5) returns true, goes inside of if block and execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * }
		 * 
		 * if (5 >= 5) returns true, goes inside of if block and execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * }
		 * 
		 * if (4 >= 5) returns false, does not go inside of if block and does not  execute operations inside of if block. 
		 * {  
		 * 		some logical operations 
		 * } 
		 */

		System.out.println("Result of '6 >= 5' : " + (6 >= 5));
		System.out.println("**************************************");

		System.out.println("Result of '5 >= 5' : " + (5 >= 5));
		System.out.println("**************************************");

		System.out.println("Result of '4 >= 5' : " + (4 >= 5));
		System.out.println("**************************************");

		/* 
		 * < operator ---> asks if smaller or not? 
		 * if (4 < 5) returns true, goes inside of if block and execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * }
		 * 
		 * if (5 < 5) returns false, does not go inside of if block and does not execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * } 
		 */

		System.out.println("Result of '4 < 5' : " + (4 < 5));
		System.out.println("**************************************");

		System.out.println("Result of '5 < 5' : " + (5 < 5));
		System.out.println("**************************************");

		/* 
		 * <= operator ---> asks if smaller or equal or not? 
		 * if (4 <= 5) returns true, goes inside of if block and execute operations inside of if block.  
		 * { 
		 * 		some logical operations 
		 * }
		 * 
		 * if (5 <= 5) returns true, goes inside of if block and execute operations inside of if block. 
		 * { 
		 *		some logical operations 
		 * }
		 * 
		 * if (6 <= 5) returns false, does not go inside of if block and does not execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * } 
		 */

		System.out.println("Result of '4 <= 5' : " + (4 <= 5));
		System.out.println("**************************************");

		System.out.println("Result of '5 <= 5' : " + (5 <= 5));
		System.out.println("**************************************");

		System.out.println("Result of '6 <= 5' : " + (6 <= 5));
		System.out.println("**************************************");
	}

	public void LogicalOperators() {

		// Logical Operators in Java

		/* 
		 * && operator ---> it is and operator. It asks if all conditions are fit or not?
		 * 
		 * if (5 == 5 && 2 < 3) All conditions are true here so returns true, goes inside of if block and execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * }
		 * 
		 * if (6 == 5 && 3 == 3) First condition is false, second one is true. All conditions are not fit so returns false, 
		 * 						 does not go inside of if block and does not execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * } 
		 */

		System.out.println("5 == 5 && 2 < 3: " + (5 == 5 && 2 < 3));
		System.out.println("**************************************");

		System.out.println("6 == 5 && 3 == 3: " + (6 == 5 && 3 == 3));
		System.out.println("**************************************");

		/* 
		 * || operator ---> it is or operator. It asks if at least one of the conditions is fit or not?
		 * 
		 * if (6 < 5 || 3 == 3) First condition is false but second condition is true so returns true, 
		 * 						goes inside of if block and execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * }
		 * 
		 * if (5 != 5 || 4 == 3) Both condition is false so returns false, does not go inside of if block 
		 * 						 and does not execute operations inside of if block. 
		 * { 
		 * 		some logical operations 
		 * } 
		 */

		System.out.println("6 < 5 || 3 == 3: " + (6 < 5 || 3 == 3));
		System.out.println("**************************************");

		System.out.println("5 != 5 || 4 == 3: " + (5 != 5 || 4 == 3));
		System.out.println("**************************************");

		/* 
		 * ! operator ---> it is not operator. It converts true to false or false to true?
		 * 
		 * !false --> true 
		 * !true --> false 
		 */

		System.out.println("!(6 < 5 || 3 == 3): " + !(6 < 5 || 3 == 3));
		System.out.println("**************************************");

		System.out.println("!(5 != 5 || 4 == 3): " + !(5 != 5 || 4 == 3));
		System.out.println("**************************************");
	}
}
