package abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		
		AbstractClass abstractClass2 = new AbstractClass() {
			
			@Override
			public void test() {
				System.out.println("abstractClass2 test call...");
			}
		};
		
		abstractClass2.test();
		abstractClass2.test1();
		System.out.println();
		
		AbstractionClass abstractionClass = new AbstractionClass();
		abstractionClass.test();
		abstractionClass.test1();
		System.out.println();
		
		AbstractClass abstractClass = new AbstractionClass();
		abstractClass.test();
		abstractClass.test1();

	}

}
