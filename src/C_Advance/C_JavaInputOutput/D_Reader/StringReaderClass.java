package C_Advance.C_JavaInputOutput.D_Reader;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderClass {

	/*
	 * Java StringReader Class
	 * Java StringReader class is a character stream with string as a source. 
	 * It takes an input string and changes it into character stream. It inherits Reader class.
	 * In StringReader class, system resources like network sockets and files are not used, 
	 * therefore closing the StringReader is not necessary. The Java StringReader class enables 
	 * you to turn an ordinary String into a Reader. This is useful if you have data as a String 
	 * but need to pass that String to a component that only accepts a Reader.
	 */
	
	public void stringReader() throws IOException {
		
		/*
		 * Methods
		 * 
		 * int read()	
		 * It is used to read a single character.
		 * 
		 * int read(char[] cbuf, int off, int len)	
		 * It is used to read a character into a portion of an array.
		 * 
		 * boolean ready()	
		 * It is used to tell whether the stream is ready to be read.
		 * 
		 * boolean markSupported()	
		 * It is used to tell whether the stream support mark() operation.
		 * 
		 * long skip(long ns)	
		 * It is used to skip the specified number of character in a stream
		 * 
		 * void mark(int readAheadLimit)	
		 * It is used to mark the mark the present position in a stream.
		 * 
		 * void reset()	
		 * It is used to reset the stream.
		 * 
		 * void close()	
		 * It is used to close the stream.
		 */
		
		String srg = "Hello Java!!";  
        StringReader reader = new StringReader(srg);  
        int k=0;  
        while((k = reader.read()) != -1){  
            System.out.print((char)k);  
        }  
	}
}
