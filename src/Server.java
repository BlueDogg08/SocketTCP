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
            
      //scambio dati
      socket.getInputStream();
    }catch(BindException be){
      System.err.println("Server già avviato");
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
        
  }
}