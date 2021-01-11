package edu.practice.langpackage;

/**
 * this WrapperExample class contains examples on wrapper classes and its
 * methods valueOf() xxxValue()
 */
public class WrapperExample {

	public static void main(String[] args) {
		System.out.println("------valueOfExamples---------");
		valueOfExamples();
		System.out.println("-----xxxxxxValueExamples --------");
		xxxValueExamples();
		System.out.println("-----parsexxxExamples --------");
		parseXxxExamples();
		System.out.println("-----autoboxingExamples --------");
		autoboxingExamples();
	}

	/**
	 * for Auto-boxing compiler converts automatically primitive int type to wrapper
	 * Integer object for Auto-unboxing compiler converts automatically wrapper
	 * Integer object to primitive int
	 */
	private static final int autoboxingExamples() {
		Integer number = 10;
		System.out.println("Autoboxing example compiler converts automatically int to Integer object " + number);

		Integer i = Integer.valueOf(20);
		int i1 = i;
		System.out
				.println("Autounboxing example compiler converts automatically Integer object to primitive int " + i1);
		return 0;
	}

	private static final void parseXxxExamples() {
		int i = Integer.parseInt("10");
		double d = Double.parseDouble("10.5");
		boolean b1 = Boolean.parseBoolean("true");
		boolean b2 = Boolean.parseBoolean("yash");
		System.out.println(i + " " + d + " " + b1 + " " + b2);

		int i1 = Integer.parseInt("1111", 2);
		System.out.println(i1);

		Integer i2 = Integer.valueOf(30);
		String s1 = i2.toString();

		String s2 = Integer.toString(20);
		String s3 = Boolean.toString(true);
		String s4 = Character.toString('a');
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

		String s5 = Integer.toString(15, 2);
		String s6 = Long.toString(15, 3);
		System.out.println(s5 + " " + s6);

		String s7 = Integer.toBinaryString(15);
		String s8 = Integer.toHexString(15);
		String s9 = Integer.toOctalString(15);

		System.out.println(s7 + " " + s8 + " " + s9);

	}

	private static final void xxxValueExamples() {
		Integer I = Integer.valueOf("130");

		System.out.println(I.byteValue());
		System.out.println(I.shortValue());
		System.out.println(I.intValue());
		System.out.println(I.floatValue());
		System.out.println(I.longValue());
		System.out.println(I.doubleValue());

		Character ch = Character.valueOf('a');
		char c = ch.charValue();
		System.out.println(c);

	}

	private static final void valueOfExamples() {
		Integer i = new Integer(10);
		System.out.println(i);
		Integer j = Integer.valueOf("20");
		System.out.println(j);
		Float f = new Float(12.5f);
		System.out.println(f.toString());
		Character ch = Character.valueOf('a');
		System.out.println(ch);

		Boolean b1 = Boolean.valueOf(true);
		Boolean b2 = Boolean.valueOf("yash");
		System.out.println(b1.equals(b2));
		System.out.println(b1 == b2);

		Boolean b3 = Boolean.valueOf("yes");
		Boolean b4 = Boolean.valueOf("no");
		System.out.println(b3.equals(b4));
		System.out.println(b3 == b4);

		Integer bnumber = Integer.valueOf("111", 2);
		System.out.println(bnumber);

		Integer onumber = Integer.valueOf("101", 8);
		System.out.println(onumber);

		Integer cnumber = Integer.valueOf("111", 36);
		System.out.println(cnumber);

	}

}
