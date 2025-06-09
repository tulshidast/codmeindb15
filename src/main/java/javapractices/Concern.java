package javapractices;

import java.util.ArrayList;
import java.util.Arrays;

public class Concern {

	public static void main(String[] args) {

		Concern concern = new Concern();
		concern.test();

	}

	public void test() {
		int arr[] = { 10, 20, 5, 3 };
		String s = "Codemind";

		try {
			System.out.println(s.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index out of bounds exception");
		}

		try {
			System.out.println(arr[30]);
			Class.forName("");

		} catch (ClassNotFoundException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception");
		}

		System.out.println("##############################################");

		String str = "abc2 name1 codemind4 test3 batch5";

		// name1 abc2 test3 codemind4 batch5

		String array[] = str.split(" ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].charAt(array[i].length() - 1) > array[j].charAt(array[j].length() - 1)) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (String sss : array) {
			System.out.println(sss);
		}

		ArrayList<String> lst = new ArrayList<String>();
		
		for(String st:array)
		{
			lst.add(st);
		}
		
		lst.sort((s1,s2)->Integer.compare(s1.charAt(s1.length()-1), s2.charAt(s2.length()-1)));
		
	   lst.forEach(System.out::println);
	}
	
	

}
