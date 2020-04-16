package algorithm.greedy;

public class Joystick {
	public static void main(String[] args) {
		String name = "JAN";
		char[] array = new char[name.length()];
		
		// 움직임
		int move = 0;
		
		// 'A'의 아스키코드
		int centerNum = 65;
		
		for (int i = 0; i < name.length(); i++) {
			array[i] = name.charAt(i);
		}
		
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			
			if(array[i] != 'A') {
				if(num <= 78) {
					// N 보다 작거나 같다 (A ~ N)
					int b= (num - centerNum);
					move += b;
				}else {
					// N 보다 크다 (O ~ Z)
					int b= 90-(num-1);
					move += b;
				}
			}else if(array[i] == 'A') {
				if(i == 1 | i == array.length-1) {
					move += -1;
				}
			}
			
			// -> 넘어가기
			if(i != array.length-1) {
				move++;
			}
		}
		
		System.out.println(move);
	}
}