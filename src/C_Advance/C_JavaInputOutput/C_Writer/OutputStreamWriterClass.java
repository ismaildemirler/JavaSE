package C_Advance.C_JavaInputOutput.C_Writer;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterClass {

	/*
	 * Java OutputStreamWriter
	 * 
	 * OutputStreamWriter is a class which is used to convert character stream to byte stream, 
	 * the characters are encoded into byte using a specified charset. write() method calls the 
	 * encoding converter which converts the character into bytes. The resulting bytes are then 
	 * accumulated in a buffer before being written into the underlying output stream. 
	 * The characters passed to write() methods are not buffered. We optimize the performance of 
	 * OutputStreamWriter by using it with in a BufferedWriter so that to avoid frequent converter invocation.
	 * 
	 * The Java OutputStreamWriter class, java.io.OutputStreamWriter, is intended to wrap an Java OutputStream 
	 * and thereby turning the byte based output stream into a character based Writer. 
	 * The Java OutputStreamWriter can also wrap any subclass of OutputStream.
	 * The Java OutputStreamWriter is useful if you need to write characters to a file, 
	 * encoded as e.g. UTF-8 or UTF-16. You can then write the characters (char values) 
	 * to the OutputStreamWriter and it will encode them correctly and write the encoded 
	 * bytes to the underlying OutputStream. The Java OutputStreamWriter is a subclass of 
	 * the Java Writer class. Thus, you can use an OutputStreamWriter anywhere a Writer is required.
	 */
	
	public void outputStreamWriter() throws IOException {
		
		/*
		 * Constructors
		 * 
		 * OutputStreamWriter(OutputStream out)
		 * It creates an OutputStreamWriter that uses the default character encoding.
		 * 
		 * OutputStreamWriter(OutputStream out, Charset cs)
		 * It creates an OutputStreamWriter that uses the given charset.
		 * 
		 * OutputStreamWriter(OutputStream out, CharsetEncoder enc)
		 * It creates an OutputStreamWriter that uses the given charset encoder.
		 * 
		 * OutputStreamWriter(OutputStream out, String charsetName)
		 * It creates an OutputStreamWriter that uses the named charset.
		 */
		
		/*
		 * Methods
		 * 
		 * void	close()	
		 * It closes the stream, flushing it first.
		 * 
		 * void	flush()	
		 * It flushes the stream.
		 * 
		 * String	getEncoding()	
		 * It returns the name of the character encoding being used by this stream.
		 * 
		 * void	write(char[] cbuf, int off, int len)	
		 * It writes a portion of an array of characters.
		 * 
		 * void	write(int c)	
		 * It writes a single character.
		 * 
		 * void	write(String str, int off, int len)	
		 * It writes a portion of a string
		 */
		
		OutputStream outputStream = new FileOutputStream("text.txt");  
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
        outputStreamWriter.write("Hello World");  
        outputStreamWriter.close();  
        
        /*
         * Character Encoding Constructors
         * The Java OutputStreamWriter also has alternative constructors that allow you to specify 
         * the character set (ISO-Latin1, UTF-8, UTF-16 etc.) to use to convert the written characters 
         * to the bytes written to the underlying OutputStream. Here is a Java OutputStreamWriter 
         * example showing the use of one of these constructors:
         */
        OutputStream os = new FileOutputStream("text.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
        
        /*
         * This example creates an OutputStreamWriter that will convert all characters written 
         * to it to UTF-8 encoded characters (one or more bytes per character) and write the 
         * UTF-8 encoded bytes to the underlying OutputStream.
         */
        
        /*
         * Write Performance
         * It is faster to write an array of characters to a Java OutputStreamWriter than writing 
         * one character at a time. The speedup can be quite significant - up to 10 x higher or more. 
         * Therefore it is recommended to use the write(char[]) methods whenever possible.
         * The exact speedup you get depends on the underlying OS and hardware of the computer 
         * you run the Java code on. The speedup depends on issues like memory speed, hard disk speed 
         * and buffer sizes, or network card speed and buffer sizes, depending on which destination 
         * the OutputStreamWriter sends its data to.
         */
        
        /*
         * Transparent Buffering via BufferedWriter
         * You can get transparent buffering of characters written to a Java OutputStreamWriter 
         * by wrapping it in a Java BufferedWriter. All bytes written to the BufferedWriter will 
         * first get buffered inside an internal byte array in the BufferedWriter. When the buffer 
         * is full, the buffer is flushed to the underlying OutputStreamWriter all at once. 
         * Here is an example of wrapping a Java OutputStreamWriter in a BufferedWriter:
         */
        int bufferSize = 8 * 1024;

        Writer writer =
            new BufferedWriter(
                  new OutputStreamWriter(
                     new FileOutputStream("output.txt"),
                    "UTF-8"
                  ),
                  bufferSize
            );
        
        /*
         * Transparent Buffering via BufferedOutputStream
         * Another way to add transparent buffering of characters written to a Java OutputStreamWriter 
         * is by wrapping the OutputStream in a Java BufferedOutputStream, before wrapping it in 
         * a OutputStreamWriter. All bytes written to the BufferedOutputStream will first get 
         * buffered inside an internal byte array in the BufferedOutputStream. When the buffer 
         * is full, the buffer is flushed to the underlying OutputStream all at once. 
         * Here is an example of using a Java OutputStreamWriter with a BufferedOutputStream:
         */
        OutputStreamWriter osWriter =
            new OutputStreamWriter(
                new BufferedOutputStream(
                      new FileOutputStream("output.txt"),
                      bufferSize
                ),
                "UTF-8"
            );
	}
}
