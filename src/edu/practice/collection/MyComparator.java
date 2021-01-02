package edu.practice.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Object> {
	
	@Override
//	public int compare(Object obj1, Object obj2) {
//		Integer i1=(Integer)obj1;
//		Integer i2=(Integer)obj2;
//		return i2.compareTo(i1); // descending order
//		return i1.compareTo(i2); // ascending order 
//		return -i1.compareTo(i2); // descending order
//		-------------------------------------
////		descending order
//		if(i1<i2)
//			return +1;
//		else if(i1>i2)
//			return -1;	
//		else 
//			return 0;
//		--------------------------------------------
//	}
	
	public int compare(Object ob1,Object ob2) {
		String s1 = ob1.toString();
		String s2 = (String)ob2;
	
		return s1.compareTo(s2);	
	}
}
