package C_Advance.C_JavaInputOutput.B_InputStream;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileInputStreamClass {

	/*
	 * FileInputStream in Java
	 * 
	 * Java FileInputStream class obtains input bytes from a file. 
	 * It is used for reading byte-oriented data (streams of raw bytes) 
	 * such as image data, audio, video etc. You can also read character-stream data. 
	 * But, for reading streams of characters, it is recommended to use FileReader class.
	 */
	
	public void fileInputStream() throws IOException {	
		
		/*
		 * The FileInputStream class has a three different constructors you can use to create 
		 * a FileInputStream instance. I will cover the first two here. The first constructor 
		 * takes a String as parameter. This String should contain the path in the file system 
		 * to where the file to read is located. Here is a code example:
		 */
		String path1 = "text.txt";
		FileInputStream fileInputStream1 = new FileInputStream(path1);
		
		/*
		 * The second FileInputStream constructor takes a File object as parameter. 
		 * The File object has to point to the file you want to read. 
		 * Here is an example:
		 */
		String path2 = "text.txt";
		File file = new File(path2);
		FileInputStream fileInputStream2 = new FileInputStream(file);
		
		/*
		 * Which of the constructors you should use depends on what form you have the path in 
		 * before opening the FileInputStream. If you already have a String or File, just use that as it is. 
		 * There is no particular gain in converting a String to a File, or a File to a String first.
		 */
		
		/*
		 * Here is a simple FileInputStream example:
		 */
		
		
		/*
		 * int read()
		 * The read() method of a FileInputStream returns an int which contains the byte value of the byte read. 
		 * If the read() method returns -1, there is no more data to read in the FileInputStream, and it can be closed. 
		 * That is, -1 as int value, not -1 as byte value. There is a difference here!
		 * You use the read() method just like the read() method of an InputStream. 
		 * Here is an example of reading all data in a Java FileInputStream :
		 */
		InputStream input1 = new FileInputStream("text.txt");

		int data = input1.read();
		while(data != -1) {
		  data = input1.read();
		  System.out.println("Data is reading..." + data);
		}
        System.out.println("***********************************");
		
		/*
		 * int available()
		 * It is used to return the estimated number of bytes that can be read from the input stream.
		 */
		InputStream input2 = new FileInputStream("text.txt");
		int bytes = input2.available();
		System.out.println("Estimated number of bytes: " + bytes);
		System.out.println("**************************************");
		
		/*
		 * int read(byte[])
		 * Being an InputStream the FileInputStream also has two read() methods which can read data into a byte array. 
		 * These methods are inherited from the Java InputStream class, by the way. These methods are:
		   - int read(byte[])
		   - int read(byte[], int offset, int length)
		   
		 * The first method attempts to fill up the byte array passed as parameter to it with bytes from from the FileInputStream.
		 * The second method attempts to read length bytes into the byte array, starting from cell offset in the byte array, 
		 * and filling forward from there. Both methods return the number of bytes actually read into the byte array. 
		 * In case there are less bytes to read than what there is space for in the array, or less than you specified 
		 * in the length parameter, less bytes will be read into the byte array. If all bytes have been read from the FileInputStream, 
		 * these read() methods will return -1. Therefore it is necessary to inspect the value returned from these read() method calls.
		 * Here is an example of calling one of the read(byte[]) methods:
		 */
		FileInputStream fileInputStream = new FileInputStream("text.txt");

		byte[] data1 = new byte[1024];
		int bytesRead = fileInputStream.read(data1, 0, data1.length);

		while(bytesRead != -1) {
			//doSomethingWithData(data1, bytesRead);
			bytesRead = fileInputStream.read(data1, 0, data1.length);
			System.out.println("Bytes by using read(byte[] bytes) : " + data1 + " " + bytesRead);
		}
		
		/*
		 * Notice that read(data, 0, data.length) is equivalent to read(data).
		 * The doSomethingWithData() method implementation has been left out of this example to keep it short. 
		 * But - it represents any set of actions you want to carry out on the read data.
		 */
		
		/*
		 * Read Performance
		 * Reading an array of bytes at a time is faster than reading a single byte at a time from a Java FileInputStream. 
		 * The difference can easily be a factor 10 or more in performance increase, by reading an array of bytes rather 
		 * than reading a single byte at a time. The exact speedup gained depends on the size of the byte array you read, 
		 * and the OS, hardware etc. of the computer you are running the code on. You should study the hard disk buffer 
		 * sizes etc. of the target system before deciding. However buffer sizes of 8KB and up will give a good speedup. 
		 * However, once your byte array exceeds the capacity of the underlying OS and hardware, you won't get a bigger 
		 * speedup from a bigger byte array. You will probably have to experiment with different byte array size and measure 
		 * read performance, to find the optimal byte array size.
		 */
		
		/*
		 * FileChannel getChannel()
		 * It is used to return the unique FileChannel object associated with the file input stream.
		 * A Java NIO FileChannel is a channel that is connected to a file. 
		 * Using a file channel you can read data from a file, and write data to a file. 
		 * The Java NIO FileChannel class is NIO's an alternative to reading files with the standard Java IO API.
		 * A FileChannel cannot be set into non-blocking mode. It always runs in blocking mode.
		 */
		FileChannel channel = fileInputStream.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(48);
		int incomingData = channel.read(buf);
		System.out.println("Incoming Data: " + incomingData);
        System.out.println("***********************************");
		
		/*
		 * FileDescriptor getFD()
		 * It is used to return the FileDescriptor object.
		 * FileDescriptor class serves as an handle to the underlying machine-specific 
		 * structure representing an open file, an open socket, or another source or sink of bytes. 
		 * The handle can be err, in or out. The FileDescriptor class is used to 
		 * create a FileInputStream or FileOutputStream to contain it.
		 */
		byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 }; 
		FileOutputStream fos = new FileOutputStream("Record.txt");  
        FileInputStream fis = new FileInputStream("Record.txt");  
        FileDescriptor fd = fos.getFD();  
        fos.write(b);  
        fos.flush();  
        fd.sync(); // It force all system buffers to synchronize with the underlying device. Confirms data to be written to the disk  
        int value = 0;  
        // for every available bytes  
        while ((value = fis.read()) != -1) {  
            char c = (char) value;// converts bytes to char  
            System.out.print(c);  
        }  
        System.out.println("\nSync() successfully executed!!");  
        System.out.println("***********************************");
        
        /*
         * Example 1:
         * Reading single character
         */
        FileInputStream fin = new FileInputStream("text.txt");    
        int i = fin.read();  
        System.out.print("Beginning Char: " + (char)i);    
        System.out.println("");
        System.out.println("***********************************");
        
        /*
         * Example 2:
         * Reading all characters
         */
        int j = 0;    
        while((j = fin.read()) != -1){    
         System.out.print((char)j);    
        }     
        System.out.println("");
        System.out.println("***********************************");
	}
}
