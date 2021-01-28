package edu.practice.datastructure.doublylinkedlist;

public class DoublyLinkedList {
	private Link head;
	private int size;

	public DoublyLinkedList() {
		head = null;
		size = 0;
	}

	public void addFront(int data) {
		if (head == null)
			head = new Link(null, data, null);
		else {
			Link newLink = new Link(null, data, head);
			head.previous = newLink;
			head = newLink;
		}
		size++;
	}

	public void addRear(int data) {
		if (head == null) {
			head = new Link(null, data, null);
		} else {
			Link current = head;
			while (current.next != null)
				current = current.next;

			Link newLink = new Link(current, data, null);
			current.next = newLink;
		}
		size++;
	}

	public void insertAt(int data, int index) {
		if (head == null)
			return;
		if (index < 1 && index > size)
			return;
		Link current = head;
		int i = 1;
		while (i < index) {
			current = current.next;
			i++;
		}
		if (current.previous == null)
			addFront(data);
		else {
			Link newLink = new Link(current.previous, data, current);
			current.previous.next = newLink;
			current.previous = newLink;
		}
		size++;

	}

	public void removeFront() {
		if (head == null)
			return;
		head = head.next;
		head.previous = null;
		size--;
	}

	public void removeRear() {
		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			size--;
			return;
		}

		Link current = head;
		while (current.next.next != null)
			current = current.next;
		current.next = null;

	}

	public int getSize() {
		return size;
	}

	public void print() {
		Link current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addFront(15);
		dll.addFront(5);
		dll.print();
		System.out.println(dll.isEmpty());
		dll.addRear(100);
		dll.print();
		dll.removeRear();

		System.out.println("size " + dll.getSize());
		dll.insertAt(362, 2);
		dll.print();
	}

}
