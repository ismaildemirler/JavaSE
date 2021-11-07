package C_Advance.C_JavaInputOutput;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileClass {

	/*
	 * Java File Class
	 * The File class is an abstract representation of file and directory pathname. 
	 * A pathname can be either absolute or relative. The File class have several methods 
	 * for working with directories and files such as creating new directories or files, 
	 * deleting and renaming directories or files, listing the contents of a directory etc.
	 * Files are a common source or destination of data in Java applications. Therefore this 
	 * text will give you a brief overview of working with files in Java. It is not the 
	 * intention to explain every technique in detail here, but rather to provide you with 
	 * enough knowledge to decide on a file access method. Separate pages will describe each 
	 * of these methods or classes in more detail, including examples of their usage etc.
	 * 
	 * Java IO File Classes
	 * 
	 * The Java IO API contains the following classes which are relevant to working with files in Java:
	   - File
	   - RandomAccessFile
	   - FileInputStream
	   - FileReader
	   - FileOutputStream
	   - FileWriter
	 */
	
	/*
	 * Reading Files via Java IO
	 * If you need to read a file from one end to the other you can use a FileInputStream or a FileReader 
	 * depending on whether you want to read the file as binary or textual data. These two classes lets you 
	 * read a file one byte or character at a time from the start to the end of the file, or read the bytes 
	 * into an array of byte or char, again from start towards the end of the file. You don't have to read 
	 * the whole file, but you can only read bytes and chars in the sequence they are stored in the file.
	 * If you need to jump around the file and read only parts of it from here and there, you can use a RandomAccessFile.
	 * 
	 * Writing File via Java IO
	 * If you need to write a file from one end to the other you can use a FileOutputStream or a FileWriter 
	 * depending on whether you need to write binary data or characters. You can write a byte or character 
	 * at a time from the beginning to the end of the file, or write arrays of byte and char. Data is stored 
	 * sequentially in the file in the order they are written. If you need to skip around a file and write 
	 * to it in various places, for instance appending to the end of the file, you can use a RandomAccessFile.
	 * 
	 * Random Access to Files via Java IO
	 * As I have already mentioned, you can get random access to files with Java IO via the RandomAccessFile class.
	 * Random access doesn't mean that you read or write from truly random places. It just means that you can skip 
	 * around the file and read from or write to it at the same time in any way you want. This is what is meant by 
	 * "random" - that the next byte read is not determined by the previous byte read. No particular access sequence 
	 * is enforced. You can access the bytes in the file "at random" - arbitrarily. This makes it possible to overwrite 
	 * parts of an existing file, to append to it, delete from it, and of course read from the file from wherever you need to read from it.
	 * 
	 * File and Directory Info Access
	 * Sometimes you may need access to information about a file rather than its content. For instance, if you need to 
	 * know the file size or the file attributes of a file. The same may be true for a directory. For instance, you may 
	 * want to get a list of all files in a given directory. Both file and directory information is available via the File class.
	 */
	
	public void file() throws IOException {
		
		/*
		 * The Java File class, java.io.File in the Java IO API gives you access to the underlying file system. 
		 * 
		 * Using the Java File class you can:
		   - Check if a file or directory exists.
		   - Create a directory if it does not exist.
		   - Read the length of a file.
	       - Rename or move a file.
		   - Delete a file.
		   - Check if path is file or directory.
		   - Read list of files in a directory.
		   - This Java File tutorial will tell you more about how.

		 * Note: The Java File class only gives you access to the file and directory meta data. 
		 * If you need to read or write the content of files, you should do so using either FileInputStream, 
		 * FileOutputStream or RandomAccessFile.
		 * 
		 * Note: If you are want to Java NIO (Java's non-blocking IO API) you will have to use the 
		 * java.nio.FileChannel class instead. Both Java File and FileChannel works, but in case 
		 * you want a pure Java NIO solution use the Java NIO FileChannel class.
		 */
		
		/*
		 * Fields
		 * 
		 * static String pathSeparator	
		 * It is system-dependent path-separator character, represented as a string for convenience.
		 * 
		 * static char pathSeparatorChar	
		 * It is system-dependent path-separator character.
		 * 
		 * static String separator	
		 * It is system-dependent default name-separator character, represented as a string for convenience.
		 * 
		 * static char separatorChar	
		 * It is system-dependent default name-separator character.
		 */
		
		/*
		 * Constructors
		 * 
		 * File(File parent, String child)	
		 * It creates a new File instance from a parent abstract pathname and a child pathname string.
		 * 
		 * File(String pathname)	
		 * It creates a new File instance by converting the given pathname string into an abstract pathname.
		 * 
		 * File(String parent, String child)	
		 * It creates a new File instance from a parent pathname string and a child pathname string.
		 * 
		 * File(URI uri)	
		 * It creates a new File instance by converting the given file: URI into an abstract pathname.
		 */
		
		/*
		 * static File createTempFile(String prefix, String suffix)	
		 * It creates an empty file in the default temporary-file directory, using the given prefix and suffix to generate its name.
		 * 
		 * boolean createNewFile()	
		 * It atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
		 * 
		 * boolean canWrite()	
		 * It tests whether the application can modify the file denoted by this abstract pathname.String[]
		 * 
		 * boolean canExecute()	
		 * It tests whether the application can execute the file denoted by this abstract pathname.
		 * 
		 * boolean canRead()	
		 * It tests whether the application can read the file denoted by this abstract pathname.
		 * 
		 * boolean isAbsolute()	
		 * It tests whether this abstract pathname is absolute.
		 * 
		 * boolean isDirectory()	
		 * It tests whether the file denoted by this abstract pathname is a directory.
		 * 
		 * boolean isFile()	
		 * It tests whether the file denoted by this abstract pathname is a normal file.
		 * 
		 * String getName()	
		 * It returns the name of the file or directory denoted by this abstract pathname.
		 * 
		 * String getParent()	
		 * It returns the pathname string of this abstract pathname's parent, or null if this pathname does not name a parent directory.
		 * 
		 * Path toPath()	
		 * It returns a java.nio.file.Path object constructed from the this abstract path.
		 * 
		 * URI toURI()	
		 * It constructs a file: URI that represents this abstract pathname.
		 * 
		 * File[] listFiles()	
		 * It returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname
		 * 
		 * long	getFreeSpace()	
		 * It returns the number of unallocated bytes in the partition named by this abstract path name.
		 * 
		 * String[]	list(FilenameFilter filter)	
		 * It returns an array of strings naming the files and directories in the directory denoted by this abstract pathname that satisfy the specified filter.
		 * 
		 * boolean mkdir()	
		 * It creates the directory named by this abstract pathname.
		 */
		
		/*
		 * Create a File
		 * Before you can do anything with the file system or File class, you must create a Java File instance. 
		 * Here is an example of creating a Java File instance:
		 */
		File file = new File("output.txt");
		
		/*
		 * The Java File constructor takes as parameter the file path in the underlying file system of the file 
		 * you want the File instance to point to. Note, that the file or directory path does not actually have 
		 * to reference an existing file or directory. If it doesn't, you won't get an exception from the File 
		 * constructor. This behavior is useful when we want to check if a file exists, or we want to create a new file.
		 * The Java File class also has a few other constructors you can use to instantiate File instances in different ways.
		 */
		
		/*
		 * Check if File or Directory Exists
		 * You can check if a file referenced by a Java File object exists using the File exists() method. 
		 * Here is an example of checking if a file exists:
		 */
		file = new File("output.txt");
		boolean fileExists = file.exists();
		System.out.println("output.txt is exist ? " + fileExists);
		System.out.println("*************************************");
		
		/*
		 * The above code also works for directories. The only change you need to make to check if a directory 
		 * exists is to pass a file system path to a directory to the Java File constructor, instead of a path 
		 * to a file. Here is an example of checking if a directory exists:
		 */		
		file = new File("c:\\data");
		fileExists = file.exists();
		System.out.println("c:\\data directory is exist ? " + fileExists);
		System.out.println("*************************************");
		
		/*
		 * Create a Directory if it Does Not Exist
		 * You can use the Java File class to create directories if they don't already exists. 
		 * The File class contains the method mkdir() and mkdirs() for that purpose.
		 * The mkdir() method creates a single directory if it does not already exist. 
		 * Here is an example of creating a single directory via the Java File class:
		 */
		file = new File("c:\\users\\ismail\\newdir");
		boolean dirCreated = file.mkdir();
		
		/*
		 * Provided that the directory "c:\\users\\ismail" already exists, the above code will create 
		 * a subdirectory of jakobjenkov named newdir. The mkdir() returns true if the directory 
		 * was created, and false if not. The mkdirs() will create all directories that are missing 
		 * in the path the File object represents. Here is an example of creating multiple directories 
		 * via the Java File class:
		 */
		file = new File("c:\\users\\ismail\\newdir");
		dirCreated = file.mkdirs();
		
		/*
		 * Provided that the C drive exists, this example will create all the directories in the path 
		 * c:\\users\\ismail\\newdir. The mkdirs() method will return true if all the directories were created, and false if not.
		 */
		
		
		/*
		 * File Length
		 * The Java File class enables you to read the length in bytes of a file. To read the length of a file, 
		 * call the File length() method. Here is an example of reading the length of a file via the Java File length() method:
		 */
		file = new File("output.txt");
		long length = file.length();
		System.out.println("Length of output.txt : " + length);
		System.out.println("**************************************");
		
		
		/*
		 * Rename or Move File or Directory
		 * To rename (or move) a file, call the method renameTo() on the File class. Here is a simple example:
		 */
		file = new File("text.txt");
		boolean success = file.renameTo(new File("new-file.txt"));
		
		/*
		 * As briefly mentioned earlier, the renameTo() method can also be used to move a file to a different directory. 
		 * The new file name passed to the renameTo() method does not have to be in the same directory as the file was 
		 * already residing in. The renameTo() method returns boolean (true or false), indicating whether the renaming 
		 * was successful. Renaming of moving a file may fail for various reasons, like the file being open, wrong 
		 * file permissions etc. The Java File renameTo() method also works for directories, by the way. Just pass a 
		 * path to a directory to the File constructor, instead of a path to a file.
		 */
		
		
		/*
		 * Delete File or Directory
		 * To delete a file call the Java File delete() method. Here is a simple example:
		 */
		file = new File("bufferedoutputstream.txt");
		success = file.delete();
		
		/*
		 * The delete() method returns boolean (true or false), indicating whether the deletion was successful. 
		 * Deleting a file may fail for various reasons, like the file being open, wrong file permissions etc.
		 * The Java File delete() method also works for directories, meaning you can also delete directories with it.
		 */
		
		
		/*
		 * Delete Directory and Subdirectories Recursively
		 * The Java File delete() method can only delete a directory if the directory is empty. To delete a directory 
		 * that contains files and subdirectories you must iterate through the directory and delete all files and 
		 * subdirectories first, before you can delete the root directory. This iteration has to be carried out 
		 * recursively, so you also delete all content of subdirectories and their subdirectories. Otherwise the 
		 * deletion of the root directory will fail. Here is a Java method that can delete a directory and all 
		 * its subdirectories and their files recursively:
		 */
		boolean isDeleted = deleteDir(file);
		
		/*
		 * Check if Path is File or Directory
		 * As mentioned several times earlier in this Java File tutorial, a File object can point to both a file or 
		 * a directory. You can check if a File object points to a file or directory, by calling its isDirectory() 
		 * method. This method returns true if the File points to a directory, and false if the File points to a file. 
		 * Here is a simple example:
		 */
		file = new File("c:\\data");
		boolean isDirectory = file.isDirectory();
		
		
		/*
		 * Example 1
		 */
		File file1 = new File("javaFile123.txt");  
        if (file1.createNewFile()) {  
            System.out.println("New File is created!");  
        } else {  
            System.out.println("javaFile123 File already exists.");  
        }  
        
        System.out.println("*************************************");
        
        /*
         * Example 2
         */
        String path = "";  
        boolean bool = false;  
        
        // creating  new files  
        File file2  = new File("testFile1.txt");  
        file2.createNewFile();  
        System.out.println(file2);  
        
        // creating new canonical from file object  
        File file3 = file2.getCanonicalFile();  
        // returns true if the file exists  
        
        System.out.println(file3);  
        bool = file3.exists();  
        // returns absolute pathname  
        path = file3.getAbsolutePath();  
        System.out.println(bool);  
        
        // if file exists  
        if (bool) {  
            // prints  
            System.out.print(path + " Exists? " + bool);  
        } 
        System.out.println("");
        System.out.println("*************************************");
        
        /*
         * Example 3
         * 
         * Read List of Files in Directory
         * You can obtain a list of all the files in a directory by calling either the Java File list() method 
         * or the listFiles() method. The list() method returns an array of String's with the file and / 
         * or directory names of directory the File object points to. The listFiles() returns an array 
         * of File objects representing the files and / or directories in the directory the File points to.
         * Here is an example of listing all files in a directory via the Java File list() and listFiles() methods:
         */
        File f = new File("/Users/ismail/Documents");  
        String filenames[] = f.list();  
        for(String filename : filenames){  
            System.out.println(filename);  
        }  
        System.out.println("*************************************");
        
        /*
         * Example 4
         */
        File dir = new File("/Users/ismail/Documents");  
        File files[] = dir.listFiles();  
        for(File item : files){  
            System.out.println(item.getName() + " Can Write: " + item.canWrite() + 
            		" Is Hidden: " + item.isHidden() + " Length: " + item.length() + " bytes");  
        }        
        System.out.println("*************************************");
        
        
	}

	public void fileDescriptor() throws IOException {
		
		/*
		 * Java FileDescriptor
		 * 
		 * FileDescriptor class serves as an handle to the underlying machine-specific structure representing an open file, 
		 * an open socket, or another source or sink of bytes. The handle can be err, in or out. The FileDescriptor class 
		 * is used to create a FileInputStream or FileOutputStream to contain it.
		 */
		
		/*
		 * Fields
		 * 
		 * static FileDescriptor err	
		 * A handle to the standard error stream.
		 * 
		 * static FileDescriptor in	
		 * A handle to the standard input stream.
		 * 
		 * static FileDescriptor out	
		 * A handle to the standard output stream.
		 */
		
		/*
		 * Constructors
		 * 
		 * FileDescriptor()	
		 * Constructs an (invalid) FileDescriptor object
		 */
		
		/*
		 * Methods
		 * 
		 * void	sync()	
		 * It force all system buffers to synchronize with the underlying device.
		 * 
		 * boolean valid()	
		 * It tests if this file descriptor object is valid.
		 */
		
		FileDescriptor fd = null;  
        byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 };  
        FileOutputStream fos = new FileOutputStream("Record.txt");  
        FileInputStream fis = new FileInputStream("Record.txt");  
        fd = fos.getFD();  
        fos.write(b);  
        fos.flush();  
        fd.sync();// confirms data to be written to the disk  
        int value = 0;  
        // for every available bytes  
        while ((value = fis.read()) != -1) {  
            char c = (char) value;// converts bytes to char  
            System.out.print(c);  
        }  
        System.out.println("\nSync() successfully executed!!");   
        System.out.println("*************************************");
	}

	public boolean deleteDir(File dir){
	    File[] files = dir.listFiles();
	    if(files != null){
	        for(File file : files){
	            if(file.isDirectory()){
	                deleteDir(file);
	            } else {
	                file.delete();
	            }
	        }
	    }
	    return dir.delete();
	}
}
