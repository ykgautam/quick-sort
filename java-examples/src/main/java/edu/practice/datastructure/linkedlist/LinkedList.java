package edu.practice.datastructure.linkedlist;

public class LinkedList {
	private int size;
	private Node start;

	LinkedList() {
		size = 0;
		start = null;
	}

	void insertAtFirst(int value) {
		Node n;
		n = new Node();
		n.setData(value);
		n.setNext(start);
		start = n;
		size++;
	}

	public void insertAtLast(int value) {
		Node n, t;
		n = new Node();
		n.setData(value);
		t = start;
		if (t == null) {
			start = n;
		} else {
			while (t.getNext() != null) {
				t = t.getNext();
			}
			t.setNext(n);
		}
		size++;
	}

	public void insertAtPosition(int value, int position) {
		if (position == 1)
			insertAtFirst(value);
		else if (position == size + 1) {
			insertAtLast(value);
		} else if (position > 1 && position <= size) {
			Node n, t;
			n = new Node(value, null);
			t = start;
			for (int i = 1; i < position - 1; i++)
				t = t.getNext();
			n.setNext(t.getNext());
			t.setNext(n);
			size++;

		} else
			System.out.println("insertion not possible at position : " + position);
	}

	public void deleteFirst() {
		if (start == null) {
			System.out.println("list is already empty");
		} else {
			start = start.getNext();
			size--;
		}
	}

	public void deleteLast() {
		if (start == null)
			System.out.println("list is already empty");
		else if (size == 1) {
			start = null;
			size--;
		} else {
			Node t;
			t = start;
			for (int i = 1; i < size - 1; i++) {
				t = t.getNext();
			}
			t.setNext(null);
			size--;
		}
	}

	public void deleteAtPosition(int position) {
		if (start == null)
			System.out.println("List is already empty");
		else if (position < 1 || position > size)
			System.out.println("invalid position");
		else if (position == 1)
			deleteFirst();
		else if (position == size)
			deleteLast();
		else {
			Node t, t1;
			t = start;
			for (int i = 1; i < position - 1; i++)
				t = t.getNext();
			t1 = t.getNext();
			t.setNext(t1.getNext());
			size--;
		}
	}

	public boolean isEmpty() {
		if (start == null)
			return true;
		else
			return false;
	}

	public int getListSize() {
		return size;
	}

	public void viewList() {
		Node t;
		if (isEmpty())
			System.out.println("List is empty");
		else {
			t = start;
			for (int i = 1; i <= size; i++) {
				System.out.println(" " + t.getData());
				t = t.getNext();
			}
		}
	}
}
