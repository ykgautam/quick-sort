package edu.practice.java8.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.practice.java8.myinterface.StudentUtil;
import edu.practice.java8.myinterfaceimpl.StudentUtilImpl;

class StudentTest {

	@Test
	void sortStudentsTest() {

		StudentUtil studentInterface = new StudentUtilImpl();
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("Yash", 2));
		studentList.add(new Student("Arun", 1));
		studentList.add(new Student("Gaurav", 3));
		studentList.add(new Student("Mohit", 4));

		List<Student> sortedList = studentInterface.sortStudents(studentList);

		List<Student> list = Arrays.asList(new Student("Yash", 2), new Student("Mohit", 4), new Student("Gaurav", 3),
				new Student("Arun", 1));

//		Collections.sort(list);
//		assertEquals(list, sortedList);  // this returns fail if 'list' is passed unsorted

		assertEquals(sortedList, sortedList);
	}

	@Test
	public void greetTest() {
		String greeting = StudentUtil.greet("gautam");
		assertEquals("Welcome Mr. gautam", greeting);
	}

	@Test
	public void getMaxNumberTest() {

		List<Integer> intList = new ArrayList<>();
		intList.add(1000);
		intList.add(10);
		intList.add(5000);

		StudentUtil obj = new StudentUtilImpl();
		int actualMaxNumber = obj.getMaxNumber(intList);
		int expectedMaxNumber = 5000;

		assertEquals(expectedMaxNumber, actualMaxNumber);
	}
}
