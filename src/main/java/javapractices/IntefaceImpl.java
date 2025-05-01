package javapractices;

public class IntefaceImpl {

	public static final int c = 50;
	int d = 40;

	public static void main(String[] args) {

		MyImplClass myImplClass = new MyImplClass();

		myImplClass.addition();
		myImplClass.mul();

		// MyInterface myInterface = new MyImplClass();

	}
}

interface MyInterface {

	public static final int a = 30;

	int b = 40;

	/**
	 * This method will do addition of two integer numbers.
	 * 
	 */
	public abstract void addition();
	

	/**
	 * This method will do subtraction of two integer numbers.
	 * 
	 */
	void sub();

}

class MyImplClass implements MyInterface {

	@Override
	public void addition() {
		System.out.println(10 + 20);

	}

	@Override
	public void sub() {
		System.out.println(30 - 20);

	}

	public void mul() {
		System.out.println(10 * 2);
	}

}