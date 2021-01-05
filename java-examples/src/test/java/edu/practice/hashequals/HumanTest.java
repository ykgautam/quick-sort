package edu.practice.hashequals;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class HumanTest {	
	static private int adharNo1 = 111;
	static private String name1 = "yash";
	
	static int adharNo2 = 111;
	static String name2 = "yash";
	@Test
	void testHashcode() {	
		Human human1 = new Human(adharNo1, name1);
		Human human2 = new Human(adharNo2, name2);
		
		int adharNumber = human1.adharNumber;
		
		assertEquals(adharNo1,adharNumber);
	}
	
	@Test
	void testEquals() {
		Human human1 = new Human(adharNo1, name1);
		Human human2 = new Human(adharNo2, name2);
		
		boolean actual = human1.equals(human2);
		boolean expected = true;
		assertEquals(expected, actual);		
	}
}
