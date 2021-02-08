package edu.practice.multithreading;

public class ThreadExample1 {

	public static void main(String[] args) {
		Thread thread1 = new Thread();
		thread1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("hii "+Thread.currentThread());
		thread1.setPriority(1);
		int gurupriority = thread1.getPriority();
		System.out.println(gurupriority);
		System.out.println("Thread Running");
	}
}