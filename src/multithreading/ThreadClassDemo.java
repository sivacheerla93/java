package multithreading;

class ChildThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Child -> " + i);
		}
	}
}

public class ThreadClassDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("In Main");
		ChildThread cd1 = new ChildThread();
		cd1.start();

		System.out.println("In Main again");
		for (int i = 1; i <= 50; i++) {
			System.out.println("Main --> " + i);
		}

		System.out.println("Waiting for child to terminate!");
		cd1.join();

		System.out.println("End of main");
	}
}
