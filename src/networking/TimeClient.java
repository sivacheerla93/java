package networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TimeClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket cs = new Socket("localhost", 2000);
		InputStream is = cs.getInputStream();
		Scanner s = new Scanner(is);
		String line = s.nextLine();
		System.out.println(line);
	}

}
