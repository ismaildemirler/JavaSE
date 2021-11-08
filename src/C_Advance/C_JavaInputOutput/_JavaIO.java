package C_Advance.C_JavaInputOutput;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectStreamClass;
import java.util.Calendar;

import C_Advance.C_JavaInputOutput.A_OutputStream.BufferedOutputStreamClass;
import C_Advance.C_JavaInputOutput.A_OutputStream.ByteArrayOutputStreamClass;
import C_Advance.C_JavaInputOutput.A_OutputStream.DataOutputStreamClass;
import C_Advance.C_JavaInputOutput.A_OutputStream.FileOutputStreamClass;
import C_Advance.C_JavaInputOutput.A_OutputStream.FilterOutputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.BufferedInputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.ByteArrayInputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.DataInputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.FileInputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.PushbackInputStreamClass;
import C_Advance.C_JavaInputOutput.B_InputStream.SequenceInputStreamClass;
import C_Advance.C_JavaInputOutput.C_Writer.BufferedWriterClass;
import C_Advance.C_JavaInputOutput.C_Writer.FileWriterClass;
import C_Advance.C_JavaInputOutput.C_Writer.PipedWriterClass;
import C_Advance.C_JavaInputOutput.C_Writer.PrintWriterClass;
import C_Advance.C_JavaInputOutput.C_Writer.StringWriterClass;
import C_Advance.C_JavaInputOutput.C_Writer._WriterClass;
import C_Advance.C_JavaInputOutput.D_Reader.BufferedReaderClass;
import C_Advance.C_JavaInputOutput.D_Reader.FileReaderClass;
import C_Advance.C_JavaInputOutput.D_Reader.InputStreamReaderClass;
import C_Advance.C_JavaInputOutput.D_Reader.PipedReaderClass;
import C_Advance.C_JavaInputOutput.D_Reader.PrintStreamClass;
import C_Advance.C_JavaInputOutput.D_Reader.StringReaderClass;
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
		
		System.out.println("***************************");
		
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

		System.out.println("***************************");
		
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

	public void file() throws IOException {
		FileClass fileClass = new FileClass();
		fileClass.file();
		fileClass.fileDescriptor();
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
		
		PushbackInputStreamClass pushbackInputStreamClass = new PushbackInputStreamClass();
		pushbackInputStreamClass.pushbackInputStream();
	}

	public void writer() throws IOException {
		_WriterClass writerClass = new _WriterClass();
		writerClass.writer();
		
		FileWriterClass fileWriterClass = new FileWriterClass();
		fileWriterClass.fileWriter();
		
		BufferedWriterClass bufferedWriterClass = new BufferedWriterClass();
		bufferedWriterClass.bufferedWriter();
		
		PrintWriterClass printWriterClass = new PrintWriterClass();
		printWriterClass.printWriter();
		
		StringWriterClass stringWriterClass = new StringWriterClass();
		stringWriterClass.stringWriter();
		
		PipedWriterClass pipedWriterClass = new PipedWriterClass();
		pipedWriterClass.pipeWriter();
	}
	
	public void reader() throws IOException {
		_ReaderClass readerClass = new _ReaderClass();
		readerClass.reader();
		
		FileReaderClass fileReaderClass = new FileReaderClass();
		fileReaderClass.fileReader();
		
		BufferedReaderClass bufferedReaderClass = new BufferedReaderClass();
		bufferedReaderClass.bufferedReader();
		
		PrintStreamClass printStreamClass = new PrintStreamClass();
		printStreamClass.printStream();
		
		InputStreamReaderClass inputStreamReaderClass = new InputStreamReaderClass();
		inputStreamReaderClass.inputStreamReader();
		
		StringReaderClass stringReaderClass = new StringReaderClass();
		stringReaderClass.stringReader();
		
		PipedReaderClass pipedReaderClass = new PipedReaderClass();
		pipedReaderClass.pipedReader();
	}

	public void objectStreamClass() throws IOException {
		
		/*
		 * Java - ObjectStreamClass 
		 * 
		 * ObjectStreamClass act as a Serialization descriptor for class. 
		 * This class contains the name and serialVersionUID of the class.
		 */
		
		/*
		 * Fields
		 * 
		 * static ObjectStreamField[]
		 * serialPersistentFields value indicating no serializable fields
		 */
		
		/*
		 * Methods 
		 * 
		 * Class<?>	forClass()	
		 * It returns the class in the local VM that this version is mapped to.
		 * 
		 * ObjectStreamField getField(String name)	
		 * It gets the field of this class by name.
		 * 
		 * ObjectStreamField[] getFields()	
		 * It returns an array of the fields of this serialization class.
		 * 
		 * String getName() 
		 * It returns the name of the class described by this descriptor.
		 * 
		 * long	getSerialVersionUID()	
		 * It returns the serialVersionUID for this class.
		 * 
		 * Static ObjectStreamClass	lookup(Class<?> cl)	
		 * It finds the descriptor for a class that can be serialized.
		 * 
		 * Static ObjectStreamClass	lookupAny(Class<?> cl)	
		 * It returns the descriptor for any class, regardless of whether it implements Serializable.
		 * 
		 * String toString()	
		 * It returns a string describing this ObjectStreamClass.
		 */
		
		// create a new object stream class for Integers  
        ObjectStreamClass osc = ObjectStreamClass.lookup(SmartPhone.class);  
  
        // get the value field from ObjectStreamClass for integers  
        System.out.println("" + osc.getField("price"));  
  
        // create a new object stream class for Calendar  
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(String.class);  
  
        // get the Class instance for osc2  
        System.out.println("Hash Field Of String Class : " + osc2.getField("hash"));  
	}

	public void objectStreamFieldClass() throws IOException {
		
		/*
		 * Java ObjectStreamField class
		 * 
		 * A description of a Serializable field from a Serializable class. An array of ObjectStreamFields 
		 * is used to declare the Serializable fields of a class. The java.io.ObjectStreamClass.getField(String name) 
		 * method gets the field of this class by name.
		 */
		
		/*
		 * Constructors
		 * 
		 * ObjectStreamField(String name, Class<?> type)	
		 * It creates a Serializable field with the specified type.
		 * 
		 * ObjectStreamField(String name, Class<?> type, boolean unshared)	
		 * It creates an ObjectStreamField representing a serializable field with the given name and type.
		 */
		
		/*
		 * Methods
		 * 
		 * int compareTo(Object obj)	
		 * It compares this field with another ObjectStreamField.
		 * 
		 * String getName()	
		 * It gets the name of this field.
		 * 
		 * int GetOffset()	
		 * Offset of field within instance data.
		 * 
		 * Class<?>	getType()	
		 * It get the type of the field.
		 * 
		 * char	getTypeCode()	
		 * It returns character encoding of field type.
		 * 
		 * String getTypeString()	
		 * It return the JVM type signature.
		 * 
		 * boolean isPrimitive()	
		 * It return true if this field has a primitive type.
		 * 
		 * boolean isUnshared()	
		 * It returns boolean value indicating whether or not the serializable field represented by this ObjectStreamField instance is unshared.
		 * 
		 * protected void setOffset(int offset)	
		 * Offset within instance data.
		 * 
		 * String toString()	
		 * It return a string that describes this field.
		 */
		
		/*
		 * public char getTypeCode()
		 * Returns character encoding of field type. The encoding is as follows:
		 * 
		 * B	byte
		 * C	char
		 * D	double
		 * F	float
		 * I	int
		 * J	long
		 * L	class or interface
		 * S	short
		 * Z	boolean
		 * [	array
		 * 
		 * Returns:
		 * the typecode of the serializable field
		 */
		
		// create a new object stream class for Integers  
        ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);  

        // get the value field from ObjectStreamClass for integers  
        System.out.println("" + osc.getField("value"));  

        // create a new object stream class for Calendar  
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);  

        // get the Class instance for osc2  
        System.out.println("" + osc2.getField("isTimeSet"));  
	}
	
	public class SmartPhone {
		private int price;
		private String name;
		
		public SmartPhone(int price, String name) {
			super();
			this.price = price;
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
