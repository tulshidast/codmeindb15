package javapractices;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSetMethods {

	public static void main(String[] args) {

		LinkedHashSet<Integer> l1 = new LinkedHashSet<Integer>();

		// Appends the specified element to the end of this list.
		l1.add(10);
		l1.add(20);
		l1.add(100);
		l1.add(200);

		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		l2.add(40);
		l2.add(50);

		System.out.println(l1);

		l1.addAll(l2);

		System.out.println(l1);

		System.out.println("######################################");

		// Returns the number of elements in this list.
		System.out.println("Size of list = " + l1.size());

		System.out.println("#######################");

		// Returns true if this list contains the specified element.
		System.out.println("L1 contains 12 = " + l1.contains(l2));
		System.out.println("L1 contains 50 = " + l1.contains(50));

		System.out.println("###################");
		System.out.println("l1 contains l2 = " + l1.containsAll(l2));

		System.out.println("#######################");
		// Returns true if this list contains no elements
		System.out.println("L1 is empty = " + l1.isEmpty());

		System.out.println("##########################");
		// remove element using index
		l1.remove(0);

		System.out.println(l1);

		Set<String> l3 = new LinkedHashSet<>();

		l3.add("sachin");
		l3.add("saurav");
		l3.add("hardik");
		l3.remove("hardik");

		System.out.println("L3 elements = \n" + l3);

		// Removes all of the elements from this list

		System.out.println("###########################");
		System.out.println(l1);

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		LinkedHashSet<Integer> l4 = new LinkedHashSet<Integer>();
		l4.add(200);
		l4.add(100);
		l4.add(150);

		l1.removeAll(l4);
		System.out.println(l1);

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(l1);
		System.out.println("################################");

		Iterator<Integer> it = l1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("##################");

		l1.clear();
		System.out.println(l1);

	}

}
