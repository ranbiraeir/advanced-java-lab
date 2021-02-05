import java.io.DataInputStream;
import java.net.*;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8080);
		System.out.println("\nServer is running on port 8080...");
		System.out.println("Waiting for Client to connect...");
		Socket socket = serverSocket.accept();
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		String message = dataInputStream.readUTF();
		System.out.println("Message From Client: " + message);
		serverSocket.close();
	}
}
