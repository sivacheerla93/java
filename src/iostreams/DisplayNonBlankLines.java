package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplayNonBlankLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter filename to read: ");
		String str = s.nextLine();
		FileReader fr = new FileReader(str);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		int lineno = 1;
		while (line != null) {
			if (line.trim().length() > 0) {
				System.out.printf("%d:%s\n", lineno, line);
			}
			line = br.readLine();
			lineno++;
		}
		fr.close();
		br.close();
	}

}
