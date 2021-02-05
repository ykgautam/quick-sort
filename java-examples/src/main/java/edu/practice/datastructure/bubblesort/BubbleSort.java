package edu.practice.datastructure.bubblesort;

/**
 * 
 * @author yash Bubble sort, complexity o(n square), n is number of times being
 *         sorted
 *
 */
public class BubbleSort {

	int[] sort(int[] array) {
		int size = array.length;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}
