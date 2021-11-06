package C_Advance.C_JavaInputOutput.D_Reader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Locale;

public class PrintStreamClass {

	/*
	 * Java PrintStream Class
	 * 
	 * The PrintStream class provides methods to write data to another stream. 
	 * The PrintStream class automatically flushes the data so there is no need to call flush() method. 
	 * Moreover, its methods don't throw IOException. The Java PrintStream class (java.io.PrintStream) 
	 * enables you to write formatted data to an underlying OutputStream. The PrintStream class can 
	 * format primitive types like int, long etc. formatted as text, rather than as their byte values. 
	 * That is why it is called a PrintStream, because it formats the primitive values as text - like 
	 * they would look when printed to the screen (or printed to paper).
	 * 
	 * Class declaration
	 * public class PrintStream extends FilterOutputStream implements Closeable.Appendable
	 */
	
	public void printStream() throws IOException {
		
		/*
		 * Methods
		 * 
		 * void print(boolean b)	
		 * It prints the specified boolean value.
		 * 
		 * void print(char c)	
		 * It prints the specified char value.
		 * 
		 * void print(char[] c)	
		 * It prints the specified character array values.
		 * 
		 * void print(int i)	
		 * It prints the specified int value.
		 * 
		 * void print(long l)	
		 * It prints the specified long value.
		 * 
		 * void print(float f)	
		 * It prints the specified float value.
		 * 
		 * void print(double d)	
		 * It prints the specified double value.
		 * 
		 * void print(String s)	
		 * It prints the specified string value.
		 * 
		 * void print(Object obj)	
		 * It prints the specified object value.
		 * 
		 * void println(boolean b)	
		 * It prints the specified boolean value and terminates the line.
		 * 
		 * void println(char c)	
		 * It prints the specified char value and terminates the line.
		 * 
		 * void println(char[] c)	
		 * It prints the specified character array values and terminates the line.
		 * 
		 * void println(int i)	
		 * It prints the specified int value and terminates the line.
		 * 
		 * void println(long l)	
		 * It prints the specified long value and terminates the line.
		 * 
		 * void println(float f)	
		 * It prints the specified float value and terminates the line.
		 * 
		 * void println(double d)	
		 * It prints the specified double value and terminates the line.
		 * 
		 * void println(String s)	
		 * It prints the specified string value and terminates the line.
		 * 
		 * void println(Object obj)	
		 * It prints the specified object value and terminates the line.
		 * 
		 * void println()	
		 * It terminates the line only.
		 * 
		 * void printf(Object format, Object... args)	
		 * It writes the formatted string to the current stream.
		 * 
		 * void printf(Locale l, Object format, Object... args)	
		 * It writes the formatted string to the current stream.
		 * 
		 * void format(Object format, Object... args)	
		 * It writes the formatted string to the current stream using specified format.
		 * 
		 * void format(Locale l, Object format, Object... args)	
		 * It writes the formatted string to the current stream using specified format.
		 */
		
		FileOutputStream fout = new FileOutputStream("output.txt");    
		PrintStream pout = new PrintStream(fout);    
		pout.println(2016);    
		pout.println("Hello Java");    
		pout.println("Welcome to Java");   
		pout.println(true);
		pout.println((int) 123);
		pout.println((float) 123.456);
		
		/*
		 * Example of printf() method using java PrintStream class:
		 * Let's see the simple example of printing integer value by format 
		 * specifier using printf() method of java.io.PrintStream class.
		 */
		int a = 19;    
		System.out.printf("%d", a); //Note: out is the object of printstream 
		
		/*
		 * This example first creates a PrintStream which is connected to an OutputStream. 
		 * Second, the example prints three primitive values to the PrintStream. 
		 * Third, the example closes the PrintStream.
		 * The instantiation of the OutputStream which the PrintStream writes to is left 
		 * out of the example for brevity. The PrintStream has a wide selection of constructors 
		 * that enable you to connect it to a File, an OutputStream etc.
		 */
		
		/*
		 * System.out and System.err are PrintStreams
		 * You may be familiar with these two well-known PrintStream instances in Java: 
		 * System.out and System.err . 
		 * If you have every used any of these two streams, you have already used a PrintStream.
		 * 
		 * printf()
		 * The Java PrintStream class contains the powerful format() and printf() methods 
		 * (they do exactly the same, but the name "printf" is more familiar to C-programmers). 
		 * These methods allow you to mix text and data in very advanced ways, using a formatting string.
		 * Here is a simple Java printf() example:
		 */
		pout.printf("%d", a);
		pout.close();    
		fout.close();    
	}
}
