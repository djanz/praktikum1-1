package chars;

public class CharChecker {

	void iterate(String s) {

		for (int i = 0; i < s.length(); i++) {

			char current = s.charAt(i);
			System.out.println(current + "\t" + isLowerCase(current) + "\t" + decValue(current));

		}

	}

	boolean isLowerCase(char current) {

		if (current >= 'a' && current <= 'z') {
			return true;
		} else {
			return false;
		}

	}

	int decValue(char current) {
		int i = current;
		return i;
	}

	char[] toArray(String s) {

		char[] charArray = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {

			charArray[i] = s.charAt(i);
		}

		return charArray;
	}

	void printArrayWhile(char[] charArray) {

		int current = 0;
		int breakAt = charArray.length;

		while (current < breakAt) {

			System.out.println("position " + current + " - value: " + charArray[current]);

			current++;

		}

	}

	void printArrayFor(char[] charArray) {

		for (int i = 0; i < charArray.length; i++) {

			System.out.println("position " + i + " - value: " + charArray[i]);

		}

	}

}
