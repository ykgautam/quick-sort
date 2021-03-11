package edu.practice.producerconsumer;

import java.util.List;

public class Producer implements Runnable {
	List<Integer> sharerdList = null;
	final int MAX_SIZE = 5;
	private int element = 0;

	public Producer(List<Integer> sharerdList) {
		super();
		this.sharerdList = sharerdList;

	}

	@Override
	public void run() {
		while (true) {
			try {
				produce(element++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void produce(int element) throws InterruptedException {
		synchronized (sharerdList) {
			while (sharerdList.size() == MAX_SIZE) {
				System.out.println("shared list is full , waiting for the consumer to consume ");
				sharerdList.wait();
			}
		}
		synchronized (sharerdList) {
			System.out.println("producer produced element"+element);
			sharerdList.add(element);
			Thread.sleep(1000);
			sharerdList.notify();
		}
	}
}
