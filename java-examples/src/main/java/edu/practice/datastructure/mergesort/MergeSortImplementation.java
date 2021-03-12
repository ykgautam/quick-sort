package edu.practice.datastructure.mergesort;

/**
 * 
 * @author yash : mergeSort implementation
 */
public class MergeSortImplementation {
	private static void mergeSort(int[] array, int left, int right) {
		if (right > left) {
			int middle = (left + right) / 2;
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			merge(array, left, middle, right);
		}
	}

	private static void merge(int[] array, int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		int i, j, k;
		for (i = 0; i < n1; i++) {
			leftArray[i] = array[left + i];
		}
		for (j = 0; j < n2; j++) {
			rightArray[j] = array[middle + 1 + j];
		}
		i = 0;
		j = 0;
		k = left;

		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				array[k++] = leftArray[i++];
			} else {
				array[k++] = rightArray[j++];
			}
		}
		while (i < n1)
			array[k++] = leftArray[i++];

		while (j < n2)
			array[k++] = rightArray[j++];

	}

	public static void main(String[] args) {
		int[] array = new int[] { 66, 38, 3, 9, 82, 10, 12, 32, 45, 767, 89 };
		mergeSort(array, 0, array.length - 1);
		System.out.println("sorted array is ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}
