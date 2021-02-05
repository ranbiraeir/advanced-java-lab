import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
			System.out.println("\nServer is running on port 8080...");
			System.out.println("Waiting for Client to connect...");
			Socket socket = serverSocket.accept();
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String message = (String) dis.readUTF();

			System.out.println("Message from client: " + message);
			System.out.println();
			serverSocket.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
