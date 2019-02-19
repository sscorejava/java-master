package arrays;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		/**
		 * one dimensional array
		 */
		int[] x1; // Valid but this is recommended because name is clearly separated from type     
		int  []x2; // Valid
		int  x3[]; // Valid
		
		/**
		 * at the time of declaration we can not specify the size otherwise we will get compiler time error
		 * 
		 * int[6] x; // not valid
		 */
		
		
		/**
		 * two dimensional array
		 */
		int[][] x4; // Valid
		int  [][]x5; // Valid
		int  x6[][]; // Valid
		int[]  []x7; // Valid
		int[]  x8[]; // Valid
		int   []x9[]; // Valid
		
		
		int[] a, b; // a -> 1, b -> 1
		int[] c[], d; // c -> 2, d -> 1
		int[] e[], f[]; // e -> 2, f -> 2
		int[] []g, h; // g -> 2, h -> 2
		int[] []i, j[]; // i -> 2, j -> 3
		// int[] []k, []l; // Compile time error -> if you want to specify dimension before the variable, is applicable only for first variable in a declaration
		
		
		/**
		 * three dimensional array
		 */
		threeDimensionalArray();
		
	}
	
	private static void threeDimensionalArray() {
		int[][][] a;
		int  [][][]b;
		int c[][][];
		int[]  [][]d;
		int[]  e[][];
		int[]  []f[];
		int[][]  []g;
		int[][]  h[];
		int  [][]i[];
		int  []j[][];
	}

}
