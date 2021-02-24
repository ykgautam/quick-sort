package edu.practice.datastructure.hashset;

public class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (this == e)
			return true;
		else if (e == null)
			return false;
		else if (this.id != e.id || this.name != e.name)
			return false;

		return true;
	}

}
