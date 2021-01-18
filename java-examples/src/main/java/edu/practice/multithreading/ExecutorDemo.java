package edu.practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
	private String name;

	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " job started by thread : " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + " job completed by thread : " + Thread.currentThread().getName());
	}
}

public class ExecutorDemo {
	public static void main(String[] args) {
		PrintJob[] jobs = { new PrintJob("Task 11"), new PrintJob("Task 22"), new PrintJob("Task 33"),
				new PrintJob("Task 44"), };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob job : jobs) {
			service.submit(job);
		}
		service.shutdown();
	}
}
