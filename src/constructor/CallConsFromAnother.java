package constructor;

public class CallConsFromAnother {
	private int num;
	private String name;
	private int age;

	public CallConsFromAnother(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public CallConsFromAnother(int num, String name, int age) {
		this(num, name);
		this.age = age;
	}

	public void getDetails() {
		System.out.println(this.num + " " + this.name + " " + this.age);
	}
}
