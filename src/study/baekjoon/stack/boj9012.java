package study.baekjoon.stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj9012 {
    public static void main(String[] args) throws IOException {
        //[백준] 괄호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            System.out.println(solution(br.readLine()));
        }
    }

    public static String solution(String bracket) {
        Stack<Character> stack = new Stack<>();
        for (char ch : bracket.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (!stack.empty()) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
