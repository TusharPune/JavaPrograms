package JavaBasics;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "漢字漢字漢字 <ab漢cd漢z AMN漢C 11311漢21";
		
		s = s.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s);

		
		String s2="01231441131000111"; 
		
		s2 = s2.replaceAll("[^1]", "");
		
		
		System.out.println(s2+"::"+s2.length());

//		Regular expression = [^a-zA-Z0-9]

		
		

	}
}