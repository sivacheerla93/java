package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter source filename: ");
		String srcfile = s.nextLine();
		System.out.println("Enter target filename: ");
		String trgfile = s.nextLine();

		try (FileReader fr = new FileReader(srcfile); FileWriter fw = new FileWriter(trgfile)) {
			BufferedReader br = new BufferedReader(fr);
			String line;
			line = br.readLine();
			while (line != null) {
				fw.write(line.toUpperCase() + "\n");
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
