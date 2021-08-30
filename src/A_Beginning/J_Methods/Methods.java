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
	}
	
	public void greetingMethod() {
		System.out.println("Hello, how are you?");
		System.out.println("This is an example method that you have coded.");
	}
}
