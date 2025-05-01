package javapractices;

public class ThisUse_2 {

	int a = 10;
	static int c = 30;

	public ThisUse_2() {
		System.out.println("Default constructor");
	}

	public ThisUse_2(int a) {
		this(10, 50);
		System.out.println(a + c);
		System.out.println("One parameter constructor");
	}

	public ThisUse_2(int a, int b) {
		System.out.println(a + b);
		System.out.println("Two parameter constructor");
	}

	public static void main(String[] args) {

		ThisUse_2 thisUse_2 = new ThisUse_2();

		System.out.println("hash code via reference variable = " + thisUse_2.hashCode());

		thisUse_2.add();

		ThisUse_2 thisUse_3 = new ThisUse_2();

		System.out.println("hash code via reference variable = " + thisUse_3.hashCode());

		thisUse_3.add();

		System.out.println("#########################################################");

		new ThisUse_2(10);

	}

	public void add() {

		int a = 30;
		System.out.println("Instance member variable and local member variable with same name addition = " + (this.a + a));
		System.out.println("Instance member variable and local member variable with same name addition = " + (a + a));

		System.out.println();
		System.out.println(10 + 20);
		System.out.println("hash code via this keyword = " + this.hashCode());

		this.div();
	}

	public void div() {
		System.out.println(10 / 5);
	}

}
