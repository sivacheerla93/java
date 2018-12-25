package multithreading;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();

		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}

}
