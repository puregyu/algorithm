package algorithm.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Camouflage {
	public static void main(String[] args) {

		/**
		 * @문제
		 	스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
			예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
			
			종류	이름
			얼굴	동그란 안경, 검정 선글라스
			상의	파란색 티셔츠
			하의	청바지
			겉옷	긴 코트
			스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
		 */
		String[][] clothes = { 
										{"yellow_hat","headgear"},
										{"blue_sunglasses","eyewear"},
										{"green_turban","headgear"},
						              };

		int answer = 0;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < clothes.length; i++) {
			hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
		}
		
		Iterator<String> keys = hm.keySet().iterator();

		int b = 1;
		while (keys.hasNext()) {
			String key = keys.next();
			answer = answer + hm.get(key);
			b = b * hm.get(key);
		}
		if (hm.size() > 1) {
			answer += b;
		}
		
		System.out.println(answer);
	}
}
