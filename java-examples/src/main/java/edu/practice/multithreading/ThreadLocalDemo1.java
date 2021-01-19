package edu.practice.multithreading;

/**
 * 
 * @author yash 
 * InheritableThreadLocal
 */
class ParentThread extends Thread {
//	public static ThreadLocal t = new ThreadLocal();

	protected static InheritableThreadLocal<Object> t = new InheritableThreadLocal<Object>() {
		public Object childValue(Object p) {
			return "CC";
		}
	};

	@Override
	public void run() {
		t.set("PP");
		System.out.println("Parent Thread value: " + t.get());
		ChildThread c = new ChildThread();
		c.start();
	}
}

class ChildThread extends Thread {
	@Override
	public void run() {
		System.out.println("Child Thread value: " + ParentThread.t.get());
	}
}

public class ThreadLocalDemo1 {

	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}
}
