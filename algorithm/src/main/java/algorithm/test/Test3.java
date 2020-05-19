package main.java.algorithm.test;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		int n = 3; 
		int m = 3; 
		int k = 2;
		
		int moveCount=0;
		int bumLocation=1;
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 1; i < n+1; i++) {
			if(i==1) {
				hm.put(i, 1);
			}else {
				hm.put(i, 0);
			}
		}

		
		while(true) {
			int index = bumLocation;
			moveCount++;
			int c = hm.get(index);
			
			if(c%2 == 1) {
				bumLocation = bumLocation+k;
				if(bumLocation>n) {
					bumLocation = bumLocation-n;
				}
			}else if(c%2 == 0) {
				bumLocation = bumLocation-k;
				if(bumLocation<1) {
					bumLocation = n-(bumLocation+1);
				}
			}
			
			if(hm.get(index)+1 == m) {
				break;
			}else {
				hm.put(index, hm.get(index)+1);
			}
		}
		
		System.out.println(moveCount);
	}
}
