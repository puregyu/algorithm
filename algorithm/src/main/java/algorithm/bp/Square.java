package main.java.algorithm.bp;

public class Square {
    public static long main(String[] args) {
        int w = 0;
        int h = 0;
        long answer = 0;
        for(int i = 0; i < w; i++)
            answer += (Long.valueOf(h) * i) / Long.valueOf(w);

        return answer * 2;
    }
}
