package study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj1863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty() && stack.peek() > y) {
                count++;
                stack.pop();
            }
            if (!stack.isEmpty() && stack.peek() == y) {
                continue;
            }
            stack.push(y);
        }

        while (!stack.isEmpty() && stack.peek() > 0) {
            count++;
            stack.pop();
        }
        System.out.println(count);
    }
}
