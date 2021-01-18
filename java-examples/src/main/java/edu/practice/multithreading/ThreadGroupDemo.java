package edu.practice.multithreading;

class MyThread extends Thread {
	public MyThread(ThreadGroup g, String name) {
		super(g, name);
	}

	public void run() {
		System.out.println("child thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
	}
}

public class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("parentgroup");
		ThreadGroup cg = new ThreadGroup(pg, "childgroup");

		MyThread t1 = new MyThread(pg, "childthread1");
		MyThread t2 = new MyThread(pg, "childthread2");
		t1.start();
		t2.start();

		System.out.println(pg.activeCount());
		System.out.println("acive grp " + pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println("active count  " + pg.activeCount());
		System.out.println("active grp " + pg.activeGroupCount());

	}
}
