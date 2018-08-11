package objectclass;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public String toString() {
		return name + " is " + age + " years old!";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;

		Person other = (Person) obj; // downcasting
		return this.name.equals(other.name) && this.age == other.age;
	}
}

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Siva Cheerla", 25);
		Person p2 = new Person("Siva Cheerla", 25);

		System.out.println(p1);
		System.out.println("Hash code of p object is: " + p1.hashCode());

		System.out.println(p2);
		System.out.println("Hash code of p object is: " + p2.hashCode());

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.getClass());
	}

}
