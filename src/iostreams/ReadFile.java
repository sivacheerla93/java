package iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter filename: ");
			String filename = s.nextLine();
			FileReader fr = new FileReader(filename);
			int ch;
			ch = fr.read();
			while (ch != -1) {
				System.out.print((char) ch);
				ch = fr.read();
			}
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
