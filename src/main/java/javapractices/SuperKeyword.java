package javapractices;

public class SuperKeyword {

	public static void main(String[] args) {

		new Bchild().bChild();

	}

}

class Aparent {

	//int a = 30;

	public Aparent() {
		System.out.println("Parent class constructor");
	}

	public Aparent(int a) {
		System.out.println("Parent class parameterized constructor");
	}

	public void aParent() {

	}

}

class Bchild extends Aparent {

	int a = 40;

	public Bchild() {
		super(10);
	}

	public void bChild() {

		super.aParent();
		System.out.println(super.a + a);

	}

}