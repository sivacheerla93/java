package iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class SimpleFileVisitorDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Path p = Paths.get("C:\\Users\\Siva Cheerla\\git\\java");
		Files.walkFileTree(p, new ProcessFile());

		Scanner s = new Scanner(System.in);
		System.out.println("Enter file to view the content(With path): ");
		String src = s.nextLine();
		Path p2 = Paths.get(src);
		ProcessFile pf = new ProcessFile();
		pf.printFile(p2);

	}

}

class ProcessFile extends SimpleFileVisitor<Path> {
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
		if (file.toString().endsWith(".java")) {
			System.out.println(file);
		}
		return FileVisitResult.CONTINUE;
	}

	public void printFile(Path file) throws Exception {
		// print contents of file
		BufferedReader br = Files.newBufferedReader(file);
		String line;
		line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}
