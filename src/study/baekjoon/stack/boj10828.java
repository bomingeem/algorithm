package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10828 {
    static int[] stack;
    static int size = 0;
    static int N;
    public static void main(String[] args) throws IOException {
        //[백준] 스택
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        stack = new int[N];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int x) {
        stack[size] = x;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int result = stack[size - 1];
            size--;
            return result;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }
}
