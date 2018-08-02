package oops.constructor;

public class ConsOverload {
	private int num;
	private String name;
	private int age;

	public ConsOverload() {
	}

	public ConsOverload(String name, int num, int age) {
		this.name = name;
		this.num = num;
		this.age = age;
	}

	public ConsOverload(String name) {
		this.name = name;
	}

	public void getDetails() {
		System.out.println(this.name + " " + this.num + " " + this.age);
	}
}
