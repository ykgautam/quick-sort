package edu.practice.datastructure.stack;

public class StackImplementation implements Stack {
	private int[] object;
	private int top;
	private int stackSize;
	private int size = 0;

	public StackImplementation() {
		stackSize = 4;
		top = -1;
		object = new int[stackSize];
	}

	public int push(int data) {
		System.out.println(data);
		if (top >= stackSize / 2) {
			int[] temp = object;
			stackSize = stackSize * 2;
			object = new int[stackSize];
			for (int i = 0; i <= top; i++)
				object[i] = temp[i];
			return object.length;
		}
		object[++top] = data;
		size++;
		return size;
	}

	int decreaseStackSize() {
		if (top == (stackSize / 2) - 1) {
			int[] temp = object;
			stackSize = stackSize * (3 / 4);
			object = new int[stackSize];
			for (int i = 0; i <= top; i++)
				object[i] = temp[i];
		}
		return object.length;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Integer pop() {
		if (top == (stackSize / 2) - 1)
			decreaseStackSize();
		if (top < 0)
			return null;
		size--;
		return object[top--];
	}

}
