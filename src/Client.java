import java.io.*;
import java.net.*;

public class Client {
  public static void main(String[] args) {
      
    int port= 2000;
    String ip= "127.0.0.1";
    BufferedReader in= null;
    PrintStream out= null;
    
    try{
      Socket socket= new Socket(ip, port);
      /*in= new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out= new PrintStream(socket.getOutputStream(), true);*/
      
      //Ricezione dal Server 2° passaggio
      DataInputStream dis=new DataInputStream(socket.getInputStream());
      String str=(String)dis.readUTF();
      
      //Invio al Server 3° passaggio
      DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
      dout.writeUTF(str+"\r\nSocket: Ok");
      dout.flush();
      dout.close();
      socket.close();
    }catch(IOException ioe){
        System.err.println("Eccezione IO");
    }
  }
}
