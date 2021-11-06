package C_Advance.C_JavaInputOutput.D_Reader;

import java.io.FileReader;
import java.io.Reader;

public class _ReaderClass {

	/*
	 * Java Reader
	 * 
	 * Java Reader is an abstract class for reading character streams. 
	 * The only methods that a subclass must implement are read(char[], int, int) and close(). 
	 * Most subclasses, however, will override some of the methods to provide higher efficiency, 
	 * additional functionality, or both. Some of the implementation class are BufferedReader, 
	 * CharArrayReader, FilterReader, InputStreamReader, PipedReader, StringReader
	 * The Java Reader class, java.io.Reader, is the base class for all Reader subclasses 
	 * in the Java IO API. A Java Reader is like a Java InputStream except that it is character 
	 * based rather than byte based. In other words, a Java Reader is intended for reading text (characters),
	 * whereas an InputStream is intended for reading raw bytes.
	 * 
	 * Readers and Sources
	 * A Reader is typically connected to some source of data like a file, char array, network socket etc. 
	 * 
	 * Characters in Unicode
	 * Today, many applications use Unicode (UTF-8 or UTF-16) to store text data. It may take one or more 
	 * bytes to represent a single character in UTF-8. In UTF-16 each character takes 2 bytes to represent. 
	 * Therefore, when reading text data, a single byte in the data may not correspond to one character in UTF. 
	 * If you just read one byte at a time of UTF-8 data via an InputStream and try to convert each byte into a 
	 * char, you may not end up with the text you expected. To solve this problem we have the Reader class. 
	 * The Reader class is capable of decoding bytes into characters. You need to tell the Reader what character 
	 * set to decode. This is done when you instantiate the Reader (actually, when you instantiate one of its subclasses).
	 * 
	 * Java Reader Subclasses
	 * You will normally use a Reader subclass rather than a Reader directly. Java IO contains a lot of Reader subclasses. 
	 * 
	 * Here is a list of the Java Reader subclasses:
	   - InputStreamReader
	   - CharArrayReader
	   - FileReader
	   - PipedReader
	   - BufferedReader
	   - FilterReader
	   - PushbackReader
	   - LineNumberReader
	   - StringReader
	 */
	
	public void reader() {
		
		/*
		 * Fields
		 * 
		 * protected Object lock
		 * The object used to synchronize operations on this stream.
		 */
		
		/*
		 * Constructors
		 * 
		 * protected Reader()
		 * It creates a new character-stream reader whose critical sections will synchronize on the reader itself.
		 * 
		 * protected Reader(Object lock)
		 * It creates a new character-stream reader whose critical sections will synchronize on the given object.
		 */
		
		/*
		 * Methods
		 * 
		 * void	mark(int readAheadLimit)
		 * It marks the present position in the stream.
		 * 
		 * boolean markSupported()
		 * It tells whether this stream supports the mark() operation.
		 * 
		 * int read()
		 * It reads a single character.
		 * 
		 * abstract void close()
		 * It closes the stream and releases any system resources associated with it.
		 * 
		 * int read(char[] cbuf)
		 * It reads characters into an array.
		 * 
		 * abstract int	read(char[] cbuf, int off, int len)
		 * It reads characters into a portion of an array.
		 * 
		 * int read(CharBuffer target)
		 * It writes a portion of an array of characters.
		 * 
		 * boolean ready()
		 * It tells whether this stream is ready to be read.
		 * 
		 * void	reset()
		 * It resets the stream.
		 * 
		 * long	skip(long n)
		 * It skips characters.
		 */
		
		try {  
            Reader reader = new FileReader("output.txt");  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
		
		/*
		 * Read Performance
		 * Reading an array of characters at a time is faster than reading a single character at a time from a Java Reader. 
		 * The difference can easily be a factor 10 or more in performance increase, by reading an array of characters 
		 * rather than reading a single character at a time. The exact speedup gained depends on the size of the char 
		 * array you read, and the OS, hardware etc. of the computer you are running the code on. You should study the 
		 * hard disk buffer sizes etc. of the target system before deciding. However buffer sizes of 8KB and up will 
		 * give a good speedup. However, once your char array exceeds the capacity of the underlying OS and hardware, 
		 * you won't get a bigger speedup from a bigger char array. You will probably have to experiment with different 
		 * byte array size and measure read performance, to find the optimal char array size.
		 */
	}
}
