package edu.practice.datastructure.binarysearch;

/**
 * 
 * @author yash Binary Search algo , pseudocode- condition1: data==array[mid],
 *         condition2: data<array[mid], condition3: element>array[mid]
 *
 */
public class BinarySearch {

	int binarySearch(int[] array, int arraySize, int data) {
		int start = 0;
		int end = arraySize - 1;

		while (start <= end) {
			int middle = (start + end) / 2;

			if (data == array[middle])
				return middle;
			else if (data < array[middle])
				end = middle - 1;
			else if (data > array[middle])
				start = middle + 1;

		}
		return -1;
	}
}
