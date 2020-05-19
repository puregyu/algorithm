package main.java.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Ex1 {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("빨강");
		queue.add("주황");
		queue.add("노랑");

		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}

}
