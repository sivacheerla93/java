package multithreading;

public class DaemonThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Waiting...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {

		}

		DaemonThread d = new DaemonThread();
		Thread t = new Thread(d);
		t.setDaemon(true);
		t.start();

		ChildThread2 cd2 = new ChildThread2();
		Thread t2 = new Thread(cd2);
		t2.start();
		try {
			t2.join();
			System.out.println("Child Completed!");
		} catch (InterruptedException ex) {

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 50; i++) {
			System.out.printf("Daemon -> %d\t", i);
		}
	}

}

class ChildThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
