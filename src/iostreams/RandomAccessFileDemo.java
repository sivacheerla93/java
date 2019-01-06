package iostreams;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int phonenumbers[] = { 1111, 2222, 3333, 4444 };
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Siva Cheerla\\git\\java\\src\\iostreams\\numbers.dat",
				"rw");
		for (int n : phonenumbers) {
			raf.writeInt(n);
		}

		raf.seek(0);
		int count = (int) raf.length() / 4;

		for (int i = 0; i < count; i++) {
			System.out.println(raf.readInt());
		}

		raf.seek(2 * 4);
		raf.writeInt(9999);

		raf.seek(0);

		for (int i = 0; i < count; i++) {
			System.out.println(raf.readInt());
		}
		raf.close();
	}

}
