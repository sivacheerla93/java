package multithreading;

public class ThreadPriority implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority p = new ThreadPriority();
		Thread t = new Thread(p);
		t.setPriority(Thread.MAX_PRIORITY);
		if (t.getPriority() == Thread.MAX_PRIORITY) {
			System.out.println("Thread with Maximum priority!");
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
