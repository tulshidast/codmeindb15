package javapractices;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Welcome to codemind");
		sb.reverse();

		System.out.println(sb);

		StringBuilder stringBuilder = new StringBuilder("Welcome to codemind");

		stringBuilder.reverse();

		System.out.println(stringBuilder);

		// String class
		String s = "welcome";

		System.out.println(s.concat(" to codemin"));

		System.out.println(s);

	}

}
