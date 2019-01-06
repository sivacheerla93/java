package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoFiles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter file 1: ");
		String src1 = s.nextLine();
		System.out.println("Enter file 2: ");
		String src2 = s.nextLine();

		FileReader fr = new FileReader(src1);
		BufferedReader br = new BufferedReader(fr);
		String line;
		line = br.readLine();
		String wordsFile1[] = null;
		while (line != null) {
			wordsFile1 = line.split(" ");
			line = br.readLine();
		}

		fr = new FileReader(src2);
		br = new BufferedReader(fr);
		line = br.readLine();
		String wordsFile2[] = null;
		while (line != null) {
			wordsFile2 = line.split(" ");
			line = br.readLine();
		}

		if (Arrays.equals(wordsFile1, wordsFile2)) {
			System.out.println("Both are equal!");
		} else {
			System.out.println("Not equal!");
		}

		fr.close();
		br.close();
	}

}
