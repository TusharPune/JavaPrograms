package JavaBasics;

public class MissingNumber {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 5, 6, 7 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

			
		}
		System.out.println("Toatl sum of avialble number :::" + sum);

		int sum1 = 0;

		for (int j = 1; j <= 7; j++) {

			sum1 = sum1 + j;
		}

		System.out.println("Actual Sum::" + sum1);

	

//	Actual to number sum + avilable number  sum = missing number 
    int Missing_Number = (sum1-sum) ;
	
	
	
	System.out.println("Missing Number :::"+Missing_Number);
	
	}

}
