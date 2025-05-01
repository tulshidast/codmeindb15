package javapractices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCharacteristics {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

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
