package C_Advance.C_JavaInputOutput.A_OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamClass {

	/*
	 * Java FilterOutputStream Class
	 * 
	 * Java FilterOutputStream class implements the OutputStream class. 
	 * It provides different sub classes such as BufferedOutputStream and 
	 * DataOutputStream to provide additional functionality. So it is less used individually.
	 * The FilterOutputStream is a base class for implementing your own filtering output streams. 
	 * Basically it just overrides all methods in OutputStream. Personally, I see no sensible 
	 * purpose for this class. I cannot see that this class actually adds or changes any behavior 
	 * in OutputStream except that it takes an OutputStream in its constructor. If you choose to 
	 * extend this class you might as well extend the OutputStream class directly, 
	 * and avoid the extra class in the hierarchy.
	 */
	
	public void filterOutputStream() throws IOException {
		
		/*
		 * Methods
		 * 
		 * void write(int b)
		 * It is used to write the specified byte to the output stream.
		 * 
		 * void write(byte[] ary)
		 * It is used to write ary.length byte to the output stream.
		 * 
		 * void write(byte[] b, int off, int len)
		 * It is used to write len bytes from the offset off to the output stream.
		 * 
		 * void flush()
		 * It is used to flushes the output stream.
		 * 
		 * void close()
		 * It is used to close the output stream.
		 */
		
		File data = new File("D:\\testout.txt");  
        FileOutputStream file = new FileOutputStream(data);  
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="Welcome to javaTpoint.";      
        byte b[]=s.getBytes();      
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();    
	}
}
