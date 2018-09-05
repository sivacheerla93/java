package interfaces;

public class TestCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter.printAuthor();

		OneCounter c = new OneCounter();
		c.increment();
		System.out.println(c.getIncrement());
		System.out.println(c.getValue());

		TenCounter c2 = new TenCounter();
		c2.increment();
		System.out.println(c2.getValue());
	}

}
