package iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class RemoveBlankLines {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter source filename: ");
		String srcfile = s.nextLine();
		Path src = Paths.get(srcfile);
		BufferedReader br = Files.newBufferedReader(src);

		Path trg = Paths.get("C:\\Users\\Siva Cheerla\\git\\java\\src\\iostreams\\sample3.txt");
		BufferedWriter bw = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);

		String line;
		line = br.readLine();
		while (line != null) {
			if (line.length() > 0) {
				bw.write(line + "\n");
			}
			line = br.readLine();
		}
		bw.close();
		br.close();
		Files.move(trg, src, StandardCopyOption.REPLACE_EXISTING);
	}

}
