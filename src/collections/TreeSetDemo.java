package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> persons = new TreeSet<>();
		Scanner s = new Scanner(System.in);
		String name;
		int age;
		while (true) {
			System.out.println("Enter name[end to stop]:");
			name = s.nextLine();
			if (name.equals("end")) {
				break;
			}
			System.out.println("Enter age: ");
			age = s.nextInt();

			Person p = new Person(name, age);
			persons.add(p);
		}
		for (Person p : persons)
			System.out.println(p);
	}

}
