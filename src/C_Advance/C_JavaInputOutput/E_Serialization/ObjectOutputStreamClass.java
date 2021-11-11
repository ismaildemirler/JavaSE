package C_Advance.C_JavaInputOutput.E_Serialization;

public class ObjectOutputStreamClass {

	/*
	 * ObjectOutputStream class
	 * The ObjectOutputStream class is used to write primitive data types, and Java objects to an OutputStream. 
	 * Only objects that support the java.io.Serializable interface can be written to streams.
	 */
	
	/*
	 * Constructor
	 * 
	 * 1) public ObjectOutputStream(OutputStream out) throws IOException {}	
	 * It creates an ObjectOutputStream that writes to the specified OutputStream.
	 */
	
	/*
	 * Methods
	 * 
	 * 1) public final void writeObject(Object obj) throws IOException {}	
	 * It writes the specified object to the ObjectOutputStream.
	 * 
	 * 2) public void flush() throws IOException {}	
	 * It flushes the current output stream.
	 * 
	 * 3) public void close() throws IOException {}	
	 * It closes the current output stream.
	 */
}
