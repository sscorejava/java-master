package oracleJavaCertification.crack_OCA_1Z0_808.test_1;

public class Question10 {

	public static void main(String[] args) {
		
		int[] n1 = new int[3];
		int[] n2 = { 10, 20, 30, 40, 50 };
		
		n1 = n2;
		
		for (int x : n1) {
			System.out.print(x + ":");
		}

	}

}
