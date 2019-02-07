package thread;

public class Example2 {

	public static void main(String[] args) {

		new Example2().call();

	}

	private void call() {
		Thread thread = new Thread(new MyThread());
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Example1....");
		}
	}

	private class MyThread implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("MyThread....");
			}
		}

	}

}
