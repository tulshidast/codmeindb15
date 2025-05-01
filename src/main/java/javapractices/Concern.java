package javapractices;

public class Concern {

	public static void main(String[] args) {

		Concern concern = new Concern();
		concern.test();

	}

	public void test() {
		int arr[] = { 10, 20, 5, 3 };
		String s = "Codemind";

		try {
			System.out.println(s.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index out of bounds exception");
		}

		try {
			System.out.println(arr[30]);
			Class.forName("");

		} catch (ClassNotFoundException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception");
		}

	}

}
