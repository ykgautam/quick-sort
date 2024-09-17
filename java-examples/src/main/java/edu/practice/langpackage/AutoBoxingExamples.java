package edu.practice.langpackage;

/**
 * 
 * @author yash autoboxing related code method overloading using var-arg,
 *         autoboxing
 *
 */
public class AutoBoxingExamples {

	public static void main(String[] args) {
		System.out.println("-----autoboxingExamples --------");
		autoboxingExamples();
		int x = 10;
		m1(x);
		m2(x);
		m3(x);

	}

	private static void m3(Object obj) {
		System.out.println("object version");
	}

	/**
	 * for Auto-boxing compiler converts automatically primitive int type to wrapper
	 * Integer object for Auto-unboxing compiler converts automatically wrapper
	 * Integer object to primitive int
	 */
	private static final void autoboxingExamples() {
		Integer number = 10;
		System.out.println("Autoboxing example compiler converts automatically int to Integer object " + number);

		Integer i = Integer.valueOf(20);
		int i1 = i;
		System.out
				.println("Autounboxing example compiler converts automatically Integer object to primitive int " + i1);

		Integer x1 = 127;
		Integer x2 = 127;
		System.out.println(x1 == x2);// true

		Integer x3 = 128;
		Integer x4 = 128;
		System.out.println(x3 == x4);// false

		Integer x5 = 1000;
		Integer x6 = 1000;
		System.out.println(x5 == x6);// false

		Double x7 = 10.5;
		Double x8 = 10.5;
		System.out.println(x7 == x8);// false

		Boolean b1 = false;
		Boolean b2 = false;
		System.out.println(b1 == b2);// true

		Integer x9 = Integer.valueOf(10);
		Integer x10 = Integer.valueOf(10);
		System.out.println(x9 == x10);// true

		Integer x11 = new Integer(10);
		Integer x12 = Integer.valueOf(10);
		System.out.println(x11 == x12);// false

		Integer x13 = new Integer(10);
		Integer x14 = new Integer(10);
		System.out.println(x13 == x14);// false

	}

	private static void m1(Integer i) {
		System.out.println("Auto boxing concept ");
	}

	private static void m1(long i) {
		System.out.println("widening concept int to long ");
	}

	private static void m2(int... i) {
		System.out.println("Auto boxing concept ");
	}

	private static void m2(long i) {
		System.out.println("widening concept int to long ");
	}

}
