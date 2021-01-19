package edu.practice.innerclass;

/**
 * 
 * @author yash: AnonymousClass example overriding taste method in other class
 *         AnonymousClass1
 */
class PopCorn {
	void taste() {
		System.out.println("salty popcorn");
	}
}

public class AnonymousClass1 {
	public static void main(String[] args) {

		PopCorn p = new PopCorn() {
			@Override
			void taste() {
				System.out.println("spicy popcorn");
			}
		};
		p.taste();

		PopCorn p1 = new PopCorn();
		p1.taste();

		PopCorn p2 = new PopCorn() {
			@Override
			void taste() {
				System.out.println("sweet popcorn");
			}
		};
		p2.taste();

		System.out.println("class name of obj ref p: " + p.getClass().getName());
		System.out.println("class name of obj ref p1: " + p1.getClass().getName());
		System.out.println("class name of obj ref p2: " + p2.getClass().getName());
	}

}
