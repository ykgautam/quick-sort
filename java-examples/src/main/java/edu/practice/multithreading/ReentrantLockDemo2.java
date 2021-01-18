package edu.practice.multithreading;

/**
 * example using tryLock(1000, TimeUnit.MILLISECONDS)
 * 
 */
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread2 extends Thread {
	static ReentrantLock l2 = new ReentrantLock();

	public MyThread2(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			if (l2.tryLock(1000, TimeUnit.MILLISECONDS)) {
				System.out.println(Thread.currentThread().getName() + " got lock and performed safe operation ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		} catch (InterruptedException e) {
			e.getMessage();
		}
		l2.unlock();
	}
}

public class ReentrantLockDemo2 {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("first thread");
		MyThread2 t2 = new MyThread2("second thread");
		t1.start();
		t2.start();
	}

}
