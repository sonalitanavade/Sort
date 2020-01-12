package sort.algo;

import java.util.Arrays;

public class InsertionSort {

	private static int[] sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int index = i;
			int temp = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[index]) {
					temp = arr[index];
					arr[index] = arr[j];
					index = j;
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	private static int[] sortwithWhile(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int val = arr[i];
			int hole =i;
			while(hole>0 && arr[hole-1]>val) {
				arr[hole]=arr[hole-1];
				hole=hole-1;
			}
			arr[hole]=val;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 5, 6, 8, 9, 4, 7, 0, 12, 14, 100, 11, 15, 20, 50, 30 };
		System.out.println("Before sorting " + Arrays.toString(arr));

		int[] sortedArray = sort(arr);
		System.out.println("after sorting with boolean check" + Arrays.toString(sortedArray));
		
		int[] arr1 = { 2, 3, 1, 5, 6, 8, 9, 4, 7, 0, 12, 14, 100, 11, 15, 20, 50, 30 };
		System.out.println("Before sorting " + Arrays.toString(arr1));

		int[] sortedArray1 = sortwithWhile(arr);
		System.out.println("after sorting with boolean check" + Arrays.toString(sortedArray1));

	}

}
