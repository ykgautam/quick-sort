package yash.io.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FibonacciRecursiveTest {

	@Test
	void fibonacciSeriesTest() {
		ArrayList<Integer> list;
		list = FibonacciRecursive.fibonacciSeries(6);
		List<Integer> expectedList = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13);
		assertEquals(expectedList, list);
	}

	@Test
	void fibonacciTest() {
		int output = FibonacciRecursive.fibonacciSum(6);
		assertEquals(8, output);
	}
}
