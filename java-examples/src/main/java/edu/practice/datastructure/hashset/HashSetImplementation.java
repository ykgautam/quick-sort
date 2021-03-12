package edu.practice.datastructure.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {
	public HashSet<Employee> addEmployees() {
		HashSet<Employee> employee = new HashSet<Employee>();
		employee.add(new Employee(10, "yash"));
		employee.add(new Employee(20, "mohit"));
		employee.add(new Employee(30, "arun"));
		employee.add(new Employee(40, "gaurav"));

		for (Employee emp : employee) {
			System.out.println(emp);
		}
		System.out.println("hashcode of Employee's");

		Iterator<Employee> i = employee.iterator();
		while (i.hasNext()) {
			Employee emp = i.next();
			System.out.println(emp.equals(new Employee(10, "yash")));
		}
		return employee;

	}
}
