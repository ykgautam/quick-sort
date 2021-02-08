package edu.practice.innerclass;

/**
 * @author yash accessing outer class fiels from local method inner class
 */
public class InnerClassDemo4 {
	int x = 10;
	static int y = 20;

	private void m1() {

		final int localVar = 111;

		class Inner4 {
			public void m2() {
				System.out.println(x);
				System.out.println(y);
				System.out.println(localVar);
			}
		}
		Inner4 i4 = new Inner4();
		i4.m2();
	}

	public static void main(String[] args) {
		InnerClassDemo4 id4 = new InnerClassDemo4();
		id4.m1();
	}
}
