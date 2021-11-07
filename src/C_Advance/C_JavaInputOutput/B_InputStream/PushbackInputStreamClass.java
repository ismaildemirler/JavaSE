package C_Advance.C_JavaInputOutput.B_InputStream;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamClass {

	/*
	 * Java PushbackInputStream Class
	 * Java PushbackInputStream class overrides InputStream and provides extra functionality 
	 * to another input stream. It can unread a byte which is already read and push back one byte.
	 * 
	 * The PushbackInputStream is intended to be used when you parse data from an InputStream. 
	 * Sometimes you need to read ahead a few bytes to see what is coming, before you can determine 
	 * how to interpret the current byte. The PushbackInputStream allows you to do that. 
	 * Well, actually it allows you to push the read bytes back into the stream. 
	 * These bytes will then be read again the next time you call read().
	 * The Java PushbackInputStream is a subclass of the Java InputStream so it inherits its 
	 * public methods - read(), close() etc. The PushbackInputStream is similar to the Java 
	 * PushbackReader, except the PushbackInputStream reads raw bytes, and the PushbackReader 
	 * reads characters (text).
	 * 
	 * Class declaration
	 * 
	 * Let's see the declaration for java.io.PushbackInputStream class:
	 * public class PushbackInputStream extends FilterInputStream  
	 */
	
	public void pushbackInputStream() throws IOException {
		
		/*
		 * Class Methods
		 * 
		 * int available()	
		 * It is used to return the number of bytes that can be read from the input stream.
		 * 
		 * int read()	
		 * It is used to read the next byte of data from the input stream.
		 * 
		 * boolean markSupported()
		 * It is used to test if the input stream support mark and reset method.	 
		 * 
		 * void mark(int readlimit)	
		 * It is used to mark the current position in the input stream.
		 * 
		 * long skip(long x)	
		 * It is used to skip over and discard x bytes of data.
		 * 
		 * void unread(int b)	
		 * It is used to pushes back the byte by copying it to the pushback buffer.
		 * 
		 * void unread(byte[] b)	
		 * It is used to pushes back the array of byte by copying it to the pushback buffer.
		 * 
		 * void reset()	
		 * It is used to reset the input stream.
		 * 
		 * void close()	
		 * It is used to close the input stream.
		 */
		
		/*
		 * Create a PushbackInputStream
		 * To use a Java PushbackInputStream you must first create a PushbackInputStream instance. 
		 * Here is an example of creating a Java PushbackInputStream:
		 */
		PushbackInputStream input1 = new PushbackInputStream(new FileInputStream("text.txt"));
		
		/*
		 * Notice how the PushbackInputStream needs another InputStream as parameter to its constructor. 
		 * The PushbackInputStream will read its bytes from this underlying InputStream.
		 */
		
		/*
		 * Setting the Push Back Limit of a PushbackInputStream
		 * You can set the number of bytes you should be able to unread in the constructor of the 
		 * PushbackInputStream. Here is how to set the push back limit via the PushbackInputStream constructor:
		 */
		int pushbackLimit = 8;
		PushbackInputStream input2 = new PushbackInputStream(
		                                new FileInputStream("text.txt"),
		                                pushbackLimit);
		
		/*
		 * This example sets an internal buffer of 8 bytes. 
		 * That means you can unread at most 8 bytes at a time, before reading them again.
		 */
		
		/*
		 * Read Bytes
		 * You read bytes from the Java PushbackInputStream via its read() method, 
		 * just like you do from a regular InputStream . Here is an example of reading 
		 * a byte from a PushbackInputStream :
		 */
		int aByte = input1.read();

		while(aByte != -1) {
		    //do something with aByte
		    byte byteRead = (byte) aByte;

		    aByte = input1.read();
		}
		
		/*
		 * Notice, that once the PushbackInputStream has no more bytes to read, from its underlying 
		 * PushbackInputStream, the read() method will return -1.
		 */
		
		/*
		 * Push a Byte Back
		 * To push a byte back into the Java PushbackInputStream you use the unread() method. 
		 * Here is an example of pushing a byte back into a PushbackInputStream :
		 */
		int bByte = input2.read();
		input2.unread(bByte);
		bByte = input2.read();
		
		/*
		 * This example first reads a byte from the PushbackInputStream, then pushes it back into 
		 * the PushbackInputStream, and then reads that byte back again with the final read() call.
		 */
		
		String srg = "1##2#34###12";  
        byte ary[] = srg.getBytes();  
        ByteArrayInputStream array = new ByteArrayInputStream(ary);  
        PushbackInputStream push = new PushbackInputStream(array);  
        int i;        
        while((i = push.read())!= -1) {  
	        if(i == '#') {  
	            int j;  
	            if((j = push.read()) == '#'){  
	                 System.out.print("**");  
	            }
	            else {  
	                push.unread(j);  
	                System.out.print((char)i);  
	            }  
	        }
	        else {  
	        	System.out.print((char)i);  
	        }  
        }        
	}
}
