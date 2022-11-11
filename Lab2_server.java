import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
 
class server {
public static void main(String args[]){
try{
//create socket, 5000 is port number
ServerSocket serverSocket = new ServerSocket(5000);  
 
System.out.println("Waiting for Client...");
 
//establish connection
Socket socket = serverSocket.accept();
 
System.out.println("Client Connected...");
 
//fetch incoming message
DataInputStream dis = new DataInputStream(socket.getInputStream());
String  message = (String)dis.readUTF();
System.out.println("Client message: " + message);  
//close connection
serverSocket.close();
}catch(Exception e){
e.printStackTrace();
}
}
}