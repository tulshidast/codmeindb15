package javapractices;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCharacteristics {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();

		set.add(10);
		set.add(5);
		set.add(20);
		set.add(30);
		set.add(100);
		set.add(10);
		
		// null insertion not allowed here
		//set.add(null);

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
