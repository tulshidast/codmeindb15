package javapractices;

public class Practice {

	public static void main(String[] args) {

		String s = "Welcome to codemind";

		String ss = "";

		int count = 1;

		for (int i = 0; i < s.length(); i++) {

			if (!(ss.contains(String.valueOf(s.charAt(i))))) {

				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {

						count++;
					}

				}

				System.out.println(s.charAt(i) + " = " + count);
				ss = ss + s.charAt(i);
				count = 1;

			}

		}

		System.out.println("##############################################");

		String str = "Welcome to pune";

		//

		str = str.replace('l', '$');

		str = str.replace("o", "To");

		System.out.println(str);

	}

}
