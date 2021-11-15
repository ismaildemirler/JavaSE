package C_Advance.D_Networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressClass {

	/*
	 * Java InetAddress class
	 * 
	 * Java InetAddress class represents an IP address. The java.net.InetAddress class provides methods to get 
	 * the IP of any host name for example www.javatpoint.com, www.google.com, www.facebook.com, etc.
	 * An IP address is represented by 32-bit or 128-bit unsigned number. An instance of InetAddress represents 
	 * the IP address with its corresponding host name. There are two types of addresses: Unicast and Multicast. 
	 * The Unicast is an identifier for a single interface whereas Multicast is an identifier for a set of interfaces.
	 * Moreover, InetAddress has a cache mechanism to store successful and unsuccessful host name resolutions.
	 * 
	 * IP Address
	 * An IP address helps to identify a specific resource on the network using a numerical representation.
	 * Most networks combine IP with TCP (Transmission Control Protocol). It builds a virtual bridge among 
	 * the destination and the source. 
	 * 
	 * There are two versions of IP address:
	   
	   1. IPv4
	      IPv4 is the primary Internet protocol. It is the first version of IP deployed for production in the 
	      ARAPNET in 1983. It is a widely used IP version to differentiate devices on network using an addressing scheme. 
	      A 32-bit addressing scheme is used to store 232 addresses that is more than 4 million addresses.
	      Features of IPv4:
	      - It is a connectionless protocol.
	      - It utilizes less memory and the addresses can be remembered easily with the class based addressing scheme.
	      - It also offers video conferencing and libraries.
	   
	   2. IPv6
	      IPv6 is the latest version of Internet protocol. It aims at fulfilling the need of more internet addresses. 
	      It provides solutions for the problems present in IPv4. It provides 128-bit address space that can be used to 
	      form a network of 340 undecillion unique IP addresses. IPv6 is also identified with a name IPng 
	      (Internet Protocol next generation).
	      Features of IPv6:
		  - It has a stateful and stateless both configurations.
	      - It provides support for quality of service (QoS).
		  - It has a hierarchical addressing and routing infrastructure.
		  
     * TCP/IP Protocol
     * TCP/IP is a communication protocol model used connect devices over a network via internet. TCP/IP helps in the 
     * process of addressing, transmitting, routing and receiving the data packets over the internet.
     * The two main protocols used in this communication model are:
	   - TCP i.e. Transmission Control Protocol. TCP provides the way to create a communication channel across the 
	     network. It also helps in transmission of packets at sender end as well as receiver end.
	   - IP i.e. Internet Protocol. IP provides the address to the nodes connected on the internet. It uses a gateway 
	     computer to check whether the IP address is correct and the message is forwarded correctly or not.
	 */
	
	public void inetAddressClass() {
		
		/*
		 * Java InetAddress Class Methods
		 * 
		 * public static InetAddress getByName(String host) throws UnknownHostException	
		 * It returns the instance of InetAddress containing LocalHost IP and name.
		 * 
		 * public static InetAddress getLocalHost() throws UnknownHostException	
		 * It returns the instance of InetAdddress containing local host name and address.
		 * 
		 * public String getHostName()	
		 * It returns the host name of the IP address.
		 * 
		 * public String getHostAddress()	
		 * It returns the IP address in string format.
		 */
		
		try {  
			InetAddress ip = InetAddress.getByName("www.google.com");  
			System.out.println("Host Name: " + ip.getHostName());  
			System.out.println("IP Address: " + ip.getHostAddress());  
		} catch(Exception e) {
			System.out.println(e);
		}  
		
		System.out.println("****************************************");
		
		try {
			InetAddress ip1 = Inet4Address.getByName("www.google.com");  
			InetAddress ip2[] = InetAddress.getAllByName("www.google.com");  
			byte addr[] = {72, 3, 2, 12};  
			System.out.print("ip1 : " + ip1);  
			System.out.print("\nip2 : " + ip2);  
			InetAddress ip3 =  InetAddress.getByAddress(addr);  
			System.out.print("\nip3 : "+ ip3);  
			System.out.print("\nAddress : " + Arrays.toString(ip1.getAddress()));  
			System.out.print("\nHost Address : " + ip1.getHostAddress());  
			System.out.print("\nisAnyLocalAddress : " + ip1.isAnyLocalAddress());  
			System.out.print("\nisLinkLocalAddress : " + ip1.isLinkLocalAddress());  
			System.out.print("\nisLoopbackAddress : " + ip1.isLoopbackAddress());  
			System.out.print("\nisMCGlobal : " + ip1.isMCGlobal());  
			System.out.print("\nisMCLinkLocal : " + ip1.isMCLinkLocal());  
			System.out.print("\nisMCNodeLocal : " + ip1.isMCNodeLocal());  
			System.out.print("\nisMCOrgLocal : " + ip1.isMCOrgLocal());  
			System.out.print("\nisMCSiteLocal : " + ip1.isMCSiteLocal());  
			System.out.print("\nisMulticastAddress : " + ip1.isMulticastAddress());  
			System.out.print("\nisSiteLocalAddress : " + ip1.isSiteLocalAddress());  
			System.out.print("\nhashCode : " + ip1.hashCode());  
			System.out.print("\nIs ip1 == ip3 : " + ip1.equals(ip3));  
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
