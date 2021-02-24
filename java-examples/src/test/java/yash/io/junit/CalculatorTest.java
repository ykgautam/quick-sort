package yash.io.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void squareTest() {
		Calculator c= new Calculator();
		int op=c.square(4);
		assertEquals(16, op);
		System.out.println();
	
	}

}
