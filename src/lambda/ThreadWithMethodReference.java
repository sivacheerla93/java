package lambda;

public class ThreadWithMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// New Thread with lambda expression
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 10; i++)
				System.out.println(i);
		});
		t1.start();

		// With Method reference
		Thread t2 = new Thread(ThreadWithMethodReference::print);
		t2.start();
	}

	static public void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
