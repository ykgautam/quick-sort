package edu.practice.multithreading;

/**
 * 
 * @author yash
 * demo program for ReentrantLock class 
 */
import java.util.concurrent.locks.ReentrantLock;

class Display1 {
	static ReentrantLock l = new ReentrantLock();

	void wish1(String name) {

		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.print("good afternoon  ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println("catch");
			}
			System.out.println(name);
		}
		l.unlock();
	}
}

class MyThread1 extends Thread {
	private Display1 d1;
	private String name;

	MyThread1(Display1 d1, String name) {
		this.d1 = d1;
		this.name = name;
	}

	@Override
	public void run() {
		d1.wish1(name);
	}
}

public class ReentrantLockDemo1 {

	public static void main(String[] args) {
		Display1 d1 = new Display1();
		MyThread1 t1 = new MyThread1(d1, "yash");
		MyThread1 t2 = new MyThread1(d1, "gtm");

		t1.start();
		t2.start();
	}

}