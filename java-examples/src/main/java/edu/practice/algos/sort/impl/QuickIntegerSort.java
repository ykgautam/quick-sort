package edu.practice.algos.sort.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import edu.practice.algos.sort.Sort;

public class QuickIntegerSort implements Sort<Integer> {

//	public static void main(String[] args) {
//		int[] arr = { 10, 30, 5, 3, 20 }; 
//		int length = arr.length;
//		QuickIntegerSort qs = new QuickIntegerSort();
//		qs.quickSortRecursion(arr, 0, length - 1);
//		qs.printArray(arr);
//	}
	
	@Override
	public Collection<Integer> sort(Collection<Integer> t) {
		List list = new ArrayList();
		list.add(10);
		list.add(5);
		System.out.println(list);

//		QuickIntegerSort qs = new QuickIntegerSort();
		quickSortRecursion((List<List>) Arrays.asList(list));
		return null;
	}

	private void quickSortRecursion(List<List> asList) {
		// TODO Auto-generated method stub
	}

	private int partition(int[] arr, int low, int high) {
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

	private void quickSortRecursion(int[] arr, int low, int high) {
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
