package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj1874 {
    static int n;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        //[백준] 스택 수열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());

        int count = 1;

        while (n-- > 0) {
            int number = Integer.parseInt(br.readLine());
            while (count <= number) {
                stack.push(count);
                count++;
                sb.append("+").append("\n");
            }

            if (stack.peek() == number) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
