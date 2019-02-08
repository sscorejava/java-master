package practicePrograms.test;

public class Test2 {

	private static final char PLUSE = '+';
	private static final char SUB = '-';
	private static final char MULTI = '*';
	private static final char DIVI = '/';

	public static void main(String[] args) {

		String str = "1+2*6/2*10";
		char[] charArray = str.toCharArray();

		int result = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			switch (ch) {
			case PLUSE: {
				int i = index;

				int previous = Character.getNumericValue(charArray[i - 1]);
				int next = Character.getNumericValue(charArray[i + 1]);

				if (Character.isDigit(charArray[i + 2])) {
					int next2 = Character.getNumericValue(charArray[i + 2]);
					String strNext = String.valueOf(next) + String.valueOf(next2);
					next = Integer.valueOf(strNext);
				}

				if (result == 0) {
					result = previous + next;
				} else {
					result += next;
				}

				break;
			}
			case SUB: {
				int i = index;

				int previous = Character.getNumericValue(charArray[i - 1]);
				int next = Character.getNumericValue(charArray[i + 1]);

				if (Character.isDigit(charArray[i + 2])) {
					int next2 = Character.getNumericValue(charArray[i + 2]);
					String strNext = String.valueOf(next) + String.valueOf(next2);
					next = Integer.valueOf(strNext);
				}

				if (result == 0) {
					result = previous - next;
				} else {
					result -= next;
				}

				break;
			}
			case MULTI: {
				int i = index;

				int previous = Character.getNumericValue(charArray[i - 1]);
				int next = Character.getNumericValue(charArray[i + 1]);

				if (Character.isDigit(charArray[i + 2])) {
					int next2 = Character.getNumericValue(charArray[i + 2]);
					String strNext = String.valueOf(next) + String.valueOf(next2);
					next = Integer.valueOf(strNext);
				}

				if (result == 0) {
					result = previous * next;
				} else {
					result *= next;
				}
				break;
			}
			case DIVI:
				int i = index;

				int previous = Character.getNumericValue(charArray[i - 1]);
				int next = Character.getNumericValue(charArray[i + 1]);

				if (Character.isDigit(charArray[i + 2])) {
					int next2 = Character.getNumericValue(charArray[i + 2]);
					String strNext = String.valueOf(next) + String.valueOf(next2);
					next = Integer.valueOf(strNext);
				}

				if (result == 0) {
					result = previous / next;
				} else {
					result /= next;
				}
				break;
			}
		}

		System.out.println("Result = " + result);

	}

}
