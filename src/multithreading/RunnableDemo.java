package multithreading;

class ThreadCode implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
		}
	}

}

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCode code = new ThreadCode();
		Thread t = new Thread(code);
		t.start();

		for (int i = 1; i <= 50; i++) {
			System.out.println("Main --> " + i);
		}
	}

}
