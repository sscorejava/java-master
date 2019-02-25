package arrays;

public class ArrayVariableAssignment {

	public static void main(String[] args) {
		
		/**
		 * Case 1
		 */
		int[] in = {10, 20, 30, 40};
		char[] ch = {'a', 'b', 'c', 'd'};
		
		int[] i = in;
		// int[] c= ch; // Compile time error -> incompatible types  found: char[] required: int[]
		
		String[] s = {"A", "AA", "AAA"};
		Object[] o = s;
		
		/**
		 * Case 2
		 */
		int[] a = {10, 20, 30, 40, 50, 60};
		int[] b = {10, 20};
		a = b;
		b = a;
		
		/**
		 * Case 3
		 */
		int[][] c = new int[3][];
		//c[0] = new int[4][3]; // required int[]
		//c[0] = 10; // required int[]
		c[0] = new int[4];

	}

}
