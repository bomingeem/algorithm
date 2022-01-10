package study.baekjoon.stack;

import java.util.Scanner;

public class boj10828 {
    static int N;
    static int size = 0;
    static int[] stack;
    public static void main(String[] args) {
        //[백준] 스택
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        N = scanner.nextInt();
        stack = new int[N];

        for (int i=0; i<N; i++) {
            String command = scanner.next();
            switch (command) {
                case "push":
                    push(scanner.nextInt());
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
            }
        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[size] = item;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int result = stack[size-1];
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
            return stack[size-1];
        }
    }
}
