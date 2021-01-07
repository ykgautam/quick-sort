package edu.practice.hashequals;
public class Human {
	protected int adharNumber ;
	private String name;
	
	public Human(int adharNumber, String name) {
		this.adharNumber = adharNumber;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return adharNumber;
	}
	@Override
	public boolean equals(Object obj) {
		Human h = (Human) obj;
		if(this == obj) // if yash.equals(yash) 
		{
//			System.out.println("fff");
			return true;
		}
//		System.out.println("hh");
		if(obj == null) // if obj =null  i.e yash.equals(null)
		{
//			System.out.println("aaa");
			return false;		
		}
		if(this.adharNumber != h.adharNumber) {
//			System.out.println("bbb");
			return false;
		}
		if(this.name != h.name) {
//			System.out.println("ccc");
			return false;	
		}
//		System.out.println("eee");
		return true;
	}
}
