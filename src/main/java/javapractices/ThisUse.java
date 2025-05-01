package javapractices;

public class ThisUse {

	// instance member variable
	int a = 10;
	static int b = 20;

	// static member function
	public static void main(String[] args) {

		ThisUse t = new ThisUse();

		System.out.println(t.a + ThisUse.b);
	}

	// instance member function
	public void test() {
		System.out.println("Instance member function");
	}

}
