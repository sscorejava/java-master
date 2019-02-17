package oracleJavaCertification.crack_OCA_1Z0_808.test_1;

public class Question6 {

	public static void main(String[] args) {
		
		// In which of the following cases we will get Compile time error?
		
		float f1 = 100F;
		
		float f2 = (float) 1_11.00;
		
		float f3 = 100;
		
		double d = 203.22;
		//float f4 = d; // here get compile time error because required casting
		
		int i = 100;
		float f = (int) i;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f);

	}

}
