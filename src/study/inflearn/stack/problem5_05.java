package study.inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class problem5_05 {
    public static void main(String[] args) throws IOException {
        //[인프런] 쇠막대기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stick = br.readLine();
        System.out.println(solution(stick));
    }

    public static int solution(String stick) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<stick.length(); i++) {
            if (stick.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (stick.charAt(i-1) == '(') {
                    answer += stack.size();
                } else {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
