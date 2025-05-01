package javapractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectionsUse {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(100);
		list.add(5);
		list.add(30);
		list.add(200);

		System.out.println(list);

		Collections.sort(list);

		System.out.println("After sorting");
		System.out.println(list);

		Collections.reverse(list);

		System.out.println("After reverse");

		System.out.println(list);

		System.out.println("Min from list = " + Collections.min(list));
		System.out.println("Max from list = " + Collections.max(list));

		List<Integer> lst = Arrays.asList(10, 20, 30, 40);

		HashSet<Integer> hset = new HashSet<Integer>(list);
		ArrayList<Integer> list1 = new ArrayList<Integer>(hset);

	}

}
