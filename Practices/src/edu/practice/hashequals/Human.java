package edu.practice.hashequals;

public class Human {
	
	int adharNumber ;
	String name;
	
	public Human(int adharNumber, String name) {
		this.adharNumber = adharNumber;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return adharNumber;
		
	}
}
