package JavaBasics;

//Reverse string program 
//Difference betw String and String buffer 


public class ReverseString {

	public static void main(String[] args) {

		String s = "Selenium";
		String Rev = "";
		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {
			Rev = Rev + s.charAt(i);
		}
		System.out.println("Using for loop : "+Rev);
		
		
		
		StringBuffer sf= new StringBuffer(s);
				
				System.out.println("Using String Buffer class : " + sf.reverse());
	}

}
