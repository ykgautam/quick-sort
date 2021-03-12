package edu.practice.datastructure.tree.bst;

public class Node {
	Node leftChild;
	Node rightChild;
	private int data;

	public Node() {
		this.leftChild = null;
		this.rightChild = null;
		this.data = 0;
	}

	public Node(int value) {
		this.leftChild = this.rightChild = null;
		this.data = value;
	}

	public void setData(int value) {
		this.data = value;
	}

	public int getData() {
		return this.data;
	}

}
