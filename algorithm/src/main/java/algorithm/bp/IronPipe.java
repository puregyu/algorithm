package main.java.algorithm.bp;

import java.util.Stack;

public class IronPipe {
    public static int main(String[] args) {
        String arrangement = "";
        int answer = 0;

        arrangement = arrangement.replace("()", "1");

        Stack<Character> a = new Stack<Character>();
        for(int i=0; i<arrangement.length(); i++) {
            char cursor = arrangement.charAt(i);
            if(cursor == '(') {
                a.push(cursor);
            }
            else if(cursor == '1') {
                answer += a.size();
            }
            else if(cursor == ')') {
                answer += 1;
                a.pop();
            }
        }

        return answer;
    }
}
