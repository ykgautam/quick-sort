package edu.practice.datastructure.doublylinkedlist;

public class Link {
	private int data;
	Link previous, next;

	Link(int data) {
		previous = null;
		this.data = data;
		next = null;
	}

	Link(Link prevNode, int data, Link nextNode) {
		previous = prevNode;
		this.data = data;
		next = nextNode;
	}

	int getData() {
		return data;
	}

}
