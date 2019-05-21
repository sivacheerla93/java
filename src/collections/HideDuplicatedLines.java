package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HideDuplicatedLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename;
		System.out.println("Enter a filename: ");
		Scanner s = new Scanner(System.in);
		filename = s.nextLine();
		ArrayList<String> lines = new ArrayList<>();
		LinkedHashSet<String> duplines = new LinkedHashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line = br.readLine();
			while (line != null) {
				if (lines.contains(line))
					duplines.add(line);
				else
					lines.add(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		// Showing unique lines
		for (String line : lines)
			System.out.println(line);
	}

}
