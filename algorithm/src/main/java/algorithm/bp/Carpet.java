package main.java.algorithm.bp;

public class Carpet {
	public static void main(String[] args) {

//		Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 빨간색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
//		Leo는 집으로 돌아와서 아까 본 카펫의 빨간색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
//		Leo가 본 카펫에서 갈색 격자의 수 brown, 빨간색 격자의 수 red가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
		
		int brown = 24;
		int red = 24;
		
		int[] answer = new int[2];
		int 가로최소값 = 3;
		int 가로최대값 = (brown/2)-1;
		
//		System.out.println(가로최소값);
//		System.out.println(가로최대값);
		
		int 가로=0;
		int 세로=0;
		
		for(int i=가로최소값; i<가로최대값+1;i++) {
			가로 = i;
			세로 = (brown-(i*2))/2 + 2;
			if(가로 >= 세로 && red == (가로-2)*(세로-2) ) {
				answer[0]=가로;
				answer[1]=세로;
			}
		}
	}
}
