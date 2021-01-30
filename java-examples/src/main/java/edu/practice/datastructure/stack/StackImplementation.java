package edu.practice.datastructure.stack;

public class StackImplementation {
	private int[] object;
	private int top;
	private int stackSize;

	public StackImplementation() {
		stackSize = 4;
		top = -1;
		object = new int[stackSize];
	}

	public void push(int data) {
		if (top >= stackSize - 1) {
			resize();
		}
		object[++top] = data;
	}

	private void resize() {
		int[] temp = object;
		stackSize = stackSize * 2;
		object = new int[stackSize];
		for (int i = 0; i <= top; i++) 
			object[i] = temp[i];
	}

	public Integer pop() {
		if (top < 0)
			return null;
		return object[top--];
	}

	public static void main(String[] args) {

	}

}
