package A_Beginning.J_Methods;

public class Methods {
	
	public void beginningToMethods() {
		
		/*
		 * Methods in Java
		 */
		
		/*
		 * A method is a block of code which only runs when it is called.
		 * You can pass data, known as parameters, into a method.
		 * Methods are used to perform certain actions, and they are also known as functions.
		 * Why use methods? To reuse code: define the code once, and use it many times.
		 */
		
		/*
		 * 	    Method Signature: Every method has a method signature. It is a part of the method declaration. 
		   						  It includes the method name and parameter list.
		 * 	    Access Specifier: Access specifier or modifier is the access type of the method. 
		   	                      It specifies the visibility of the method. Java provides four types of access specifier:
		   	 		Public   : The method is accessible by all classes when we use public specifier in our application.
					Private  : When we use a private access specifier, the method is accessible only in the classes in which it is defined.
					Protected: When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.
					Default  : When we do not use any access specifier in the method declaration, Java uses default access specifier by default. 
						 	   It is visible only from the same package only.
		 *      Return Type: Return type is a data type that the method returns. It may have a primitive data type, object, collection, void, etc. 
		         			 If the method does not return anything, we use void keyword.
		 *      Method Name: It is a unique name that is used to define the name of a method. It must be corresponding to the functionality of the method. 
		        		     Suppose, if we are creating a method for subtraction of two numbers, the method name must be subtraction(). 
		        		     A method is invoked by its name.
		 *      Parameter List: It is the list of parameters separated by a comma and enclosed in the pair of parentheses. 
		       					It contains the data type and variable name. If the method has no parameter, left the parentheses blank.
		 *      Method Body: It is a part of the method declaration. It contains all the actions to be performed. 
		 					 It is enclosed within the pair of curly braces.
		 */
		
		/*
		 * In a class, there can be methods that have same name. But they have to have different kind of parameters or different number of parameters.
		 */
		
		/*
		 * access_specifier (optional) extra_features return_type function_name (parameters) {
		   		function code block
		   }
		 
		 * public void ExampleMethod(){
		 
		   }
		 */
		
		/*
		 * We can use methods which is already defined in the Java class libraries is known as predefined methods.
		 * For instance: println
		 */
		System.out.println("For example println is a predefined method");
		
		/*
		 * Or we can write our own methods and use them whenever we need.
		 */
		greetingMethod();
		
		/*
		 * Until now, we did not send parameters to a method. We can send parameters to method and use them inside of the method.
		 * If your method waits for parameters you have to send parameters or the method will get an error. 
		 * If your method waits for 2 parameters you have to send 2 parameters. Not more not less.
		 * Your parameters have to match. For instance your method waits firstly string, secondly integer you have to send that kind of parameters.
		 * Order of parameters matter.
		 */
		greetingMethodWithParameters("İsmail", "Turkey");
		greetingMethodWithParameters("Jake", "England");
		
		calculation("*", 24, 5);
	}
	
	public void returningFromMethods() {
		
		/*
		 * When using some of methods we don't need to have a returning value from result of operations of what have done in the method.
		 * We call the method and method has done his duty and it is over.
		 * But sometimes we need some results which returns from operations what have done in the methods to continue to main process.
		 * So these times we don't use void. We use some kind of data type which we need to get the result from method in method definition
		 * and use the 'return' keyword in the method to return result of the operations.
		 * This method definition and return value must match or we can get an error.
		 */
		int result = calculatorWithReturn("/", 1255, 5);
		System.out.println("Result of the calculator method : " + result);
		
		System.out.println("**************************************");
		
		/*
		 * We can use the return value of a method as an input of other method/s.
		 * In this example we found a ratio from first method and give ratio to second method.
		 */		
		int ratio = calculatorWithReturn("+", 25, 15);
		double salary = calculateSalary(1000, ratio);
		System.out.println("Calculated salary : " + salary);
		
		System.out.println("**************************************");
	}

