package edu.practice.datastructure.bubblesort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	void sortTest() {
		int[] array = new int[] { 12, 34, 6, 43 };
		BubbleSort obj = new BubbleSort();
		int[] sortedArray = obj.sort(array);
		int[] expectedArray = { 6, 12, 34, 43 };
		assertArrayEquals(expectedArray, sortedArray);
	}
}
