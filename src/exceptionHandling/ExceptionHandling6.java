package exceptionHandling;

public class ExceptionHandling6 {

	public static void main(String[] args) {
		
		System.out.println(test());

	}
	
	@SuppressWarnings("finally")
	private static int test() {
		
		try {
			System.out.println("try block");
			return 0;
		}
		catch (Exception e) {
			
			return 0;
		}
		finally {
			
			return 10;
		}
	}

}
