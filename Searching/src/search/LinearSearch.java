package search;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == key)
				return i;

		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 52, 26, 35, 14, 18, 76, 100, 0, 5 };
		System.out.println("Enter key to be found");
		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		if (index != -1)
			System.out.println("Element found at index:" + index);
		else
			System.out.println("Element not found");
	}

}
