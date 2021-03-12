package edu.practice.datastructure.linkedlist;

public class Node {
	private int data;
	private Node next;

	Node() {
		data = 0;
		next = null;
	}

	Node(int d, Node n) {
		data = d;
		next = n;
	}

	public void setData(int d) {
		data = d;
	}

	public void setNext(Node n) {
		next = n;
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

}
