package edu.practice.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizationTest {
	/*
	 * @ValueSource
	 * 
	 * @EnumSource
	 * 
	 * @MethodSource
	 * 
	 * @CsvSource
	 */

//	-------------------- @ValueSource ----------------------
	@ParameterizedTest
	@ValueSource(ints = { 1, 5, 3, 7 })
	public void valueSourceTest(int i) {
		System.out.println(i);
	}

	@ParameterizedTest
	@ValueSource(strings = { "apple", "banana", "pineapple", "orange" })
	public void valueSourceTest2(String s) {
		System.out.println(s);
	}

//	----------------------- @EnumSource ------------------------------------
	enum Fruits {
		apple, banana, pineapple, orange;
	}

	@ParameterizedTest
	@EnumSource(Fruits.class)
	public void enumSoureTest(Fruits fruit) {
		System.out.println(fruit);
	}

//	---------------------- @MethodSource ------------------------------------
	private static String[] fruits() {
		return new String[] { "apple", "banana", "pineapple", "orange" };
	}

	@ParameterizedTest
	@MethodSource("fruits")
	public void methodSourceTest(String fruit) {
		System.out.println(fruit);
	}

//	  to provide multiple parameter
	private static Object[] values() {
		return new Object[][] { { "java", "programming language" }, { "junit5", "unit testing framework" },
				{ "selenium", "automation api" }, { "github", "repository" }, };
	}

	@ParameterizedTest
	@MethodSource("values")
	public void methodSourceTest2(String technology, String description) {
		System.out.println(technology + " -> " + description);
	}

//	----------------------- @CsvSource --------------------
	@ParameterizedTest
	@CsvSource({ "java, programming language", "junit5, unit testing framework", "selenium, automation api",
			"selenium, automation api" })
	public void csvSourceTest(String technology, String description) {
		System.out.println(technology + " -> " + description);
	}
}
