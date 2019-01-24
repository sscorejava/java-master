package java1_8._interface;

public class ImplementsClass implements Interface1, Interface2 {

	@Override
	public void method1() {
		System.out.println("ImplementsClass:: method1");
	}

	@Override
	public void method2() {
		System.out.println("ImplementsClass:: method2");
	}

	@Override
	public void logInterface1() {
		System.out.println("@Override:: logInterface1");
	}

}
