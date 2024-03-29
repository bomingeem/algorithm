package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj17298 {
    static int A;
    static int[] seq;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        //[백준] 오큰수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        seq = new int[A];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<A; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<A; i++) {
            while (!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<A; i++) {
            sb.append(seq[i]).append(" ");
        }
        System.out.println(sb);
    }
}
