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
      socket.close();
    }catch(IOException ioe){
        System.err.println("Eccezione IO");
    }
  }
}