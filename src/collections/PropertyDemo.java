package collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		p.setProperty("name", "Siva");
		p.setProperty("email", "siva@email.com");
		p.setProperty("phone", "1234567890");
		for (Object k : p.keySet())
			System.out.printf("%s:%s\n", k, p.get(k));
		p.store(new FileWriter("c:\\siva.properties"), "Siva Details");
		Properties p2 = new Properties();
		p2.load(new FileReader("c:\\siva.properties"));
		for (Object k : p2.keySet())
			System.out.printf("%s:%s\n", k, p2.get(k));
	}

}
