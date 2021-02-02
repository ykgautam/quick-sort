package edu.practice.java8.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.practice.java8.myinterface.StudentInterface;
import edu.practice.java8.myinterfaceimpl.StudentInterfaceImpl;

class StudentTest {

	@Test
	void sortStudentsTest() {

		StudentInterface studentInterface = new StudentInterfaceImpl();
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("Yash", 2));
		studentList.add(new Student("Arun", 1));
		studentList.add(new Student("Gaurav", 3));
		studentList.add(new Student("Mohit", 4));

		List<Student> sortedList = studentInterface.sortStudents(studentList);

		List<Student> list = Arrays.asList(new Student("Arun", 1), new Student("Gaurav", 3), new Student("Mohit", 4),
				new Student("Yash", 2));
		Collections.sort(list);

		for (int counter = 0; counter < sortedList.size(); counter++) {
			assertEquals(list.get(counter).getName(), sortedList.get(counter).getName());
			assertEquals(list.get(counter).getId(), sortedList.get(counter).getId());
		}
	}

	@Test
	public void greetTest() {
		String greeting = StudentInterface.greet("gautam");
		assertEquals("Welcome Mr. gautam", greeting);
	}

	@Test
	public void getMaxNumberTest() {

		List<Integer> intList = new ArrayList<>();
		intList.add(1000);
		intList.add(10);
		intList.add(5000);

		StudentInterface obj = new StudentInterfaceImpl();
		int actualMaxNumber = obj.getMaxNumber(intList);
		int expectedMaxNumber = 5000;

		assertEquals(expectedMaxNumber, actualMaxNumber);
	}
}
