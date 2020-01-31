package JavaBasics;

public class CountEvenOddNumber {
	
	
	public static void main(String[] args)
	{
	     int num=7986123;
	     int event_count=0;
	     int odd_count=0;
	     
	     while(num>0)
	     {
	    	 int rem=num % 10;
	    	 if (rem % 2==0)
	    	  {
				    event_count++;
			} else 
			{
             odd_count++;
             
             //Test
			}
	    	 num=num/10;
	     }
	     
	     System.out.println("NUMBER OF EVEN NUMBERS :: "+event_count);
	     System.out.println("NUMBER OF ODD NUMBERS :: "+odd_count);
	}


}
