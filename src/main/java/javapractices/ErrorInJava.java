package javapractices;

public class ErrorInJava {

	public static void main(String[] args) {

		new ErrorInJava().test();

	}

	public void test() {
		System.out.println(1000 + 2000);
		test();
	}

}
