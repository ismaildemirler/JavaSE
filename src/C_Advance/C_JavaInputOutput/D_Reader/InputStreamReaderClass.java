package C_Advance.C_JavaInputOutput.D_Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class InputStreamReaderClass {

	/*
	 * Java InputStreamReader
	 * 
	 * An InputStreamReader is a bridge from byte streams to character streams: 
	 * It reads bytes and decodes them into characters using a specified charset. 
	 * The charset that it uses may be specified by name or may be given explicitly, 
	 * or the platform's default charset may be accepted. The Java InputStreamReader class, 
	 * java.io.InputStreamReader, wraps a Java InputStream, thereby turning the byte 
	 * based InputStream into a character based Reader. In other words, the Java 
	 * InputStreamReader interprets the bytes of an InputStream as text instead 
	 * of numerical data. The Java InputStreamReader class is thus a subclass of the Java Reader class.
	 * The Java InputStreamReader is often used to read characters from files (or network connections) 
	 * where the bytes represents text. For instance, a text file where the characters are encoded 
	 * as UTF-8. You could use an InputStreamReader to wrap a FileInputStream in order to read such a file.  
	 */
	
	public void inputStreamReader() throws IOException {
		
		/*
		 * Constructors
		 * 
		 * InputStreamReader(InputStream in)	
		 * It creates an InputStreamReader that uses the default charset.
		 * 
		 * InputStreamReader(InputStream in, Charset cs)	
		 * It creates an InputStreamReader that uses the given charset.
		 * 
		 * InputStreamReader(InputStream in, CharsetDecoder dec)	
		 * It creates an InputStreamReader that uses the given charset decoder.
		 * 
		 * InputStreamReader(InputStream in, String charsetName)
		 * It creates an InputStreamReader that uses the named charset.
		 */
		
		/*
		 * Methods
		 * 
		 * void	close()	
		 * It closes the stream and releases any system resources associated with it.
		 * 
		 * String getEncoding()	
		 * It returns the name of the character encoding being used by this stream.
		 * 
		 * int read()	
		 * It reads a single character.
		 * 
		 * int read(char[] cbuf, int offset, int length)	
		 * It reads characters into a portion of an array.
		 * 
		 * boolean ready()	
		 * It tells whether this stream is ready to be read.
		 */
		
		InputStream stream = new FileInputStream("output.txt");  
        Reader reader = new InputStreamReader(stream);  
        int data = reader.read();  
        while (data != -1) {  
            System.out.print((char) data);  
            data = reader.read();  
        }  
        reader.close();
        
        /*
         * Set InputStreamReader Character Encoding
         * The characters in underlying InputStream will be encoded using some character encoding. 
         * This character encoding is referred to as a character set, or Charset in Java. 
         * Two of the commonly used character sets are ASCII (or ISO-Latin1) and UTF8 (or UTF-16 in some cases).
         * You need to tell the Java InputStreamReader instance what character sets the characters 
         * in the InputStream are encoded with. You do so in the InputStreamReader constructor. 
         * Here is an example of setting the character set to be used by a Java InputStreamReader:
         */
        InputStream inputStream = new FileInputStream("output.txt");
        InputStreamReader inputStreamReader =
            new InputStreamReader(inputStream, Charset.forName("UTF-8"));
        
        /*
         * As you can see, the character set is passed as the second parameter to the InputStreamReader 
         * constructor. In the example above, the character used is UTF-8.
         */
        
        /*
         * Get InputStreamReader Character Encoding
         * You can get the character encoding used by a Java InputStreamReader instance via its 
         * getEncoding() method. Here is an example of obtaining the character encoding used by a Java InputStreamReader:
         */
        String encoding = inputStreamReader.getEncoding();
	}
}
