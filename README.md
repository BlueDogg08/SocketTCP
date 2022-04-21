# SocketTCP

# Server.java
# riga 13 - ServerSocket sSocket= new ServerSocket(port);
Viene creata un'istanza della classe "ServerSocket" specificando il numero di porta a cui rimanere in ascolto.

# riga 16 - socket=sSocket.accept();
Viene invocato il metodo "accept()" che si accerta che il server rimanga in ascolto di una richiesta di connessione e la porta ovviamente non deve essere già in uso.

# riga 20 - socket.getInputStream();
Il metodo "getInputStream()" restituisce un input stream per il socket che gli è stato passato.

# Client.java
# riga 13 - Socket socket= new Socket(ip, port);
Viene aperto un socket specificando l'indirizzo ip del server("127.0.0.1") e la porta("2000").

# riga 16 - socket.close();
Viene chiusa la connessione.
