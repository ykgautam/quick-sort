package edu.practice.collection;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
//		intTreeset();
		stringTreeset();		
	}

	private static void intTreeset() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>(new MyComparator());
		treeSet.add(10);
		treeSet.add(40); 
		treeSet.add(20);
		treeSet.add(30);
		
		System.out.println(treeSet);
	}
	private static void stringTreeset() {
		
		TreeSet<String> treeSet = new TreeSet<String>(new MyComparator());
		treeSet.add("w");
		treeSet.add("c");
		treeSet.add("a");
		treeSet.add("d");

		System.out.println(treeSet);
	}
}
