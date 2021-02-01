package edu.practice.datastructure.insertionsort;

public class InsertionsortImplementation implements InsertionSort {

	@Override
	public int[] sort(int[] array, int numberOfElements) {
		int index1, index2, key;
		for (index1 = 1; index1 < numberOfElements; index1++) {
			key = array[index1];
			index2 = index1 - 1;
			while (index2 >= 0 && array[index2] > key) {
				array[index2 + 1] = array[index2];
				index2 = index2 - 1;
			}
			array[index2 + 1] = key;
		}
		return array;
	}
}
