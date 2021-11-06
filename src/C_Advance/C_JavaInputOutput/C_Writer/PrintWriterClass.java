package C_Advance.C_JavaInputOutput.C_Writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClass {

	/*
	 * Java PrintWriter class
	 * 
	 * Java PrintWriter class is the implementation of Writer class. 
	 * It is used to print the formatted representation of objects to the text-output stream.
	 * The Java PrintWriter class (java.io.PrintWriter) enables you to write formatted data to an 
	 * underlying Writer. For instance, writing int, long and other primitive data formatted as text, 
	 * rather than as their byte values. The Java PrintWriter is useful if you are generating reports 
	 * (or similar) where you have to mix text and numbers. The PrintWriter class has all the same methods 
	 * as the PrintStream except for the methods to write raw bytes. 
	 * Being a Writer subclass the PrintWriter is intended to write text.
	 */
	
	public void printWriter() throws FileNotFoundException {
		
		/*
		 * PrintWriter Constructors
		 * The PrintWriter has a wide selection of contructors that enable you to connect it to a File, 
		 * an OutputStream, or a Writer. In that way the PrintWriter is a bit different from other Writer 
		 * subclasses which tend to have mostly constructors that can take other Writer instances as parameters 
		 * (except for a few, like OutputStreamWriter).
		 */
		
		/*
		 * Methods
		 * 
		 * void println(boolean x)	
		 * It is used to print the boolean value.
		 * 
		 * void println(char[] x)	
		 * It is used to print an array of characters.
		 * 
		 * void println(int x)	
		 * It is used to print an integer.
		 * 
		 * PrintWriter append(char c)	
		 * It is used to append the specified character to the writer.
		 * 
		 * PrintWriter append(CharSequence ch)	
		 * It is used to append the specified character sequence to the writer.
		 * 
		 * PrintWriter append(CharSequence ch, int start, int end)	
		 * It is used to append a subsequence of specified character to the writer.
		 * 
		 * boolean checkError()	
		 * It is used to flushes the stream and check its error state.
		 * 
		 * protected void setError()	
		 * It is used to indicate that an error occurs.
		 * 
		 * protected void clearError()	
		 * It is used to clear the error state of a stream.
		 * 
		 * PrintWriter format(String format, Object... args)	
		 * It is used to write a formatted string to the writer using specified arguments and format string.
		 * 
		 * void print(Object obj)	
		 * It is used to print an object.
		 * 
		 * void flush()	
		 * It is used to flushes the stream.
		 * 
		 * void close()	
		 * It is used to close the stream.
		 */
		
		/*
		 * printf() and format()
		 * The Java PrintWriter class contains the powerful format() and printf() methods. 
		 * The two methods do exactly the same, but the name "printf" is more familiar to C-programmers. 
		 * The format() and printf() methods allow you to mix text and data in very advanced ways, 
		 * using a formatting string.
		 */

	    PrintWriter writer = new PrintWriter(System.out); 
	    
		System.out.format("The value of " + "the float variable is " +
			     "%f, while the value of the " + "integer variable is %d, " +
			     "and the string is %s", 0.5f, 6, "Example");
		
		System.out.println("");
		
		writer.printf("The value of " + "the float variable is " +
			     "%f, while the value of the " + "integer variable is %d, " +
			     "and the string is %s", 0.5f, 6, "Example");
		
		writer.println("");
		
		writer.println("*********************************************");
		
		
	    //Data to write on Console using PrintWriter     
	    writer.write("Example Sentence");        
	    writer.flush();  
	    writer.close(); 
	    
	    System.out.println("");
		System.out.println("*********************************************");
	    
	    //Data to write in File using PrintWriter       
	    PrintWriter writer1 = null;      
	    writer1 = new PrintWriter(new File("text.txt"));  
	    writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
	    writer1.flush();  
	    writer1.close();  
	}
}
