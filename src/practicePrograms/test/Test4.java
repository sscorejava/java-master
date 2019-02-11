package practicePrograms.test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {

		// ArrayList<Shape> shapes = new ArrayList<Circle>(); -> compile time error type
		// mismatch

		// List<Shape> shapes = new ArrayList<Circle>(); -> compile time error type
		// mismatch

		// ArrayList<Circle> shapes = new ArrayList<Shape>(); -> compile time error type
		// mismatch

		// List<Circle> shapes = new ArrayList<Shape>(); -> compile time error type
		// mismatch

		List<Shape> list = new ArrayList<Shape>();

		List<Circle> circles = new ArrayList<Circle>();
		
		list.add(new Shape());
		list.add(new Circle());
		
		list.get(0).draw();
		list.get(1).draw();
		
		// circles.add((Circle) new Shape()); -> runtime exception java.lang.ClassCastException
		circles.add(new Circle());
		
		circles.get(0).draw();

	}

	private static class Shape {

		void draw() {
			System.out.println("Shape class");
		}

	}

	private static class Circle extends Shape {

		@Override
		void draw() {
			System.out.println("Circle class");
		}

	}

}
