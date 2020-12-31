package collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

//		method calling
		iteratorOverArraylist(list);
		hashSet(list);
		listIterator();
		arrayList();
		
//		------------------------------------
//		another iterator on same list
//		Iterator itr = list.iterator();
//		while (itr.hasNext()) {
//			Object object = (Object) itr.next();
//			System.out.println("obj "+object);
//		}
//		------------------------------------------
	}

	private static void arrayList() {
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

	private static void listIterator() {

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

	private static void hashSet(List<String> c) {
//		c.remove("three");
//		System.out.println(c.size());

//		for (String s : c) {
//			System.out.println(s);
//		}

//		itr.remove();
		System.out.println( " hashset iterator ");

		Iterator<String> itr = c.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}

	private static void iteratorOverArraylist(List list) {

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

