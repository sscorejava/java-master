package collections;

import java.util.LinkedList;

public class Example7 {

	public static void main(String[] args) {

		Example7 example7 = new Example7();

		Demo1 demo1 = example7.new Demo1(); // non-static object inside static method
		demo1.show();

		Demo2 demo2 = new Demo2(); // static object inside static method
		demo2.show();

	}

	private class Demo1 {

		public void show() {
			LinkedList<String> list = new LinkedList<String>();

			list.add("Element1");
			list.add("Element2");

			System.out.println(list.getFirst());
		}
	}

	private static class Demo2 {

		public void show() {
			LinkedList<String> list = new LinkedList<String>();

			list.add("Element1");
			list.add("Element2");

			System.out.println(list.getFirst());
		}
	}

}
