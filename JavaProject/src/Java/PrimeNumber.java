package Java;

public class PrimeNumber {

	public static void main(String args[]) {

		int num = 11;
		int count = 0;
		boolean isprime=true;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println(num + " PRIME NUMBER");
			} else {
				System.out.println(num + " NOT PRIME NUMBER");
			}
		} else {
			System.out.println(num + " NOT A PRIME NUMBER");
		}
//
//		for (int i=2;i<=num/2;i++) {
//			
//			if(num%i==0) {
//				
//				isprime=false; 
//				
//				System.out.println("Given Number is not prime "+ i);
//				
//			}
//			System.out.println("Given Number is prime "+ i);
//			
//			
//			
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
