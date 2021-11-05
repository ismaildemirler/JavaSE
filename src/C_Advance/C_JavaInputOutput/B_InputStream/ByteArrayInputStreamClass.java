package C_Advance.C_JavaInputOutput.B_InputStream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamClass {

	/*
	 * Java ByteArrayInputStream Class
	 * 
	 * The ByteArrayInputStream is composed of two words: ByteArray and InputStream. As the name suggests, 
	 * it can be used to read byte array as input stream. Java ByteArrayInputStream class contains an internal 
	 * buffer which is used to read byte array as stream. In this stream, the data is read from a byte array.
	 * The buffer of ByteArrayInputStream automatically grows according to data. 
	 * The Java ByteArrayInputStream class, java.io.ByteArrayInputStream, of the Java IO API enables you 
	 * to read data from byte arrays as streams of bytes. In other words, the ByteArrayInputStream class 
	 * can turn a byte array into an InputStream. The ByteArrayInputStream class is a subclass of the InputStream class, 
	 * so you can use a ByteArrayInputStream as an InputStream. The ByteArrayInputStream also has a set of additional 
	 * methods that are specific to the ByteArrayInputStream class. We will cover some of these methods in this tutorial.
	 * The Java ByteArrayInputStream can be handy if your data is stored in an array, but you have a component that 
	 * can only process it as an InputStream. The ByteArrayInputStream can thus wrap the byte array, and turn it into a stream.
	 */
	
	public void byteArrayInputStream() {
		
		/*
		 * Java ByteArrayInputStream class constructors
		 * 
		 * ByteArrayInputStream(byte[] array)
		 * Creates a new byte array input stream which uses array as its buffer array.
		 * 
		 * ByteArrayInputStream(byte[] array, int offset, int len)
		 * Creates a new byte array input stream which uses array as its buffer array 
		 * that can read up to specified len bytes of data from an array. 
		 */ 
		byte[] bytes = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 }; 
		ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(bytes);
		
		int offset = 20;
		int length = 45;
		ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bytes, offset, length);
		
		/*
		 * You read bytes from a Java ByteArrayInputStream just like you would from a regular InputStream, 
		 * via its read() method. The read() will return the next byte from the byte array, 
		 * or -1 if the end of the byte array (or byte array section) has been reached. 
		 * Here is an example of reading bytes from a Java ByteArrayInputStream:
		 */	
		
		byte[] buf = { 35, 36, 37, 38 };  
	    // Create the new byte array input stream  
	    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
	    int k = 0;  
	    while ((k = byt.read()) != -1) {  
	      //Conversion of a byte into character  
	      char ch = (char) k;  
	      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
	    }  
	    System.out.println("*************************************************");
	    
	    /*
	     * available()
	     * The Java ByteArrayInputStream available() method tells you how many bytes are still available 
	     * in the ByteArrayInputStream. Here is an example:
	     */
	    int bytesAvailable = byt.available();
	    System.out.println("Available : " + bytesAvailable);  
	    
	    /*
	     * mark()
	     * The mark() method of the ByteArrayInputStream class sets an internal mark at the current byte position,
	     * meaning right after the previous byte read. The mark() method takes a parameter telling how many bytes 
	     * can be read past this mark, before this mark becomes invalid. By default, if no mark has been explicitly 
	     * set, the ByteArrayInputStream has marked position 0, or the position at the offset passed to its constructor. 
	     * Here is an example of setting a mark in a ByteArrayInputStream via its mark() method:
	     */
	    byte[] abcdef = "abcdef".getBytes();

	    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(abcdef);

	    int data = byteArrayInputStream.read();  // read 'a'
        data = byteArrayInputStream.read();  // read 'b'
        data = byteArrayInputStream.read();  // read 'c'

        byteArrayInputStream.mark(1024);     // mark set before reading 'd'
        data = byteArrayInputStream.read();  // read 'd'
        data = byteArrayInputStream.read();  // read 'e'
        data = byteArrayInputStream.read();  // read 'f'
        
        /*
         * reset()
         * The reset() method of the ByteArrayInputStream resets how far it has read into the byte array. 
         * The index will be reset back to the last mark set on the ByteArrayInputStream. By default, 
         * if no mark has been explicitly set, the ByteArrayInputStream has marked position 0, or the 
         * position at the offset passed to its constructor. 
         * Here is an example of using the ByteArrayInputStream reset() method:
         */

        data = byteArrayInputStream.read();  // read 'a'
        data = byteArrayInputStream.read();  // read 'b'
        data = byteArrayInputStream.read();  // read 'c'

        byteArrayInputStream.mark(1024);     // mark set before reading 'd'
        data = byteArrayInputStream.read();  // read 'd'
        data = byteArrayInputStream.read();  // read 'e'
        data = byteArrayInputStream.read();  // read 'f'

        byteArrayInputStream.reset();        // reset to mark before 'd'
        data = byteArrayInputStream.read();  // read 'd'
        data = byteArrayInputStream.read();  // read 'e'
        data = byteArrayInputStream.read();  // read 'f'
        
        /*
         * skip()
         * The Java ByteArrayInputStream skip() method enables you to skip over a number of bytes 
         * from the underlying byte array. You pass as parameter the number of characters you want 
         * to skip over. Here is an example of skipping over a number of bytes using the 
         * ByteArrayInputStream skip() method:
         */
        byteArrayInputStream.skip(20);        
	}
}
