package javapractices;

public class MethodOverriding {

	public static void main(String[] args) {

		Vehicle2 v = new TwoWheelerVehicle2();

		v.changeGear();

	}

}

class Vehicle2 {

	public void changeGear() {
		System.out.println("Change four wheeler vehicle gear");

	}
}

class TwoWheelerVehicle2 extends Vehicle2 {

	public void changeGear() {
		System.out.println("Change two wheeler gear");

	}
}
