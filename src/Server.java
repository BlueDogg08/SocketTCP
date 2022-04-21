import java.io.*;
import java.net.*;

public class Server {
  public static void main(String[] args) {
      
    int port=2000;
    Socket socket= null;
    
    try{
      //apertura porta
      //server in ascolto
      ServerSocket sSocket= new ServerSocket(port);
      System.out.println("In attesa di connetersi con il client");
      
      socket=sSocket.accept();
      System.out.println("Server connesso con il socket: "+ socket.getRemoteSocketAddress());
      
      //Invio al client 1° passaggio
      DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
      dout.writeUTF("Server: Connessione avvenuta");
      dout.flush();
      dout.close();
      
      //Ricezione dal client  4° passaggio
      DataInputStream dis=new DataInputStream(socket.getInputStream());
      String str=(String)dis.readUTF();
      System.out.println(str);
      sSocket.close();
      
    }catch(BindException be){
      System.err.println("Server già avviato");
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
        
  }
}
