package C_Advance.C_JavaInputOutput.D_Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	/*
	 * Java FileReader Class
	 * Java FileReader class is used to read data from the file. 
	 * It returns data in byte format like FileInputStream class.
	 * It is character-oriented class which is used for file handling in java.
	 * The Java FileReader class, java.io.FileReader makes it possible to read the contents of a 
	 * file as a stream of characters. It works much like the FileInputStream except the 
	 * FileInputStream reads bytes, whereas the FileReader reads characters. The FileReader 
	 * is intended to read text, in other words. One character may correspond to one or more 
	 * bytes depending on the character encoding scheme. The Java FileReader is a subclass 
	 * of the Java Reader class, so it has many of the same methods.
	 */
	
	public void fileReader() throws IOException {
		
		/*
		 * Constructors of FileReader class
		 * 
		 * FileReader(String file)
		 * It gets filename in string. It opens the given file in read mode. 
		 * If file doesn't exist, it throws FileNotFoundException.
		 * 
		 * FileReader(File file)
		 * It gets filename in file instance. It opens the given file in read mode. 
		 * If file doesn't exist, it throws FileNotFoundException.
		 */
		
		 FileReader fr = new FileReader("output.txt");    
         int i;    
         while((i = fr.read()) != -1) {   
        	 System.out.print((char)i);  
         }
         fr.close();    
		
		/*
		 * Read Performance
		 * Reading an array of characters at a time is faster than reading a single character 
		 * at a time from a Java FileReader. The difference can easily be a factor 10 or more 
		 * in performance increase, by reading an array of characters rather than reading a single character at a time.
		 * The exact speedup gained depends on the size of the char array you read, and the OS, 
		 * hardware etc. of the computer you are running the code on. You should study the hard 
		 * disk buffer sizes etc. of the target system before deciding. However buffer sizes of 
		 * 8KB and up will give a good speedup. However, once your char array exceeds the capacity 
		 * of the underlying OS and hardware, you won't get a bigger speedup from a bigger char array.
		 * You will probably have to experiment with different byte array size and measure read performance, 
		 * to find the optimal char array size.
		 */
	}
}
