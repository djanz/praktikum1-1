package chars;

public class App {

	public static void main(String[] args) {

		CharChecker cc = new CharChecker();

		String s = "praktikum";

		char[] charArray = cc.toArray(s);
		cc.printArrayFor(charArray);

		// App app = new App();
		// app.iter(s, 10);

	}

	void iter(String s, int limit) {

		int j = 0;
		for (; j <= limit;) {
			System.out.println("count: " + j + " " + s);
			j++;
		}
		System.out.println("\n");

		System.out.println("++++++++++++++++++");

		System.out.println("\n");

		int i = 0;
		while (i <= limit) {
			System.out.println("count: " + i + " " + s);
			i++;
		}

	}

}
