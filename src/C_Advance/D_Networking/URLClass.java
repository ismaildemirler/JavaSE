package C_Advance.D_Networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class URLClass {

	/*
	 * Java URL
	 * 
	 * The Java URL class represents an URL. URL is an acronym for Uniform Resource Locator. 
	 * It points to a resource on the World Wide Web. For example:

			 https://www.microsoft.com/microsoft-365/microsoft-office
			 ------- ----------------- ------------- ----------------
			    |            |               |              |
			    |            |               |              |
			   \_/          \_/             \_/            \_/
			 Protocol    Host Name       Directory         File
			 
			 
	 * A URL contains many information:
	   1) Protocol: In this case, http is the protocol.
	   2) Server name or IP Address: In this case, www.microsoft.com is the server name.
	   3) Port Number: It is an optional attribute. If we write https://www.microsoft.com:80/microsoft-365/, 
	      80 is the port number. If port number is not mentioned in the URL, it returns -1.
	   4) File Name or directory name: for example, index.jsp is the file name.
	 */
	
	public void urlClass() {
		
		/*
		 * Constructors of Java URL class
		 * 
		 * URL(String spec)
		 * Creates an instance of a URL from the String representation.
		 * 
		 * URL(String protocol, String host, int port, String file)
		 * Creates an instance of a URL from the given protocol, host, port number, and file.
		 * 
		 * URL(String protocol, String host, int port, String file, URLStreamHandler handler)
		 * Creates an instance of a URL from the given protocol, host, port number, file, and handler.
		 * 
		 * URL(String protocol, String host, String file)
		 * Creates an instance of a URL from the given protocol name, host name, and file name.
		 * 
		 * URL(URL context, String spec)
		 * Creates an instance of a URL by parsing the given spec within a specified context.
		 * 
		 * URL(URL context, String spec, URLStreamHandler handler)
		 * Creates an instance of a URL by parsing the given spec with the specified handler within a given context.
		 */
		
		/*
		 * Commonly used methods of Java URL class
		 * The java.net.URL class provides many methods. 
		 * The important methods of URL class are given below:
		 * 
		 * public String getProtocol()	
		 * it returns the protocol of the URL.
		 * 
		 * public String getHost()	
		 * it returns the host name of the URL.
		 * 
		 * public String getPort()	
		 * it returns the Port Number of the URL.
		 * 
		 * public String getFile()	
		 * it returns the file name of the URL.
		 * 
		 * public String getAuthority()	
		 * it returns the authority of the URL.
		 * 
		 * public String toString()	
		 * it returns the string representation of the URL.
		 * 
		 * public String getQuery()	
		 * it returns the query string of the URL.
		 * 
		 * public String getDefaultPort()	
		 * it returns the default port of the URL.
		 * 
		 * public URLConnection openConnection()	
		 * it returns the instance of URLConnection i.e. associated with this URL.
		 * 
		 * public boolean equals(Object obj)	
		 * it compares the URL with the given object.
		 * 
		 * public Object getContent()	
		 * it returns the content of the URL.
		 * 
		 * public String getRef()	
		 * it returns the anchor or reference of the URL.
		 * 
		 * public URI toURI()	
		 * it returns a URI of the URL.
		 */
		
		try {
			URL url = new URL("https://www.microsoft.com/tr-tr/microsoft-365/microsoft-office?rtc=1");
			System.out.println("Protocol: " + url.getProtocol());  
			System.out.println("Host Name: " + url.getHost());  
			System.out.println("Port Number: " + url.getPort());  
			System.out.println("File Name: " + url.getFile());			
		} catch(Exception e){
			System.out.println(e);
		}  
		    
		System.out.println("*****************************************************");
		
		URL url = null;
		try {
			url = new URL("https://www.google.com/search?q=java+programming&oq=java+programming&sourceid=chrome&ie=UTF-8");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	    
		System.out.println("Protocol: " + url.getProtocol());    
		System.out.println("Host Name: " + url.getHost());    
		System.out.println("Port Number: " + url.getPort());    
		System.out.println("Default Port Number: " + url.getDefaultPort());    
		System.out.println("Query String: " + url.getQuery());    
		System.out.println("Path: " + url.getPath());    
		System.out.println("File: " + url.getFile());  
		
		System.out.println("*****************************************************");  
	}
}
