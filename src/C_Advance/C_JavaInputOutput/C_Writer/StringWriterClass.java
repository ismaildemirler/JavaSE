package C_Advance.C_JavaInputOutput.C_Writer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

public class StringWriterClass {

	/*
	 * Java StringWriter Class
	 * 
	 * Java StringWriter class is a character stream that collects output from string buffer, 
	 * which can be used to construct a string. The StringWriter class inherits the Writer class.
	 * In StringWriter class, system resources like network sockets and files are not used, 
	 * therefore closing the StringWriter is not necessary. The Java StringWriter class 
	 * (java.io.StringWriter) enables you to obtain the characters written to a Writer as a String. 
	 * The StringWriter is useful if you have a component that only can write data to a Writer but you need that data as a String.
	 */
	
	public void stringWriter() throws IOException {
		
		/*
		 * void write(int c)	
		 * It is used to write the single character.
		 * 
		 * void write(String str)	
		 * It is used to write the string.
		 * 
		 * void write(String str, int off, int len)	
		 * It is used to write the portion of a string.
		 * 
		 * void write(char[] cbuf, int off, int len)	
		 * It is used to write the portion of an array of characters.
		 * 
		 * String toString()	
		 * It is used to return the buffer current value as a string.
		 * 
		 * StringBuffer getBuffer()	
		 * It is used t return the string buffer.
		 * 
		 * StringWriter append(char c)	
		 * It is used to append the specified character to the writer.
		 * 
		 * StringWriter append(CharSequence csq)	
		 * It is used to append the specified character sequence to the writer.
		 * 
		 * StringWriter append(CharSequence csq, int start, int end)	
		 * It is used to append the subsequence of specified character sequence to the writer.
		 * 
		 * void flush()	
		 * It is used to flush the stream.
		 * 
		 * void close()	
		 * It is used to close the stream.
		 */
		
		char[] ary = new char[512];  
        StringWriter writer = new StringWriter();  
        FileInputStream input = null;  
        BufferedReader buffer = null;  
        input = new FileInputStream("text.txt");  
        buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));  
        int x;  
        while ((x = buffer.read(ary)) != -1) {  
        	writer.write(ary, 0, x);  
        }  
        System.out.println(writer.toString());        
        writer.close();  
        buffer.close();  
	}
}
