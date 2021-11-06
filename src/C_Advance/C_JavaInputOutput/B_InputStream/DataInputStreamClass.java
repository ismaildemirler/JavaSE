package C_Advance.C_JavaInputOutput.B_InputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamClass {

	/*
	 * Java DataInputStream Class
	 * 
	 * Java DataInputStream class allows an application to read primitive data from the input 
	 * stream in a machine-independent way. Java application generally uses the data output 
	 * stream to write data that can later be read by a data input stream. The Java DataInputStream class, 
	 * java.io.DataInputStream, enables you to read Java primitives (int, float, long etc.) 
	 * from an InputStream instead of only raw bytes. You wrap an InputStream in a DataInputStream and 
	 * then you can read Java primitives via ' the DataInputStream. That is why it is called 
	 * DataInputStream - because it reads data (numbers) instead of just bytes.
	 * 
	 * 								|   
	 * 								|   bytes
	 * 							   \_/
	 *                   ______________________
	 * 					 ||    InputStream   ||
	 * 				     ||__________________||
	 * 
	 * 								|   byte, int, long,
	 *  							|   float or double
	 *  						   \_/
	 *  				 ______________________	
	 *                   ||  DataInputStream  ||
	 *                   ||___________________||
	 *                  
	 * The DataInputStream is handy if the data you need to read consists of Java primitives 
	 * larger than one byte each, like int, long, float, double etc. The DataInputStream expects 
	 * the multi byte primitives to be written in network byte order (Big Endian - most significant byte first).
	 * Often you will use a Java DataInputStream to read data written by a Java DataOutputStream.
	 * The Java DataInputStream class is a subclass of InputStream, so DataInputStream also has the 
	 * basic read methods that enable you to read a single byte or an array of bytes from the underlying 
	 * InputStream, in case you need that. In this Java DataInputStream tutorial I will only cover the extra 
	 * methods the DataInputStream has, though. One issue to keep in mind when reading primitive data types is, 
	 * that there is no way to distinguish a valid int value of -1 from the normal end-of-stream marker. 
	 * That basically means, that you cannot see from the primitive value returned if you have reached 
	 * end-of-stream. Therefore you kind of have to know ahead of time what data types to read, and in 
	 * what sequence. In other words, you need to know ahead of time what data you can read from the DataInputStream.
	 */
	
	public void dataInputStream() throws IOException {
		
		/*
		 * Here is a Java DataInputStream example:
		 */
		DataInputStream dataInputStream1 = new DataInputStream(
                new FileInputStream("data.bin"));

//		boolean myBoolean = dataInputStream1.readBoolean();
//		byte myByte = dataInputStream1.readByte();
//		int myUnsignedByte = dataInputStream1.readUnsignedByte();
//		double myDouble = dataInputStream1.readDouble();
//		float myFloat = dataInputStream1.readFloat();
//		short myShort = dataInputStream1.readShort();
//		char myChar = dataInputStream1.readChar();
//		int myUnsignedShort = dataInputStream1.readUnsignedShort();
//		int myInt = dataInputStream1.readInt();
//		long myLong = dataInputStream1.readLong();
//		String myString = dataInputStream1.readUTF();
		//etc.
		
		dataInputStream1.close();
		
		/*
		 * Create a DataInputStream 
		 * You create a Java DataInputStream via its constructor. 
		 * When you do so, you pass an InputStream as parameter from which the primitive data 
		 * types are to be read. Here is an example of creating a Java DataInputStream:
		 */
		DataInputStream dataInputStream2 =
		        new DataInputStream(
		                new FileInputStream("data.bin"));
		
		/*
		 * Using a DataInputStream With a DataOutputStream
		 * As mentioned earlier, the DataInputStream class is often used together with a DataOutputStream. 
		 * Therefore I just want to show you an example of first writing data with a DataOutputStream and then 
		 * reading it again with a DataInputStream. Here is the example Java code:
		 */
		
		DataOutputStream dataOutputStream =
                new DataOutputStream(
                        new FileOutputStream("data.bin"));

        dataOutputStream.writeInt(123);
        dataOutputStream.writeFloat(123.45F);
        dataOutputStream.writeLong(789);

        dataOutputStream.close();

        DataInputStream dataInputStream =
                new DataInputStream(
                        new FileInputStream("data.bin"));

        int   int123     = dataInputStream.readInt();
        float float12345 = dataInputStream.readFloat();
        long  long789    = dataInputStream.readLong();

        dataInputStream.close();

        System.out.println("DataInputStream int123     = " + int123);
        System.out.println("DataInputStream float12345 = " + float12345);
        System.out.println("DataInputStream long789    = " + long789);
        System.out.println("***************************************");
        
        /*
         * This example first creates a DataOutputStream and then writes an int, float and a long value to a file. 
         * Second the example creates a DataInputStream which reads the int, float and long value in from the same file.
         */
        
        InputStream input = new FileInputStream("text.txt");  
        DataInputStream inst = new DataInputStream(input);  
        int count = input.available();  
        byte[] ary = new byte[count];  
        inst.read(ary);  
        System.out.println("DataInputStream : ");
        for (byte bt : ary) {  
          char k = (char) bt;  
          System.out.print(k + " - ");  
        }  
        System.out.println("");
        System.out.println("***************************************");
	}
}
