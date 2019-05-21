package collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WriteNamesIntoFileSortedOrder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TreeSet<String> persons = new TreeSet<>();
		Scanner s = new Scanner(System.in);
		FileWriter fw = new FileWriter("sample.txt");
		String name;
		while (true) {
			System.out.println("Enter name[end to stop]:");
			name = s.nextLine();
			if (name.equals("end")) {
				break;
			}
			persons.add(name);
		}
		for (String p : persons)
			fw.write(p.toUpperCase() + "\n");
		fw.close();
		System.out.println("Done!");
	}

}
