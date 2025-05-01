package javapractices;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {

		TreeMap<Long, String> map = new TreeMap<Long, String>();

		map.put(344352378967L, "sachin");
		map.put(987634521785L, "virat");
		map.put(998428761982L, "rohit");
		map.put(765792489072L, "hardik");

		map.put(344352378967L, "rahul");
		map.put(276528569736L, "virat");

		// even single null key is not allowed in tree map
		// map.put(null, null);

		map.put(676785650879L, null);

		Set<Entry<Long, String>> set = map.entrySet();

		Iterator<Entry<Long, String>> it = set.iterator();

		while (it.hasNext()) {

			Entry<Long, String> ee = it.next();
			// System.out.println(ee);
			System.out.println(ee.getKey() + " : " + ee.getValue());

		}

		// class cast exception
		TreeMap tmap = new TreeMap();
		tmap.put(344352378967L, "sachin");
		tmap.put(344352378966L, 'C');
		tmap.put(new Student("sachin", 12, 'C'), "rohit");
	}

}
