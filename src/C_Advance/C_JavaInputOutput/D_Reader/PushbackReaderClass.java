package C_Advance.C_JavaInputOutput.D_Reader;

import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderClass {

	/*
	 * Java PushbackReader Class
	 * 
	 * Java PushbackReader class is a character stream reader. It is used to pushes back a 
	 * character into stream and overrides the FilterReader class. The Java PushbackReader 
	 * class, java.io.PushbackReader, is intended to be used when you parse data from a Reader. 
	 * Sometimes you need to read ahead a few characters to see what is coming, before you can 
	 * determine how to interpret the current character. The Java PushbackReader allows you to 
	 * do that. Well, actually it allows you to push back the read characters into the Reader. 
	 * These characters will then be read again the next time you call read(). The Java 
	 * PushbackReader works much like the PushbackInputStream except that the PushbackReader 
	 * works on characters, whereas the PushbackInputStream works on bytes.
	 * 
	 * Class declaration
	 * Let' s see the declaration for java.io.PushbackReader class:
	 * public class PushbackReader extends FilterReader  
	 */
	
	public void pushbackReader() throws IOException {
		
		/*
		 * Class Methods
		 * 
		 * int read()	
		 * It is used to read a single character.
		 * 
		 * void mark(int readAheadLimit)	
		 * It is used to mark the present position in a stream.
		 * 
		 * boolean ready()	
		 * It is used to tell whether the stream is ready to be read.
		 * 
		 * boolean markSupported()	
		 * It is used to tell whether the stream supports mark() operation.
		 * 
		 * long skip(long n)	
		 * It is used to skip the character.
		 * 
		 * void unread (int c)	
		 * It is used to pushes back the character by copying it to the pushback buffer.
		 * 
		 * void unread (char[] cbuf)	
		 * It is used to pushes back an array of character by copying it to the pushback buffer.
		 * 
		 * void reset()	
		 * It is used to reset the stream.
		 * 
		 * void close()	
		 * It is used to close the stream.
		 */
		
		/*
		 * PushbackReader Example
		 * Here is a simple PushbackReader example:
		 */
		PushbackReader pushbackReader1 =
			    new PushbackReader(new FileReader("output.txt"));		
		int data = pushbackReader1.read();
		pushbackReader1.unread(data);
		
		/*
		 * The call to read() reads a character from the PushbackReader just like from any other Reader. 
		 * The call to unread() pushes a character back into the PushbackReader. The next time read() is 
		 * called the pushed back characters will be read first. If you push back multiple characters into 
		 * the PushbackReader, the latest pushed back character will be returned first from the read() method, 
		 * just like with a stack.
		 */
		
		/*
		 * Setting the Push Back Limit of a PushbackReader
		 * You can set the number of characters you should be able to unread in the constructor of the 
		 * PushbackReader. Here is how to set the pushback limit using the PushbackReader constructor:
		 */
		int pushbackLimit = 8;
		PushbackReader pushbackReader2 = new PushbackReader(
		                                new FileReader("output.txt"),
		                                pushbackLimit);
		
		/*
		 * This example sets an internal buffer of 8 characters in the PushbackReader. 
		 * That means you can unread at most 8 characters at a time, before reading them again.
		 */
		
		char ary[] = {'1','-','-','2','-','3','4','-','-','-','5','6'};  
        CharArrayReader reader = new CharArrayReader(ary);   
        PushbackReader push = new PushbackReader(reader);  
        int i;  
        while( (i = push.read())!= -1) {  
	        if(i == '-') {  
	            int j;  
	            if((j = push.read()) == '-'){  
	                System.out.print("#*");  
	            }else {
	            	push.unread(j); // push back single character  
	                System.out.print((char)i);  
	            }  
	        }
	        else {
	        	System.out.print((char)i);  
	        }  
        }     
	}
}
