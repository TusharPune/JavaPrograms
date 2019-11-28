package InterviewQuestion;

public class StarPattrn {

	static int i, j, k;

	public static void main(String[] args) {

		StarPattrn obj = new StarPattrn();
		obj.leftsidetrangle();

		rightsidepattern();
		centerstrighttrangle();
		ceterreverstrangle();
		maintrangle();
		

	}

	public void leftsidetrangle() {

		// *
		// **
		// ***
		// ****

		for (i = 0; i <= 4; i++) {

			for (j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();

		}
	}

	public static void rightsidepattern() {

//		 * * * *
//		 * * *
//		 * *
//		 *

		for (i = 4; i >= 0; i--) {

			for (j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}

	public static void centerstrighttrangle() {
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		*********
		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void ceterreverstrangle() {

//		*********
//		 *******
//		  *****
//		   ***
//		    *

		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void maintrangle() {

		
		
//			*
//		   ***
//		  *****
//		 *******
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
		for (i = 1; i <= 5; i++) {
			for (j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 4; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
