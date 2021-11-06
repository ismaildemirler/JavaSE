package C_Advance.C_JavaInputOutput;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import C_Advance.C_JavaInputOutput.A_OutputStream.BufferedOutputStreamClass;
import C_Advance.C_JavaInputOutput.A_OutputStream.ByteArrayOutputStreamClass;
import C_Advance.C_JavaInputOutput.A_OutputStream.DataOutputStreamClass;
import C_Advance.C_JavaInputOutput.A_OutputStream.FileOutputStreamClass;
import C_Advance.C_JavaInputOutput.A_OutputStream.FilterOutputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.BufferedInputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.ByteArrayInputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.DataInputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.FileInputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.SequenceInputStreamClass;
import C_Advance.C_JavaInputOutput.C_Writer.BufferedWriterClass;
import C_Advance.C_JavaInputOutput.C_Writer.FileWriterClass;
import C_Advance.C_JavaInputOutput.C_Writer._WriterClass;
import C_Advance.C_JavaInputOutput.D_Reader.BufferedReaderClass;
import C_Advance.C_JavaInputOutput.D_Reader.FileReaderClass;
import C_Advance.C_JavaInputOutput.D_Reader._ReaderClass;

public class _JavaIO {

	/*
	 * Java Input Output (I/O)
	 */
	
	/*
	 * Java I/O (Input and Output) is used to process the input and produce the output.
	 * Java uses the concept of a stream to make I/O operation fast. 
	 * The java.io package contains all the classes required for input and output operations.
	 * We can perform file handling in Java by Java I/O API.
	 */
	
	public void javaIO() {
		
		/*
		 * Stream
		 * Java uses Streams to speed up input-output operations.
		 * A stream is a sequence of data. In Java, a stream is composed of bytes. 
		 * It's called a stream because it is like a stream of water that continues to flow.
		 * In Java, 3 streams are created for us automatically. 
		 * 
		 * All these streams are attached with the console.
	       1) System.out: standard output stream
	       2) System.in: standard input stream
	       3) System.err: standard error stream

		 * Let's see the code to print output and an error message to the console.
		 */
		System.out.println("Simple Message");  
		System.err.println("Error Message");  	
		
		/*
		 * Let's see the code to get input from console.
		 */
		int i = 0; 
		try {
			System.out.print("Enter a character: ");
			i = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		} //returns ASCII code of 1st character  
		System.out.println("Your character: " + (char)i); //will print the character  
		
		/*
		 * OutputStream and InputStream
		 * The explanation of OutputStream and InputStream classes are given below:
		 * 
		 * OutputStream:
		 * Java application uses an output stream to write data to a destination; 
		 * it may be a file, an array, peripheral device or socket.
		 * 
		 * InputStream:
		 * Java application uses an input stream to read data from a source; 
		 * it may be a file, an array, peripheral device or socket.
		 */
		
		/*
		 * OutputStream Class
		 * OutputStream class is an abstract class. 
		 * It is the superclass of all classes representing an output stream of bytes. 
		 * An output stream accepts output bytes and sends them to some sink.
		 * 
		 * Useful methods of OutputStream
		   1) public void write(int) throws IOException
		      is used to write a byte to the current output stream.
		   2) public void write(byte[]) throws IOException
		      is used to write an array of byte to the current output stream.
		   3) public void flush() throws IOException
		      flushes the current output stream.
		   4) public void close()throws IOException
		      is used to close the current output stream.
		      
		 * OutputStream Hierarchy
		 * OutputStream contains FileOutputStream, ByteArrayOutputStream, FilterOutputStream,
		 * PipedOutputStream, ObjectOutputStream, DataOutputStream, BufferedOutputStream, PrintStream.
		 */
		
		/*
		 * InputStream class
		 * InputStream class is an abstract class. 
		 * It is the superclass of all classes representing an input stream of bytes.

 		 * Useful methods of InputStream
 		   1) public abstract int read() throws IOException
 		      reads the next byte of data from the input stream. It returns -1 at the end of the file.
 		   2) public int available() throws IOException
 		      returns an estimate of the number of bytes that can be read from the current input stream.
 		   3) public void close() throws IOException
 		      is used to close the current input stream.
 		 
 		 * InputStream Hierarchy
		 * InputStream contains FileInputStream, ByteArrayInputStream, FilterInputStream,
		 * PipedInputStream, ObjectInputStream, DataInputStream, BufferedInputStream, PushBackInputStream.
		 */
	}

	public void outputStream() throws IOException {
		
		FileOutputStreamClass fileOutputStreamClass = new FileOutputStreamClass();
	    fileOutputStreamClass.fileOutputStream();
	    
	    BufferedOutputStreamClass bufferedOutputStreamClass = new BufferedOutputStreamClass();
	    bufferedOutputStreamClass.bufferedOutputStream();
	    
	    ByteArrayOutputStreamClass byteArrayOutputStreamClass = new ByteArrayOutputStreamClass();
	    byteArrayOutputStreamClass.byteArrayOutputStream();
	    
	    DataOutputStreamClass dataOutputStreamClass = new DataOutputStreamClass();
	    dataOutputStreamClass.dataOutputStream();
	    
	    FilterOutputStreamClass filterOutputStreamClass = new FilterOutputStreamClass();
	    fileOutputStreamClass.fileOutputStream();
	}
	 
	public void inputStream() throws IOException {
		
		FileInputStreamClass fileInputStreamClass = new FileInputStreamClass();
		fileInputStreamClass.fileInputStream();
		
		BufferedInputStreamClass bufferedInputStreamClass = new BufferedInputStreamClass();
		bufferedInputStreamClass.bufferedInputStream();
		
		SequenceInputStreamClass sequenceInputStreamClass = new SequenceInputStreamClass();
		sequenceInputStreamClass.sequenceInputStream();
		
		ByteArrayInputStreamClass arrayInputStreamClass = new ByteArrayInputStreamClass();
		arrayInputStreamClass.byteArrayInputStream();
		
		DataInputStreamClass dataInputStreamClass = new DataInputStreamClass();
		dataInputStreamClass.dataInputStream();
	}

	public void writer() throws IOException {
		_WriterClass writerClass = new _WriterClass();
		writerClass.writer();
		
		FileWriterClass fileWriterClass = new FileWriterClass();
		fileWriterClass.fileWriter();
		
		BufferedWriterClass bufferedWriterClass = new BufferedWriterClass();
		bufferedWriterClass.bufferedWriter();
	}
	
	public void reader() throws IOException {
		_ReaderClass readerClass = new _ReaderClass();
		readerClass.reader();
		
		FileReaderClass fileReaderClass = new FileReaderClass();
		fileReaderClass.fileReader();
		
		BufferedReaderClass bufferedReaderClass = new BufferedReaderClass();
		bufferedReaderClass.bufferedReader();
	}
}
