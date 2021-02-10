package edu.practice.datastructure.binaryheap;

public class BinaryMaxHeap {
	int size;
	int[] array = new int[20];

	public void insertNewValue(int value) {
		array[size] = value;
		int index = size;
		int parent = (index - 1) / 2;

		while (parent >= 0 && array[parent] < array[index]) {
			int tempVar = array[parent];
			array[parent] = array[index];
			array[index] = tempVar;

			tempVar = parent;
			index = parent;
		}
		size++;
	}

	public int getMax() {
		return array[0];
	}

	public int removeMax() {
		int max = array[0];
		array[0] = array[size - 1];
		size = size - 1;
		maxHeapify(0);
		return max;
	}

	private void maxHeapify(int index) {
		int left, right;
		left = 2 * index;
		right = 2 * index + 1;
		int largest = index;
		if (left < size && array[left] > array[largest]) {
			largest = left;
		}
		if (right < size && array[right] > array[largest])
			largest = right;

		if (largest != index) {
			int temp = array[largest];
			array[largest] = array[index];
			array[index] = temp;
			maxHeapify(largest);
		}
	}

	public int[] buildMaxHeap(int[] array) {
		this.array = array;
		this.size = array.length;
		System.out.println("size " + this.size);

		for (int i = (size / 2) - 1; i > 0; i--)
			maxHeapify(i);
		return array;
	}

	public static void main(String[] args) {
		BinaryMaxHeap obj = new BinaryMaxHeap();
		int[] array = { 10, 77, 11, 30, 20, 38, 2, 45 };
		
		obj.insertNewValue(array[0]);
		System.out.println(obj.getMax());
		obj.insertNewValue(array[1]);
		System.out.println(obj.getMax());
		obj.insertNewValue(array[2]);

	}
}
