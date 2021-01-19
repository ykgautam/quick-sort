package edu.practice.innerclass;

/**
 * 
 * @author yash : declaring Inner class in instance method of outer class
 *
 */
public class InnerClassDemo3 {
	private void m1() {
		class Inner3 {
			void sum(int x, int y) {
				System.out.println("The sum: " + (x + y));
			}
		}
		Inner3 i3 = new Inner3();
		i3.sum(10, 20);
		i3.sum(100, 200);
		i3.sum(1000, 2000);

	}

	public static void main(String[] args) {
		InnerClassDemo3 id3 = new InnerClassDemo3();
		id3.m1();
	}
}
