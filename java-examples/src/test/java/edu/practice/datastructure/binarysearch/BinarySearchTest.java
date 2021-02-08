package edu.practice.datastructure.binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void binarySearchTest() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		BinarySearch obj = new BinarySearch();
		int index = obj.binarySearch(array, array.length, 5);
		int expectedIndex = 4;
		assertEquals(expectedIndex, index);
	}

}
