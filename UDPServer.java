import java.io.*;
import java.net.*;
class UDPServer {
public static void main(String args[]) throws Exception
{
DatagramSocket serverSocket = new
DatagramSocket(9876);
byte[] receiveData = new byte[1024];
byte[] sendData = new byte[1024];
while(true)
{
DatagramPacket receivePacket =
new DatagramPacket(receiveData, receiveData.length);
serverSocket.receive(receivePacket);
String sentence = new String(receivePacket.getData());
InetAddress IPAddress = receivePacket.getAddress();
int port = receivePacket.getPort();
System.out.println("from client   "+sentence);
//String capitalizedSentence = sentence.toUpperCase();
BufferedReader give =
new BufferedReader(new InputStreamReader(System.in));

sentence = give.readLine();



sendData = sentence.getBytes();
DatagramPacket sendPacket =
new DatagramPacket(sendData, sendData.length, IPAddress, port);
serverSocket.send(sendPacket);
}
}
} 