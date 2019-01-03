import java.net.*;
import java.io.*;
public class datagramSender{
public static void main(String[ ] args){
try{
InetAddress receiverHost = InetAddress.getByName(args[0]);
int receiverPort = Integer.parseInt(args[1]);
String message = args[2];
DatagramSocket mySocket = new DatagramSocket( );
byte[] buffer = message.getBytes( );
DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiverHost,
receiverPort);
mySocket.send(packet);

int MAX_LEN = 40;
int localPortNum = receiverPort;
//int localPortNum = Integer.parseInt(args[0]);


DatagramSocket mySocket = new DatagramSocket(localPortNum);
byte[] buffer = new byte[MAX_LEN];
DatagramPacket packet = new DatagramPacket(buffer, MAX_LEN);
mySocket.receive(packet);
String message = new String(buffer);
System.out.println(message);

mySocket.close( );
}
catch(Exception e){ e.printStackTrace( ); }
}
}