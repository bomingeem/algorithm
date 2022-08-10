package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10799 {
    static int count = 0;
    static Stack<String> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        //[백준] 쇠막대기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bracket = br.readLine();

        for (int i=0; i<bracket.length(); i++) {
            if (bracket.charAt(i) == '(') {
                stack.push("(");
            } else if (bracket.charAt(i) == ')') {
                if (bracket.charAt(i-1) == '(') {
                    stack.pop();
                    count += stack.size();
                } else {
                    stack.pop();
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
