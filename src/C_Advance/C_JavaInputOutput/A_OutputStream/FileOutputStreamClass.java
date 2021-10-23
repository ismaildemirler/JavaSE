package C_Advance.C_JavaInputOutput.A_OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamClass {

	/*
	 * FileOutputStream in Java
	 * 
	 * Java FileOutputStream is an output stream used for writing data to a file.
	 * If you have to write primitive values into a file, use FileOutputStream class. 
	 * You can write byte-oriented as well as character-oriented data through FileOutputStream class. 
	 * But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.
	 * The Java FileOutputStream class, java.io.FileOutputStream, makes it possible to write a file as a stream of bytes. 
	 * The Java FileOutputStream class is a subclass of Java OutputStream meaning you can use a FileOutputStream as an OutputStream.
	 */
	
	public void fileOutputStream() throws IOException {
		
		/*
		 * Here is a simple Java FileOutputStream example:
		 */
		byte bWrite[] = {11,21,3,40,5};
		
		OutputStream output = new FileOutputStream("text.txt");
		for(int x = 0; x < bWrite.length ; x++) {
			output.write(bWrite[x]);   // writes the bytes
        }
		output.close();
		
		/*
		 * FileOutputStream Constructors
		 * The Java FileOutputStream class contains a set of different useful constructors. 
		 * We will cover the most commonly used constructors here.
		 * The first constructor takes a String which contains the path of the file to write to. 
		 * Here is an example:
		 */
		String path1 = "C:\\data\\output-text.txt";
		FileOutputStream output1 = new FileOutputStream(path1);
		
		/*
		 * Notice the path String. It needs double backslashes (\\) 
		 * to create a single backslash in the String, because backslash is an escape character in Java Strings. 
		 * To get a single backslash you need to use the escape sequence \\.
		 */
		
		/*
		 * The second FileOutputStream constructor takes a Java File 
		 * object which points to the file in the file system. 
		 * Here is an example:
		 */
		String path2 = "C:\\data\\output-text.txt";
		File file = new File(path2);
		FileOutputStream output2 = new FileOutputStream(file);
		
		/*
		 * Overwriting vs. Appending the File 
		 * When you create a Java FileOutputStream pointing to a file that already exists, 
		 * you can decide if you want to overwrite the existing file, or if you want to append to the existing file. 
		 * You decide that based on which of the FileOutputStream constructors you choose to use.
		 * This constructor which takes just one parameter, the file name, will overwrite any existing file:
		 */
		OutputStream output3 = new FileOutputStream("c:\\data\\output-text.txt");
		
		/*
		 * There is a constructor that takes 2 parameters too: The file name and a boolean. 
		 * The boolean indicates whether to append to the file or not. 
		 * Thus, a value of true means that you want to append to the file, 
		 * whereas a value of false means you want to overwrite the file. 
		 * Here are two Java FileOutputStream constructor examples:
		 */
		OutputStream output4 = new FileOutputStream("c:\\data\\output-text.txt", true); //append
		OutputStream output5 = new FileOutputStream("c:\\data\\output-text.txt", false); //overwrite
		
		/*
		 * When you leave out the second boolean parameter and thus just use the constructor that takes a file path, 
		 * the default mode is to overwrite any existing file on the given path.
		 */
		
		/*
		 * write()
		 * To write data to a Java FileOutputStream you can use its write() method. 
		 * The write() method takes an int which contains the byte value of the byte to write. 
		 * Thus, only the lower 8 bit of the passed int actually gets written to the FileOutputStream destination. 
		 * Here is an example of writing data to a Java FileOutputStream using its write() method.
		 * This example writes the byte value 123 to the given Java FileOutputStream.
		 */
		
		/*
		 * Unfortunately, if an exception is thrown during the write() call in the example above, 
		 * that exception will cause the program flow to break before the close() method is called. 
		 * Therefore it is better to close a Java FileOutputStream using the Java try with resources construct. 
		 * Here is an example of closing a Java FileOutputStream using the try-with-resources construct:
		 */
		try(OutputStream outputStream = new FileOutputStream("text.txt")) {
		    outputStream.write(123);
		}
		
		/*
		 * Notice how the FileOutputStream is declared inside the parentheses following the try keyword. 
		 * All resources declared inside these parentheses will be closed automatically once the program 
		 * flow exits the try block, regardless of whether an exception is thrown or not. 
		 * In other words, the FileOutputStream close() will be called automatically for you.
		 */
		
		OutputStream outputStream1 = new FileOutputStream("text.txt", true);
		outputStream1.write(123);

		/*
		 * Writing Byte Arrays
		 * Since the Java FileOutputStream is a subclass of OutputStream, 
		 * you can write arrays of bytes to the FileOutputStream too, 
		 * instead of just a single byte at a time. 
		 * Here is an example of writing an array of bytes to a Java FileOutputStream :
		 */
		byte[] bytesArr =  new byte[]{1,2,3,4,5};
		outputStream1.write(bytesArr);
		
		/*
		 * Write Performance
		 * It is faster to write an array of bytes to a Java FileOutputStream than writing one byte at a time. 
		 * The speedup can be quite significant - up to 10 x higher or more. 
		 * Therefore it is recommended to use the write(byte[]) methods whenever possible.
		 * The exact speedup you get depends on the underlying OS and hardware of the computer you run the Java code on. 
		 * The speedup depends on issues like memory speed, hard disk speed and buffer sizes.
		 */
		
		/*
		 * flush()
		 * When you write data to a Java FileOutputStream the data may get cached internally 
		 * in the memory of the computer and written to disk at a later time. 
		 * For instance, every time there is X amount of data to write, or when the FileOutputStream is closed.
		 * If you want to make sure that all written data is written to disk without having to close 
		 * the FileOutputStream you can call its flush() method. Calling flush() will make sure that 
		 * all data which has been written to the FileOutputStream so far, is fully written to disk too. 
		 * Here is an example of calling the Java FileOutputStream flush() method:
		 */
		byte[] bytes =  new byte[]{101, 75, 66, 78};
		outputStream1.write(bytes);
		outputStream1.flush();
		
		/*
		 * Closing a FileOutputStream
		 * Like any other OutputStream a FileOutputStream instance needs to be closed after use. 
		 * You do so by calling its close() method. Here is an example of closing a 
		 * Java FileOutputStream by calling its close() method:
		 */
		outputStream1.write(123);
		
		/*
		 * Example 1) Write Byte
		 */ 
		outputStream1.write(65);   
        System.out.println("success...");  
        System.out.println("*****************************************");
        
        /*
         * Example 2) Write String
         */   
        String s = "Welcome to Java IO Courses.";    
        byte b[] = s.getBytes();//converting string into byte array    
        outputStream1.write(b);           
        outputStream1.close();    
        System.out.println("Welcome to Java IO Courses has been written to file...");    
        System.out.println("*****************************************"); 
	}
}
