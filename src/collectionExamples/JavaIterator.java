package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaIterator {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("one");
//		list.add("two");
//		list.add("three");
//		list.add("four");

//		method calling
//		iteratorOverArraylist(list);
//		hashSet(list);
//		listIterator();
//		arrayList();
		treeSet();	
//		--------------------------------------

		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("one");
		list.add("two");
		list.add("three");
		
		String string = Collections.min(list);
		System.out.println("min value is : "+string);
		
//		Collections.replaceAll(list, "one", null);
		System.out.println("0th index value "+list.indexOf("one"));
		System.out.println("0th index value "+list.lastIndexOf("one"));
		Iterator iterator = list.iterator();
		
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println(element);
		}

		Set<String> set = new HashSet<String>();
		set.addAll(list);
		System.out.println("set values " + set.equals("two"));

		System.out.println();
		
//		Collection collection = new HashSet();
		
//		------------------------------------
//		another iterator on same list
//		Iterator itr = list.iterator();
//		while (itr.hasNext()) {
//			Object object = (Object) itr.next();
//			System.out.println("obj "+object);
//		}
//		------------------------------------------
//		duplicate values not allowed 
		SortedSet<String> sortedSet = new TreeSet<String>();

		sortedSet.add("c");
		sortedSet.add("b");
		sortedSet.add("a");
		sortedSet.add("d");
		sortedSet.add("e");
		sortedSet.add("e");
		
		System.out.println(sortedSet);

		SortedSet headSet = sortedSet.headSet("c"); // return smaller values than "c" from sortedset
		SortedSet tailSet = sortedSet.tailSet("c"); // bigger values than "c"
		System.out.println(headSet);
		System.out.println(tailSet);
//		-------------------------------------------
		
//		-----------------------------------------
	}

	private static final void treeSet() {
		TreeSet treeSet = new TreeSet();

		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");

		Iterator i = treeSet.descendingIterator();
		while(i.hasNext()) {
		    String element = (String) i.next();
		    System.out.println("treeSet "+element);
		}
	}
	
	private static final void arrayList() {
		System.out.println("arrayList method : ");
		List<String> list = new ArrayList<>();
		list.add("123");
		list.add("456");
		list.add("789");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();

			if (string.equals("123")) {
				itr.remove();
			}
		}

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}

	}

	private static  final void listIterator() {

		List<String> list = new ArrayList<>();
		list.add("yash");
		list.add("gaurav");
		list.add("arun");

		ListIterator<String> listIterator = list.listIterator();
		int i = 1;
		while (listIterator.hasNext()) {

			System.out.println(i + " " + listIterator.next());
			i++;
		}

		System.out.println("now by using hasPrevious() ");

		while (listIterator.hasPrevious()) {
			i--;
			System.out.println(i + " " + listIterator.previous());
		}
	}

	private static final void hashSet(List<String> c) {
//		c.remove("three");
//		System.out.println(c.size());

//		for (String s : c) {
//			System.out.println(s);
//		}

//		itr.remove();
		System.out.println(" hashset iterator ");

		Iterator<String> itr = c.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}

	private static final void iteratorOverArraylist(List list) {

		list.remove("two");
		Iterator<String> iterator = list.iterator();
		System.out.println(" iterateover arraylist ");
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
		list.add("two");
	}
}

