package C_Advance.B_ExceptionHandling.D_CustomException;

public class _CustomException {

	/*
	 * Java Custom Exception
	 * In Java, we can create our own exceptions that are derived classes of the Exception class. 
	 * Creating our own Exception is known as custom exception or user-defined exception. 
	 * Basically, Java custom exceptions are used to customize the exception according to user need.
	 * Consider the example 1 in which InvalidAgeException class extends the Exception class.
	 * Using the custom exception, we can have your own exception and message. 
	 * Here, we have passed a string to the constructor of superclass i.e. 
	 * Exception class that can be obtained using getMessage() method on the object we have created.
	 * In this section, we will learn how custom exceptions are implemented and used in Java programs.
	 */
	
	/*
	 * Why use custom exceptions?
	 * Java exceptions cover almost all the general type of exceptions that may occur in the programming. 
	 * However, we sometimes need to create custom exceptions.
	 * 
	 * Following are few of the reasons to use custom exceptions:
	   - To catch and provide specific treatment to a subset of existing Java exceptions.
	   - Business logic exceptions: These are the exceptions related to business logic and workflow. 
	     It is useful for the application users or the developers to understand the exact problem.
	 */
	
	public void customExceptions() {
		
		/*
		 * In order to create custom exception, we need to extend Exception class that belongs to java.lang package.
		 * Let's see a simple example of Java custom exception. 
		 * In the following code, constructor of EmailValidationException takes a string as an argument. 
		 * This string is passed to constructor of parent class Exception using the super() method. 
		 * Also the constructor of Exception class can be called without using a parameter and calling super() method is not mandatory.
		 */
		try {
			String email = "abcde";
			if (!email.contains("@")) {
				throw new EmailValidationException("Email format is incorrect");
			}
		} catch (EmailValidationException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	class EmailValidationException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public EmailValidationException(String message) {
			super(message);
		}
		
		@Override
		public void printStackTrace() {
			System.out.println("Please, enter your email in correct format!");
		}
	}
}
