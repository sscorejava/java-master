package polymorphism;

public class SubClass extends SuperClass {
	
	public SubClass() {
		
	}
	
	@Override
	public void test() {
		System.out.println("Sub class test method...");
	}
	
	@Override
	public void test1() {
		//super.test1();
		System.out.println("SubClass test method");
	}

}
