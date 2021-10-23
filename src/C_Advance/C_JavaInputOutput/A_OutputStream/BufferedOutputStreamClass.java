package C_Advance.C_JavaInputOutput.A_OutputStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamClass {

	/*
	 * BufferedOutputStream in Java
	 */
	
	/*
	 * Java BufferedOutputStream class is used for buffering an output stream. 
	 * It internally uses buffer to store data. It adds more efficiency than to write data directly into a stream. 
	 * So, it makes the performance fast. For adding the buffer in an OutputStream, 
	 * use the BufferedOutputStream class. Let's see the syntax for adding the buffer in an OutputStream:
	 * 
	 * OutputStream os= new BufferedOutputStream(new FileOutputStream("C:\\Data\\testout.txt"));
	 * 
	 * The Java BufferedOutputStream class, java.io.BufferedOutputStream, is used to capture bytes written to 
	 * the BufferedOutputStream in a buffer, and write the whole buffer in one batch to an underlying Java OutputStream 
	 * for increased performance. Buffering can speed up IO quite a bit, especially when writing data to disk access or network.
	 */
	
	public void bufferedOutputStream() throws IOException {
		
		/*
		 * Java BufferedOutputStream class constructors
		 */
		
		/*
		 * BufferedOutputStream(OutputStream os)
		 * It creates the new buffered output stream which is used for writing the data to the specified output stream.
		 */
		OutputStream os = new BufferedOutputStream(new FileOutputStream("text.txt"));
		OutputStream os1 = new BufferedOutputStream(os);
		
		/*
		 * BufferedOutputStream(OutputStream os, int size)
		 * It creates the new buffered output stream which is used for writing 
		 * the data to the specified output stream with a specified buffer size.
		 * This example sets the internal buffer to 8 KB. 
		 * It is best to use buffer sizes that are multiples of 1024 bytes. 
		 * That works best with most built-in buffering in hard disks etc.
		 * Except for adding buffering to your input streams, the Java BufferedOutputStream 
		 * behaves exactly like an OutputStream. The only difference is that you may need to call 
		 * flush() if you need to be absolutely sure that the data written until now is flushed 
		 * out of the buffer and onto the network or disk.
		 */
		int bufferSize = 8 * 1024;
		OutputStream os2 = new BufferedOutputStream(os, bufferSize);
		
		/*
		 * Optimal Buffer Size for a BufferedOutputStream
		 * You should make some experiments with different buffer sizes to find out which buffer size seems 
		 * to give you the best performance on your concrete hardware. The optimal buffer size may depend 
		 * on whether you are using the Java BufferedOutputStream with a disk or network OutputStream.
		 * With both disk and network streams, the optimal buffer size may also depend on the concrete 
		 * hardware in the computer. If the hard disk is anyways writing a minimum of 4KB at a time, 
		 * it's stupid to use less than a 4KB buffer. It is also better to then use a buffer size that 
		 * is a multiple of 4KB. For instance, using 6KB would be stupid too.
		 * Even if your disk writes blocks of e.g. 4KB at a time, it can still be a good idea to use 
		 * a buffer that is larger than this. A disk is good at writing data sequentially - meaning it is good 
		 * at writing multiple blocks that are located after each other. Thus, using a 16KB buffer, or a 64KB 
		 * buffer (or even larger) with a BufferedOutputStream may still give you a better performance 
		 * than using just a 4KB buffer. To find the optimal BufferedOutputStream buffer size, 
		 * find out the block size your hard disk writes in, and make the buffer a multiple of that size. 
		 * You will definitely have to experiment to find the optimal buffer size. 
		 * Do so by measuring write speeds with different buffer sizes.
		 */
		
		/*
		 * Java BufferedOutputStream class methods
		 * 
		 * void write(int b)
		 * It writes the specified byte to the buffered output stream.
		 * 
		 * void write(byte[] b, int off, int len)
		 * It write the bytes from the specified byte-input stream into a specified byte array, starting with the given offset
		 * 
		 * void flush()
		 * It flushes the buffered output stream.
		 */
		
		/*
		 * Writing Byte Arrays
		 * Since the Java BufferedOutputStream is a subclass of OutputStream, 
		 * you can write arrays of bytes to the BufferedOutputStream too, 
		 * instead of just a single byte at a time. 
		 *
	     * flush()
	     * When you write data to a Java BufferedOutputStream the data is cached internally 
	     * in a byte buffer until the byte buffer is full, at which time the whole buffer 
	     * is written to the underlying OutputStream.
	     * If you want to make sure that all written data is written to disk without having to 
	     * close the BufferedOutputStream you can call its flush() method. Calling flush() 
	     * will make sure that all data which has been written to the BufferedOutputStream so far, 
	     * is fully written to the underlying OutputStream too, plus flush() will also have been called 
	     * on the underlying OutputStream.
	     * 
	     */
		FileOutputStream fout = new FileOutputStream("bufferedoutputstream.txt");    
		BufferedOutputStream bufferedOutputStream =
			    new BufferedOutputStream(fout);

	    byte[] bytes =  new byte[]{101, 75, 65, 58, 88};
	    bufferedOutputStream.write(bytes);
	    bufferedOutputStream.flush();  
		
		/*
		 * Example of BufferedOutputStream class:
		 * In this example, we are writing the textual information in the BufferedOutputStream object 
		 * which is connected to the FileOutputStream object. The flush() flushes the data of one stream 
		 * and send it into another. It is required if you have connected the one stream with another.
		 */
	     BufferedOutputStream bout = new BufferedOutputStream(fout);    
	     String s = "BufferedOutputStream Example";    
	     byte b[] = s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    
	     
	     
	}
}
