package C_Advance.B_ExceptionHandling.C_ThrowsKeyword;

import java.io.IOException;

public class _ThrowsKeyword {

	/*
	 * Throws Keyword in Java
	 * The Java throws keyword is used to declare an exception. 
	 * It gives an information to the programmer that there may occur an exception. 
	 * So, it is better for the programmer to provide the exception handling 
	 * code so that the normal flow of the program can be maintained.
	 * Exception Handling is mainly used to handle the checked exceptions. 
	 * If there occurs any unchecked exception such as NullPointerException, 
	 * it is programmers' fault that he is not checking the code before it being used.
	 * 
	 * return_type method_name() throws exception_class_name{  
	   		//method code  
	   }  
	 */
	
	/*
	 * Which exception should be declared?
	 * Ans: Checked exception only, because:
	   - unchecked exception: under our control so we can correct our code.
	   - error: beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or StackOverflowError.

     * Advantage of Java throws keyword
     * Now Checked Exception can be propagated (forwarded in call stack).
     * It provides information to the caller of the method about the exception.
     * 
     * Can we rethrow an exception?
     * Yes, by throwing same exception in catch block.
	 */
	
	public void throwsKeyword() {
		
		/*
		 * Java throws Example
		 * Let's see the example of Java throws clause which describes 
		 * that checked exceptions can be propagated by throws keyword.
		 */
		CheckedExceptionPropagationExample example = new CheckedExceptionPropagationExample();
		example.connectDeviceMethod();
		
		/*
		 * If we are calling a method that declares an exception, 
		 * we must either caught or declare the exception.
		 * 
		 * There are two cases:
	       - Case 1: We have caught the exception i.e. we have handled the exception using try/catch block.
		   - Case 2: We have declared the exception i.e. specified throws keyword with the method.
		 */
	}

	public void throwAndThrows() {
		
		/*
		 * Difference between throw and throws in Java
		 * The throw and throws is the concept of exception handling 
		 * where the throw keyword throw the exception explicitly from a 
		 * method or a block of code whereas the throws keyword is used in signature of the method.
		 * There are many differences between throw and throws keywords. 
		 * A list of differences between throw and throws are given below:
		 * 
		   - Definition :
		     - Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
		     - Java throws keyword is used in the method signature to declare an exception 
		       which might be thrown by the function while the execution of the code.
		       
		   - Declaration :
		     - throw is used within the method.
		     - throws is used with the method signature.
		     
		   - Internal implementation :
		     - We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.
		     - We can declare multiple exceptions using throws keyword that can be thrown by the method. 
		       For example, main() throws IOException, SQLException.
		 */		
	}
	
	public class CheckedExceptionPropagationExample {
		
		void connect() throws IOException { 
			throw new IOException("device error");//checked exception  
		}
		
		void connectDevice() throws IOException {
			connect();
		}
		
		void connectDeviceMethod() {
			try {
				connectDevice();
			} catch (Exception e) {
				System.out.println("exception handled");
			}
		}
	}
}
