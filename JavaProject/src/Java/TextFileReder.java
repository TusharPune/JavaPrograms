package Java;

import java.io.File;

import java.io.IOException;

import java.util.Scanner;

public class TextFileReder {

	public static void main(String[] args) throws IOException {

		File file = new File("/home/tushar/test.txt");
		Scanner sc = new Scanner(file);
 String Str1=sc.toString();
		String str4[] = Str1.split(",");

		for (int i = 0; i <= str4.length-1 ; i++) {

			System.out.println(str4[i]);
		}

//		while (sc.hasNextLine()) {			
//			String sc2 = sc.nextLine();
//			String[] fName = sc2.split(",");			
//			String result = fName[0];
//			System.out.println(result);
//		}

	}

}
