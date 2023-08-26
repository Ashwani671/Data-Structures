package selectionsorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void Selection(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j =i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = { 50, 30, 56, 12, 41, 32 };
		System.out.println("Before Sorting:"+Arrays.toString(arr));
		Selection(arr);
		System.out.println("After Sorting:"+Arrays.toString(arr));

	}

}
