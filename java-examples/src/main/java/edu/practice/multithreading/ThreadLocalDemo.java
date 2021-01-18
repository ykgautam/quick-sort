package edu.practice.multithreading;

public class ThreadLocalDemo {

	public static void main(String[] args) {
//		ThreadLocal t1 = new ThreadLocal();

		ThreadLocal t1 = new ThreadLocal() {
			@Override
			protected Object initialValue() {
				return "abc";
			}
		};
		System.out.println(t1.get());
		t1.set("yash");
		System.out.println(t1.get());
		t1.remove();
		System.out.println(t1.get());
		System.out.println(t1.getClass().getName());
		System.out.println(t1.getClass().getPackageName());

	}
}
