package javapractices;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapProgram {

	public static void main(String[] args) {

		// Welcome to codemind technology
		// W = 1, e = 4, l = 2 and so on

		String s = "Welcome to codemind technology";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (!(map.containsKey(s.charAt(i)))) {
				map.put(s.charAt(i), 1);
			}

			else {
				map.put(s.charAt(i), (map.get(s.charAt(i)) + 1));

			}

		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		Iterator<Entry<Character, Integer>> it = set.iterator();

		while (it.hasNext()) {

			Entry<Character, Integer> e = it.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
