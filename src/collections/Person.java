package collections;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		final Person other = (Person) obj;
		if (this.name.equals(other.name) && this.age == other.age)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		if (this.name.equals(other.name))
			return this.age - other.age;
		else
			return this.name.compareTo(other.name);
	}

}
