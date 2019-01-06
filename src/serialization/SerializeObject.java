package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Siva Cheerla", "sivach123@email.com");
		try (FileOutputStream output = new FileOutputStream(
				"C:\\Users\\Siva Cheerla\\git\\java\\src\\serialization\\siva.dat")) {
			ObjectOutputStream outstream = new ObjectOutputStream(output);
			outstream.writeObject(p);
			outstream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
