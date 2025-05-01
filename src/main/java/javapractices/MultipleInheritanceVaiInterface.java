package javapractices;

public class MultipleInheritanceVaiInterface {

	public static void main(String[] args) {

		A a = new D();
		a.a();

		B b = new D();
		b.a();
		b.test();

		D d = new D();
		d.a();
		d.test();

	}

}

interface A {

	public abstract void a();
}

interface B {

	public abstract void a();

	public abstract void test();
}

interface C extends A, B {

}

class D implements A, B {

	@Override
	public void test() {
		System.out.println("This is test");

	}

	@Override
	public void a() {
		System.out.println("This is a came from both interface");

	}

}