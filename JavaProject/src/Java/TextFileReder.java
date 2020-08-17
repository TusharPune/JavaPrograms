package Java;

import java.io.File;

import java.io.IOException;

import java.util.Scanner;

public class TextFileReder {

	public static void main(String[] args) throws IOException {

		File file = new File("/home/tushar/test.txt");
		Scanner sc = new Scanner(file);
String i=sc.toString(); 


		while (sc.hasNextLine()) {			
			String sc2 = sc.nextLine();
			String[] fName = sc2.split(",");			
			String result = fName[0];
			System.out.println(result);
		}

	}

}
