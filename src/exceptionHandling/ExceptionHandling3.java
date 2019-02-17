package exceptionHandling;

class Base extends Exception {
}

class Derived extends Base {
}

public class ExceptionHandling3 {

	public static void main(String[] args) {

		try {
			throw new Derived();
			
		} 
		catch (Base b) {
			System.out.println("Caught base class exception");
		} 
		/* catch (Derived d) { // Compiler Error because base class exception is caught before derived class
			System.out.println("Caught derived class exception");
		} */

	}

}
