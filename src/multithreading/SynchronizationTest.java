package multithreading;

class Data {
	synchronized public void print() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}
}

class CThread extends Thread {
	Data obj;

	public CThread(Data obj, String name) {
		this.obj = obj;
		setName(name);
	}

	public void run() {
		obj.print();
	}
}

public class SynchronizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CThread t1, t2;
		Data obj = new Data();

		t1 = new CThread(obj, "First");
		t2 = new CThread(obj, "Second");
		t1.start();
		t2.start();
	}

}
