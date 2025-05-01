package javapractices;

public class EncapsulationInJava {

	public static void main(String args[]) {

		Cd cd = new Cd();
		cd.setA(10);
		System.out.println(cd.getA());

		cd.setB(30);
		System.out.println(cd.getB());
	}

}

class Cd {

	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
