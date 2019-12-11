package InterviewQuestion;

public class StringManipulation {

	public static void main(String args[]) {

		String Str = "Test java project with the help for selenium";

		// Find particular charater using index Numnber
		System.out.println(Str.charAt(6));

		// Find particular charater index using String
		System.out.println(Str.indexOf("p"));

		// find 2nd p index number ---similar for 3rd...
		System.out.println(Str.indexOf("p", Str.indexOf("p") + 1));

		// find particular string index
		System.out.println(Str.indexOf("project"));

		// compare two string
		String Str2 = "Test Java project with the help for selenium";
		System.out.println(Str.equals(Str2)); // case sensitive
		System.out.println(Str.equalsIgnoreCase(Str2));// non case sensitive

		// Find substring
		System.out.println(Str.substring(10, 30));

		// Trim
		String Str3 = "    Test Java project     ";
		System.out.println(Str3.trim());
		// replace all space using ,
		System.out.println(Str.replace(" ", ","));

		// Trim
		String date = "11-12-2019";
		System.out.println(date.replace("-", "/"));

		// Split

		String str4[] = Str.split(" ");

		for (int i = 0; i <= str4.length-1 ; i++) {

			System.out.println(str4[i]);
		}

	}

}
