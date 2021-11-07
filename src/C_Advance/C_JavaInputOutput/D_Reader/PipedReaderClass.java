package C_Advance.C_JavaInputOutput.D_Reader;

import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReaderClass {

	/*
	 * Java - PipedReader
	 * 
	 * The PipedReader class is used to read the contents of a pipe as a stream of characters. 
	 * This class is used generally to read text. PipedReader class must be connected to 
	 * the same PipedWriter and are used by different threads. The Java PipedReader class 
	 * (java.io.PipedReader) makes it possible to read the contents of a pipe as a stream 
	 * of characters. As such it works very much like a PipedInputStream except the PipedInputStream 
	 * is byte based, not character based. The PipedReader is intended to read text, in other words. 
	 * A Java PipedReader must be connected to a PipedWriter. Often, the PipedReader and PipedWriter 
	 * are used by different threads. Only one PipedReader can be connected to the same PipedWriter.
	 */
	
	public void pipedReader() {
		
		/*
		 * Constructor
		 * 
		 * PipedReader(int pipeSize)	
		 * It creates a PipedReader so that it is not yet connected and uses the specified pipe size for the pipe's buffer.
		 * 
		 * PipedReader(PipedWriter src)	
		 * It creates a PipedReader so that it is connected to the piped writer src.
		 * 
		 * PipedReader(PipedWriter src, int pipeSize)	
		 * It creates a PipedReader so that it is connected to the piped writer src and uses the specified pipe size for the pipe's buffer.
		 * 
		 * PipedReader()	
		 * It creates a PipedReader so that it is not yet connected.
		 */
		
		/*
		 * Methods
		 * 
		 * void	close()	
		 * It closes this piped stream and releases any system resources associated with the stream.
		 * 
		 * void	connect(PipedWriter src)	
		 * It causes this piped reader to be connected to the piped writer src.
		 * 
		 * int	read()	
		 * It reads the next character of data from this piped stream.
		 * 
		 * int	read(char[] cbuf, int off, int len)	
		 * It reads up to len characters of data from this piped stream into an array of characters.
		 * 
		 * boolean	ready()	
		 * It tells whether this stream is ready to be read.
		 */
		
		final PipedReader read = new PipedReader();  
        final PipedWriter write = new PipedWriter(read);  

        Thread readerThread = new Thread(new Runnable() {  
            public void run() {  
                try {  
                    int data = read.read();  
                    while (data != -1) {  
                        System.out.print((char) data);  
                        data = read.read();  
                    }  
                } catch (Exception ex) {  
                }  
            }  
        });  

        Thread writerThread = new Thread(new Runnable() {  
            public void run() {  
                try {  
                    write.write("I love my country\n".toCharArray());  
                } catch (Exception ex) {  
                }  
            }  
        });  

        readerThread.start();  
        writerThread.start();  
        
        /*
         * read()
         * The read() method of a Java PipedReader returns an int which contains the char value of the 
         * character read. If the read() method returns -1, there is no more data to read in the PipedReader, 
         * and it can be closed. That is, -1 as int value, not -1 as byte value. There is a difference here!
         */
	}
}
