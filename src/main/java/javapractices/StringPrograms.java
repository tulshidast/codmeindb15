package javapractices;

public class StringPrograms {

	public static void main(String[] args) {

		String s = "Welcome to codemind";

		// reverse given String
		// dnimedoc ot emocleW
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		System.out.println();

		// reverse words from given String
		// emocleW ot dnimedoc

		String arr[] = s.split(" ");

		for (String ss : arr) {

			for (int i = ss.length() - 1; i >= 0; i--) {
				System.out.print(ss.charAt(i));
			}

			System.out.print(" ");
		}

		System.out.println();

		String ss = "1233%4dfDFG3$%fg";

		// print only digits
		// 123343

		System.out.println(ss.replaceAll("[0-9]", ""));
		System.out.println(ss.replaceAll("[A-Z]", ""));
		System.out.println(ss.replaceAll("[a-z]", ""));
		System.out.println(ss.replaceAll("[%$]", ""));

		System.out.println(ss.replaceAll("[^0-9]", ""));

		System.out.println(ss.replaceAll("[^0-9a-zA-Z]", ""));

		System.out.println(ss.replaceAll("[0-9a-zA-Z]", ""));

		String sss = "Welcome to codemind";

		int count = 0;

		for (int i = 0; i < sss.length(); i++) {
			if (sss.charAt(i) == 'm') {
				count++;
			}
		}

		System.out.println("Count of m = " + count);

		int count1 = 1;
		String ssss = "";

		for (int i = 0; i < sss.length(); i++) {

			if (!(ssss.contains(String.valueOf(sss.charAt(i))))) {
				for (int j = i + 1; j < sss.length(); j++) {
					if (sss.charAt(i) == sss.charAt(j)) {
						count1++;
					}
				}
				System.out.println(sss.charAt(i) + " = " + count1);
				count1 = 1;
			}

			ssss = ssss + sss.charAt(i);
		}

		System.out.println("####################################################");

		String str = "Simapatil19@gmail.com";

		String str2 = str.substring(0, 11);
		
		String a[]=str.split("@");

		String str3 = a[1];

		for (int i = str2.length() - 1; i >= 0; i--) {
			System.out.print(str2.charAt(i));
		}
		System.out.print("@"+str3);

	}

}
