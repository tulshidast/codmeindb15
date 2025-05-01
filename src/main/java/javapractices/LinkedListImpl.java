package javapractices;

import java.util.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(5);
		linkedList.add(7);
		linkedList.add(20);
		linkedList.add(100);
		linkedList.add(null);
		linkedList.add(5);

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}

	}

}
