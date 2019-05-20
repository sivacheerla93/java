package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nl = new ArrayList();
		nl.add("Ronaldo");
		nl.add("Messi");
		nl.add("Gerrard");
		nl.add(1, "Rooney");

		for (Object obj : nl)
			System.out.println(obj);

		nl.remove("Ronaldo");
		System.out.println(nl.indexOf("Messi"));

	}

}
