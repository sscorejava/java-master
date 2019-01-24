package polymorphism;

public class PolymorphismMain {

	public static void main(String[] args) {
		
		//SuperClass sClass = new SuperClass();
		SubClass subClass = new SubClass();
		SuperClass superClass = new SubClass();
		
		//sClass.test1();
		subClass.test();
		superClass.test1();
		
		/* SubClass subC = (SubClass) new SuperClass(); // not create sub class object by using super class constructor
		subC.test();
		subC.test1(); 
		*/

	}

}
