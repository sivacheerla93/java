package multithreading;

public class RunnableWithAnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 50; i++) {
					System.out.println(i);
				}
			}
		});

		t.start();

		for (int i = 1; i <= 50; i++) {
			System.out.println("Main --> " + i);
		}
	}

}
