package Java;

public class SearsProgram {

	public static void main(String[] args) {

		String test = "";
		String test2 = "";

		String str[] = { "S", "E", "A", "R", "S" };
		System.out.println(str.length);

		for (int i = 0; i <= str.length - 1; i++) {
			test = test + str[i];
			System.out.println(test);
		}

		for (int i = str.length; i >= 1; i++) {
//			System.out.println(test);
			for (int j = 1; i <= i; j++) {
				test2 = test2 + str[j];

			}
			System.out.println(test);

		}
	}

}