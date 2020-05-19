package main.java.algorithm.test;

public class Test {
	public static void main(String[] args) {
		int answer = 0;
		int n = 6;

		
		answer =fibonacci(n);
		
		System.out.println(answer);
	}
	
	public static int fibonacci(int n) {
        // 재귀함수 활용
        if(n <= 1) 
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
