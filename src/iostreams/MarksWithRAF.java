package iostreams;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class MarksWithRAF {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Siva Cheerla\\git\\java\\src\\iostreams\\marks.dat",
				"rw");
		Scanner s = new Scanner(System.in);
		int sno = 1;

		for (int i = 0; i < 50; i++) {
			int m = (int) Math.round(Math.random() * 100);
			raf.writeInt(m);
		}

		raf.seek(0);
		int count = (int) raf.length() / 4;

		for (int i = 0; i < count; i++) {
			System.out.println(sno + " " + raf.readInt());
			sno++;
		}

		System.out.println("Enter serial num to display marks: ");
		int sip = s.nextInt() - 1;
		raf.seek(sip * 4);
		System.out.println(raf.readInt());

		raf.close();
	}

}
