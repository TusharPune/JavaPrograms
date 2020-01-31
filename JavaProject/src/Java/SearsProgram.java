package Java;

public class SearsProgram {

	public static void main(String[] args) {
		
		String str = "Yagna", nstr = " ", nstr2 = " ";
		String strA[] = { "Y", "A", "G", "N", "A" };
//		int lng = str.length();
		int lng = strA.length;
		for (int i = 0; i <= lng - 1; i++) {
//			System.out.println(nstr = nstr + str.charAt(i));
			System.out.println(nstr = nstr + strA[i]);
		}
		for (int j = lng - 1; j >= 0; j--) {
			for (int k = 0; k <= j - 1; k++) {
//				nstr2 = nstr2 + str.charAt(k);
				nstr2 = nstr2 + strA[k];
			}
			System.out.println(nstr2);
			nstr2 = " ";

		}
	}

}