package edu.practice.collection;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1000);
		treeSet.add(3000);
		treeSet.add(4000);
		treeSet.add(2000);
		treeSet.add(5000);

		System.out.println(treeSet);

		System.out.println("ceiling()- either 2k or aftr 2k : "+treeSet.ceiling(2000));
		System.out.println("higher()- aftr 2k whaht is least/first element : "+treeSet.higher(2000));
		System.out.println("floor()- b4 3k highest element including 3k : "+treeSet.floor(3000));
		System.out.println("lower()- b4 3k highest element : "+treeSet.lower(3000));
		System.out.println("pollFirst : "+treeSet.pollFirst());
		System.out.println("pollLast : "+treeSet.pollLast());
		System.out.println("elements of treeSet in descending order : "+treeSet.descendingSet());
	}
}
