package arrays;

public class ArrayInitialization {

	public static void main(String[] args) {

		int[] a = new int[3];
		System.out.println(a);
		System.out.println(a[0]);

		System.out.print("\n");

		int[][] b = new int[2][3];
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[0][0]);

		System.out.print("\n");

		int[][] c = new int[2][];
		System.out.println(c);
		System.out.println(c[0]);
		try {
			System.out.println(c[0][0]);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException Exception");
		}

		System.out.print("\n");

		/**
		 * Once we create a array every array element by default initialize with 0
		 */
		int[] d = new int[3];
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		d[0] = 10;
		d[1] = 20;
		d[2] = 30;
		try {
			d[3] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Exception");
		}
		try {
			d[-3] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Exception");
		}
		// d[2.5] = 30; // cannot convert from double to int
		d[(int) 2.5] = 60;
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);

	}

}
