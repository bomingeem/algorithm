package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10799 {
    public static void main(String[] args) throws IOException {
        //[백준] 쇠막대기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bar = br.readLine();

        System.out.println(solution(bar));
    }

    public static int solution(String bar) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i=0; i<bar.length(); i++) {
            if (bar.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.peek() + 1 == i) {
                    stack.pop();
                    count += stack.size();
                } else {
                    stack.pop();
                    count += 1;
                }
            }
        }
        return count;
    }
}
