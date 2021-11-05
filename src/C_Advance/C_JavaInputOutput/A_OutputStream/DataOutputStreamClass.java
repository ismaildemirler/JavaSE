package C_Advance.C_JavaInputOutput.A_OutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataOutputStreamClass {

	/*
	 * Java DataOutputStream Class
	 * 
	 * Java DataOutputStream class allows an application to write primitive Java data types 
	 * to the output stream in a machine-independent way. Java application generally uses 
	 * the data output stream to write data that can later be read by a data input stream.
	 * The Java DataOutputStream class enables you to write Java primitives to OutputStream's 
	 * instead of only bytes. You wrap an OutputStream in a DataOutputStream and then you can 
	 * write primitives to it. That is why it is called a DataOutputStream - because you can write 
	 * int, long, float and double values to the OutputStream, and not just raw bytes.
	 * 
	 * 								|    int, long,
	 * 								|  float, double
	 * 							   \_/
	 *                   ______________________
	 * 					 || DataOutputStream ||
	 * 				     ||__________________||
	 * 
	 * 								|
	 *  							|   bytes
	 *  						   \_/
	 *  				 ______________________	
	 *                   ||   OutputStream    ||
	 *                   ||___________________||
	 * 
	 * Often you will use the Java DataOutputStream together with a Java DataInputStream. 
	 * You use the DataOutputStream to write the data to e.g. a file, and then use the DataInputStream 
	 * to read the data again. I have included an example of that later. Using the DataOutputStream 
	 * and DataInputStream together is a handy way to be able to write larger primitives than bytes 
	 * to an OutputStream and be able to read them in again, ensuring the right byte order is used etc.
	 * 
	 * public class DataOutputStream extends FilterOutputStream implements DataOutput  
	 */ 
	
	public void dataOutputStream() throws IOException {
		
		/*
		 * Here is a Java DataOutputStream example:
		 */
		DataOutputStream dataOutputStream1 = new DataOutputStream(
                new FileOutputStream("binary.data"));

		dataOutputStream1.write(45);            //byte data
		dataOutputStream1.writeInt(4545);       //int data
		dataOutputStream1.writeDouble(109.123); //double data
		dataOutputStream1.writeBoolean(false);  //boolean data
		dataOutputStream1.writeChar(0);         //char data
		dataOutputStream1.writeChars("ABC");    //string data
		dataOutputStream1.writeShort(10);       //short data
		dataOutputStream1.writeLong(10000L);    //long data
		
		
		dataOutputStream1.close();
		
		/*
		 * Using a DataOutputStream With a DataInputStream
		 * 
		 * As mentioned earlier, the DataOutputStream class is often used together with a DataInputStream. 
		 * Therefore I just want to show you an example of first writing data with a DataOutputStream and 
		 * then reading it again with a DataInputStream. Here is the example Java code:
		 */
		DataOutputStream dataOutputStream2 =
                new DataOutputStream(
                        new FileOutputStream("data.bin"));

		dataOutputStream2.writeInt(123);
		dataOutputStream2.writeFloat(123.45F);
		dataOutputStream2.writeLong(789);

		dataOutputStream2.close();

        DataInputStream dataInputStream3 =
                new DataInputStream(
                        new FileInputStream("data.bin"));

        int   int123     = dataInputStream3.readInt();
        float float12345 = dataInputStream3.readFloat();
        long  long789    = dataInputStream3.readLong();

        dataInputStream3.close();

        System.out.println("DataOutputStream int123     = " + int123);
        System.out.println("DataOutputStream float12345 = " + float12345);
        System.out.println("DataOutputStream long789    = " + long789);
        
        System.out.println("*************************************");
        
        /*
         * This example first creates a DataOutputStream and then writes an int, 
         * float and a long value to a file. Second the example creates a DataInputStream 
         * which reads the int, float and long value in from the same file.
         */
        
        /*
         * You can also use the try-with-resources construct introduced in Java 7. 
         * Here is how to use and close a DataOutputStream looks with the try-with-resources construct:
         */
        
        OutputStream output = new FileOutputStream("data.bin");

        try(DataOutputStream dataOutputStream =
            new DataOutputStream(output)){

            dataOutputStream.writeInt(123);
            dataOutputStream.writeFloat(123.45F);
            dataOutputStream.writeLong(789);
        }
        
        /*
         * Notice how there is no longer any explicit close() method call. 
         * The try-with-resources construct takes care of that. Notice also 
         * that the first FileOutputStream instance is not created inside 
         * the try-with-resources block. That means that the try-with-resources 
         * block will not automatically close this FileOutputStream instance. 
         * However, when the DataOutputStream is closed it will also close the 
         * OutputStream instance it writes to, so the FileOutputStream instance 
         * will get closed when the DataOutputStream is closed.
         */
	}
}
