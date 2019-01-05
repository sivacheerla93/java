package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountWordsInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter filename: ");
			String filename = s.nextLine();
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int count = 0;

			while (line != null) {
				String words[] = line.split(" ");
				for (String w : words) {
					count++;
				}
				line = br.readLine();
			}
			fr.close();
			br.close();

			System.out.println("Total no. of words: " + count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
