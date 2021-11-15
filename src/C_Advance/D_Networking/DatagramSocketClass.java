package C_Advance.D_Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSocketClass {
	
	/*
	 * Java DatagramSocket and DatagramPacket
     * 
	 * Java DatagramSocket and DatagramPacket classes are used for connection-less socket 
	 * programming using the UDP instead of TCP.
	 * 
     * Datagram
     * 
	 * Datagrams are collection of information sent from one device to another device via 
	 * the established network. When the datagram is sent to the targeted device, there is 
	 * no assurance that it will reach to the target device safely and completely. It may 
	 * get damaged or lost in between. Likewise, the receiving device also never know if 
	 * the datagram received is damaged or not. The UDP protocol is used to implement the 
	 * datagrams in Java.
	 */

	public void datagramSocketClass() {
		
		/*
		 * Java DatagramSocket class
		 * 
		 * Java DatagramSocket class represents a connection-less socket for sending and receiving 
		 * datagram packets. It is a mechanism used for transmitting datagram packets over network.
		 * A datagram is basically an information but there is no guarantee of its content, arrival 
		 * or arrival time.
		 */
		
		/*
		 * Commonly used Constructors of DatagramSocket class
		 * 
		 * DatagramSocket() throws SocketException: 
		 * it creates a datagram socket and binds it with the available Port Number on the localhost machine.
		 * 
		 * DatagramSocket(int port) throws SocketException: 
		 * it creates a datagram socket and binds it with the given Port Number.
		 * 
		 * DatagramSocket(int port, InetAddress address) throws SocketException: 
		 * it creates a datagram socket and binds it with the specified port number and host address.
		 */
		
		/*
		 * Methods
		 * 
		 * void bind(SocketAddress addr)	
		 * It binds the DatagramSocket to a specific address and port.
		 * 
		 * void close()	
		 * It closes the datagram socket.
		 * 
		 * void connect(InetAddress address, int port)	
		 * It connects the socket to a remote address for the socket.
		 * 
		 * void disconnect()	
		 * It disconnects the socket.
		 * 
		 * boolean getBroadcast()	
		 * It tests if SO_BROADCAST is enabled.
		 * 
		 * DatagramChannel getChannel()	
		 * It returns the unique DatagramChannel object associated with the datagram socket.
		 * 
		 * InetAddress getInetAddress()	
		 * It returns the address to where the socket is connected.
		 * 
		 * InetAddress getLocalAddress()	
		 * It gets the local address to which the socket is connected.
		 * 
		 * int getLocalPort()	
		 * It returns the port number on the local host to which the socket is bound.
		 * 
		 * SocketAddress getLocalSocketAddress()	
		 * It returns the address of the endpoint the socket is bound to.
		 * 
		 * int getPort()	
		 * It returns the port number to which the socket is connected.
		 * 
		 * int getReceiverBufferSize()	
		 * It gets the value of the SO_RCVBUF option for this DatagramSocket that is 
		 * the buffer size used by the platform for input on the DatagramSocket.
		 * 
		 * boolean isClosed()	
		 * It returns the status of socket i.e. closed or not.
		 * 
		 * boolean isConnected()	
		 * It returns the connection state of the socket.
		 * 
		 * void send(DatagramPacket p)	
		 * It sends the datagram packet from the socket.
		 * 
		 * void receive(DatagramPacket p)	
		 * It receives the datagram packet from the socket.
		 */
	}

	public void datagramPacketClass() {
		
		/*
		 * Java DatagramPacket Class
		 * 
		 * Java DatagramPacket is a message that can be sent or received. It is a data container. 
		 * If you send multiple packet, it may arrive in any order. Additionally, packet delivery is not guaranteed.
		 * Commonly used Constructors of DatagramPacket class
		   - DatagramPacket(byte[] barr, int length): it creates a datagram packet. This constructor is used 
		     to receive the packets.
	       - DatagramPacket(byte[] barr, int length, InetAddress address, int port): it creates a datagram packet. 
	         This constructor is used to send the packets.
		 */
		
		/*
		 * InetAddress getAddress()	
		 * It returns the IP address of the machine to which the datagram is being sent or from which the datagram was received.
		 * 
		 * byte[] getData()	
		 * It returns the data buffer.
		 * 
		 * int getLength()	
		 * It returns the length of the data to be sent or the length of the data received.
		 * 
		 * int getOffset()	
		 * It returns the offset of the data to be sent or the offset of the data received.
		 * 
		 * int getPort()	
		 * It returns the port number on the remote host to which the datagram is being sent or from which the datagram was received.
		 * 
		 * SocketAddress getSocketAddress()	
		 * It gets the SocketAddress (IP address + port number) of the remote host that the packet is being sent to or is coming from.
		 * 
		 * void setAddress(InetAddress iaddr)	
		 * It sets the IP address of the machine to which the datagram is being sent.
		 * 
		 * void setData(byte[] buff)	
		 * It sets the data buffer for the packet.
		 * 
		 * void setLength(int length)	
		 * It sets the length of the packet.
		 * 
		 * void setPort(int iport)	
		 * It sets the port number on the remote host to which the datagram is being sent.
		 * 
		 * void setSocketAddress(SocketAddress addr)	
		 * It sets the SocketAddress (IP address + port number) of the remote host to which the datagram is being sent.
		 */
	}

	public void example() {
		
		try(DatagramSocket ds = new DatagramSocket()) {
			String str = "Welcome java";  
		    InetAddress ip = InetAddress.getByName("127.0.0.1");		     
		    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
		    ds.send(dp);   
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(DatagramSocket ds = new DatagramSocket(3000)){
			byte[] buf = new byte[1024];  
		    DatagramPacket dp = new DatagramPacket(buf, 1024);  
		    ds.receive(dp);  
		    String str = new String(dp.getData(), 0, dp.getLength());  
		    System.out.println(str);  
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
