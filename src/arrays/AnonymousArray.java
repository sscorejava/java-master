package arrays;

/**
 * 
 * array without name
 *
 */
public class AnonymousArray {

	public static void main(String[] args) {
		
		sum(new int[] {10, 20, 30, 40});
		sum(new int[][] {{10, 20, 30}, {40, 50, 60, 70}});
		
		System.out.println("----------------------------\n");
		
		int[] e = new int[] {10, 20, 30, 40}; // not anonymous array because give name is e
		//int[] f = new int[4] {10, 20, 30, 40}; // compile time error, because provide size 4 with initialize
		System.out.println(e);
		System.out.println(e.length);
		System.out.println(e[2]);

	}
	
	private static void sum(int[] x) {
		int total = 0;
		for (int item : x) {
			total = total + item;
		}
		System.out.println("The Sum: " + total);
	}
	
	private static void sum(int[][] x) {
		System.out.println("Two Dimensional Array");
	}

}
