package javapractices;

public class Inheritance {

	public static void main(String[] args) {

		FourWheelerVehicle fourWheelerVehicle = new FourWheelerVehicle();

		// parent properties and behavior
		System.out.println(fourWheelerVehicle.color);
		fourWheelerVehicle.run();

		// Child's properties and behavior
		System.out.println(fourWheelerVehicle.topSpeed);
		fourWheelerVehicle.stop();

		System.out.println(FourWheelerVehicle.milage);

		TwoWheelerVehicle twoWheelerVehicle = new TwoWheelerVehicle();
		twoWheelerVehicle.run();

		Bicycle bicycle = new Bicycle();
		System.out.println(bicycle.color);
		System.out.println(bicycle.numberOfWheeles);

	}

}

class Vehicle {

	// properties
	String color = "White";
	String mfg = "Tata";
	static int milage;

	// Behavior
	public void run() {
		System.out.println("Running");
	}
}

class FourWheelerVehicle extends Vehicle {

	// properties
	int topSpeed = 280;

	// Behavior

	public void stop() {
		System.out.println("Stopping");
	}
}

class TwoWheelerVehicle extends Vehicle {

	int numberOfWheeles = 2;

}

class Bicycle extends TwoWheelerVehicle {

}