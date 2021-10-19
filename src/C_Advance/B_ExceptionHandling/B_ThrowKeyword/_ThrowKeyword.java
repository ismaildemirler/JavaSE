package C_Advance.B_ExceptionHandling.B_ThrowKeyword;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _ThrowKeyword {

	/*
	 * Throw Keyword in Java
	 * 
	 * In Java, exceptions allows us to write good quality codes where the errors are checked 
	 * at the compile time instead of runtime and we can create custom exceptions 
	 * making the code recovery and debugging easier.
	 * The Java throw keyword is used to throw an exception explicitly. 
	 * We specify the exception object which is to be thrown. 
	 * The Exception has some message with it that provides the error description. 
	 * These exceptions may be related to user inputs, server, etc.
	 * We can throw either checked or unchecked exceptions in Java by throw keyword. 
	 * It is mainly used to throw a custom exception. We can also define our own set of conditions and 
	 * throw an exception explicitly using throw keyword. For example, we can throw ArithmeticException 
	 * if we divide a number by another number. Here, we just need to set the condition and throw exception using throw keyword.
	 * The syntax of the Java throw keyword is given below. 
	 * 
	 * throw new exception_class("error message");  
	 * 
	 * Let's see the example of throw IOException.
	 * 
	 * throw new IOException("sorry device error");
	 * 
	 * Where the Instance must be of type Throwable or subclass of Throwable. 
	 * For example, Exception is the sub class of Throwable and the user-defined exceptions usually extend the Exception class.
	 */
	
	public void throwKeyword() {
		
		/*
		 * Example 1: Throwing Unchecked Exception
		 * In this example, we have created a method named validate() 
		 * that accepts an integer as a parameter. If the age is less than 18, 
		 * we are throwing the ArithmeticException otherwise print a message welcome to vote.
		 */
		int age = 17;
		if(age < 18) {  
            //throw Arithmetic exception if not eligible to vote 
			try {
	            throw new ArithmeticException("Person is not eligible to vote");   
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
		System.out.println("********************************************");
		
		/*
		 * The above code throw an unchecked exception. 
		 * Similarly, we can also throw unchecked and user defined exceptions.
		 * If we throw unchecked exception from a method, it is must to handle the exception or declare in throws clause.
		 */
		
		/*
		 * Example 2: Throwing Checked Exception
		 * Every subclass of Error and RuntimeException is an unchecked exception in Java. 
		 * A checked exception is everything else under the Throwable class.
		 */
		try {
			FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
	        BufferedReader fileInput = new BufferedReader(file);  	      
	        throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("********************************************");
		
		/*
		 * Example 3: Throwing User-defined Exception 
		 */
		try  
        {  
            // throw an object of user defined exception  
            throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException ude)  
        {  
            System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(ude.getMessage());  
        }  
		System.out.println("********************************************");
	}
	
	public void exceptionPropagation() {
		
		/*
		 * Java Exception Propagation
		 * An exception is first thrown from the top of the stack and if it is not caught, 
		 * it drops down the call stack to the previous method. If not caught there, 
		 * the exception again drops down to the previous method, and so on until they are 
		 * caught or until they reach the very bottom of the call stack. 
		 * This is called exception propagation.
		 * By default Unchecked Exceptions are forwarded in calling chain (propagated).
		 */
		UncheckedExceptionPropagationExample obj = new UncheckedExceptionPropagationExample();  
		obj.callingDivideMethod();  
		System.out.println("normal flow..."); 
		
		/*
		 * In the above example exception occurs in the m() method where it is not handled, 
		 * so it is propagated to the previous n() method where it is not handled, 
		 * again it is propagated to the p() method where exception is handled.
		 * Exception can be handled in any method in call stack either 
		 * in the main() method, callingDivideMethod() method, callingDivide() method or divide() method.
		 * 
		 * By default, Checked Exceptions are not forwarded in calling chain (propagated).
		 * It gives compile-time error.
		 */
	}
	
	public class UserDefinedException extends Exception {
		
		private static final long serialVersionUID = -7000392512257059138L;

		public UserDefinedException(String str)  
	    {  
	        // Calling constructor of parent Exception  
	        super(str);  
	    }  
	}

	public class UncheckedExceptionPropagationExample {
		
		void divide() {
			int data = 100 / 0;
		}
		
		void callingDivide() {
			divide();
		}
		
		void callingDivideMethod() {
			try {
				callingDivide();
			} catch (Exception e) {
				System.out.println("exception handled");
			}
		}
	}
}
