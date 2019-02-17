package exceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		try {
			//throw 10; // No exception of type int can be thrown; an exception type must be a subclass of Throwable
			throw new NullPointerException();
		}
		catch (Exception e) {
			System.out.println("Got the  Exception " + e);
		}

	}

}
