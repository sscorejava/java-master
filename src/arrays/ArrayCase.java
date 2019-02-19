package arrays;

public class ArrayCase {

	public static void main(String[] args) {
		
		/**
		 * Case 1
		 */
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 'a';
		System.out.println(a[1]);
		byte by = 20;
		a[2] = by;
		short sh = 30;
		a[3] = sh;
		
		/**
		 * Case 2
		 * As array elements we can provide either declared type objects or it's child class objects
		 * 
		 */
		Object[] objects = new Object[10];
		objects[0] = new Object();
		objects[1] = new Integer(10);
		objects[2] = new Double(10.5);
		objects[3] = new String("Suresh");
		
		Number[] numbers = new Number[10];
		numbers[0] = new Integer(10);
		numbers[1] = new Double(10.5);
		// numbers[2] = new String("Suresh"); // compile time error
		
		/**
		 * Case 3
		 * for interface type array as array elements it's implements class object are allow
		 */
		Runnable[] runnables = new Runnable[10];
		runnables[0] = new Thread();
		runnables[1] = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("");
			}
		};
		runnables[2] = new Thread();

	}

}
