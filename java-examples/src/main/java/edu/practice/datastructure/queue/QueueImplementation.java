package edu.practice.datastructure.queue;

public class QueueImplementation implements QueueInterface {
	private int[] object;
	private int front;
	private int rear;
	private int queueSize;
	int counter = 0;

	public QueueImplementation() {
		queueSize = 3;
		object = new int[queueSize];
		front = -1;
		rear = -1;
	}

	public int resize() {
		int[] temp = object;
		queueSize = queueSize * 2;
		object = new int[queueSize];
		for (int i = 0; i <= front; i++) {
			object[i] = temp[i];
		}
		return object.length;
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

	public int push(int data) {
		counter++;
		if ((front + 1) >= queueSize) {
			int[] temp = object;
			queueSize = queueSize * 2;
			object = new int[queueSize];
			for (int i = 0; i <= front; i++) {
				object[i] = temp[i];
			}
		}
//			resize();
		object[++front] = data;
		return object[front];
	}

	public void printQueue() {
		for (int i = 0; i < counter; i++) {
			System.out.println("value " + object[i]);
		}
	}

	@Override
	public QueueImplementation queueOPerations() {
		QueueImplementation queue = new QueueImplementation();
		System.out.println(queue.push(1) + " " + queue.resize());
		queue.push(2);
		queue.push(3);
		queue.push(5);

		queue.printQueue();

		System.out.println("size " + queue.resize());
		System.out.println("counter size " + queue.counter);
		return queue;
	}

}
