package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		/**
		 * In java Two Dimensional Array not implemented by using matrix style Sun
		 * people followed "Array of Arrays" approach for multi-Dimensional array
		 * creation --------------- The main advantage of this approach is "Memory
		 * utilization will be improved"
		 */

		/**
		 * Example 1
		 */
		int[][] a = new int[2][];
		a[0] = new int[2];
		a[1] = new int[3];

		/**
		 * Example 2
		 */
		int[][][] b = new int[2][][];
		b[0] = new int[3][];
		b[0][0] = new int[1];
		b[0][1] = new int[2];
		b[0][2] = new int[3];
		b[1] = new int[2][2];

		// int[] c = new int[]; // Not valid array without size

		int[] d = new int[3]; // Valid

		// int[][] e = new int[][]; // Not valid not define base size

		int[][] f = new int[3][]; // Valid

		// int[][] g = new int[][4]; // Not valid not define base size

		int[][] h = new int[3][4]; // Valid

		int[][][] i = new int[3][4][5]; // Valid

		int[][][] j = new int[3][4][]; // Valid

		// int[][][] k = new int[3][][5]; // Not valid

		// int[][][] l = new int[][4][5]; // Not valid not define base size

	}

}
