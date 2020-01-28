package InterviewQuestion;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING");

		String str = sc.nextLine();

		int count = 1;

		for (int i = 0; i <= str.length() - 1; i++) {

			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}

		System.out.println("Words Count ::  " + count);
	}

}
