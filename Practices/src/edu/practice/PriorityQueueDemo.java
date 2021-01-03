package edu.practice;

import java.util.PriorityQueue;
import edu.practice.collection.MyComparator;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		queueMethods(); 
		
//		created a new queue "q1" with customized sorting 
		PriorityQueue q1 =new PriorityQueue(15,new MyComparatorForQueue());
		q1.offer("a");
		q1.offer("c");
		q1.offer("b"); 
		q1.offer("d");
		System.out.println(q1);
		
	}
	private static void queueMethods() {
		PriorityQueue queue = new PriorityQueue<>();
		System.out.println("peek return null if queue is empty : " + queue.peek());

		for (int i = 1; i <= 15; i++) {
			System.out.println("is object added in queue : "+queue.add(i));
		}
		System.out.println("all objects in the queue are " + queue);
		System.out.println("poll() remove and rturn head elements of queue "+queue.poll());
		System.out.println("retuens the head element : " + queue.peek());
		System.out.println("remove() method used here "+queue.remove());
		System.out.println(queue);
		
	}
}
