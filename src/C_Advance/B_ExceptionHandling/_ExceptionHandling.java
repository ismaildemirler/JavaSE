package C_Advance.B_ExceptionHandling;

public class _ExceptionHandling {

	/*
	 * Exception Handling in Java
	 */
	
	/*
	 * The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors 
	 * so that the normal flow of the application can be maintained.
	 * In this tutorial, we will learn about Java exceptions, it's types, 
	 * and the difference between checked and unchecked exceptions.
	 */
	
	/*
	 * What is Exception in Java?
	 * Dictionary Meaning: Exception is an abnormal condition.
	 * In Java, an exception is an event that disrupts the normal flow of the program. 
	 * It is an object which is thrown at runtime.
	 * 
	 * What is Exception Handling?
	 * Exception Handling is a mechanism to handle runtime errors such as 
	 * ClassNotFoundException, IOException, SQLException, RemoteException, etc.
	 * The core advantage of exception handling is to maintain the normal flow of the application. 
	 * An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions.
	 */
	
	/*
	 * Hierarchy of Java Exception classes
	 * The java.lang.Throwable class is the root class of 
	 * Java Exception hierarchy inherited by two subclasses: Exception and Error. 
	 * 
	 * Types of Java Exceptions
	 * There are mainly two types of exceptions: checked and unchecked. 
	 * An error is considered as the unchecked exception. 
	 * However, according to Oracle, there are three types of exceptions namely:
       - Checked Exception
       - Unchecked Exception
	   - Error
	 */
	
	/*
	 * Difference between Checked and Unchecked Exceptions
	   1) Checked Exception
		  The classes that directly inherit the Throwable class except RuntimeException 
		  and Error are known as checked exceptions. For example, IOException, SQLException, etc. 
		  Checked exceptions are checked at compile-time.

	   2) Unchecked Exception
	      The classes that inherit the RuntimeException are known as unchecked exceptions. 
	      For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
	      Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

	   3) Error
	      Error is irrecoverable. Some example of errors are OutOfMemoryError, 
	      VirtualMachineError, AssertionError etc.
	 */
	
	public void exceptionHandling() {

		try {
			// code that may raise exception
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception Message Examole: " + e.getMessage());
		}
		// rest code of the program
		System.out.println("We can continue flows of the program...");
		System.out.println("****************************************");

		/*
		 * In the above example, 100/0 raises an ArithmeticException which is handled by
		 * a try-catch block.
		 */

		/*
		 * Common Scenarios of Java Exceptions There are given some scenarios where
		 * unchecked exceptions may occur. They are as follows:
		 */

		/*
		 * 1) A scenario where ArithmeticException occurs If we divide any number by
		 *    zero, there occurs an ArithmeticException.
		 */
		try {
			int a=50/0; //ArithmeticException 
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Message: " + e.getMessage());
		}
		System.out.println("****************************************");
		
		/*
		 * 2) A scenario where NullPointerException occurs
		 *    If we have a null value in any variable, 
		 *    performing any operation on the variable throws a NullPointerException.
		 */
		try {
			String s = null;  
			System.out.println(s.length()); //NullPointerException  
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception Message: " + e.getMessage());
		}
		System.out.println("****************************************");
		
		/*
		 * 3) A scenario where NumberFormatException occurs
		 *    If the formatting of any variable or number is mismatched, 
		 *    it may result into NumberFormatException. 
		 *    Suppose we have a string variable that has characters; 
		 *    converting this variable into digit will cause NumberFormatException.
		 */
		try {
			String s = "abc";  
			int i = Integer.parseInt(s); //NumberFormatException  
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception Message: " + e.getMessage());
		}
		System.out.println("****************************************");
		
		/*
		 * 4) A scenario where ArrayIndexOutOfBoundsException occurs
		 *    When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs. 
		 *    there may be other reasons to occur ArrayIndexOutOfBoundsException. 
		 *    Consider the following statements.
		 */
		try {
			int a[] = new int[5];  
			a[10] = 50; //ArrayIndexOutOfBoundsException 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception Message: " + e.getMessage());
		}
		System.out.println("****************************************");
	}

	public void exceptionHandlingWithMethodOverriding() {
		
		/*
		 * Exception Handling with Method Overriding in Java
		 * 
		 * There are many rules if we talk about method overriding with exception handling.
		 * Some of the rules are listed below:
		   - If the superclass method does not declare an exception
			 - If the superclass method does not declare an exception, subclass overridden method 
			   cannot declare the checked exception but it can declare unchecked exception.

		   - If the superclass method declares an exception
			 - If the superclass method declares an exception, subclass overridden method can declare same, 
			   subclass exception or no exception but cannot declare parent exception.
		 */
		
		/*
		 * If the superclass method does not declare an exception
		 */
		Parent p = new TestExceptionChild();    
		p.message(); 
		
		/*
		 * If the superclass method declares an exception
		 * Example in case subclass overridden method declares same exception
		 * it is no problem
		 */
		try {
			p.log();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * Example in case subclass overridden method declares subclass exception
		 */
		try {
			p.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * Example in case subclass overridden method declares no exception
		 */
		try {
			p.save();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	class Parent {
		void message() {
			System.out.println("Parent message Method");
		}
		
		void log() throws Exception {
			System.out.println("Parent log Method");
		}
		
		void print() throws Exception {
			System.out.println("Parent print Method");
		}
		
		void save() throws Exception {
			System.out.println("Parent save Method");
		}
	}
	
	class TestExceptionChild extends Parent {
		
		// overriding the method in child class  
		// gives compile time error  
//		@Override
//		void message() throws IOException {
//			System.out.println("TestExceptionChild");   
//		}
		
		@Override 
		void message() throws ArithmeticException {
			System.out.println("TestExceptionChild");
		}
		
		// overriding the method in child class  
	    // gives compile time error  
//		@Override
//		void log() throws Exception {
//			System.out.println("TestExceptionChild");
//		}
		
		@Override 
		void log() throws Exception {
			System.out.println("TestExceptionChild");
		}
		
		@Override 
		void print() throws NullPointerException {
			System.out.println("TestExceptionChild");
		}
		
		@Override 
		void save() {
			System.out.println("TestExceptionChild");
		}
	}
}
