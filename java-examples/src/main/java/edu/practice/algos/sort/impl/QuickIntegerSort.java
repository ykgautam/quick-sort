package edu.practice.algos.sort.impl;

import java.util.Arrays;
import java.util.Collection;

import edu.practice.algos.sort.Sort;

public class QuickIntegerSort implements Sort<Integer> {

	@Override
	public Collection<Integer> sort(Collection<Integer> collectionToSort) {
		Integer[] array = collectionToSort.toArray(new Integer[0]);
		quickSortRecursion(array, 0, collectionToSort.size() - 1);
		return Arrays.asList(array);
	}

	private int partition(Integer[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;

			} // inner while ends here

			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}

		} // outer while ends here
		return low;
	} // partition() ends here

	private void quickSortRecursion(Integer[] arr, int low, int high) {
		int pi = partition(arr, low, high);
		if (low < pi - 1) {
			quickSortRecursion(arr, low, pi - 1);
		}
		if (pi < high) {
			quickSortRecursion(arr, pi, high);
		}
	}

	private void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
