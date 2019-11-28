package InterviewQuestion;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 123456;

		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Revers Number : "+rev);
		
		
		int num2=56789; 
		
		StringBuffer sf= new StringBuffer(String.valueOf(num2)); 
		
		System.out.println(sf.reverse()); 
		
		
	}

	private static StringBuffer StringBuffer(String valueOf) {
		// TODO Auto-generated method stub
		return null;
	}

}
