package javapractices;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {

		TreeSet<Integer> l1 = new TreeSet<Integer>();

		// Appends the specified element to the end of this list.
		l1.add(10);
		l1.add(20);
		l1.add(100);
		l1.add(200);

		TreeSet<Integer> l2 = new TreeSet<Integer>();
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

		Set<String> l3 = new TreeSet<>();

		l3.add("sachin");
		l3.add("saurav");
		l3.add("hardik");
		l3.remove("hardik");

		System.out.println("L3 elements = \n" + l3);

		// Removes all of the elements from this list

		System.out.println("###########################");
		System.out.println(l1);

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		TreeSet<Integer> l4 = new TreeSet<Integer>();
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

		Iterator<Integer> it3 = l1.descendingIterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}

		System.out.println("##################");

		l1.clear();
		System.out.println(l1);

	}

}
