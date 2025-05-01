package javapractices;

public class TryConstruct {

	public static void main(String[] args) {

		TryConstruct tryConstruct = new TryConstruct();
		tryConstruct.div(10, 0);

	}

	public int div(int a, int b) {

		int result = 0;

		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Runtime Please do not try to devide by zero");
		} catch (NullPointerException e) {
			System.out.println("Arithmatic Please do not try to devide by zero");
		} catch (RuntimeException e) {
			System.out.println("Runtime Please do not try to devide by zero");
		} finally {

		}

		System.out.println("Result = " + result);

		return result;
	}

	public int add(int a, int b) {
		int result = a + b;
		System.out.println(result);
		return result;
	}

}
