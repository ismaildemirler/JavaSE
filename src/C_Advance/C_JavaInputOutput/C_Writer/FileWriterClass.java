package C_Advance.C_JavaInputOutput.C_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterClass {

	/*
	 * Java FileWriter Class
	 * 
	 * Java FileWriter class is used to write character-oriented data to a file. 
	 * It is character-oriented class which is used for file handling in java.
	 * Unlike FileOutputStream class, you don't need to convert string into byte array 
	 * because it provides method to write string directly.
	 * 
	 * The Java FileWriter class, java.io.FileWriter, makes it possible to write characters to a file. 
	 * In that respect the Java FileWriter works much like the FileOutputStream except that a FileOutputStream 
	 * is byte based, whereas a FileWriter is character based. The FileWriter is intended to write text, 
	 * in other words. One character may correspond to one or more bytes, depending on the character 
	 * encoding scheme in use. The Java FileWriter class is a subclass of the Java Writer class, by the way.
	 */
	
	public void fileWriter() throws IOException {
		
		/*
		 * Constructors of FileWriter class
		 * 
		 * FileWriter(String file)
		 * Creates a new file. It gets file name in string
		 * 
		 * FileWriter(File file)
		 * Creates a new file. It gets file name in File object
		 */
		
		Writer fileWriter1 = new FileWriter("output.txt");
		
		File file = new File("output.txt");
		Writer fileWriter2 = new FileWriter(file);
		
		/*
		 * Methods
		 * 
		 * void write(String text)
		 * It is used to write the string into FileWriter.
		 * 
		 * void write(char c)
		 * It is used to write the char into FileWriter.
		 * 
		 * void write(char[] c)
		 * It is used to write char array into FileWriter.
		 * 
		 * void flush()
		 * It is used to flushes the data of FileWriter.
		 * 
		 * void close()
		 * It is used to close the FileWriter.
		 */
		
		/*
		 * Overwriting vs. Appending the File
		 * 
		 * When you create a Java FileWriter you can decide if you want to overwrite any existing 
		 * file with the same name, or if you want to append to any existing file. You decide that 
		 * by choosing what FileWriter constructor you use. The FileWriter constructor taking just 
		 * one parameter, the file name, will overwrite any existing file:
		 */
		Writer fileWriter = new FileWriter("output.txt");
		
		/*
		 * FileWriter has a constructor that takes 2 parameters too: The file name and a boolean. 
		 * The boolean indicates whether to append or overwrite an existing file. 
		 * Here are two Java FileWriter examples showing that:
		 */
		Writer fw1 = new FileWriter("c:\\data\\output.txt", true);  //appends to file
		Writer fw2 = new FileWriter("c:\\data\\output.txt", false); //overwrites file
		
		/*
		 * FileWriter Character Encoding
		 * The FileWriter assumes that you want to encode the bytes to the file using the default 
		 * character encoding for the computer your application is running on. This may not always 
		 * be what you want, and you cannot change it! If you want to specify a different character 
		 * encoding scheme, don't use a FileWriter. Use an OutputStreamWriter on a FileOutputStream 
		 * instead. The OutputStreamWriter lets you specify the character encoding scheme 
		 * to use when writing bytes to the underlying file.
		 */
		
		/*
		 * Write Performance
		 * It is faster to write an array of characters to a Java FileWriter than writing one character at a time. 
		 * The speedup can be quite significant - up to 10 x higher or more. Therefore it is recommended to use 
		 * the write(char[]) methods whenever possible. The exact speedup you get depends on the underlying OS 
		 * and hardware of the computer you run the Java code on. The speedup depends on issues like memory speed, 
		 * hard disk speed and buffer sizes etc.
		 */
		
		try {    
			FileWriter fw = new FileWriter("text.txt");    
			fw.write("Welcome to Java Tutorial!");    
	        fw.close();    
	    }
		catch(Exception e) {
			System.out.println(e);
		}    
	    System.out.println("Success...");  
	}
}
