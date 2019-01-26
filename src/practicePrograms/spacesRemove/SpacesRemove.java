package practicePrograms.spacesRemove;

import java.util.Scanner;

// How To Remove White Spaces from String In Java?
public class SpacesRemove {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input string to be cleaned from white spaces...!");

		String inputString = sc.nextLine();
		sc.close();

		String stringWithoutSpaces = inputString.replaceAll("\\s+", "");

		System.out.println("Input String : " + inputString);

		System.out.println("Input String Without Spaces : " + stringWithoutSpaces);

	}

}