	public void MethodOverloading() {
		
		/*
		 * We can define multiple methods which have same names but different parameters and also different return types. 
		 * This is a concept in Java. So these methods do different jobs in a different way but have same name in a class. 
		 * This type of method is called Overloaded Method.
		 * Sometimes method overloading can be used instead of doing some parameter of method optional to use method with less parameters.
		 */
		int result1 = calculator("/", 10, 2);
		System.out.println("Result of first method overloading = " + result1);
		System.out.println("**************************************");
		
		int result2 = calculator("*", 3, 5, 6);
		System.out.println("Result of second method overloading = " + result2);
		System.out.println("**************************************");
		
		int result3 = calculator("+", 10, 20, 21, 43);
		System.out.println("Result of third method overloading = " + result3);
		System.out.println("**************************************");
		
		scoreCalculate(250);
		scoreCalculate("İsmail");
		scoreCalculate("John", 100);
	}
	
	/*
	 * Beginning to methods
	 */
	public void greetingMethod() {
		System.out.println("Hello, how are you?");
		System.out.println("This is an example method that you have coded.");
		System.out.println("**************************************");
	}
	
	/*
	 * Beginning to methods
	 */
	public void greetingMethodWithParameters(String name, String country) {
		System.out.println("Hello " + name + ", how is your life in " + country + "?");
		System.out.println("**************************************");
	}
	
	/*
	 * Beginning to methods
	 */
	public void calculation(String operation, int number1, int number2) {
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

	/*
	 * Returning from methods
	 */
	public int calculatorWithReturn(String operation, int number1, int number2) {
		int result = 0;
		switch (operation) {
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			result = number1 / number2;
			break;
		default:
			System.out.println("Geçersiz işlem");
			break;
		}
		return result;
	}

	/*
	 * Returning from methods
	 */
	public double calculateSalary(int baseSalary, int ratio) {
		double salary = baseSalary * ((double)ratio / 100);
		return salary;
	}

	/*
	 * Method Overloading
	 */
	public int calculator(String operation, int number1, int number2) {
		int result = 0;
		switch (operation) {
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			result = number1 / number2;
			break;
		default:
			System.out.println("Geçersiz işlem");
			break;
		}
		return result;
	}
	
	/*
	 * Method Overloading
	 */
	public int calculator(String operation, int number1, int number2, int number3) {
		int result = 0;
		switch (operation) {
		case "+":
			result = number1 + number2 + number3;
			break;
		case "-":
			result = number1 - number2 - number3;
			break;
		case "*":
			result = number1 * number2 * number3;
			break;
		case "/":
			result = number1 / number2 / number3;
			break;
		default:
			System.out.println("Geçersiz işlem");
			break;
		}
		return result;
	}
	
	/*
	 * Method Overloading
	 */
	public int calculator(String operation, int number1, int number2, int number3, int number4) {
		int result = 0;
		switch (operation) {
		case "+":
			result = number1 + number2 + number3 + number4;
			break;
		case "-":
			result = number1 - number2 - number3 - number4;
			break;
		case "*":
			result = number1 * number2 * number3 * number4;
			break;
		case "/":
			result = number1 / number2 / number3 / number4;
			break;
		default:
			System.out.println("Geçersiz işlem");
			break;
		}
		return result;
	}

	/*
	 * Method Overloading
	 */
	public void scoreCalculate(String name, int score) {
		System.out.println("The gamer who is called " + name + " has " + score + " score");
		System.out.println("**************************************");
	}
	
	/*
	 * Method Overloading
	 */
	public void scoreCalculate(String name) {
		System.out.println("The gamer who is called " + name + " has undefined score");
		System.out.println("**************************************");
	}

	/*
	 * Method Overloading
	 */
	public void scoreCalculate(int score) {
		System.out.println("The undefined gamer has " + score + " score");
		System.out.println("**************************************");
	}
}
