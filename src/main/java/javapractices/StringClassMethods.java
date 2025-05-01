package javapractices;

public class StringClassMethods {

	public static void main(String[] args) {

		String s = "Welcome to codemind";

		System.out.println("Character at specified index is = " + s.charAt(5));

		System.out.println(s.concat(" technology"));

		System.out.println(s.compareTo("technology"));

		System.out.println(s.compareTo("Welcome to codemind"));

		System.out.println(s.compareTo("Technology"));

		System.out.println(s.compareToIgnoreCase("welcome to codeMind"));

		System.out.println(s.compareToIgnoreCase("Technology"));

		System.out.println(s.contains(" to "));

		System.out.println(s.endsWith(" to codemind"));

		System.out.println(s.equals("Welcome to codemind"));

		System.out.println(s.equalsIgnoreCase("Welcome To Codemind"));

		System.out.println(s.indexOf('o'));
		System.out.println(s.indexOf("codemind"));

		System.out.println(s.indexOf('o', 10));

		System.out.println("".isBlank());
		System.out.println("   ".isBlank());
		System.out.println(s.isBlank());

		System.out.println(s.isEmpty());

		System.out.println("".isEmpty());

		System.out.println(s.lastIndexOf('o'));

		System.out.println(s.length());

		System.out.println(s.replace('o', 'O'));

		System.out.println(s.replace("co", "CO"));

		String ss = "11FDG$%$dfhgfh324";

		System.out.println(ss.replaceAll("[^0-9]", ""));

		System.out.println(ss.replaceFirst("[FD]", "99"));

		String a[] = s.split(" ");

		for (String sss : a) {
			System.out.println(sss);
		}

		// Welcome to codemind

		System.out.println(s.startsWith("Welcome"));

		System.out.println(s.substring(11));

		System.out.println(s.substring(0, 7));

		char arr[] = s.toCharArray();

		for (char c : arr) {
			System.out.print(c);
		}

		System.out.println();
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		String sss = "      Welcome     to  codmeind     ";
		System.out.println(sss);
		System.out.println(sss.trim());

		int aa = 10;

		String ssss = String.valueOf(aa);

		System.out.println(ssss.length());

		boolean b = true;

		String t = String.valueOf(b);

		System.out.println(t.length());

	}

}
