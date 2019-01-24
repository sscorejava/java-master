package java1_8._interface;

public interface Interface1 {
	
	void method1();
	
	default void logInterface1(){
		System.out.println("I1 log:: Interface1");
	}
	
	static void staticInterface1() {
		System.out.println("static method :: Interface1");
	}

}
