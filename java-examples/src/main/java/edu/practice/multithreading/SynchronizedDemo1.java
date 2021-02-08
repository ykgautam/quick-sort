package edu.practice.multithreading;

/**
 * 
 * @author yash code using synchronized modifier
 *
 */
class Display {

	synchronized void wish(String name) {

		for (int i = 0; i < 10; i++) {
			System.out.print("good morning ");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			System.out.println(name);
		}
	}
}

class MyThread11 extends Thread {
	private Display d;
	private String name;

	MyThread11(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread11 t1 = new MyThread11(d, "yash");
		MyThread11 t2 = new MyThread11(d, "Gaurav");
		t1.start();
		t2.start();

	}

}
