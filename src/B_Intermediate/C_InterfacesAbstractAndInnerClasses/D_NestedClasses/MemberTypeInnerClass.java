package B_Intermediate.C_InterfacesAbstractAndInnerClasses.D_NestedClasses;

public class MemberTypeInnerClass {

	private double PI = Math.PI;
	
	public class Factorial {
		
		public void calculateFactorial(int number) {
			
			int factorial = 1;
			for (int i = 2; i <= number; i++) {
				factorial *= i;
			}
			System.out.println("Factorial: " + factorial);
		}
	}
	
	public class PrimeNumbers {
		
		private boolean isPrime(int number) {
			
			int i = 2;
			while(i < number) {
				if(number % i == 0) {
					return false;
				}
				i++;
			}
			return true;
		}
		
		public void isNumberPrimeOrNot(int number) {
			if (isPrime(number)) {
				System.out.println("The number is a prime number");
			}
			else {
				System.out.println("The number is not a prime number");
			}
		}
	}
	
	public class Area {
		
		public void areaOfCircle(int radius) {
			System.out.println("Area of the circle: " + (radius * radius * PI));
		}
	}
}
