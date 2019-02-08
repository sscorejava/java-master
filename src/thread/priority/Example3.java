package thread.priority;


public class Example3 {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(1);
		new Example3().call();

	}

	private void call() {
		MyThread1 myThread1 = new MyThread1();
		myThread1.setPriority(10);
		myThread1.start();
		
		MyThread2 myThread2 = new MyThread2();
		myThread2.setPriority(9);
		myThread2.start();
		
		MyThread3 myThread3 = new MyThread3();
		myThread3.setPriority(8);
		myThread3.start();
		
		MyThread4 myThread4 = new MyThread4();
		myThread4.setPriority(7);
		myThread4.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Example1....");
		}
	}

	private class MyThread1 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("MyThread.1....");
			}
		}

	}
	
	private class MyThread2 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("MyThread....2....");
			}
		}

	}
	
	private class MyThread3 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("MyThread.......3....");
			}
		}

	}
	
	private class MyThread4 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("MyThread..4....");
			}
		}

	}

}
