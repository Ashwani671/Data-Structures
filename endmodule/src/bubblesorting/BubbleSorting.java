package bubblesorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting {

	public static void Bubble(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = { 95, 32, 46, 75 };
		System.out.println("Before Sorting :" + Arrays.toString(arr));
		Bubble(arr);
		System.out.println("After Sorting :" + Arrays.toString(arr));
	}
}
