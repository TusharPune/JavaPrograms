package Java;

public class StringCompare {

	public static void main(String[] args) {
		

		String str1= "JAVA TEST"; 
		String str2= "java test";
		String str3= "JAVA TEST"; 
		String str4= "JAVA";
		Object obj= str1; 
		String b ="225"; 
		String c= new String("225");
		
		System.out.println(str1.compareTo(str2) ); //-32
		System.out.println(str1.compareToIgnoreCase(str2));  //0
		System.out.println(str1.compareTo(obj.toString())); //0
		System.out.println(str1==str3);//true
		System.out.println(b.equals(c));//false
		
		
		int a=5;
		int b1=2;
		int c1 = a/b1; 
		
		System.out.println(c1);
		
		
		
		
		
		
		
	}

}
