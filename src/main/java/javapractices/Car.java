package javapractices;

public class Car {

	// properties will be represented by instance/object member variable
	String color;
	String mfg;
	int speed;
	int sum = 20;

	public Car(String color, String mfg, int speed) {
		this.color = color;
		this.mfg = mfg;
		this.speed = speed;
	}

	// Behavior will be represented by instance/object member functions/methods
	public void start() {
		System.out.println("Starting car");
		System.out.println(color);
		System.out.println(mfg);
		System.out.println(speed);
		sum = sum + 10;
		System.out.println();
	}

	public void run() {
		System.out.println("Sum value is = " + sum);
		System.out.println("Running car");
	}

	public static void main(String args[]) {

		Car c = new Car("White", "tata", 140);
		c.start();
		c.run();

		c.color = "Red";

		System.out.println(c.color);

		c.start();

	}

}
