package edu.practice.collection;

import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("a", "apple");
		treeMap.put("b", "boy");
		treeMap.put("d", "dog");
		treeMap.put("c", "cat");
		treeMap.put("e", "elephant");

//		System.out.println(treeMap);
		navigableMapMethods(treeMap);
	}

	private static void navigableMapMethods(TreeMap<String, String> t) {
		System.out.println("all objects in treeMap 't' :"+t);

		System.out.println("floorKey(\"b\") : " + t.floorKey("b"));
		System.out.println("lowerKey(\"b\") : " + t.lowerKey("b"));
		System.out.println("ceilingKey(\"c\") : " + t.ceilingKey("c"));
		System.out.println("higherKey(\"c\") :" + t.higherKey("c"));
		System.out.println("pollFirstEntry() : " + t.pollFirstEntry());
		System.out.println("pollLastEntry() : " + t.pollLastEntry());
		System.out.println("descendingKeySet() only key in descending order : " + t.descendingKeySet());
		System.out.println("descendingMap() : " + t.descendingMap());

	}

}
