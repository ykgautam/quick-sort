package edu.practice.java8.client;

import java.util.ArrayList;
import java.util.List;

import edu.practice.java8.model.Student;
import edu.practice.java8.myinterface.StudentInterface;
import edu.practice.java8.myinterfaceimpl.StudentInterfaceImpl;

public class StudentMain {

	public static void main(String[] args) {
		StudentInterface studentInterface = new StudentInterfaceImpl();

		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("Yash", 2));
		studentList.add(new Student("Arun", 1));
		studentList.add(new Student("Gaurav", 3));
		studentList.add(new Student("Mohit", 4));

		List<Student> sortedList = studentInterface.sortStudents(studentList);

		System.out.println("sorted student list is ");
		for (Student student : sortedList)
			System.out.println(
					"student's name is " + student.getName().toUpperCase() + " " + " and id is " + student.getId());

		System.out.println();
		System.out.println(StudentInterface.greet("Yash"));

		List<Integer> intList = new ArrayList<>();
		intList.add(1000);
		intList.add(10);
		intList.add(5000);
		int maxNumber = studentInterface.getMaxNumber(intList);
		System.out.println("maximum number is " + maxNumber);

	}
}
