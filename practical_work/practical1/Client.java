import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8080);
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
			dout.writeUTF("Hello World");
			dout.flush();
			dout.close();
			socket.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
