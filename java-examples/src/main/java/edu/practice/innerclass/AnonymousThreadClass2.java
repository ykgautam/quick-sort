package edu.practice.innerclass;

/**
 * 
 * @author yash: AnonymousClass2 that extends Thread class
 *
 */
public class AnonymousThreadClass2 {

	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("overridden run");
				}
			}
		};
		t.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("main method");
		}

	}

}
