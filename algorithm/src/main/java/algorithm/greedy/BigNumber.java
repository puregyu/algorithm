package algorithm.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class BigNumber {
	public static void main(String[] args) {
		
//		어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
//		예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
//		문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. 
//		number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
//
//		[제한 조건]
//		number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.
//		k는 1 이상 number의 자릿수 미만인 자연수입니다.
		
		String number = "4177252841"; // 10자리
		int k = 4; // 4자리 제거
		String answer = ""; // 6자리 수를 만들어야함
		
		// 가장 큰 수 찾기
		char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
		
		System.out.println("정답 : "+new String(result));
	}
}
