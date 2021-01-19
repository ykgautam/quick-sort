package edu.practice.innerclass;

/**
 * 
 * @author yash :accesing inner class method from outside area of outer class
 *         accesing inner class method from outside area of outer class
 */
public class InnerClassDemo2 {

	class Inner2 {
		private void show2() {
			System.out.println("this is show2() in inner2 class");
		}
	}

	private void m2() {
		System.out.println("this is m2() in outer class ");
		Inner2 i2 = new Inner2();
		i2.show2();

	}

	public static void main(String[] args) {
//		InnerClassDemo2.Inner2 i3= new InnerClassDemo2().new Inner2();
		InnerClassDemo2 id2 = new InnerClassDemo2();
		id2.m2();

//accesing inner class code from outside area of outer class
		InnerClassDemo1 iObj = new InnerClassDemo1();
		InnerClassDemo1.Inner1 i = iObj.new Inner1();
		i.show1();

	}
}
