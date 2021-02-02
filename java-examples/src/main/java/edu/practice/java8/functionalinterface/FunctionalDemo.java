package edu.practice.java8.functionalinterface;

public class FunctionalDemo {

	public static void main(String[] args) {

		CreateThreadUsingAnonymousClass();
		CreateThreadUsingLambdaExpression();
	}

	private static void CreateThreadUsingLambdaExpression() {
		Runnable r = () -> {
			System.out.println("my task is excuting using lambda expression...");
		};
		Thread t = new Thread(r);
		t.start();
	}

	private static void CreateThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("my task is excuting using AnonymousClass...");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
