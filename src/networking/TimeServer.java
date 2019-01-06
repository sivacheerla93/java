package networking;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TimeServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(2000);
		System.out.println("TimeServer is ready...");
		while (true) {
			Socket cs = ss.accept();
			PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
			pw.println(new Date().toString());
		}
	}

}
