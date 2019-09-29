package lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintJavaFiles {
	public static void main(String[] args) throws Exception {
		Path dir = Paths.get("D:\\Education");

		Files.walk(dir).filter(p -> p.toString().endsWith(".java")).forEach(PrintJavaFiles::printFile);
	}

	public static void printFile(Path p) {
		System.out.printf("\n******* %s *******\n", p.toString());
		try {
			Files.readAllLines(p).stream().forEach(System.out::println);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}