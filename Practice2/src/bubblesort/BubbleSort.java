package bubblesort;

public class BubbleSort {
	
	private static void printArray(int[] arr) {
		for (int i=0; i< arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.print("");
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 3, 6, 9, 2, 4 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		printArray(arr);
	}
}
