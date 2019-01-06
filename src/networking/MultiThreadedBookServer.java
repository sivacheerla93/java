package networking;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedBookServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(3000, 10);
		System.out.println("BookServer is ready...");
		ExecutorService executor = Executors.newFixedThreadPool(10);

		while (true) {
			Socket cs = ss.accept();
			System.out.println("Accepted Client Request...");
			ClientHandler client = new ClientHandler(cs);
			executor.execute(client);
		}
	}

}

class ClientHandler implements Runnable {
	Socket client;

	public ClientHandler(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String books[] = { "Java Book", "Python Book", "Angular Book" };
		try {
			Scanner s = new Scanner(client.getInputStream());
			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
			int bookno;
			String title;
			while (true) {
				bookno = s.nextInt();

				if (bookno == 0) {
					break;
				}

				if (bookno - 1 < books.length) {
					title = books[bookno - 1];
				} else {
					title = "";
				}
				pw.println(title);
			}
			System.out.println("Client Connection Closed...");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
