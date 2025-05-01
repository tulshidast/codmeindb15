package javapractices;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();

		set.add(10);
		set.add(5);
		set.add(20);
		set.add(30);
		set.add(100);
		set.add(10);
		set.add(null);

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
