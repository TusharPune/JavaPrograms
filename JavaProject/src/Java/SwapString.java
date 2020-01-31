package Java;

public class SwapString {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";

		a = a + b; // Hello + World= HelloWorld

		System.out.println("a length:: " + a.length());// 5
		System.out.println("b length:: " + b.length());// 5

		b = a.substring(0, a.length() - b.length());// 0 to 5=Hello
		a = a.substring(b.length());// 5 Onward

		System.out.println("a:: " + a);
		System.out.println("b:: " + b);
	}

}
