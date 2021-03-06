package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter filename to read: ");
		String str = s.nextLine();
		FileReader fr = new FileReader(str);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		fr.close();
		br.close();
	}

}
