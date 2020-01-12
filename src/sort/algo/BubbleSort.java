package sort.algo;
import java.util.Arrays;

public class BubbleSort {

	private int[] sort(int[] sort) {
		boolean swap = true;
		while (swap) {
			swap = false;
			int temp = 0;
			for (int i = 0; i < sort.length - 1; i++) {
				if (sort[i] > sort[i + 1]) {
					temp = sort[i];
					sort[i] = sort[i + 1];
					sort[i + 1] = temp;
					swap = true;
				}
			}
		}
		return sort;
	}

	public static void main(String[] args) {
		int[] array = { 10, 5, 2, 8, 6, 7, 9, 1, 3, 4, 0 };
		System.out.println("sortedArray " + Arrays.toString(new BubbleSort().sort(array)));
	}
}