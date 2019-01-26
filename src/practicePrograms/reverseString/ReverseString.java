package practicePrograms.reverseString;

// Write a java program to reverse a string?
public class ReverseString {

	public static void main(String[] args) {

		String str = "MyJava";

		//1. Using StringBuffer Class
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf.reverse());

		//2. Using iterative method
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		//3. Using Recursive Method
        System.out.println(recursiveMethod(str));
	}

	static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

}
