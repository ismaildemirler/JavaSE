package C_Advance.C_JavaInputOutput.C_Writer;

import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class _WriterClass {

	/*
	 * Java Writer
	 * 
	 * It is an abstract class for writing to character streams. The methods that a 
	 * subclass must implement are write(char[], int, int), flush(), and close(). 
	 * Most subclasses will override some of the methods defined here to provide 
	 * higher efficiency, functionality or both. The Java Writer class (java.io.Writer) 
	 * is the base class for all Writer subclasses in the Java IO API. A Writer is like 
	 * an OutputStream except that it is character based rather than byte based. 
	 * In other words, a Writer is intended for writing text, whereas an OutputStream is intended for writing raw bytes.
	 * 
	 * Characters in Unicode
	 * Today, many applications use Unicode (typically UTF-8 or UTF-16) to store text data. 
	 * It may take one or more bytes to represent a single character in UTF-8. In UTF-16 each 
	 * character takes 2 bytes to represent. To write UTF-8 or UTF-16 correctly you need to 
	 * know which of the two formats you want to store the text in, and you need to know how 
	 * to properly encode characters using the chosen format. This is where the Java Writer 
	 * class comes in handy. The Java Writer subclasses can normally handle UTF-8 and UTF-16 
	 * encoding for you, so you don't have to worry about that.
	 * 
	 * Writer Subclasses
	 * You will normally use a Writer subclass rather than a Writer directly. 
	 * Subclasses of Writer include OutputStreamWriter, CharArrayWriter, FileWriter, plus many others. 
	 * 
	 * Here is a list of the Java Writer subclasses:
	   - FileWriter
	   - OutputStreamWriter
	   - BufferedWriter
	   - PipedWriter
	   - CharArrayWriter
	   - FilterWriter
	   - StringWriter
	   - PrintWriter
	   
	 * Writers and Destinations
	 * A Java Writer is typically connected to some destination of data like a file, char array, network socket etc.
	 */
	
	public void writer() {
		
		/*
		 * Fields
		 * 
		 * protected Object lock
		 * The object used to synchronize operations on this stream.
		 */
		
		/*
		 * Constructors
		 * 
		 * protected Writer()
		 * It creates a new character-stream writer whose critical sections will synchronize on the writer itself.
		 * 
		 * protected Writer(Object lock)
		 * It creates a new character-stream writer whose critical sections will synchronize on the given object
		 */
		
		/*
		 * Methods
		 * 
		 * Writer append(char c)
		 * It appends the specified character to this writer.
		 * 
		 * Writer append(CharSequence csq)
		 * It appends the specified character sequence to this writer
		 * 
		 * Writer append(CharSequence csq, int start, int end)
		 * It appends a subsequence of the specified character sequence to this writer.
		 * 
		 * abstract void close()
		 * It closes the stream, flushing it first.
		 * 
		 * abstract void flush()
		 * It flushes the stream.
		 * 
		 * void	write(char[] cbuf)
		 * It writes an array of characters.
		 * 
		 * abstract void write(char[] cbuf, int off, int len)
		 * It writes a portion of an array of characters.
		 * 
		 * void	write(int c)
		 * It writes a single character.
		 * 
		 * void	write(String str)
		 * It writes a string
		 * 
		 * void	write(String str, int off, int len)
		 * It writes a portion of a string.
		 */
		
		try {  
            Writer w = new FileWriter("output.txt");  
            w.write('A');
            String content = "I love JAVA";  
            w.write(content);  
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        } 
		
		/*
		 * Write Performance
		 * It is faster to write an array of characters to a Java Writer than writing one character at a time. 
		 * The speedup can be quite significant - up to 10 x higher or more. Therefore it is recommended to use 
		 * the write(char[]) methods whenever possible. The exact speedup you get depends on the underlying OS 
		 * and hardware of the computer you run the Java code on. The speedup depends on issues like memory speed, 
		 * hard disk speed and buffer sizes, or network card speed and buffer sizes, depending on which destination 
		 * the Writer sends its data to.
		 */
		
		/*
		 * Usage of Try With Resource
		 * 
		 * We did not have to use multiple try catch block thanks to try with resource structure. Java handles closing
		 * closable files which implements from IClosable interface.
		 */
		try(FileWriter fileWriter = new FileWriter("text.txt")) {
			fileWriter.write("Example String");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileWriter fileWriter1 = new FileWriter("text.txt");
		    FileWriter fileWriter2 = new FileWriter("output.txt")) {
			fileWriter1.write("Example String");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
