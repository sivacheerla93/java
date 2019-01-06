package iostreams;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

public class PushbackReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringReader sr = new StringReader("ABC XYZ");
		PushbackReader pr = new PushbackReader(sr);
		int ch = pr.read();
		System.out.println(ch);
		pr.unread(ch);
		System.out.println(pr.read());
		pr.close();
	}

}
