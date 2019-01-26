package practicePrograms.duplicateCharacters;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

// How To Find Duplicate Characters In A String In Java?
public class DuplicateCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input string to be cleaned from white spaces...!");

		String inputString = sc.nextLine();
		sc.close();

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		Set<Character> charsInString = charCountMap.keySet();

		System.out.println("Duplicate Characters In " + inputString);

		for (Character ch : charsInString) {
			if (charCountMap.get(ch) > 1) {
				// If any char has a count of more than 1, printing it's count
				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}

	}

}
