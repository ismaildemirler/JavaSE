package C_Advance.C_JavaInputOutput.B_InputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputStreamClass {

	/*
	 * Java FilterInputStream Class
	 * 
	 * Java FilterInputStream class implements the InputStream. It contains different sub classes as BufferedInputStream, 
	 * DataInputStream for providing additional functionality. So it is less used individually.
	 * The FilterInputStream is a base class for implementing your own filtering input streams. 
	 * Basically it just overrides all methods in InputStream and passes all calls to any method 
	 * on the FilterInputStream onto a wrapped InputStream. The wrapped InputStream is passed to 
	 * the FilterInputStream in its constructor. The FilterInputStream class does not have any special behavior. 
	 * It is intended to be a base class for your own subclasses, but in my opinion you might as well just subclass InputStream directly.
	 * We cannot see that this class actually adds or changes any behavior in InputStream 
	 * except that it takes an InputStream in its constructor.
	 */
	
	public void filterInputStream() throws IOException {
		
		/*
		 * Methods
		 * 
		 * int available()
		 * It is used to return an estimate number of bytes that can be read from the input stream.
		 * 
		 * int read()
		 * It is used to read the next byte of data from the input stream.
		 * 
		 * int read(byte[] b) 
		 * It is used to read up to byte.length bytes of data from the input stream.
		 * 
		 * long skip(long n)
		 * It is used to skip over and discards n bytes of data from the input stream.
		 * 
		 * boolean markSupported()
		 * It is used to test if the input stream support mark and reset method.
		 * 
		 * void mark(int readlimit)
		 * It is used to mark the current position in the input stream.
		 * 
		 * void reset()
		 * It is used to reset the input stream.
		 * 
		 * void close()
		 * It is used to close the input stream.
		 */
		
		File data = new File("text.txt");  
        FileInputStream  file = new FileInputStream(data);  
        FilterInputStream filter = new BufferedInputStream(file);  
        int k = 0;  
        while((k = filter.read()) != -1){  
            System.out.print((char)k);  
        }  
        file.close();  
        filter.close();  
	}
}
