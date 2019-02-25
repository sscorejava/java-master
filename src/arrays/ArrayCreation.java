package arrays;

public class ArrayCreation {

	public static void main(String[] args) {
		
		/**
		 * every array in java is an object only hence we can create arrays by using new operator
		 * eg: int[] a = new int[3];
		 */
		int[] a = new int[3];
		System.out.println(a.getClass().getName());
		
		int[][] b = new int[3][2];
		System.out.println(b.getClass().getName());
		
		boolean[] c = new boolean[2];
		System.out.println(c.getClass().getName());
		
		double[][] d = new double[3][3];
		System.out.println(d.getClass().getName());
		
		byte[][] e = new byte[3][3];
		System.out.println(e.getClass().getName());
		
		short[] f = new short[3];
		System.out.println(f.getClass().getName());
		
		/**
		 * Note: for every array type corresponding classes are available and 
		 * these classes are part of java language and not available to the programmer level
		 */
		
		
		/**
		 * 1 Point
		 * 
		 * at the time of array creation compulsory we should specify the size other wise we will get compiler time error
		 * eg: int[] a = new int[]; -> Not valid
		 * int[] a = new int[3]; -> valid
		 */
		
		/**
		 * 2 Point
		 * 
		 * it is legal to have an array with size 0 in java
		 */
		int[] g = new int[0]; // Valid
		
		/**
		 *  3 Point
		 *  
		 *  if you trying to specify array size with some negative int value then we will get run time exception.
		 */
		int[] h = new int[-3]; // get run time exception java.lang.NegativeArraySizeException
		
		/**
		 *  4 Point
		 *  
		 *  to specify array size the allowed data types are byte, short, char, int
		 *  if you trying to specify any other type then we will get compile time error 
		 */
		int in = 10;
		int[] i = new int[in];
		int[] j = new int['a']; // Valid
		byte by = 20;
		int[] k = new int[by]; // Valid
		short sh = 30;
		int[] l = new int[sh];
		double dou = 40;
		// int[] m = new int[dou]; // Not valid
		int[] m = new int[(int) dou]; // Valid
		
		/**
		 *  5 Point
		 *  
		 *  max array size is 2147483647
		 *  which is the maximum value of int data type
		 */
		int[] n = new int[2147483647]; // may be get run time error java.lang.OutOfMemoryError
		// int[] o = new int[2147483648]; // Not valid out of range, integer number too large
	}

}
