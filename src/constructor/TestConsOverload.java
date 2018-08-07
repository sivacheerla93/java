package constructor;

public class TestConsOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsOverload c1 = new ConsOverload();
		c1.getDetails();

		ConsOverload c2 = new ConsOverload("Siva Cheerla", 12345, 24);
		c2.getDetails();

		ConsOverload c3 = new ConsOverload("Siva Cheerla");
		c3.getDetails();
	}
}
