package arrays;

// Array Declaration, Creation & Initialization in a single line
public class SingleLine {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30};
		char[] ch = {'a', 'e', 'i', 'o', 'u'};
		String[] strings = {"A", "AA", "AAA", "AAAA"};
		
		int[][] b = {{10, 20}, {30, 40, 50}};
		
		int[][][] c = { {{10, 20, 30}, {40, 50, 60}}, {{70, 80}, {90, 100, 110}} };
		System.out.println(c[0][1][2]);
		System.out.println(c[1][0][1]);
		//System.out.println(c[1][2][0]); // java.lang.ArrayIndexOutOfBoundsException
		System.out.println(c[1][1][1]);
		// System.out.println(c[2][1][0]); // java.lang.ArrayIndexOutOfBoundsException
		
		/**
		 * If you want to use this shortcut compulsory we should perform all activity's in a single line
		 *  If you are trying to divide into multiple line then we will get compile time error 
		 */
		int[] x1 = {10, 20, 30};
		int[] x2;
		// x2 = {10, 20, 30}; // compile time error
		
		System.out.println("----------------------------\n");

		/**
		 *   length vs length()
		 */
		int[] in = new int[6];
		System.out.println(in.length);
		in = new int[10];
		// System.out.println(in.length()); // cannot find symbol symbol:method length() location: class int[]
		System.out.println(in.length);
		
		String s = "Suresh";
		// System.out.println(s.length); // cannot find symbol symbol:variable length location: class java.lang.String
		System.out.println(s.length());
		
		System.out.println("----------------------------\n");
		
		/**
		 * Example 1
		 */
		String[] strArray = {"A", "AA", "AAA"};
		System.out.println(strArray.length);
		//System.out.println(strArray.length()); // compile time error
		System.out.println(strArray[0].length());
		//System.out.println(strArray[0].length); // compile time error
		
		System.out.println("----------------------------\n");
		
		int[][] d = new int[6][3];
		System.out.println(d.length);
		System.out.println(d[0].length);
		
		System.out.println("----------------------------\n");
		
		int[] e = new int[] {10, 20, 30, 40};
		//int[] f = new int[4] {10, 20, 30, 40}; // compile time error, because provide size 4 with initialize
		System.out.println(e);
		System.out.println(e.length);
		System.out.println(e[2]);
		
	}

}
