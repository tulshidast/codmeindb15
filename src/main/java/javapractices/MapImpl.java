package javapractices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapImpl {

	public static void main(String[] args) {

		Map<Long, String> map = new HashMap<Long, String>();

		map.put(344352378967L, "sachin");
		map.put(987634521785L, "virat");
		map.put(998428761982L, "rohit");
		map.put(765792489072L, "hardik");

		map.put(344352378967L, "rahul");
		map.put(276528569736L, "virat");
		map.put(null, null);
		map.put(676785650879L, null);

		Set<Entry<Long, String>> set = map.entrySet();

		Iterator<Entry<Long, String>> it = set.iterator();

		while (it.hasNext()) {

			Entry<Long, String> ee = it.next();
			// System.out.println(ee);
			System.out.println(ee.getKey() + " : " + ee.getValue());

		}
		
		// user defined class as value
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		Student s1 = new Student("sachin", 10, 'A');
		Student s2 = new Student("rohit", 11, 'B');
		Student s3 = new Student("saurav", 12, 'A');

		Map<Integer, Student> m = new HashMap<Integer, Student>();
		m.put(10, s1);
		m.put(11, s2);
		m.put(12, s3);

		Set<Entry<Integer, Student>> eee = m.entrySet();

		Iterator<Entry<Integer, Student>> it2 = eee.iterator();

		while (it2.hasNext()) {

			Entry<Integer, Student> e2 = it2.next();
			System.out.println(e2.getKey() + " : " + e2.getValue().toString());

		}

	}

}
