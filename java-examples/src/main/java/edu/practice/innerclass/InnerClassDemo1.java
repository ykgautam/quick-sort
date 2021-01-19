package edu.practice.innerclass;

/**
 * @author yash : accesing inner class code from static area of outer class
 *
 */
public class InnerClassDemo1 {
	class Inner1 {
		void show1() {
			System.out.println("this is show1() in inner1 class");
		}
	}

	public static void main(String[] args) {
		InnerClassDemo1 i1 = new InnerClassDemo1();
		InnerClassDemo1.Inner1 inner1 = i1.new Inner1();

		inner1.show1();

		InnerClassDemo1.Inner1 i2 = new InnerClassDemo1().new Inner1();
		i2.show1();
		
		
	}

}
