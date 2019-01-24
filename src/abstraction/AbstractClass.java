package abstraction;

public abstract class AbstractClass {
	
	public abstract void test();
	
	public void test1() {
		test();
		System.out.println("AbstractClass test1 method...");
	}

}
