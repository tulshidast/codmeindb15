package javapractices;

public class RuntimeExceptionExample {

	public static void main(String[] args) {

		RuntimeExceptionExample runtimeException = new RuntimeExceptionExample();
		System.out.println("division = " + runtimeException.div(100, 100));
		// System.out.println("division = " + runtimeException.div(100, 0));

		runtimeException.stringLenth("Welcome to codemind");
		// runtimeException.stringLenth(null);

		int num = runtimeException.convertStringToNumber("10");
		System.out.println("Squire of number = " + num * num);

		// runtimeException.convertStringToNumber("12wer");

		System.out.println(runtimeException.getCharacter("Welcome to codemind", 5));

		// System.out.println(runtimeException.getCharacter("Welcome", 10));

		System.out.println("String from index = " + runtimeException.getStringFromIndex(3));
		// System.out.println("String from index = " +
		// runtimeException.getStringFromIndex(4));
		
		System.out.println("Last line");
	}

	public char getCharacter(String s, int index) {
		return s.charAt(index);
	}

	public int div(int a, int b) {
		return a / b;
	}

	public void stringLenth(String s) {
		System.out.println("String length = " + s.length());
	}

	public int convertStringToNumber(String numericString) {
		return Integer.parseInt(numericString);
	}

	public String getStringFromIndex(int index) {
		String arr[] = { "Welcome", "to", "codemind", "technology" };
		return arr[index];
	}
}
