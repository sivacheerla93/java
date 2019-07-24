package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.length() - s2.length();
	}

}

public class SortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<>();
		names.add("Bill Gates");
		names.add("Steve Jobs");
		names.add("Larry Ellison");
		names.add("Larry Page");
		names.add("Musk");

		// Collections.sort(names, new LengthCompare());

		// Collections.sort(names, (String s1, String s) -> s1.length() -
		// s2.length());

		Collections.sort(names, (s1, s2) -> s1.length() - s2.length());
		for (String n : names)
			System.out.println(n);
	}

}
