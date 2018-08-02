package oops.methodoverloading;

public class TestAccountInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountInfo a1 = new AccountInfo();
		a1.setInfo(12345, "Siva Cheerla");

		AccountInfo a2 = new AccountInfo();
		a2.setInfo("Siva Cheerla", 6789);

		a1.getInfo();
		a2.getInfo();
	}

}
