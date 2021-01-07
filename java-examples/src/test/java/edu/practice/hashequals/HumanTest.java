package edu.practice.hashequals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HumanTest {	
	private  int adharNo1 = 222;
	private   String name1 = "yash";
	
	private  int adharNo2 = 222;
	private  String name2 = "yash";
	Human human1;
	Human human2;
	@BeforeEach
	void init() {
		 human1 = new Human(adharNo1, name1);
		 human2 = new Human(adharNo2, name2);	
	}
	@Test
	void testHashcode() {	
		int adharNumber = human1.adharNumber;
		assertEquals(adharNo1,adharNumber);
//		System.out.println(human1.adharNumber);
	}
	
	@Test
	void testEquals() {
		boolean actual = human1.equals(human2);
		boolean expected = true;
		assertEquals(expected, actual);		
	}
}
