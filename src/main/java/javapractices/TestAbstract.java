package javapractices;

public class TestAbstract {

	public static void main(String[] args) {

		TestAbs testAbs = new TestAbs();

		testAbs.testing();
		System.out.println(testAbs.addition(40, 50));

		Abs ab = new TestAbs();
	}

}

abstract class Abs {

	public Abs() {

		System.out.println("Constructor from abstract class");

	}

	public void testing() {

		System.out.println("Non abstract method");
	}

	/**
	 * This method will do addition of two integer numbers.
	 * 
	 * @param a provide a as int
	 * 
	 * @param b provide b as int
	 * 
	 * @return addition returns addition of two given numbers
	 * 
	 */
	public abstract int addition(int a, int b);

}

class TestAbs extends Abs {

	public TestAbs() {
		super();
		System.out.println("Child class constructor");

	}

	public int addition(int a, int b) {
		return a + b;
	}

}