package java1_8._interface;

public class InterfaceMain {

	public static void main(String[] args) {
		
		Interface1 interface1 = new ImplementsClass();
		Interface2 interface2 = new ImplementsClass();
		
		interface1.method1();
		interface2.method2();
		
		interface1.logInterface1();
		interface2.logInterface2();
		
		// static method called by interface name
		Interface1.staticInterface1();
		Interface2.staticInterface2();

	}

}
