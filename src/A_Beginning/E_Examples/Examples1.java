package A_Beginning.E_Examples;

public class Examples1 {
	
	public void bodyIndex() {

		/*
		 * Body Index Program
		 */
		
		/*
		 * This algorithm calculates body index by using height and weight of a person.
		 * Body Index : Weight / (Height * Height)
		 */

		float weight = 78.7f;
		float height = 1.75f;
		float bodyIndex = weight / (height * height);
		System.out.println("Body Index = " + bodyIndex);
	}

	public void calculateCostByMile() {

		/*
		 * This algorithm calculates the cost according to miles that car went away.
		 */

		float unitCostforMile = 1.6f;
		int howMuchMilesAway = 125;
		float cost = unitCostforMile * howMuchMilesAway;
		System.out.println("Cost ($) = " + cost + "$");

	}

	public void swapValuesOfTwoVariables() {

		/*
		 * This algorithm swaps values of two variables.
		 * This classical logic is used in a lot of place.
		 */

		// First Way

		/*
		 * For doing this,
		 * we need a third variable to hold value of one of them temporarily
		 */

		int variable1 = 150;
		int variable2 = 125;
		int temp;
		temp = variable1;
		variable1 = variable2;
		variable2 = temp;
		System.out.println("Variable 1 = " + variable1);
		System.out.println("Variable 2 = " + variable2);

		// Second Way

		/*
		 * For doing this,		 
		 * we don't need third variable. We can swap their values by multiplying them
		 * and then dividing each other
		 */

		int firstNumber = 10;
		int secondNumber = 20;
		firstNumber *= secondNumber;
		secondNumber = firstNumber / secondNumber;
		firstNumber = firstNumber / secondNumber;
		System.out.println("First Number = " + firstNumber);
		System.out.println("Second Number = " + secondNumber);
	}

	public void findHypotenuseOfRightTriangle() {

		/*
		 * This algorithm calculates the Hypotenuse of right triangle
		 */

		int h = 3;
		int line = 4;
		
		// Math functions will cover later
		float hypotenuse = (float) Math.sqrt(h * h + line * line);
		System.out.println("Hypotenuse = " + hypotenuse);
	}
}
