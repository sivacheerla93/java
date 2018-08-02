package oops.overloading;

// method overloading is creating methods with same name and different types params
// We can call method overloading as compile-time polymorphism also
public class AccountInfo {
	private int mobile;
	private String name;

	public void setInfo(int num, String name) {
		this.mobile = num;
		this.name = name;
	}

	public void setInfo(String name, int num) {
		this.name = name;
		this.mobile = num;
	}

	public void getInfo() {
		System.out.println(this.name + " " + this.mobile);
	}
}
