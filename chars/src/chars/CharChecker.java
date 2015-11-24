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

}
