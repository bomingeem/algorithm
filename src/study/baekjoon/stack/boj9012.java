package study.baekjoon.stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj9012 {
    static int T;
    public static void main(String[] args) throws IOException {
        //[백준] 괄호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            sb.append(solution(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }

    public static String solution(String bracket) {
        Stack<Character> stack = new Stack<>();
        for (char ch : bracket.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
