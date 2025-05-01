package javapractices;

public class StringPractices {

	public static void main(String[] args) {

		String s = new String("Sachin");

		System.out.println(s);

		String ss = "Saurav";

		System.out.println(ss);

		String sss = "Saurav";

		System.out.println(ss.hashCode());
		System.out.println(sss.hashCode());

		String h = "Hardik";

		String hh = h.concat(" Pandya"); // Hardik Pandya

		System.out.println(h); // Hardik

		System.out.println(hh);

	}

}
