package edu.practice.datastructure.queue;

public class QueueImplementation {
	private int[] object;
	private int front;
	private int rear;
	private int queueSize;

	public QueueImplementation() {
		queueSize = 3;
		object = new int[queueSize];
		front = -1;
		rear = -1;
	}

	public void push(int data) {
		if ((front + 1) >= queueSize)
			resize();
		object[++front] = data;
	}

	private void resize() {
		int[] temp = object;
		queueSize = queueSize * 2;
		object = new int[queueSize];
		for (int i = 0; i <= front; i++) {
			object[i] = temp[i];
		}
	}

	public Integer pop() {
		if (front > rear) {
			return object[++rear];
		}
		return null;
	}

	public boolean isEmpty() {
		return front <= rear;
	}

	public static void main(String[] args) {
		QueueImplementation queue = new QueueImplementation();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		queue.push(6);
		queue.push(7);
		System.out.println("1 " + queue.pop());
		System.out.println("2 " + queue.pop());
		System.out.println("3 " + queue.pop());
		System.out.println("4 " + queue.pop());
		System.out.println("5 " + queue.pop());
		System.out.println("6 " + queue.pop());
		System.out.println("7 " + queue.pop());

	}

}
