package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("C");
		lhs.add("Java");
		lhs.add("Python");
		lhs.add("Java");

		for (String s : lhs)
			System.out.println(s);
	}

}
