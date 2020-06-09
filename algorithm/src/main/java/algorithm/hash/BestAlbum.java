package main.java.algorithm.hash;

import java.util.*;

public class BestAlbum {
	public static void main(String[] args) {
		/**
		 * @문제
		 	스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

			속한 노래가 많이 재생된 장르를 먼저 수록합니다.
			장르 내에서 많이 재생된 노래를 먼저 수록합니다.
			장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.

			고유번호 낮은 순 > 많이 재생된 노래 > 장르

			노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
		 */

		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};

		HashMap<String, Object> 장르_곡정보 = new HashMap<String, Object>();      //	<장르, 곡 정보>
		HashMap<String, Integer> 장르_재생수 = new HashMap<String, Integer>(); 	//	<장르, 총 장르 재생수>
		ArrayList<Integer> 결과 = new ArrayList<Integer>();

		for(int i = 0; i < genres.length; i++){
			String key = genres[i];
			// 곡 정보 : [key : 곡 고유번호, value : 재생횟수]
			HashMap<Integer, Integer> 곡정보;

			if(장르_곡정보.containsKey(key)){
				곡정보 = (HashMap<Integer, Integer>) 장르_곡정보.get(key);
			} else {
				곡정보 = new HashMap<Integer, Integer>();
			}

			// 곡 정보 = [key : 곡 고유번호, value : 재생횟수]
			곡정보.put(i, plays[i]);
			// 장르_곡정보 = [key : 곡 장르, value : 곡 정보]
			장르_곡정보.put(key, 곡정보);

			// 재생수
			if(장르_재생수.containsKey(key)){
				장르_재생수.put(key, 장르_재생수.get(key) + plays[i]);
			} else {
				장르_재생수.put(key, plays[i]);
			}
		}

		int mCnt = 0;
		Iterator it = sortByValue(장르_재생수).iterator();

		while(it.hasNext()){
			String key = (String)it.next();
			Iterator indexIt = sortByValue((HashMap<Integer, Integer>)장르_곡정보.get(key)).iterator();
			int playsCnt = 0;

			while(indexIt.hasNext()){
				결과.add((int)indexIt.next());
				mCnt++;
				playsCnt++;
				if(playsCnt > 1) break;
			}
		}

		int[] answer = new int[결과.size()];

		for(int i = 0; i < 결과.size(); i++){
			answer[i] = 결과.get(i).intValue();
		}

		System.out.println(answer);
	}

	private static ArrayList sortByValue(Map map){
		ArrayList<Object> keyList = new ArrayList();
		keyList.addAll(map.keySet());

		Collections.sort(keyList, new Comparator(){
			public int compare(Object o1, Object o2){
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);

				return ((Comparable) v2).compareTo(v1);
			}
		});
		return null;
	}
}
