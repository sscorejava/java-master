package collections;

import java.util.PriorityQueue;

public class Example1 {

	public static void main(String[] args) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.add(11);
		queue.add(10);
		queue.add(22);
		queue.add(5);
		queue.add(12);
		queue.add(2);
		
		System.out.println(queue);
		
		while (!queue.isEmpty()) {
			System.out.printf("%d ", queue.remove());
		}
		
		System.out.println("\n");
		System.out.println(queue);
	}
	
	/* 
	 * Priority queue always outputs the minimum element from the queue when remove() method is called, 
	 * no matter what the sequence of input is. 
	 * */

}
