package thread;

public class Example1 {

	public static void main(String[] args) {

		new Example1().call();

	}

	private void call() {
		MyThread myThread = new MyThread();
		myThread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Example1....");
		}
	}

	private class MyThread extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("MyThread....");
			}
		}

	}

}
