package edu.practice.datastructure.linearsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinearSearchImplementationTest {

	@Test
	void test() {
		int[] array = new int[] { 1, 3, 5, 9, 4 };
		LinearSearch obj = new LinearSearchImplementation();
		int index = obj.searchElementIndex(array, 9);
		assertEquals(3, index);
		assertEquals(9, array[index]);

	}

}
