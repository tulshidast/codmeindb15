package javapractices;

import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();
		vector.add(10);
		vector.add(5);
		vector.add(7);
		vector.add(20);
		vector.add(100);
		vector.add(null);
		vector.add(5);

		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}

	}

}
