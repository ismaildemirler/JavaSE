package A_Beginning.K_Examples;

public class Examples4 {
	
	public void findPrimeNumbers() {
		
		/*
		 * Finding Prime Numbers in Java
		 */
		
		/* 
		 * Prime number: The number which can not be divided any numbers except 1 and itself.
		 * In this example prime numbers which is between 1 and 1000 is found.
		 */

		System.out.print("Prime Numbers : 2"); 
		for (int i = 3; i < 1000; i++) {
			boolean isPrime = isPrimeNumber(i);
			if (isPrime) {
				System.out.print(" - " + i);
			}
		}
		System.out.println("");
		System.out.println("**************************************");
	}
	
	private boolean isPrimeNumber(int number) {
		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}

	public void getGCMOfTwoNumbers() {
		
		/*
		 * Finding Greatest Common Divisor of Two Numbers in Java
		 */
		
		int number1 = 36;
		int number2 = 45;
		
		int gcm = findGCMOfTwoNumbers(number1, number2);
		System.out.println("GCM of " + number1 + " and " + number2 + " : " + gcm);
		System.out.println("**************************************");
	}
	
	private int findGCMOfTwoNumbers(int number1, int number2) {
		int gcm = 0;
		int minimumNumber = findMinimumOfTwoNumbers(number1, number2);
		for (int i = 1; i <= minimumNumber; i++) {
			if(allNumbersCanBeDivided(number1, number2, i)) {
				gcm = i;
			}
		}
		return gcm;
	}
	
	private boolean allNumbersCanBeDivided(int number1, int number2, int i) {
		if (number1 % i == 0 && number2 % i == 0) {
			return true;
		}
		return false;
	}
	
	private int findMinimumOfTwoNumbers(int number1, int number2) {
		int minimum = number1;
		if (number2 < minimum) {
			minimum = number2;
		}
		return minimum;
	}
}
