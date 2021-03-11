package edu.practice.producerconsumer;

import java.util.List;

public class Consumer implements Runnable {
	List<Integer> sharerdList = null;

	public Consumer(List<Integer> sharerdList) {
		super();
		this.sharerdList = sharerdList;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void consume() throws InterruptedException {
		synchronized (sharerdList) {
			while (sharerdList.isEmpty()) {
				System.out.println("shared list is empty , waiting for the producer to produce ");
				sharerdList.wait();
			}
		}

		synchronized (sharerdList) {
			Thread.sleep(100);
			sharerdList.notify();
		}
	}
}
