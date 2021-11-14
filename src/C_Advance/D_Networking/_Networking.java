package C_Advance.D_Networking;

public class _Networking {

	/*
	 * Java Networking
	 * 
	 * Java Networking is a concept of connecting two or more computing devices together so that we can share resources.
	 * Java socket programming provides facility to share data between different computing devices.
	 * 
	 * Advantage of Java Networking
	   1) Sharing resources
	   2) Centralize software management
	   
	 * The java.net package supports two protocols,
	   1) TCP: Transmission Control Protocol provides reliable communication between the sender and receiver. 
	      TCP is used along with the Internet Protocol referred as TCP/IP.
	   2) UDP: User Datagram Protocol provides a connection-less protocol service by allowing packet of data 
	      to be transferred along two or more nodes
	 */
	
	/*
	 * Java Networking Terminology
	 * The widely used Java networking terminologies are given below:
	 
	   1) IP Address
       2) Protocol
	   3) Port Number
	   4) MAC Address
	   5) Connection-oriented and connection-less protocol
	   6) Socket
	 */
	
	/*
	 * IP Address
	 * IP address is a unique number assigned to a node of a network e.g. 192.168.0.1 . It is composed of octets 
	 * that range from 0 to 255. It is a logical address that can be changed.
	 */
	
	/*
	 * Protocol
	 * 
	 * A protocol is a set of rules basically that is followed for communication. For example:
	   - TCP
	   - FTP
	   - Telnet
	   - SMTP
	   - POP etc.
	 */
	
	/*
	 * Port Number
	 * The port number is used to uniquely identify different applications. It acts as a communication endpoint 
	 * between applications. The port number is associated with the IP address for communication between two applications.
	 */
	
	/*
	 * MAC Address
	 * MAC (Media Access Control) address is a unique identifier of NIC (Network Interface Controller). 
	 * A network node can have multiple NIC but each with unique MAC address. For example, an ethernet 
	 * card may have a MAC address of 00:0d:83::b1:c0:8e.
	 */
	
	/*
	 * Connection-oriented and connection-less protocol
	 * In connection-oriented protocol, acknowledgement is sent by the receiver. So it is reliable but slow. 
	 * The example of connection-oriented protocol is TCP. But, in connection-less protocol, acknowledgement 
	 * is not sent by the receiver. So it is not reliable but fast. The example of connection-less protocol is UDP.
	 */
	
	/*
	 * Socket
	 * A socket is an endpoint between two way communications.
	 */
	
	/*
	 * java.net package
	 * The java.net package can be divided into two sections:
	   1) A Low-Level API: It deals with the abstractions of addresses i.e. networking identifiers, Sockets i.e. 
	      bidirectional data communication mechanism and Interfaces i.e. network interfaces.
	   2) A High Level API: It deals with the abstraction of URIs i.e. Universal Resource Identifier, URLs i.e. 
	      Universal Resource Locator, and Connections i.e. connections to the resource pointed by URLs.

	 * The java.net package provides many classes to deal with networking applications in Java. 
	 * 
	 * A list of these classes is given below:
	   - Authenticator
	   - CacheRequest
	   - CacheResponse
	   - ContentHandler
	   - CookieHandler
	   - CookieManager
 	   - DatagramPacket
	   - DatagramSocket
	   - DatagramSocketImpl
	   - InterfaceAddress
	   - JarURLConnection
	   - MulticastSocket
	   - InetSocketAddress
	   - InetAddress
	   - Inet4Address
	   - Inet6Address
	   - IDN
	   - HttpURLConnection
	   - HttpCookie
	   - NetPermission
	   - NetworkInterface
	   - PasswordAuthentication
	   - Proxy
	   - ProxySelector
	   - ResponseCache
	   - SecureCacheResponse
	   - ServerSocket
	   - Socket
	   - SocketAddress
	   - SocketImpl
	   - SocketPermission
	   - StandardSocketOptions
	   - URI
	   - URL
	   - URLClassLoader
	   - URLConnection
	   - URLDecoder
	   - URLEncoder
	   - URLStreamHandler

	 * List of interfaces available in java.net package:
	   - ContentHandlerFactory
	   - CookiePolicy
	   - CookieStore
	   - DatagramSocketImplFactory
	   - FileNameMap
	   - SocketOption<T>
	   - SocketOptions
	   - SocketImplFactory
	   - URLStreamHandlerFactory
	   - ProtocolFamily
	 */
}
