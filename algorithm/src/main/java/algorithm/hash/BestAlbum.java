package algorithm.hash;

import java.util.HashMap;

public class BestAlbum {
	public static void main(String[] args) {
		/**
		 * @문제
		 	스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

			속한 노래가 많이 재생된 장르를 먼저 수록합니다.
			장르 내에서 많이 재생된 노래를 먼저 수록합니다.
			장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
			노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
		 */
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		HashMap<String, int[]> hm2 = new HashMap<String, int[]>();
		
		for (int i = 0; i < genres.length; i++) {
			if(hm.containsKey(genres[i])) {
				
				int[] t = hm2.get(genres[i]);
				for (int j = 0; j < t.length; j++) {
					
				}
				
				hm.put(genres[i], hm.get(genres[i])+plays[i]);
				
			}else {
				hm.put(genres[i], plays[i]);
				hm.put(genres[i], plays[i]);
			}
		}
		System.out.println(hm);
	}
}
