package A_Beginning.C_Chars;

public class Chars {

	public void charType() {

		/*
		 * 
		 * char data type is used to demonstrate letters. char datatype is 2 bytes - 16
		 * bits
		 * 
		 */
		char character1 = 'A';
		char character2 = '?';
		// char character3 = '23' is wrong
		// char character4 = 'AB' is wrong
		char character5 = 2000;
		System.out.println("Character = " + character5);
		
		// We can use any of characters from unicode character table
		char character6 = '\u0152';
		System.out.println("Unicode Character = " + character6);
	}

	public void booleanType() {

		/*
		 * It is used for conditions. It can be just false or true.
		 */
		boolean negativeCondition = false;
		System.out.println("Negative Condition = " + negativeCondition);

		boolean positiveCondition = true;
		System.out.println("Positive Condition = " + positiveCondition);

		/*
		 * In this way we can question if two condition is true or not and assign this
		 * boolean value to boolean variable In "if - else" subject this boolean subject
		 * will be considered more.
		 */
		boolean conditionIsFit = negativeCondition == positiveCondition;
		System.out.println("Condition is fit = " + conditionIsFit);
	}
}
