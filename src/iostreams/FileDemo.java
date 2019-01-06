package iostreams;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Siva Cheerla\\git\\java\\src\\iostreams");

		if (f.exists()) {
			if (f.isFile())
				System.out.println("File");
			else {
				for (File file : f.listFiles()) {
					System.out.println(file.toString());
				}
			}
		} else
			System.out.println("Not Present");
	}

}
