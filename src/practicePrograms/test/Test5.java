package practicePrograms.test;

public class Test5 {

	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("test");
		StringBuilder s2 = new StringBuilder("test");
		
		if (s1.equals(s2)) {
			System.out.println("right");
		} else {
			System.out.println("not right");
		}
		
		if (s2.equals(s1)) {
			System.out.println("right");
		} else {
			System.out.println("not right");
		}
		
		System.out.println("\n\n");
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		if (str1.equals(str2)) {
			System.out.println("right");
		} else {
			System.out.println("not right");
		}
		
		if (str2.equals(str1)) {
			System.out.println("right");
		} else {
			System.out.println("not right");
		}

	}

}
