package javapractices;

import java.util.ArrayList;

public class ArrayListImpl {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(5);
		arrayList.add(7);
		arrayList.add(20);
		arrayList.add(100);
		arrayList.add(null);
		arrayList.add(5);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

	}

}
