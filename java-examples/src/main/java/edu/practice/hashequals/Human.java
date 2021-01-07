package edu.practice.hashequals;

public class Human {
	private int adharNumber;

	private String name;

	public Human(int adharNumber, String name) {
		this.adharNumber = adharNumber;
		this.name = name;
	}

	public int getAdharNumber() {
		return adharNumber;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return adharNumber;
	}

	@Override
	public boolean equals(Object obj) {
		Human h = (Human) obj;
		if (this == obj) // if yash.equals(yash)
		{
			return true;
		}
		if (obj == null) // if obj =null i.e yash.equals(null)
		{
			return false;
		}
		if (this.adharNumber != h.adharNumber) {
			return false;
		}
		if (this.name != h.name) {
			return false;
		}
		return true;
	}
}
