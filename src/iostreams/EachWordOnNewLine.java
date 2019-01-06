package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class EachWordOnNewLine {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter file to print words: ");
		String src = s.nextLine();
		FileReader fr = new FileReader(src);
		BufferedReader br = new BufferedReader(fr);
		String line;
		line = br.readLine();
		while (line != null) {
			String words[] = line.split(" ");
			for (String word : words) {
				System.out.println(word);
			}
			line = br.readLine();
		}
		fr.close();
		br.close();
	}

}
