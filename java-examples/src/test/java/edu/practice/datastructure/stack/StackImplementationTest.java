package edu.practice.datastructure.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StackImplementationTest {
	@Test
	void pushTest() {
		StackImplementation stack = new StackImplementation();
		stack.push(10);
		stack.push(20);
		stack.pop();
		stack.push(40);
		stack.pop();
		stack.push(30);
		stack.push(50);
		int size = stack.getSize();
		System.out.println(size);
		assertEquals(3, size);
	}

	@Test
	void popTest() {
		StackImplementation stack = new StackImplementation();
		Integer actualPop = stack.pop();
		stack.pop();
		assertEquals(null, actualPop);
		int s = stack.getSize();
		assertEquals(0, s);
	}

	@Test
	void decreaseStackSizeTest() {
		StackImplementation stack = new StackImplementation();
		int actualSize = stack.decreaseStackSize();
		System.out.println("q size  " + actualSize);
		assertEquals(4, actualSize);
	}
	
	@Test
	void isEmptyTest() {
		StackImplementation stack = new StackImplementation();
//		stack.push(11);
		boolean empty = stack.isEmpty();
		assertEquals(true, empty);
	}

	@Test
	void getSize() {
		StackImplementation stack = new StackImplementation();
		int actualSize = stack.getSize();
		assertEquals(0, actualSize);
	}
}
