package edu.practice.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
	public static void main(String[] args) {
		
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		
		sm.put(new Integer(2), "java");
		sm.put(new Integer(3), "python");
		sm.put(new Integer(5), "javascript");
		sm.put(new Integer(4), "c");
		sm.put(new Integer(1), "cpp");
		
		System.out.println(sm.containsValue("python"));
		System.out.println(sm.get(2).equals("java"));
		
		Set s = sm.entrySet();

		// Using iterator in SortedMap
		Iterator i = s.iterator();

		while (i.hasNext()) {
			Map.Entry m = (Map.Entry) i.next();

			int key = (Integer) m.getKey();
			String value = (String) m.getValue();

			System.out.println("Key : " + key + " value : " + value);
		}
	}
}
