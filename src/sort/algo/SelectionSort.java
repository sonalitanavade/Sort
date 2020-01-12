package sort.algo;

import java.util.Arrays;

public class SelectionSort {

	private static int[] sort(int[] arr) {
		int temp = 0;
		// loop on all elements.
		for (int i = 0; i < arr.length - 2; i++) {
			// start with next index from previous role.
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 5, 6, 8, 9, 4, 7, 0 };
		System.out.println("Before sorting " + Arrays.toString(arr));
		int[] sortedArray = sort(arr);
		System.out.println("after sorting " + Arrays.toString(sortedArray));
	}

}
