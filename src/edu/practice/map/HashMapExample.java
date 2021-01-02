package edu.practice.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(2, "Mango");
		map.put(1, "Apple");
		map.put(3, "Orange");
		map.put(1, "Apple");
//		map.remove(1);
//		System.out.println(map);
		System.out.println(map.containsKey(2));

		hashOperations(map);
	}

	static private void hashOperations(Map<Integer, String> mapp) {
		HashMap<Integer, String> map = (HashMap<Integer, String>) mapp;
		System.out.println("entries in map " + map);

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		map.putIfAbsent(4, "pineapple");
		System.out.println("after adding element using putIfAbsent () : ");
		for (Map.Entry m1 : map.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());
		}

		System.out.println("size of map : " + map.size());

//		-------------------------------------------
//		creating a new hashMap
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.putAll(map);
		hashMap.put(null, "Banana");
		System.out.println("hashmap : " + hashMap);
		
		boolean hasKey = hashMap.containsKey(1);
		System.out.println(hasKey);
		
		System.out.println(hashMap.get(2));
		
//		--------------------------------------------
	}
}
 
