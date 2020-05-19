package main.java.algorithm.recursion;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 시킬 숫자를 입력하세요.");
		int num = sc.nextInt();
		sc.close();

		int value = factorial(num);
		System.out.println("팩토리얼 값은 : " + value);
	}

	private static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
