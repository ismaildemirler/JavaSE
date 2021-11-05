package C_Advance.C_JavaInputOutput.B_InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputStreamClass {

	/*
	 * BufferedInputStream Class in Java
	 */
	
	/*
	 * Java BufferedInputStream class is used to read information from stream. 
	 * It internally uses buffer mechanism to make the performance fast.
	 * 
	 * The important points about BufferedInputStream are:
	   - When the bytes from the stream are skipped or read, the internal buffer 
	     automatically refilled from the contained input stream, many bytes at a time.
	   - When a BufferedInputStream is created, an internal buffer array is created.
	   
	 * The Java BufferedInputStream class, java.io.BufferedInputStream, 
	 * provides transparent reading of chunks of bytes and buffering for a Java InputStream, 
	 * including any subclasses of InputStream. Reading larger chunks of bytes and buffering 
	 * them can speed up IO quite a bit. Rather than read one byte at a time from the network 
	 * or disk, the BufferedInputStream reads a larger block at a time into an internal buffer. 
	 * When you read a byte from the Java BufferedInputStream you are therefore reading it from 
	 * its internal buffer. When the buffer is fully read, the BufferedInputStream reads another 
	 * larger block of data into the buffer. This is typically much faster than reading a single 
	 * byte at a time from an InputStream, especially for disk access and larger data amounts.
	 */
	
	public void bufferedInputStream() {
		
		/*
		 * Java BufferedInputStream class constructors
		 */
		
		/*
		 * BufferedInputStream(InputStream IS)
		 * It creates the BufferedInputStream and saves it argument, 
		 * the input stream IS, for later use.
		 * To add buffering to an InputStream simply wrap it in a BufferedInputStream. 
		 * Here is how that looks:
		 */
		try {
			InputStream is = new BufferedInputStream(new FileInputStream("text.txt"));
			InputStream bs = new BufferedInputStream(is);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * As you can see, using a BufferedInputStream to add buffering to a non-buffered 
		 * InputStream is pretty easy. The BufferedInputStream creates a byte array internally, 
		 * and attempts to fill the array by calling the InputStream.read(byte[]) methods on the underlying InputStream.
		 */
		
		/*
		 * BufferedInputStream(InputStream IS, int size)
		 * It creates the BufferedInputStream with a specified buffer size and 
		 * saves it argument, the input stream IS, for later use.
		 * You can set the buffer size to use internally by the Java BufferedInputStream. 
		 * You provide the buffer size as a parameter to the BufferedInputStream constructor, like this:
		 */
		try {
			int bufferSize = 8 * 1024;
			InputStream is = new BufferedInputStream(new FileInputStream("text.txt"));
			InputStream bs = new BufferedInputStream(is, bufferSize);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * This example sets the internal buffer used by the BufferedInputStream to 8 KB. 
		 * It is best to use buffer sizes that are multiples of 1024 bytes. 
		 * That works best with most built-in buffering in hard disks etc.
		 * Except for adding buffering to your input streams, BufferedInputStream behaves exactly like an InputStream.
		 */
		
		/*
		 * Optimal Buffer Size for a BufferedInputStream
		 * You should make some experiments with different buffer sizes to find out which 
		 * buffer size seems to give you the best performance on your concrete hardware. 
		 * The optimal buffer size may depend on whether you are using the Java BufferedInputStream 
		 * with a disk or network InputStream. With both disk and network streams, the optimal buffer 
		 * size may also depend on the concrete hardware in the computer. If the hard disk is anyways 
		 * reading a minimum of 4KB at a time, it's stupid to use less than a 4KB buffer. It is also 
		 * better to then use a buffer size that is a multiple of 4KB. For instance, using 6KB would be stupid too.
		 * Even if your disk reads blocks of e.g. 4KB at a time, it can still be a good idea to use 
		 * a buffer that is larger than this. A disk is good at reading data sequentially - meaning 
		 * it is good at reading multiple blocks that are located after each other. 
		 * Thus, using a 16KB buffer, or a 64KB buffer (or even larger) with a BufferedInputStream may 
		 * still give you a better performance than using just a 4KB buffer.
		 * Also keep in mind that some hard disks have a read cache of some megabytes. 
		 * If your hard disk anyways reads, say 64KB, of your file into its internal cache, 
		 * you might as well get all of that data into your BufferedInputStream using one read operation, 
		 * instead of using multiple read operations. Multiple read operations will be slower, 
		 * and you risk that the hard disk's read cache gets erased between read operations, 
		 * causing the hard disk to re-read that block into the cache.
		 * To find the optimal BufferedInputStream buffer size, find out the block size your hard disk reads in, 
		 * and possibly also its cache size, and make the buffer a multiple of that size. 
		 * You will definitely have to experiment to find the optimal buffer size. 
		 * Do so by measuring read speeds with different buffer sizes.
		 */
		
		/*
		 * void mark(int readlimit)
		 * It sees the general contract of the mark method for the input stream.
		 * 
		 * void reset()
		 * It repositions the stream at a position the mark method was last called on this input stream.
		 * 
		 * long skip(long x)
		 * It skips over and discards x bytes of data from the input stream.
		 * 
		 * boolean markSupported()
		 * It tests for the input stream to support the mark and reset methods.
		 */
		
		/*
		 * mark() and reset()
		 * An interesting aspect to note about the BufferedInputStream is that is supports 
		 * the mark() and reset() methods inherited from the InputStream. 
		 * Not all InputStream subclasses support these methods. In general you can call 
		 * the markSupported() method to find out if mark() and reset() are supported on 
		 * a given InputStream or not, but the BufferedInputStream supports them.
		 */
		
		/*
		 * Closing a BufferedInputStream
		 * When you are finished reading data from a Java BufferedInputStream you must close it. 
		 * You close a BufferedInputStream by calling the close() method inherited from InputStream. 
		 * Closing a Java BufferedInputStream will also close the InputStream from which the 
		 * BufferedInputStream is reading and buffering data. Here is an example of opening a Java BufferedInputStream, 
		 * reading all data from it, and then closing it:
		 */
		
		try {
			InputStream is = new BufferedInputStream(new FileInputStream("text.txt"));
			InputStream bs = new BufferedInputStream(is);
			int data = bs.read();
			while(data != -1) {
			  data = bs.read();
			}
			bs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Notice how the while loop continues until a -1 value is read from the BufferedInputStream read() method. 
		 * After that, the while loop exits, and the BufferedInputStream close() method is called. 
		 * The above code is not 100% robust. If an exception is thrown while reading data from the BufferedInputStream, 
		 * the close() method is never called. This piece of code looks okay at first glance. 
		 * But what happens if an exception is thrown from inside the doSomethingWithData() method? 
		 * That's right! The InputStream is never closed! To avoid this you can rewrite the code to this:
		 */
		
		InputStream input = null;

		try{
		  input = new FileInputStream("text.txt");

		  int data = input.read();
		  System.out.println("Buffered Input Stream : ");
		  while(data != -1) {
		      //do something with data...
			  //doSomethingWithData(data);

		      data = input.read();
		      System.out.print(data + " - ");
		  }
		}catch(IOException e){
		  //do something with e... log, perhaps rethrow etc.
		} finally {
		  if(input != null)
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("*******************************************************");
		
		/*
		 * Notice how the InputStream is now closed inside a finally clause. 
		 * No matter what happens inside the try-block, the finally clause will be executed. 
		 * Hence the InputStream will always be closed. But what happens if close() throws an exception? 
		 * Say the stream was already closed? Well, to catch that situation you will 
		 * have to wrap the call to close() in a try-catch block too. The code to properly handle the iteration 
		 * of an InputStream (or OutputStream for that matter), can bet quite ugly as you can see, once you get 
		 * the correct exception handling in there too. This ugly exception handling code isn't particularly 
		 * nice to have spread throughout your code, repeated again and again. What if someone who is in a 
		 * hurry cuts a corner and skips the exception handling? Furthermore, imagine that an exception is 
		 * thrown first from doSomethingWithData(). The first catch clause will catch that exception and 
		 * the finally clause will then try to close the InputStream. But, what happens if an exception is 
		 * also thrown from the input.close() method? Which of the two exceptions should be propagated up the call stack?
		 * Luckily, there is a way around this problem. The solutions is called "Exception Handling Templates". 
		 * Create an exception handling template that properly closes your stream after use. 
		 * This template is written once, and reused throughout your code. Nice and simple.
		 */
		try {
			new InputStreamProcessingTemplate1(){
			    public void doProcess(InputStream input) throws IOException{
			        int inChar = input.read();
			        while(inChar != -1){
			            //do something with the chars...
			        	inChar = input.read();
			        }
			    }
			}.process("text.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * This example creates an anonymous subclass of the InputStreamProcessingTemplate class, 
		 * instantiates an instance of the subclass, and calls its process() method.
		 * This is a lot simpler to write, and easier to read. Only the domain logic is visible in the code. 
		 * The compiler will check that you have extended the InputStreamProcessingTemplate correctly. 
		 * You will typically also get more help from your IDE's code completion when writing it, 
		 * because the IDE will recognize both the doProcess() and process() methods.
		 * You can now reuse the InputStreamProcessingTemplate in any place in your code where you need 
		 * to process a file input stream. You can easily modify the template to work for all input streams and not just files.
		 */
		
		/*
		 * Using Interfaces Instead of Subclass
		 * 
		 * Notice the extra parameter in the template's process() method. This is the InputStreamProcessor, 
		 * which is called from inside the try block (processor.process(input)). 
		 * Using this template would look like this:
		 */
		
		try {
			new InputStreamProcessingTemplate2()
			    .process("text.txt", new InputStreamProcessor() {
					@Override
					public void process(InputStream input) throws IOException {
						int inChar = input.read();
						while(inChar != -1) {
							//do something with the chars...
							inChar = input.read();
						}
					}			    	
			    });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * It doesn't look much different from the previous usage, except the call to the 3
		 * InputStreamProcessingTemplate.process() method is now closer to the top of the code. 
		 * This may be easier to read. Exception handling templates are a simple yet powerful mechanism 
		 * that can increase the quality and readability of your code. It also increases your productivity, 
		 * since you have much less code to write, and less to worry about. Exceptions are handled by the templates. 
		 * And, if you need to improve the exception handling later in the development process, 
		 * you only have a single spot to change it in: The exception handling template.
		 * The Template Method design pattern can be used for other purposes than exception handling. 
		 * The iteration of the input stream could also have been put into a template. 
		 * The iteration of a ResultSet in JDBC could be put into a template. 
		 * The correct execution of a transaction in JDBC could be put into a template. The possibilities are endless.
		 */
		
		/*
		 * Reusable BufferedInputStream
		 * One of the weaknesses of the standard Java BufferedInputStream is that it can only be used once. 
		 * Once you close it, it's no longer usable. If you need to read a lot of files, or network streams, 
		 * you have to create a new BufferedInputStream for each file or network stream you want to read. 
		 * This means that you are creating a new object, and more importantly, a new byte array which is 
		 * used as buffer inside the BufferedInputStream. This can put pressure on the Java garbage collector, 
		 * if the number of files or streams read is high, and if they are read quickly after each other.
		 * An alternative is to create a reusable BufferedInputStream where you can replace the underlying 
		 * source InputStream, so the BufferedInputStream and its internal byte array buffer can be reused. 
		 * To save you the trouble, I have created such a ReusableBufferedInputStream, and included the code 
		 * for it further down this tutorial. First, I want to show you how using this ReusableBufferedInputStream looks.
		 * 
		 * Create a ReusableBufferedInputStream
		 * First you need to create a ReusableBufferedInputStream. 
		 * Here is an example of how to create a ReusableBufferedInputStream:
		 */
		ReusableBufferedInputStream reusableBufferedInputStream =
			    new ReusableBufferedInputStream(new byte[1024 * 1024]);
		
		/*
		 * This example creates a ReusableBufferedInputStream with a 1 MB byte array as its internal buffer.
		 * 
		 * Set Source
		 * When you have created a ReusableBufferedInputStream you need to set the InputStream 
		 * on it to use as underlying data source. 
		 * Here is how you set a source InputStream on a ReusableBufferedInputStream :
		 */
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream("text.txt");
			reusableBufferedInputStream.setSource(inputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * The setSource() method actually returns a reference to the ReusableBufferedInputStream, 
		 * so you can actually create a ReusableBufferedInputStream and set the source in a single instruction:
		 */
		try {
			reusableBufferedInputStream =
				    new ReusableBufferedInputStream(new byte[1024 * 1024])
				        .setSource(new FileInputStream("text.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Reusing a ReusableBufferedInputStream
		 * When you are done using the ReusableBufferedInputStream you need to close it. 
		 * Closing it will only close the underlying source InputStream. After closing a 
		 * ReusableBufferedInputStream you can use it again, simply by setting a new source InputStream on it. 
		 * Here is how it looks to reuse a ReusableBufferedInputStream :
		 */
		
		try {
			reusableBufferedInputStream.setSource(new FileInputStream("text.txt"));
			reusableBufferedInputStream.close();
			reusableBufferedInputStream.setSource(new FileInputStream("text.txt"));

			//read data from ReusableBufferedInputStream
			reusableBufferedInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//read data from ReusableBufferedInputStream

		
	}
	
	public abstract class InputStreamProcessingTemplate1 {

	    public void process(String fileName) throws Exception{
	        IOException processException = null;
	        InputStream input = null;
	        try{
	            input = new FileInputStream(fileName);

	            doProcess(input);
	        } catch (IOException e) {
	            processException = e;
	        } finally {
	           if(input != null){
	              try {
	                 input.close();
	              } catch(IOException e){
	                 if(processException != null){
	                    throw new Exception(processException);
	                 } else {
	                    throw new Exception(e);
	                 }
	              }
	           }
	           if(processException != null){
	              throw new Exception(processException);
	           }
	        }
	    }

	    //override this method in a subclass, to process the stream.
	    public abstract void doProcess(InputStream input) throws IOException;
	}

	public interface InputStreamProcessor {
	    public void process(InputStream input) throws IOException;
	}

	public class InputStreamProcessingTemplate2 {

	    public void process(String fileName, InputStreamProcessor processor) throws Exception{
	        IOException processException = null;
	        InputStream input = null;
	        try{
	            input = new FileInputStream(fileName);

	            processor.process(input);
	        } catch (IOException e) {
	            processException = e;
	        } finally {
	           if(input != null){
	              try {
	                 input.close();
	              } catch(IOException e){
	                 if(processException != null){
	                    throw new Exception(processException);
	                 } else {
	                    throw new Exception(e);
	                 }
	              }
	           }
	           if(processException != null){
	              throw new Exception(processException);
	        }
	    }
	}

	}

	public class ReusableBufferedInputStream extends InputStream {

	    private byte[]      buffer = null;
	    private int         writeIndex = 0;
	    private int         readIndex  = 0;
	    private InputStream source = null;

	    public ReusableBufferedInputStream(byte[] buffer) {
	        this.buffer = buffer;
	    }

	    public ReusableBufferedInputStream setSource(InputStream source){
	        this.source = source;
	        this.writeIndex = 0;
	        this.readIndex  = 0;
	        return this;
	    }

	    @Override
	    public int read() throws IOException {

	        if(readIndex == writeIndex) {
	            if(writeIndex == buffer.length) {
	                writeIndex = 0;
	                readIndex  = 0;
	            }
	            //data should be read into buffer.
	            int bytesRead = readBytesIntoBuffer();
	            while(bytesRead == 0) {
	                //continue until you actually get some bytes !
	                bytesRead = readBytesIntoBuffer();
	            }

	            //if no more data could be read in, return -1;
	            if(bytesRead == -1) {
	                return -1;
	            }
	        }

	        return 255 & this.buffer[readIndex++];
	    }



	    private int readBytesIntoBuffer() throws IOException {
	        int bytesRead = this.source.read(this.buffer, this.writeIndex, this.buffer.length - this.writeIndex);
	        writeIndex += bytesRead;
	        return bytesRead;
	    }

	    @Override
	    public void close() throws IOException {
	        this.source.close();
	    }
	}
}
