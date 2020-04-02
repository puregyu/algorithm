package algorithm.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhoneNumber {
	
	public static void main(String[] args) {
		
		/**
		 * @문제
		 	전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
			전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

			구조대 : 119
			박준영 : 97 674 223
			지영석 : 11 9552 4421
			전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

		 */
		String[] phone_book = { "119", "97674223", "1195524421" };
		boolean answer = true;
		
		/**
		 * @푼사람 devyu
		 * @채점결과
		 * 정확성: 84.6
		 * 효율성: 0.0 
		 * 합계: 84.6 / 100.0 
		 */
//		for (int i = 0; i < phone_book.length; i++) {
//			for (int j = 0; j < phone_book.length; j++) {
//				if(i != j && phone_book[i].startsWith(phone_book[j])) {
//					answer = false;
//				}
//			}
//		}
		
		/**
		 * @푼사람 devyu
		 * @채점결과
		 * 채점 결과
		 * 정확성: 69.2
		 * 효율성: 15.4
		 * 합계: 84.6 / 100.0
		 */
//		for (int i = 0; i < phone_book.length-1; i++) {
//			for (int j = i+1; j < phone_book.length; j++) {
//				if(phone_book[j].startsWith(phone_book[i])) {
//					answer = false;
//					break;
//				}
//			}
//		}
		

		/**
		 * @푼사람 devyu
		 * @채점결과
		 * 채점 결과
		 * 합격
		 * 
		 * Collections.sort() 를 사용한 
		 */
//		List<String> sortedList = new ArrayList<>(Arrays.asList(phone_book));
//		Collections.sort(sortedList);
//		
//		for (int i = 0; i < sortedList.size()-1; i++) {
//			for (int j = i+1; j < sortedList.size(); j++) {
//				if(sortedList.get(j).startsWith(sortedList.get(i))) {
//					answer = false;
//					break;
//				}
//			}
//		}
		
		
		/**
		 * @푼사람 Others
		 * @채점결과
		 * 채점 결과
		 * 합격
		 * 
		 * Collections.sort() 를 사용한 
		 */
		for(int i=0; i<phone_book.length-1; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {
                	answer = false;
            	}
                if(phone_book[j].startsWith(phone_book[i])) {
                	answer = false;
            	}
            }
        }
		
		System.out.println(answer);
	}
}
