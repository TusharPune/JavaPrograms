package InterviewQuestion;

import java.util.Arrays;

public class secondlagraestnumber {

	public static void main(String[] args) {
		
		int a[] = {0,1,2,1,1,5,1,0,1};
		
		Arrays.sort(a);		
		System.out.println(a);
		
		for (int SorttedNumber:a) {
			System.out.print(SorttedNumber);		
			
		}
		
		System.out.println("Second lagraest number::"+a[1]);
		
		
		
		
	}

}
