package javapractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCharacteristics {

	public static void main(String[] args) {

		// hetrogenouse objects are allowed but we never used in realtime

//		List l1 = new ArrayList();
//		
//		l1.add(10);
//		l1.add(20.5f);
//		l1.add("sachin");
//		
//		for(Object obj:l1)
//		{
//			System.out.println(((String)obj).length());
//		}

		List<Integer> l1 = new ArrayList<Integer>();

		// List<Integer> a = Arrays.asList(10, 20, 30, 100);

		l1.add(10);
		l1.add(5);
		l1.add(100);
		l1.add(20);
		l1.add(9);
		l1.add(null);
		l1.add(100);

		System.out.println(l1);

		for (Integer i : l1) {
			System.out.println(i);
		}
	}

}
