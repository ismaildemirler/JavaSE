package C_Advance.C_JavaInputOutput.C_Writer;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterClass {

	/*
	 * Java - PipedWriter
	 * 
	 * The PipedWriter class is used to write java pipe as a stream of characters. 
	 * This class is used generally for writing text. Generally PipedWriter is 
	 * connected to a PipedReader and used by different threads. The Java PipedWriter 
	 * class (java.io.PipedWriter) makes it possible to write to a Java pipe as a stream 
	 * of characters. In that respect the PipedWriter works much like a PipedOutputStream 
	 * except that a PipedOutputStream is byte based, whereas a PipedWriter is character based. 
	 * The PipedWriter is intended for writing text, in other words. Normally a Java PipedWriter 
	 * is connected to a PipedReader. And often the PipedWriter and the PipedReader are used by different threads.
	 */
	
	public void pipeWriter() throws IOException {
		
		/*
		 * Contructors
		 * 
		 * PipedWriter()	
		 * It creates a piped writer that is not yet connected to a piped reader.
		 * 
		 * PipedWriter(PipedReader snk)	
		 * It creates a piped writer connected to the specified piped reader.
		 * 
		 */
		
		/*
		 * Methods
		 * 
		 * void	close()	
		 * It closes this piped output stream and releases any system resources associated with this stream.
		 * 
		 * void	connect(PipedReader snk)	
		 * It connects this piped writer to a receiver.
		 * 
		 * void	flush()	
		 * It flushes this output stream and forces any buffered output characters to be written out.
		 * 
		 * void	write(char[] cbuf, int off, int len)	
		 * It writes len characters from the specified character array starting at offset off to this piped output stream.
		 * 
		 * void	write(int c)	
		 * It writes the specified char to the piped output stream.
		 */
		
		/*
		 * write()
		 * The write() method of a PipedWriter takes an int which contains the byte value of the byte to write. 
		 * There are also versions of the write() method that take a String, char array etc.
		 * 
		 * Java IO Pipes
		 * The PipedWriter must always be connected to a PipedReader. When connected like that, they form a Java pipe. 
		 */
		
		/*
		 * Java IO: Pipes
		 * Pipes in Java IO provides the ability for two threads running in the same JVM to communicate. 
		 * Therefore pipes can also be sources or destinations of data. You cannot use a pipe to communicate 
		 * with a thread in a different JVM (different process). The pipe concept in Java is different from 
		 * the pipe concept in Unix / Linux, where two processes running in different address spaces can 
		 * communicate via a pipe. In Java, the communicating parties must be running in the same process, 
		 * and should be different threads.
		 */
		
		/*
		 * Creating Pipes via Java IO
		 * Creating a pipe using Java IO is done via the PipedOutputStream and PipedInputStream classes. 
		 * A PipedInputStream should be connected to a PipedOutputStream. The data written to the 
		 * PipedOutputStream by one thread can be read from the connected PipedInputStream by another thread.
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
         * You can also connect the two pipe streams using their connect() methods. 
         * Both PipedInputStream and PipedOutputStream has a connect() method that can connect one to the other.
         */
        
        /*
         * Pipes and Threads
         * Remember, when using the two connected pipe streams, pass one stream to one thread, 
         * and the other stream to another thread. The read() and write() calls on the streams 
         * are blocking, meaning if you try to use the same thread to both read and write, 
         * this may result in the thread deadlocking itself.
         */
        
        /*
         * Pipe Alternatives
         * There are many other ways than pipes that threads can communicate within the same JVM. 
         * In fact, threads more often exchange complete objects rather than raw byte data. 
         * But - if you need to exchange raw byte data between threads, Java IO's pipes are a possibility.
         */
	}
}
