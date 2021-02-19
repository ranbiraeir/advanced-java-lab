import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8080);
			Socket s = ss.accept();

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			String str = "", str1 = "";
			while (!str.equalsIgnoreCase("bye")) {
				str = dis.readUTF();
				System.out.println("Client says " + str);
				str1 = br.readLine();
				dout.writeUTF(str1);
				dout.flush();
			}
			dout.close();
			ss.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}