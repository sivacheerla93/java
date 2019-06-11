package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashSet;

public class UniqueLines {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("c:\\names.txt"));
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		String line;
		while ((line = br.readLine()) != null)
			lhs.add(line);
		br.close();
		for (String s : lhs)
			System.out.println(s);
	}

}
