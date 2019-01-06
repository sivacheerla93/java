package iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
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

	public void printFile(Path file) {
		// print contents of file
	}
}
