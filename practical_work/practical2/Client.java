import java.io.DataOutputStream;
import java.net.*;

public class Client {
	public static void main(String[] args) throws Exception {
		String ip = "192.168.43.61";
		Socket socket = new Socket(ip, 8080);
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		dataOutputStream.writeUTF("How are you doing?");
		dataOutputStream.flush();
		dataOutputStream.close();
		socket.close();
	}
}
