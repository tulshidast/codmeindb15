package javapractices;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

public class TreeMapMethods {

	public static void main(String[] args) {

		TreeMap<Long, String> map = new TreeMap<Long, String>();

		map.put(344352378967L, "sachin");
		map.put(987634521785L, "virat");
		map.put(998428761982L, "rohit");
		map.put(765792489072L, "hardik");
		map.put(344352378968L, "rahul");
		map.put(276528569736L, "virat");

		System.out.println(map);
		System.out.println("###############################");

		TreeMap<Long, String> map2 = new TreeMap<Long, String>();
		map2.put(234345434543l, "ravindra");

		map.putAll(map2);

		System.out.println(map);

		System.out.println("################################");

		System.out.println("map contains 765792489072L = " + map.containsKey(765792489072L));
		System.out.println("map contains 765792489009L = " + map.containsKey(765792489009L));

		System.out.println("##########################################################");
		System.out.println("map contains ravindra = " + map.containsValue("ravindra"));
		System.out.println("map contains jofra = " + map.containsValue("jofra"));

		System.out.println("###############################################");

		System.out.println(map.get(765792489072L));

		System.out.println("##################################");
		System.out.println("map is empty = " + map.isEmpty());

		System.out.println("###########################");

		Set<Long> keySet = map.keySet();

		for (Long l : keySet) {
			System.out.println(l);
		}

		System.out.println("########################");

		// map.remove(344352378968L);
		map.remove(344352378968L, "rahul");

		System.out.println(map);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		map.replace(765792489072L, "krunal");

		System.out.println(map);

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		System.out.println("Size of map = " + map.size());

		System.out.println("################################");

		Collection<String> values = map.values();

		Iterator<String> it4 = values.iterator();

		while (it4.hasNext()) {
			System.out.println(it4.next());

		}

		System.out.println("######################");
		map.clear();
		System.out.println(map);
		System.out.println(map.size());

	}

}
