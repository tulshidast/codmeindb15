package javapractices;

import java.util.ArrayList;

public class Queries_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "$23.39";
		s = s.replaceAll("[^0-9]", "");
		Integer.parseInt(s);

		// type casting
		double a = 10.30;

		float b = (float) a;

		// boxing
		int primitiveInt = 10;
		Integer boxedInt = Integer.valueOf(primitiveInt); // Boxing: int to Integer

		// un boxing
		Integer boxedInt_1 = Integer.valueOf(10); // Creating a wrapper object
		int primitiveInt_1 = boxedInt_1; // Unboxing the Integer object to int

		// auto boxing
		int cc = 1000;
		Integer dd = cc;

		ArrayList al = new ArrayList();

		al.add("sachin");
		al.add(10);
		al.add(20);

		int num = 0;

		for (Object obj : al) {

			if (obj instanceof Integer) {
				num = num + (Integer) obj;
			}
		}
		System.out.println("Num = " + num);

	}

}
