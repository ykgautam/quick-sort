package edu.practice.java8.myinterface;

import java.util.Collections;
import java.util.List;

import edu.practice.java8.model.Student;

public interface StudentUtil {
	default public List<Student> sortStudents(List<Student> studentList) {
		Collections.sort(studentList);
		return studentList;
	}

	static public String greet(String name) {
		return "Welcome Mr. " + name;
	}

	public abstract int getMaxNumber(List<Integer> intList);
}
