package edu.practice.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Object> {
	int number;

	MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Object call() throws Exception {
		System.out.println(
				Thread.currentThread().getName() + " is responsible to find sum of first " + number + " numbers");
		Thread.sleep(2000);
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] jobs = { 
				new MyCallable(10), 
				new MyCallable(20),
				new MyCallable(30), 
				new MyCallable(40),
				new MyCallable(50), 
				new MyCallable(60), 
				};

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (MyCallable job : jobs) {
			Future<Object> f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}
