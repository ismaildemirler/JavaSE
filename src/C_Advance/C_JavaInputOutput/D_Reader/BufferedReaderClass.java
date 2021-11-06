package C_Advance.C_JavaInputOutput.D_Reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderClass {

	/*
	 * Java BufferedReader Class 
	 * Java BufferedReader class is used to read the text from a character-based input stream. 
	 * It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class.
	 * The Java BufferedReader class, java.io.BufferedReader, provides buffering for your Java Reader instances. 
	 * Buffering can speed up IO quite a bit. Rather than read one character at a time from the underlying Reader, 
	 * the Java BufferedReader reads a larger block (array) at a time. This is typically much faster, especially 
	 * for disk access and larger data amounts. The Java BufferedReader is similar to the BufferedInputStream but 
	 * they are not exactly the same. The main difference between BufferedReader and BufferedInputStream is 
	 * that BufferedReader reads characters (text), whereas the BufferedInputStream reads raw bytes.
	 * The Java BufferedReader class is a subclass of the Java Reader class, so you can use a BufferedReader anywhere a Reader is required.
	 */
	
	public void bufferedReader() throws IOException {
		
		/*
		 * Java BufferedReader class constructors
		 */
		
		/*
		 * BufferedReader(Reader rd)
		 * It is used to create a buffered character input stream that uses the default size for an input buffer.
		 */
		BufferedReader bufferedReader1 = new BufferedReader(new FileReader("text.txt"));
		
		/*
		 * This example creates a BufferedReader which wraps a FileReader. The BufferedReader will read a block of characters 
		 * from the FileReader (typically into a char array). Each character returned from read() is thus returned from this 
		 * internal array. When the array is fully read the BufferedReader reads a new block of data into the array etc.
		 */
		
		/*
		 * BufferedReader(Reader rd, int size)
		 * It is used to create a buffered character input stream that uses the specified size for an input buffer.
		 */
		int bufferSize = 8 * 1024;

		BufferedReader bufferedReader2 = new BufferedReader(
		                      new FileReader("text.txt"),
		                      bufferSize
		);
		
		/*
		 * This example sets the internal buffer to 8 KB. It is best to use buffer sizes that are multiples of 1024 bytes. 
		 * That works best with most built-in buffering in hard disks etc. Except for adding buffering to Reader instances, 
		 * a Java BufferedReader behaves pretty much like a Reader. The BufferedReader has one extra method though, 
		 * the readLine() method. This method can be handy if you need to read input one line at a time. 
		 * Here is a BufferedReader readLine() example:
		 */
		String lineResult = bufferedReader1.readLine();
		
		/*
		 * The readLine() method will return a textual line (all text until at line break is found) read from the BufferedReader. 
		 * If there is no more data to read from the underlying Reader, then the BufferedReader's readLine() method will return null .
		 */
		
		/*
		 * Read Performance
		 * Reading an array of characters at a time is faster than reading a single character at a time from a Java Reader. 
		 * However, since the BufferedReader does some internal buffering already, the difference is most likely not as 
		 * dramatic as with a Reader that uses no buffering. You will most likely still see a small difference though.
		 * 
		 * Skip Characters
		 * The Java BufferedReader class has a method named skip() which can be used to skip over a number of characters 
		 * in the input that you do not want to read. You pass the number of characters to skip as parameter to the skip() method. 
		 * Here is an example of skipping characters from a Java BufferedReader :
		 */
		long charsSkipped = bufferedReader2.skip(24);
		
		/*
		 * This example tells the Java BufferedReader to skip over the next 24 characters in the BufferedReader. 
		 * The skip() method returns the actual number of characters skipped. In most cases that will be the same 
		 * number as you requested skipped, but in case there are less characters left in the BufferedReader than 
		 * the number you request skipped, the returned number of skipped characters can be less than the number 
		 * of characters you requested skipped.
		 */
		
		/*
		 * Methods
		 * 
		 * int read()	
		 * It is used for reading a single character.
		 * 
		 * int read(char[] cbuf, int off, int len)	
		 * It is used for reading characters into a portion of an array.
		 * 
		 * boolean markSupported()	
		 * It is used to test the input stream support for the mark and reset method.
		 * 
		 * String readLine()	
		 * It is used for reading a line of text.
		 * 
		 * boolean ready()	
		 * It is used to test whether the input stream is ready to be read.
		 * 
		 * long skip(long n)	
		 * It is used for skipping the characters.
		 * 
		 * void reset()	
		 * It repositions the stream at a position the mark method was last called on this input stream.
		 * 
		 * void mark(int readAheadLimit)	
		 * It is used for marking the present position in a stream.
		 * 
		 * void close()	
		 * It closes the input stream and releases any of the system resources associated with the stream.
		 */
		
		FileReader fr = new FileReader("output.txt");    
        BufferedReader br = new BufferedReader(fr);    

        int i;    
        System.out.println("");
        System.out.println("**********************************");
        System.out.println("Character by character : ");
        while((i = br.read()) != -1){  
        	System.out.print((char)i + " ");  
        }  

        System.out.println("");
        System.out.println("**********************************");

        fr = new FileReader("output.txt"); 
        br = new BufferedReader(fr);  
        System.out.println("Line by line : ");
        String line = br.readLine();
        while(line != null) {

        	System.out.print(line + " ");  
        	line = br.readLine();
        }
        System.out.println("");
        System.out.println("**********************************");
        
        br.close();    
        fr.close();
        
        /*
         * Reading data from console by InputStreamReader and BufferedReader
         * In this example, we are connecting the BufferedReader stream with the InputStreamReader 
         * stream for reading the line by line data from the keyboard.
         */
        InputStreamReader r = new InputStreamReader(System.in);    
        BufferedReader bufReader = new BufferedReader(r);            
        System.out.println("Enter your name");    
        String name = bufReader.readLine();    
        System.out.println("Welcome " + name); 
        r.close();    
        bufReader.close();   
        
        /*
         * Another example of reading data from console until user writes stop
         * In this example, we are reading and printing the data until the user prints stop.
         */
//        InputStreamReader reader = new InputStreamReader(System.in);    
//        BufferedReader bufferedReader = new BufferedReader(reader);           
//        String info = "";    
//        while(!info.equals("stop")){    
//        	System.out.println("Enter data: ");    
//        	info = bufferedReader.readLine();    
//        	System.out.println("data is: " + info);    
//        }              
//        bufferedReader.close();    
//        reader.close();    
        
        /*
         * Reusable BufferedReader
         * One of the weaknesses of the standard Java BufferedReader is that it can only be used once. 
         * Once you close it, it's no longer usable. If you need to read a lot of files, or network streams, 
         * you have to create a new BufferedReader for each file or network stream you want to read. 
         * This means that you are creating a new object, and more importantly, a new char array 
         * which is used as buffer inside the BufferedReader. This can put pressure on the Java garbage collector, 
         * if the number of files or streams read is high, and if they are read quickly after each other.
         * An alternative is to create a reusable BufferedReader where you can replace the underlying source Reader, 
         * so the BufferedReader and its internal byte array buffer can be reused. To save you the trouble, 
         * I have created such a ReusableBufferedReader, and included the code for it further down this tutorial. 
         * First, I want to show you how using this ReusableBufferedReader looks. 
         * 
         * Create a ReusableBufferedReader
         * First you need to create a ReusableBufferedReader. 
         * Here is an example of how to create a ReusableBufferedReader:
         */
        ReusableBufferedReader reusableBufferedReader =
        	    new ReusableBufferedReader(new char[1024 * 1024]);
        
        /*
         * This example creates a ReusableBufferedReader with a 2 MB char array 
         * (1024 * 1024 chars, 1 char = 2 bytes) as its internal buffer.
         */
        
        /*
         * Set Source
         * When you have created a ReusableBufferedReader you need to set the Reader on it to use as underlying data source. 
         * Here is how you set a source Reader on a ReusableBufferedReader:
         */
        FileReader fileReader = new FileReader("output.txt");
        reusableBufferedReader.setSource(fileReader);
        
        /*
         * The setSource() method actually returns a reference to the ReusableBufferedReader, 
         * so you can actually create a ReusableBufferedReader and set the source in a single instruction:
         */
        reusableBufferedReader =
        	    new ReusableBufferedReader(new char[1024 * 1024])
        	        .setSource(new FileReader("output.txt"));
        
        /*
         * Reusing a ReusableBufferedReader
         * When you are done using the ReusableBufferedReader you need to close it. 
         * Closing it will only close the underlying source Reader. After closing a 
         * ReusableBufferedReader you can use it again, simply by setting a new source Reader on it. 
         * Here is how it looks to reuse a ReusableBufferedReader :
         */
        reusableBufferedReader.setSource(new FileReader("output.txt"));
        System.out.println("Reusable Buffer Data First Read : ");
        int data = reusableBufferedReader.read();
        while(data != -1) {

        	System.out.print((char)data + " ");  
        	data = reusableBufferedReader.read();
        }
        reusableBufferedReader.close();      
        System.out.println("");
        System.out.println("*************************************************");

        System.out.println("Reusable Buffer Data Second Read : ");
        reusableBufferedReader.setSource(new FileReader("output.txt"));
        while(data != -1) {

        	System.out.print((char)data + " ");  
        	data = reusableBufferedReader.read();
        }
        reusableBufferedReader.close();     
        System.out.println("");
        System.out.println("*************************************************");
	}
	
	public class ReusableBufferedReader extends Reader {

	    private char[] buffer = null;
	    private int writeIndex = 0;
	    private int readIndex  = 0;
	    private boolean endOfReaderReached = false;

	    private Reader source = null;


	    public ReusableBufferedReader(char[] buffer) {
	        this.buffer = buffer;
	    }

	    public ReusableBufferedReader setSource(Reader source){
	        this.source = source;
	        this.writeIndex = 0;
	        this.readIndex  = 0;
	        this.endOfReaderReached = false;
	        return this;
	    }

	    @Override
	    public int read() throws IOException {
	        if(endOfReaderReached) {
	            return -1;
	        }

	        if(readIndex == writeIndex) {
	            if(writeIndex == buffer.length) {
	                this.writeIndex = 0;
	                this.readIndex  = 0;
	            }
	            //data should be read into buffer.
	            int bytesRead = readCharsIntoBuffer();
	            while(bytesRead == 0) {
	                //continue until you actually get some bytes !
	                bytesRead = readCharsIntoBuffer();
	            }

	            //if no more data could be read in, return -1;
	            if(bytesRead == -1) {
	                return -1;
	            }
	        }

	        return 65535 & this.buffer[readIndex++];
	    }

	    @Override
	    public int read(char[] dest, int offset, int length) throws IOException {
	        int charsRead = 0;
	        int data = 0;
	        while(data != -1 && charsRead < length){
	            data = read();
	            if(data == -1) {
	                endOfReaderReached = true;
	                if(charsRead == 0){
	                    return -1;
	                }
	                return charsRead;
	            }
	            dest[offset + charsRead] = (char) (65535 & data);
	            charsRead++;
	        }
	        return charsRead;
	    }

	    private int readCharsIntoBuffer() throws IOException {
	        int charsRead = this.source.read(this.buffer, this.writeIndex, this.buffer.length - this.writeIndex);
	        writeIndex += charsRead;
	        return charsRead;
	    }

	    @Override
	    public void close() throws IOException {
	        this.source.close();
	    }
	}
}
