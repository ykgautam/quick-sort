package edu.practice.datastructure.tree.bst;

public class BinarySearchTree {

	public Node root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public Node add(int value) {
		root = addValue(root, value);
		return root;
	}

	private Node addValue(Node root, int value) {
		if (root == null)
			root = new Node(value);
		else if (value < root.getData()) {
			root.leftChild = addValue(root.leftChild, value);
		} else if (value > root.getData()) {
			root.rightChild = addValue(root.rightChild, value);
		}
		return root;
	}

	public boolean search(int element) {
		return searchElement(root, element);
	}

	private boolean searchElement(Node root, int element) {
		boolean found = false;

		while (root != null && !found) {

			if (element < root.getData())
				root = root.leftChild;
			else if (element > root.getData())
				root = root.rightChild;
			else {
				found = true;
				break;
			}
			found = searchElement(root, element);
		}
		return found;
	}

	public static void main(String[] args) {
		BinarySearchTree obj = new BinarySearchTree();
		System.out.println(obj.isEmpty());
		System.out.println(obj.add(101).getData());
		System.out.println(obj.isEmpty());
		obj.add(10);
		System.out.println(obj.search(101));
	}
}
