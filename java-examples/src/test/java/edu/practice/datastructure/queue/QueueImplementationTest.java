package edu.practice.datastructure.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QueueImplementationTest {

	@Test
	void pushTest() {
		QueueImplementation queue = new QueueImplementation();
		int actualData = queue.push(1);
		int expectedData = 1;
		assertEquals(expectedData, actualData);
	}

	@Test
	void popTest() {
		QueueImplementation q = new QueueImplementation();
		Integer actualelement = q.pop();
		System.out.println(actualelement);
		Integer expectedelement = null;
		assertEquals(expectedelement, actualelement);
	}

	@Test
	void resizeTest() {
		QueueImplementation queue = new QueueImplementation();
		int actualSize = queue.resize();
		System.out.println("actualsize " + actualSize);
		int expectedSize = 6;
		assertEquals(expectedSize, actualSize);
	}

	@Test
	public void queueOPerationsTest() {
		QueueImplementation queue = new QueueImplementation();
		QueueImplementation actualqueue = queue.queueOPerations();

		int[] expected = { 1, 2, 3, 5 };

		assertEquals(actualqueue, expected);
	}
}
