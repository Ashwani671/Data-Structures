package insertionsorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSorting {
	
	public static void insertion(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			int j,temp=arr[i];
		
		
		for( j=i-1;j>=0&& arr[j]>temp;j--) {
			arr[j+1]=arr[j];
		}
		arr[j+1]=temp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 9955, 102, 46, 75 };
		System.out.println("Before Sorting :" + Arrays.toString(arr));
		insertion(arr);
		System.out.println("After Sorting :" + Arrays.toString(arr));
	}
}
