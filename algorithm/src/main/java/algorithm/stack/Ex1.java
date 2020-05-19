package main.java.algorithm.stack;

import java.util.Stack;

public class Ex1 {
	public static void main(String[] args) {
		
//		push() // 데이터 삽입
//		pop() // 마지막 데이터 꺼내서 반환
//		peek() // 마지막 데이터 반환
//		size() // 스택 크기
//		isEmpty() // 비어있는지 여부


		
		Stack<String> stack = new Stack<String>();
		stack.push("빨강");
		stack.push("주황");
		stack.push("노랑");
		stack.push("초록");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
