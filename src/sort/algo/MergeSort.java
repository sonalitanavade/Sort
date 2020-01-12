package sort.algo;

import java.util.Arrays;

public class MergeSort {

	private static int[] merge(int[] arr) {

		// stop the flow if arr.siz = 1.
		// control will go to merge(leftA) or merge(rightA) as per stack.
		if (arr.length < 2) {
			return arr;
		}
		// devide array - if size=5 then mid = 5/2 =2
		int mid = arr.length / 2;
		// define left array with size mid.
		int[] leftA = new int[mid];
		// define right array with size arr.size - mid
		// if arr.size = 5 and mid=2 then rightA size will be 5-2=3
		int[] rightA = new int[arr.length - mid];

		// fill left array from 0 to mid
		for (int i = 0; i < mid; i++) {
			leftA[i] = arr[i];
		}

		// fill right array from mid to arr.size
		int index = 0;
		for (int i = mid; i < arr.length; i++) {
			rightA[index] = arr[i];
			index++;
		}

		// repeat above code till leftA size becomes 1
		merge(leftA);

		// repeat above code till rightA size becomes 1
		merge(rightA);
		
		//merge above leftA and righA array.
		mergeSortedArray(arr, leftA, rightA);
		return arr;
	}

	private static int[] mergeSortedArray(int[] arr, int[] left, int[] right) {
		int leftI = 0;
		int rightI = 0;
		int arrI = 0;

		while (leftI < left.length && rightI < right.length) {
			if (left[leftI] < right[rightI]) {
				arr[arrI] = left[leftI];
				leftI++;
			} else {
				arr[arrI] = right[rightI];
				rightI++;
			}
			arrI++;
		}

		while (leftI < left.length) {
			arr[arrI] = left[leftI];
			leftI++;
			arrI++;
		}

		while (rightI < right.length) {
			arr[arrI] = right[rightI];
			rightI++;
			arrI++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 5, 6, 8, 9, 4, 7, 0 };
		System.out.println("Before sorting " + Arrays.toString(arr));
		int[] sortedArray = merge(arr);
		System.out.println("after sorting " + Arrays.toString(sortedArray));
	}

}
