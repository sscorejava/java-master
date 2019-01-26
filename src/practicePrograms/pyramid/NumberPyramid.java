package practicePrograms.pyramid;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How Many Rows You Want In Your Pyramid?");
		int noOfRows = sc.nextInt();
		sc.close();

		pattern1(noOfRows);
		System.out.println("\n");
		pattern2(noOfRows);
		System.out.println("\n");
		pattern3(noOfRows);
		System.out.println("\n");
		pattern4(noOfRows);
		System.out.println("\n");
		pattern5(noOfRows);
		System.out.println("\n");
		pattern6(noOfRows);

	}

	private static void pattern1(int noOfRows) {
		int rowCount = 1;
		System.out.println("Here Is Your Pyramid");

		for (int i = noOfRows; i > 0; i--) {
			// Printing i spaces at the beginning of each row
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// Printing 'rowCount' value 'rowCount' times at the end of each row
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(rowCount + " ");
			}
			System.out.println();
			// Incrementing the rowCount
			rowCount++;
		}
	}

	private static void pattern2(int noOfRows) {
		int rowCount = 1;
		System.out.println("Here Is Your Pyramid");

		for (int i = noOfRows; i > 0; i--) {
			// Printing i spaces at the beginning of each row
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// Printing 'j' value at the end of each row
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			// Incrementing the rowCount
			rowCount++;
		}
	}

	private static void pattern3(int noOfRows) {
		int rowCount = 1;
		System.out.println("Here Is Your Pyramid");

		for (int i = noOfRows; i > 0; i--) {
			// Printing i spaces at the beginning of each row
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// Printing 'rowCount' value 'rowCount' times at the end of each row
			for (int j = 1; j <= rowCount; j++) {
				System.out.print("* ");
			}
			System.out.println();
			// Incrementing the rowCount
			rowCount++;
		}
	}

	private static void pattern4(int noOfRows) {
		int rowCount = 1;
		System.out.println("Here Is Your Pyramid");

		for (int i = noOfRows; i > 0; i--) {
			// Printing i*2 spaces at the beginning of each row
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}
			// Printing j value where j value will be from 1 to rowCount
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}
			// Printing j value where j value will be from rowCount-1 to 1

			for (int j = rowCount - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
			// Incrementing the rowCount
			rowCount++;
		}
	}

	private static void pattern5(int noOfRows) {
		int rowCount = noOfRows;
		System.out.println("Here Is Your Pyramid");

		for (int i = 0; i < noOfRows; i++) {
			// Printing i*2 spaces at the beginning of each row
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}
			// Printing j where j value will be from 1 to rowCount
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}
			// Printing j where j value will be from rowCount-1 to 1

			for (int j = rowCount - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
			// Decrementing the rowCount
			rowCount--;
		}
	}

	private static void pattern6(int noOfRows) {
		System.out.println("Here Is Your Pyramid");

		for (int i = noOfRows; i >= 1; i--) {
			// Printing i*2 spaces at the beginning of each row
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}
			// Printing j where j value will be from i to noOfRows
			for (int j = i; j <= noOfRows; j++) {
				System.out.print(j + " ");
			}
			// Printing j where j value will be from noOfRows-1 to i

			for (int j = noOfRows - 1; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

}
