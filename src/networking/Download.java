package networking;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Download {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter URL to download file: ");
		String fromurl = s.nextLine();
		System.out.println("Enter target filename: ");
		String filename = s.nextLine();
		URL urlobj = new URL(fromurl);
		InputStream is = urlobj.openStream();
		FileOutputStream fo = new FileOutputStream(filename);
		int ch = is.read();
		while (ch != -1) {
			fo.write(ch);
			ch = is.read();
		}
		fo.close();
		is.close();
	}

}
