package edu.practice.clone;

public class Dog implements Cloneable {
	private Cat c;
	private String dogName;

	Dog(Cat c, String name) {
		this.c = c;
		this.dogName = name;
	}

	public Cat getC() {
		return c;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Object cloneD() throws CloneNotSupportedException {
		Cat c3 = new Cat(c.getCatName());
		Dog d3 = new Dog(c3, dogName);
		return d3;
	}
}