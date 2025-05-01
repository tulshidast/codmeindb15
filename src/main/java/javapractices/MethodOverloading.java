package javapractices;

public class MethodOverloading {

	public static void main(String[] args) {

		Child c = new Child();

		float f = c.addition(10.5f);
		System.out.println(f);

		c.addition(10, 20);

	}

	public void addition() {
		System.out.println(10 + 20);
	}

	public int addition(int a) {
		return a + 20;
	}

	public float addition(float a) {
		return a + 20;
	}

}

class Child extends MethodOverloading {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}
}
