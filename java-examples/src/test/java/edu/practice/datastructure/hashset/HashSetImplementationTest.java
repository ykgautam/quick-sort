package edu.practice.datastructure.hashset;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

class HashSetImplementationTest {

	@Test
	void addEmployeesTest() {
		HashSetImplementation h = new HashSetImplementation();
		HashSet<Employee> e = h.addEmployees();
		boolean b = e.contains(new Employee(10, "yash"));
		int actualSize = 4;
		assertEquals(actualSize, e.size());
		assertEquals(true, b);
	}

}
