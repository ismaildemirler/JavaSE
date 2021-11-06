package C_Advance.C_JavaInputOutput.C_Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {

	/*
	 * Java BufferedWriter Class
	 * Java BufferedWriter class is used to provide buffering for Writer instances. 
	 * It makes the performance fast. It inherits Writer class. The buffering characters 
	 * are used for providing the efficient writing of single arrays, characters, and strings.
	 * The Java BufferedWriter class, java.io.BufferedWriter, provides buffering to Writer instances. 
	 * Buffering can speed up IO quite a bit. Rather than writing one character at a time to the 
	 * network or disk, the BufferedWriter writes a larger block at a time. This is typically much 
	 * faster, especially for disk access and larger data amounts. The Java BufferedWriter is a 
	 * Java Writer subclass, so it can be used anywhere a Writer is required.
	 */
	
	public void bufferedWriter() throws IOException {
		
		/*
		 * Class constructors
		 */
		
		/*
		 * BufferedWriter(Writer wrt)
		 * It is used to create a buffered character output stream that uses the default size for an output buffer.
		 */
		BufferedWriter bufferedWriter1 = 
			    new BufferedWriter(new FileWriter("output.txt"));
		
		/*
		 * BufferedWriter(Writer wrt, int size)
		 * It is used to create a buffered character output stream that uses the specified size for an output buffer.
		 */
		int bufferSize = 8 * 1024;
	    
		BufferedWriter bufferedWriter2 = 
		    new BufferedWriter(
		        new FileWriter("output.txt"),
		            bufferSize);
		
		/*
		 * This example sets the internal buffer of the BufferedWriter to 8 KB. 
		 * It is best to use buffer sizes that are multiples of 1024 bytes. 
		 * That works best with most built-in buffering in hard disks etc.
		 * Except for adding buffering to your input streams, BufferedWriter 
		 * behaves pretty much like a Writer. The BufferedWriter adds one extra 
		 * method though: The newLine() method which can write a new-line character 
		 * to the underlying Writer. In addition, you may need to call flush() 
		 * if you need to be absolutely sure that the characters written until 
		 * now is flushed out of the buffer and onto the network or disk.
		 */
		
		/*
		 * Methods
		 * 
		 * void newLine()
		 * It is used to add a new line by writing a line separator.
		 * 
		 * void write(int c)
		 * It is used to write a single character
		 * 
		 * void write(char[] cbuf, int off, int len)
		 * It is used to write a portion of an array of characters.
		 * 
		 * void write(String s, int off, int len)
		 * It is used to write a portion of a string.
		 * 
		 * void flush()
		 * It is used to flushes the input stream.
		 * 
		 * void close()
		 * It is used to closes the input stream
		 */
		
		FileWriter writer = new FileWriter("output.txt", true);  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("This is a sample sentence for BufferedWriter");   
	    buffer.newLine();
	    buffer.write("This is second line"); 
	    buffer.flush();
	    buffer.close();   
		
		/*
		 * Write Performance
		 * It is faster to write an array of characters to a Java BufferedWriter than writing one character at a time. 
		 * Since the BufferedWriter collects the characters written internally in a buffer before writing them to the 
		 * underlying Writer, the speedup is not as noticeable as with other Writer classes (that do not use buffering). 
		 * However, there is still a small speedup.
		 */
	}
}
