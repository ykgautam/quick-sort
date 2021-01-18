package edu.practice.multithreading;

/**
 * tryLock(5000, TimeUnit.MILLISECONDS)
 * in do while loop
 */

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyThread3 extends Thread {
	static Lock l3 = new ReentrantLock();

	public MyThread3(String name) {
		super(name);
	}

	@Override
	public void run() {
		super.run();
		do {
			try {

				if (l3.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + " got lock");
					Thread.sleep(20000);
					l3.unlock();
					System.out.println(Thread.currentThread().getName() + " got released ");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "unable to get lock and will try later ");
				}
			} catch (InterruptedException e) {
			}
		} while (true);
	}
}

public class ReentrantLockDemo3 {

	public static void main(String[] args) {
		MyThread3 t1 = new MyThread3("first thread");
		MyThread3 t2 = new MyThread3("second thread");
		t1.start();
		t2.start();
	}
}
