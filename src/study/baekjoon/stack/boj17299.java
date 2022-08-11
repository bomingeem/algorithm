package study.baekjoon.stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj17299 {
    static int A;
    static int[] seq;
    static int[] frequence = new int[1000001];
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        //[백준] 오등큰수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        seq = new int[A];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<A; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
            frequence[seq[i]] += 1;
        }

        for (int i=0; i<A; i++) {
            while (!stack.isEmpty() && frequence[seq[stack.peek()]] < frequence[seq[i]]) {
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
