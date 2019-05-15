package networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BookClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("localhost", 3000);
		Scanner keyboard = new Scanner(System.in);
		Scanner sin = new Scanner(s.getInputStream());
		PrintWriter sout = new PrintWriter(s.getOutputStream(), true);
		String title;
		int bookno;
		while (true) {
			System.out.println("Enter book no.[0 to stop]: ");
			bookno = keyboard.nextInt();
			sout.println(bookno);
			if (bookno == 0) {
				break;
			}
			title = sin.nextLine();
			if (title.length() != 0) {
				System.out.println("Book Title: " + title + "\n");
			} else {
				System.out.println("Invalid Book No." + "\n");
			}
		}

	}

}
