package Java;

public class SwapNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int x;

		
		System.out.println("a:: "+a+" "+"b :: "+b);
		// using 3rd variable
		x = b;
		b = a;
		a = x;
		System.out.println("1st :: "+a+" "+b);
		
		// using two variable

		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("2st ::"+a+" "+b);
		
		
		//3rd 
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		
		System.out.println("3rd :: "+a+" "+b);
		
		
		//using  xor
		
		a=a^b;
		b=a^b;
		a=a^b;

		System.out.println("4th :: "+a+" "+b);
	}

}
