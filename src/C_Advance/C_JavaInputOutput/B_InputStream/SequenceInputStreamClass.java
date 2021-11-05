package C_Advance.C_JavaInputOutput.B_InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamClass {

	/*
	 * Java SequenceInputStream Class
	 * 
	 * Java SequenceInputStream class is used to read data from multiple streams. 
	 * It reads data sequentially (one by one). The Java SequenceInputStream combines 
	 * two or more other InputStream's into one. First the SequenceInputStream will 
	 * read all bytes from the first InputStream, then all bytes from the second InputStream. 
	 * That is the reason it is called a SequenceInputStream, since the InputStream instances are read in sequence.
	 * 
	 * || InputStream ||                    || InputStream ||
	 * ||_____________||                    ||_____________||
	 *         |                                    |
	 *         |                                    |
	 *         |____________________________________|
	 *                            |
	 *                            |
	 *                           \_/
	 *                || SequenceInputStream ||
	 *                ||_____________________||
	 */
	
	public void sequenceInputStream() {
		
		/*
		 * Constructors of SequenceInputStream class
		 * 
		 * SequenceInputStream(InputStream s1, InputStream s2)
		 * creates a new input stream by reading the data of two input stream in order, first s1 and then s2.
		 * 
		 * SequenceInputStream(Enumeration e)
		 * creates a new input stream by reading the data of an enumeration whose type is InputStream.
		 */
		
		/*
		 * Here is a simple Java SequenceInputStream example:
		 */
		
		try {
			FileInputStream input1 = new FileInputStream("text.txt");
			FileInputStream input2 = new FileInputStream("record.txt");
			SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);   
			int data = sequenceInputStream.read();
		    System.out.println("Sequence Data First Way : ");
			while(data != -1){
			    data = sequenceInputStream.read();
			    System.out.print(data + " - ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("*******************************************************");

		/*
		 * This Java code example first creates two FileInputStream instances. 
		 * The FileInputStream extends the InputStream class, so they can be used with the SequenceInputStream.
		 * Second, this example creates a SequenceInputStream. The SequenceInputStream is given the two 
		 * FileInputStream instances as constructor parameters. This is how you tell the SequenceInputStream 
		 * to combine two InputStream instances. The two InputStream instances combined with the SequenceInputStream 
		 * can now be used as if it was one coherent stream. When there is no more data to read from the second InputStream, 
		 * the SequenceInputStream read() method will return -1, just like any other InputStream does.
		 */

		/*
		 * Combining More Than Two InputStreams
		 * You can combine more than two InputStream instances with the SequenceInputStream in two ways. 
		 * The first way is to put all the InputStream instances into a Vector, and pass that Vector 
		 * to the SequenceInputStream constructor. Here is an example of how passing a Vector to the 
		 * SequenceInputStream constructor looks:
		 */
		try {
			InputStream input1 = new FileInputStream("text.txt");
			InputStream input2 = new FileInputStream("record.txt");
			InputStream input3 = new FileInputStream("text.txt");
	
			Vector<InputStream> streams = new Vector<>();
			streams.add(input1);
			streams.add(input2);
			streams.add(input3);
	
			Enumeration elements = streams.elements();   
			SequenceInputStream sequenceInputStream = new SequenceInputStream(elements);
			    
			int data = sequenceInputStream.read();
		    System.out.println("Sequence Data Second Way : ");
			while(data != -1){
			    System.out.print(data + " - ");
			    data = sequenceInputStream.read();
			}
			sequenceInputStream.close();
		}
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("*******************************************************");
		
		/*
		 * The second method is to combine the InputStream instances two and two into SequenceInputStream instances, 
		 * and then combine these again with another SequenceInputStream. Here is how combining more than two InputStream 
		 * instances with multiple SequenceInputStream instances look:
		 */
		try {
			InputStream input1 = new FileInputStream("text.txt");
			InputStream input2 = new FileInputStream("record.txt");
			InputStream input3 = new FileInputStream("text.txt");
			InputStream input4 = new FileInputStream("record.txt");
			
			SequenceInputStream sequenceInputStream1 =
			        new SequenceInputStream(input1, input2);

			SequenceInputStream sequenceInputStream2 =
			        new SequenceInputStream(input3, input4);

			SequenceInputStream sequenceInputStream =
			    new SequenceInputStream(
			            sequenceInputStream1, sequenceInputStream2);

			int data = sequenceInputStream.read();
		    System.out.println("Combined Sequence Data : ");
			while(data != -1){
			    data = sequenceInputStream.read();
			    System.out.print(data + " - ");
			}
			sequenceInputStream.close();
		}
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("*******************************************************");
	}
}
