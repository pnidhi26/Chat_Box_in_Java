import java.net.*;
import java.io.*;
import java.*;
public class datagramReceiver{
public static void main(String[ ] args){

try{
int MAX_LEN = 40;
int localPortNum = Integer.parseInt(args[0]);
DatagramSocket mySocket = new DatagramSocket(localPortNum);
byte[] buffer = new byte[MAX_LEN];
DatagramPacket packet = new DatagramPacket(buffer, MAX_LEN);
mySocket.receive(packet);
String message = new String(buffer);
System.out.println(message);
System.out.println("enter inet add");
Scanner sc=new Scanner(System.in);
String inetadd= sc.next();
InetAddress receiverHost1 = InetAddress.getByName(inetadd);
String recport = sc.next();
int receiverPort = Integer.parseInt(recport);

String msg= sc.next();


String message = msg;
DatagramSocket mySocket = new DatagramSocket( );
byte[] buffer = message.getBytes( );
DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiverHost,
receiverPort);
mySocket.send(packet);

mySocket.close( );
}
catch(Exception e){e.printStackTrace( );}
}

}