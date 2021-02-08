package edu.practice.innerclass;

/**
 * 
 * @author yash: AnonymousClass3 that implements Runnable interface
 *
 */
class Display {
	public void show() {
		synchronized (this) {
			for (int i = 1; i < 5; i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.getMessage();
				}
				System.out.println("show this code in synchronized way");
			}
		}
	}
}

public class AnonymousRunnableClass3 {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			@Override
			public void run() {
				Display d = new Display();
				d.show();
				synchronized (this) {
					for (int i = 1; i < 5; i++) {
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.getMessage();
						}
						System.out.println("run in synchronized way");
					}
				}
			}
		};

		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i < 5; i++) {
					System.out.println("inside method arg ");
				}
			}
		}).start();

		Thread thread = new Thread(r);
		thread.start();

		for (int i = 1; i < 5; i++) {
			System.out.println("main method");
		}
	}
} 
