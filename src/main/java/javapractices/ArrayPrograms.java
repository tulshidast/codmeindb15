package javapractices;

import java.util.Scanner;

public class ArrayPrograms {

	public static void main(String[] args) {

		int arr[] = new int[7];

		Scanner scanner = new Scanner(System.in);

		for (int k = 0; k < 7; k++) {

			arr[k] = scanner.nextInt();

			if (k == 6)
				break;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("####################################################");
		// print array in ascending order 2,5,10,30,50,100,200
		// print array in descending order 200,100,50,30,10,5,2

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int c = arr[i];

					arr[i] = arr[j];
					arr[j] = c;

				}
			}
		}

		System.out.println("##########################################");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Find min and max from array");

		System.out.println("#############################################");
		System.out.println("Min = " + arr[0]);
		System.out.println("Max = " + arr[arr.length - 1]);
		System.out.println("######################################");

		System.out.println("Min = " + arr[2]);
		System.out.println("Max = " + arr[arr.length - 2]);
	}

}
