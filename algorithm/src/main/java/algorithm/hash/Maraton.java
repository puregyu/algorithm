package main.java.algorithm.hash;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Maraton {
	public static void main(String[] args) {
		
		/**
		 * @문제
		 	수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
			마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
			완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

		 */
		String[] participant = { "abra", "cxmax", "boyond" };
		String[] completion = { "abra", "cxmax" };

		String answer = "";

		/**
		 * @푼사람 devyu
		 * @방법
		 * ArrayList 이용한 방법
		 */
//		ArrayList<String> list = new ArrayList<String>();
//		for (String p : participant) {
//			list.add(p);
//		}
//		for (String c : completion) {
//			list.remove(c);
//		}
//		answer = list.get(0);

		/**
		 * @푼사람 해답
		 * @방법
		 * HashMap 이용한 방법
		 */
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//        for (String player : participant) 
//        	map.put(player, map.getOrDefault(player, 0) + 1);
//        for (String player : completion) 
//        	map.put(player, map.get(player) - 1);
//
//        for (String key : map.keySet()) {
//            if (map.get(key) != 0){
//                answer = key;
//            }
//        }		
       
		/**
		 * @푼사람 devyu
		 * @방법
		 * Arrays.sort 이용한 방법
		 */
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		
//		int i = 0;
//		for (i = 0; i < completion.length; i++) {
//			if (!participant[i].equals(completion[i])) {
//				break;
//			}
//		}
//		answer = participant[i];
		
		
		// 정답
		System.out.println(answer);

	}
}