package edu.practice.multithreading;

/**
 * 
 * @author yash main thread belong to main grp
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());
		System.out.println(Thread.currentThread().getPriority());

		ThreadGroup g1 = new ThreadGroup("first Group");
		System.out.println(g1.getParent().getName());

		ThreadGroup g2 = new ThreadGroup(g1, "second Group");
		System.out.println(g2.getName());
		System.out.println(g2.getParent().getName());

		Thread t1 = new Thread(g1, "thread1");
		Thread t2 = new Thread(g1, "thread2");
		System.out.println(t1);
		g1.setMaxPriority(3);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		Thread t3 = new Thread(g1, "thread3");
		System.out.println(t3.getPriority());
		System.out.println(t3.isAlive());
		g1.list();
		t3.setDaemon(false);
		System.out.println(t3.isDaemon());

	}

}
