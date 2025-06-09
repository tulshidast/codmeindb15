package testpackages;

public class JavaPrograms {

	public static void main(String[] args) {

		int num = 6;

		boolean result = true;

		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				result = false;
			}
		}

		if (result) {

			System.out.println("Number is prime = " + num);
		} else {
			System.out.println("Number is not prime = " + num);
		}
	}

}
