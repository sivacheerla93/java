package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNumbers implements Runnable {

	private String name;

	public PrintNumbers(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%s : %d\n", name, i);
		}
	}

}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 1; i <= 10; i++) {
			executor.execute(new PrintNumbers("Thread " + i));
		}
		System.out.println("Done with main()");
	}

}
