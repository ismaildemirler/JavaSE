package C_Advance.B_ExceptionHandling.A_TryCatchBlocks;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class _TryCatch {

	/*
	 * Try-Catch Block
	 * 
	 * Java try block is used to enclose the code that might throw an exception. 
	 * It must be used within the method. If an exception occurs at the particular 
	 * statement in the try block, the rest of the block code will not execute. 
	 * So, it is recommended not to keep the code in try block that will not throw an exception.
	 * Java try block must be followed by either catch or finally block.
	 */
	
	/*
	 * Internal Working of Java try-catch block
	 * 
	 * The JVM firstly checks whether the exception is handled or not. 
	 * If exception is not handled, JVM provides a default exception handler that performs the following tasks:
	   - Prints out exception description.
	   - Prints the stack trace (Hierarchy of methods where the exception occurred).
	   - Causes the program to terminate.
	 
	 * But if the application programmer handles the exception, 
	 * the normal flow of the application is maintained, i.e., rest of the code is executed.
	 */
	
	public void tryCatch() {
		
		try {
			 int data = 50/0; //throws exception 
		} catch (ArithmeticException e) {
			System.out.println(e);  
		}
		System.out.println("rest of the code"); 
		System.out.println("*************************************");
		
		/*
		 * As displayed in the above example, the rest of the code is executed, 
		 * i.e., the rest of the code statement is printed.
		 */
		
		/*
		 * In this example, we also kept the code in a try block that will not throw an exception.
		 */
		try {
			int data = 50/0; //throws exception   
            	           // if exception occurs, the remaining statement will not execute  
			System.out.println("rest of the code"); 
		} catch (ArithmeticException e) {
			System.out.println(e);  
		}
		System.out.println("*************************************");
		
		/*
		 * In above example, we can see that if an exception occurs in the try block, 
		 * the rest of the block code will not execute.
		 */
		
		/*
		 * Here, we handle the exception using the parent class exception.
		 */
		try {  
			int data = 50/0; //throws exception   
        }      
        catch(Exception e) {  
        	//We can print out custom message in catch block.
            System.out.println("Can not divide by zero.");  
        }  
        System.out.println("rest of the code");  
		System.out.println("*************************************");
		
		/*
		 * Let's see an example to resolve the exception in a catch block.
		 */
		int i = 50;  
        int j = 0;  
        int data;  
        
        try {  
        	data = i / j; //throws exception   
        }  
        catch(Exception e) {  
             // resolving the exception in catch block  
            System.out.println("Resolving result in catch block: " + i / (j + 2));  
        }  
		System.out.println("*************************************");
		
		/*
		 * In this example, along with try block, we also enclose exception code in a catch block.
		 */
		try {  
			int data1 = 50 / 0; //throws exception   
        }    
        catch(Exception e) {  
            // generating the exception in catch block  
        	//int data2 = 50 / 0; //throws exception and program will stop.  
        }  
		System.out.println("rest of the code");  
		System.out.println("*************************************");
		
		/*
		 * Here, we can see that the catch block didn't contain the exception code. 
		 * So, enclose exception code within a try block and use catch block only to handle the exceptions.
		 */
		
		/*
		 * If we handle the generated exception (Arithmetic Exception) 
		 * with a different type of exception class (ArrayIndexOutOfBoundsException),
		 * the program will stop and does not continue. 
		 */
		
		/*
		 * Let's see an example to handle another unchecked exception.
		 */
		try {  
			int arr[]= {1,3,5,7};  
			System.out.println(arr[10]); //throws exception   
        }    
        catch(ArrayIndexOutOfBoundsException e) {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
		System.out.println("*************************************");
		
		/*
		 * Let's see an example to handle checked exception.
		 */
		PrintWriter pw;  
        try {  
            pw = new PrintWriter("jtp.txt"); //may throw exception   
            pw.println("saved");  
        }  
        // providing the checked exception handler  
        catch (FileNotFoundException e) {                
            System.out.println(e);  
        }         
        System.out.println("File saved successfully");  
		System.out.println("*************************************");
	}

	public void multipleCatch() {
		
		/*
		 * Java Multi-catch block
		 * A try block can be followed by one or more catch blocks. 
		 * Each catch block must contain a different exception handler. 
		 * So, if you have to perform different tasks at the occurrence 
		 * of different exceptions, use java multi-catch block.
		 * 
		 * Points to remember
		   - At a time only one exception occurs and at a time only one catch block is executed.
		   - All catch blocks must be ordered from most specific to most general, i.e. 
		     catch for ArithmeticException must come before catch for Exception.
		 */
		
		try {
			int[] a = new int[5];
			a[6] = 30 / 0;
		} catch (ArithmeticException  e) {
			System.out.println("Arithmetic Exception occurs: " + e.getMessage());  
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs: " + e.getMessage());  
		} catch (Exception e) {
			System.out.println("Parent Exception occurs: " + e.getMessage());  
		}
		System.out.println("rest of the code"); 
		System.out.println("*************************************************");
		
		try {
			int[] a = new int[5];
			System.out.println(a[9]);
		} catch (ArithmeticException  e) {
			System.out.println("Arithmetic Exception occurs: " + e.getMessage());  
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs: " + e.getMessage());  
		} catch (Exception e) {
			System.out.println("Parent Exception occurs: " + e.getMessage());  
		}
		System.out.println("rest of the code"); 
		System.out.println("*************************************************");
		
		/*
		 * In above example, try block contains two exceptions. 
		 * But at a time only one exception occurs and its corresponding catch block is executed.
		 */
		
		/*
		 * In this example, we generate NullPointerException, 
		 * but didn't provide the corresponding exception type. 
		 * In such case, the catch block containing the parent exception class Exception will invoked.
		 */
		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException  e) {
			System.out.println("Arithmetic Exception occurs: " + e.getMessage());  
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs: " + e.getMessage());  
		} catch (Exception e) {
			System.out.println("Parent Exception occurs: " + e.getMessage());  
		}
		System.out.println("rest of the code"); 
		System.out.println("*************************************************");
		
		/*
		 * If we put multiple catch to handle the exception without maintaining 
		 * the order of exceptions (i.e. from most specific to most general)
		 * our code will give compile-time error.
		 */
	}

	public void nestedTry() {
		
		/*
		 * Java Nested try block
		 * In Java, using a try block inside another try block is permitted. 
		 * It is called as nested try block. Every statement that we enter a statement in try block, 
		 * context of that exception is pushed onto the stack.
		 * For example, the inner try block can be used to handle ArrayIndexOutOfBoundsException 
		 * while the outer try block can handle the ArithemeticException (division by zero).
		 * 
		 * Why use nested try block
		 * Sometimes a situation may arise where a part of a block may cause one error and 
		 * the entire block itself may cause another error. In such cases, exception handlers have to be nested.
		 */
		
		/*
		 * Let's see an example where we place a try block within another try block for two different exceptions.
		 */
		try {
			try {
				System.out.println("going to divide by 0");    
				int b = 39 / 0;    
			} catch (ArithmeticException  e) {
				System.out.println(e); 
			}
			
			try {
				int a[] = new int[5];    
				
				//assigning the value out of array bounds  
				a[5] = 4;   
			} catch (ArrayIndexOutOfBoundsException  e) {
				System.out.println(e); 
			}
			
			System.out.println("other statement"); 
			
		} catch (Exception e) {
			System.out.println("handled the exception (outer catch)");  
		}
		
		System.out.println("normal flow..");    
		System.out.println("*************************************");
		
		/*
		 * When any try block does not have a catch block for a particular exception, 
		 * then the catch block of the outer (parent) try block are checked for that exception, 
		 * and if it matches, the catch block of outer try block is executed.
		 * If none of the catch block specified in the code is unable to handle the exception, 
		 * then the Java runtime system will handle the exception. 
		 * Then it displays the system generated message for that exception.
		 */
		
		/*
		 * Let's consider the following example. 
		 * Here the try block within nested try block (inner try block 2) do not handle the exception. 
		 * The control is then transferred to its parent try block (inner try block 1). 
		 * If it does not handle the exception, then the control is transferred to the main try block 
		 * (outer try block) where the appropriate catch block handles the exception. 
		 * It is termed as nesting.
		 */
		
		// outer (main) try block  
        try {      
            //inner try block 1   
            try {      
                // inner try block 2  
                try {  
                    int arr[] = { 1, 2, 3, 4 };  
  
                    //printing the array element out of its bounds  
                    System.out.println(arr[10]);  
                } catch (ArithmeticException e) {  
                    System.out.println("Arithmetic exception");  
                    System.out.println(" inner try block 2");  
                }  
            } catch (ArithmeticException e) {  
                System.out.println("Arithmetic exception");  
                System.out.println("inner try block 1");  
            }  
        } catch (ArrayIndexOutOfBoundsException e4) {  
            System.out.print(e4);  
            System.out.println(" outer (main) try block");  
        } catch (Exception e5) {  
            System.out.print("Exception");  
            System.out.println(" handled in main try-block");  
        }  
		System.out.println("*************************************");
	}

	public void finallyBlock() {
		
		/*
		 * Java finally block
		 * Java finally block is a block used to execute important code such as closing the connection, etc.
		 * Java finally block is always executed whether an exception is handled or not. 
		 * Therefore, it contains all the necessary statements that need to be printed 
		 * regardless of the exception occurs or not. The finally block follows the try-catch block.
		 */
		
		/*
		 * Why use Java finally block?
		   - finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
	 	   - The important statements to be printed can be placed in the finally block.

		 * Usage of Java finally
		 * Let's see the different cases where Java finally block can be used.
		 */
		
		/*
		 * Case 1: When an exception does not occur
		 * Let's see the below example where the Java program does not throw any exception, 
		 * and the finally block is executed after the try block.
		 */
		try {
			//below code do not throw any exception
			int data = 25 / 5;    
			System.out.println("Result of 25/5 : " + data); 
		} catch (Exception e) {
			System.out.println(e);
		}
		//executed regardless of exception occurred or not  
		finally {
			System.out.println("finally block is always executed"); 
		}
		System.out.println("rest of the code..."); 
		System.out.println("*************************************");
		
		/*
		 * Case 2: When an exception occur but not handled by the catch block
		 * Let's see the the following example. Here, the code throws an exception 
		 * however the catch block cannot handle it. Despite this, the finally block is 
		 * executed after the try block and then the program terminates abnormally.
		 */
		try {
			System.out.println("Inside the try block");  
			//below code throws divide by zero exception  
			/*
			int data=25/0;    
			System.out.println(data);
			*/
			//above code throws error, finally block executed and program stop.
		}
		//cannot handle Arithmetic type exception  
	    //can only accept Null Pointer type exception  
		catch (NullPointerException  e) {
			System.out.println(e);
		}
		//executed regardless of exception occurred or not  
		finally {
			System.out.println("finally block is always executed"); 
		}
		System.out.println("rest of the code..."); 
		System.out.println("*************************************");
		
		/*
		 * Case 3: When an exception occurs and is handled by the catch block
		 * Example:
		 * Let's see the following example where the Java code throws an 
		 * exception and the catch block handles the exception. 
		 * Later the finally block is executed after the try-catch block. 
		 * Further, the rest of the code is also executed normally.
		 */
		try {
			System.out.println("Inside the try block");  
			
			//below code throws divide by zero exception  
			int data = 25 / 0;    
			System.out.println(data);
		}
		//handles the Arithmetic Exception / Divide by zero exception  
		catch (ArithmeticException   e) {
			System.out.println(e);
		}
		//executed regardless of exception occurred or not  
		finally {
			System.out.println("finally block is always executed"); 
		}
		System.out.println("rest of the code..."); 
		System.out.println("*************************************");
				
		/*
		 * Rule: For each try block there can be zero or more catch blocks, but only one finally block.
		 * Note: The finally block will not be executed if the program exits 
		 *       (either by calling System.exit() or by causing a fatal error that causes the process to abort).
		 */
		
		/*
		 * We can create try block without a catch but it requires finally then.		
		 */
		try {
			int data = 25 / 5;    
			System.out.println(data);
		}
		finally {
			System.out.println("finally block is always executed"); 
		}
	}
}
