package java1_8._interface;

public interface Interface2 {
	
	void method2();
	
	default void logInterface2(){
		System.out.println("I2 log:: Interface2");
	}
	
	static void staticInterface2() {
		System.out.println("static method :: Interface2");
	}

}
