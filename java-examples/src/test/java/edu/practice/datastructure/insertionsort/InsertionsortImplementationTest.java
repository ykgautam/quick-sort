package edu.practice.datastructure.insertionsort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class InsertionsortImplementationTest {

	@Test
	void test() {
		int[] array = { 1, 6, 2, 5, 2, 3, 9, 55, 7 };

		InsertionSort obj = new InsertionsortImplementation();
		int[] sortedArray = obj.sort(array, array.length);

		for (int index = 0; index < array.length; index++)
			System.out.print(sortedArray[index] + " ");

		for (int index = 0; index < array.length; index++)
			assertEquals(array[index], sortedArray[index]);
	}
}
