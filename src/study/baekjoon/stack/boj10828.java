package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10828 {
    static int[] stack;
    static int position = 0;
    static int N;
    public static void main(String[] args) throws IOException {
        //[백준] 스택
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer command;
        stack = new int[N];

        for (int i=0; i<N; i++) {
            command = new StringTokenizer(br.readLine(), " ");
            switch (command.nextToken()) {
                case "push":
                    push(Integer.parseInt(command.nextToken()));
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "top":
                    System.out.println(top());
                    break;
            }
        }
    }

    public static void push(int x) {
        stack[position++] = x;
    }

    public static int pop() {
        if (position == 0) {
            return -1;
        } else {
            int result = stack[position-1];
            position--;
            return result;
        }
    }

    public static int size() {
        return position;
    }

    public static int empty() {
        if (position == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (position == 0) {
            return -1;
        } else {
            return stack[position-1];
        }
    }
}
