package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream input = new FileInputStream(
				"C:\\Users\\Siva Cheerla\\git\\java\\src\\serialization\\siva.dat")) {
			ObjectInputStream instream = new ObjectInputStream(input);
			Person p = (Person) instream.readObject();
			System.out.println(p.toString());
			instream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
