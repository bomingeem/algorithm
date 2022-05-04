package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj3986 {
    static int N;
    public static void main(String[] args) throws IOException {
        //[백준] 좋은 단어
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0; i<N; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            stack.push(str.charAt(0));

            for (int j=1; j<str.length(); j++) {
                char ch = str.charAt(j);
                if (!stack.isEmpty()) {
                    if (ch == stack.peek()) {
                        stack.pop();
                        continue;
                    }
                }
                stack.push(ch);
            }
            if (stack.isEmpty()) count++;
        }
        System.out.println(count);
    }
}
