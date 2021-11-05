package C_Advance.C_JavaInputOutput.A_OutputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamClass {

	/*
	 * Java ByteArrayOutputStream Class
	 * 
	 * Java ByteArrayOutputStream class is used to write common data into multiple files. 
	 * In this stream, the data is written into a byte array which can be written to multiple streams later. 
	 * The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
	 * The buffer of ByteArrayOutputStream automatically grows according to data.
	 * 
	 * The Java ByteArrayOutputStream class, java.io.ByteArrayOutputStream of the Java IO API enables you to 
	 * capture data written to a stream in a byte array. You write your data to the ByteArrayOutputStream and 
	 * when you are done you call the its toByteArray() method to obtain all the written data in a byte array. 
	 * The Java ByteArrayOutputStream can be handy in situations where you have a component that outputs its 
	 * data to an OutputStream, but where you need the data written as a byte array.
	 */
	
	public void byteArrayOutputStream() {
		
		/*
		 * Java ByteArrayOutputStream class constructors
		 * 
		 * ByteArrayOutputStream()
		 * Creates a new byte array output stream with the initial capacity of 32 bytes, though its size increases if necessary.
		 * 
		 * ByteArrayOutputStream(int size)
		 * Creates a new byte array output stream, with a buffer capacity of the specified size, in bytes.
		 */

		System.out.println("");
		System.out.println("*********************************************");
		
		ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
		ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(5);
		
		/*
		 * Methods
		 */
		
		/*
		 * int size()
		 * It is used to returns the current size of a buffer.
		 */
		int size = byteArrayOutputStream2.size();
		System.out.println("Size : " + size);
		System.out.println("*********************************************");
		
		/*
		 * byte[] toByteArray()
		 * It is used to create a newly allocated byte array. Once you have finished writing 
		 * to the ByteArrayOutputStream you can obtain all the bytes written as a Java byte array, 
		 * using the ByteArrayOutputStream toByteArray() method. Here is an example:
		 */
		byte[] bytes = byteArrayOutputStream1.toByteArray();
		
		/*
		 * String toString()
		 * It is used for converting the content into a string decoding bytes using a platform default character set.
		 */
		
		/*
		 * String toString(String charsetName)
		 * It is used for converting the content into a string decoding bytes using a specified charsetName.
		 */
		
		/*
		 * void write(int b)
		 * It is used for writing the byte specified to the byte array output stream.
		 */
		
		/*
		 * void write(byte[] b, int off, int len
		 * It is used for writing len bytes from specified byte array starting from the offset off to the byte array output stream.
		 */
		
		/*
		 * void writeTo(OutputStream out)
		 * It is used for writing the complete content of a byte array output stream to the specified output stream.
		 */
		
		/*
		 * void reset()
		 * It is used to reset the count field of a byte array output stream to zero value.
		 */
		
		/*
		 * void close()
		 * It is used to close the ByteArrayOutputStream.
		 */
		
		/*
		 * ByteArrayOutputStream class to write common data into 2 files: text.txt and record.txt.
		 */
		
		try {
			FileOutputStream fout1 = new FileOutputStream("text.txt");    
		    FileOutputStream fout2 = new FileOutputStream("record.txt");    
		        
		    ByteArrayOutputStream bout=new ByteArrayOutputStream();    
		    bout.write(65);    
		    bout.writeTo(fout1);    
		    bout.writeTo(fout2);
		    bout.flush();    
		    bout.close();//has no effect    
		} catch (Exception e) {
			// TODO: handle exception
		}   
		
		/*                
		 * 												    fout1
		 *                                              [[1100110011]] -------->  text.txt
		 *                                              /
		 *                                             /
		 *                                            /
		 *                    write()                /
		 *  Java Application ---------->  [[1100110011]]
		 *                                     bout  \
		 *                                            \
		 *                                             \
		 *                                              \
		 *                                              [[1100110011]] -------->  record.txt
		 *                                                  fout2
		 */           
	}
}
