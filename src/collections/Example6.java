package collections;

import java.util.ArrayList;

public class Example6 {

	public static void main(String[] args) {

		Example6 example6 = new Example6();

		Demo1 demo1 = example6.new Demo1(); // non-static object inside static method
		demo1.show();
		
		Demo2 demo2 = new Demo2(); // static object inside static method
		demo2.show();

	}

	private class Demo1 {

		public void show() {
			ArrayList<Integer> list = new ArrayList<Integer>();

			list.add(4);
			list.add(7);
			list.add(1);

			System.out.println(list);
		}
	}

	private static class Demo2 {

		public void show() {
			ArrayList<Integer> list = new ArrayList<Integer>();

			list.add(10);
			list.add(20);
			list.add(30);

			System.out.println(list);
		}
	}

}
