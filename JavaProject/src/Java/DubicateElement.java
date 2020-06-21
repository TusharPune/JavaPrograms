package Java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DubicateElement {

	public static void main(String[] args) {

		String name[] = { "Java", "Test", "Java" };
//
//		for (int i = 0; i <= name.length; i++) {
//			for (int j = i + 1; j <= name.length; j++) {
//				if (name[i].equals(name[j])) {
//					System.out.println("Dublicate Element ::" + name[i]);
//				}
//			}
//
//		}
//		
		
/// Second solutions______________________....///
		
		
		Set<String> obj= new HashSet<String>(); 		
		for (String obj2 : name ) {
			if(obj.add(obj2)== false) {
				System.out.println("Dublicate Element ::" + obj2);
			}
			
			
		}
		
		

	}

}
