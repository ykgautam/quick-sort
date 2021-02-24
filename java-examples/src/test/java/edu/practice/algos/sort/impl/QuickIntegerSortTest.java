package edu.practice.algos.sort.impl;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickIntegerSortTest {
	
	private QuickIntegerSort quickIntegerSort;

	@BeforeEach
	public void setup() {
		quickIntegerSort = new QuickIntegerSort();
	}

	@Test
	public void testSort() {
		List<Integer> list = Arrays.asList(1, 3, 2, 5);
		Collection<Integer> actualSortedList = quickIntegerSort.sort(list);
		assertEquals(actualSortedList, Arrays.asList(1, 2, 3, 5));
	}
}