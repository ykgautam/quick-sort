package edu.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(15);
		list.add(25);
		list.add(20);

		collectionsSearchDemo(list);
		reverseDemo(list);

	}

	private static void reverseDemo(ArrayList<Integer> list) {
		Collections.reverse(list);
		System.out.println(list);

	}

	private static void collectionsSearchDemo(ArrayList<Integer> list) {
		System.out.println("before sorting " + list);
		
		Comparator<Object> c = new MyComparatorForCollectionsSearch();
		Comparator<Object> c1 = Collections.reverseOrder(c);

//		we need to have sorted arraylist first
		Collections.sort(list,c);

		System.out.println("after sorting" + list);
//		binarysearch() returns index value if present else insertion point 

		System.out.println("returns index of value if present : " + Collections.binarySearch(list, 10));
		System.out.println("returns insertion pt if absent : " + Collections.binarySearch(list, 15));

		Collections.sort(list,c1);
		
		System.out.println(list);
		System.out.println("using MyComparator " + Collections.binarySearch(list, 12, c1));

	}

}
