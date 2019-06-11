package programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFile {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a filename : ");
		String filename = scanner.nextLine();

		Stack<String> lines = new Stack();
		try (FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr)) {
			String line = br.readLine();
			while (line != null) {
				lines.push(line);
				line = br.readLine();
			}

			// display stack
			while (!lines.isEmpty())
				System.out.println(lines.pop());

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}