package study.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10845 {
    static int[] queue = new int[100001];
    static int N;
    static int start = 0;
    static int end = 0;
    public static void main(String[] args) throws IOException {
        //[백준] 큐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            StringTokenizer command = new StringTokenizer(br.readLine(), " ");
            switch (command.nextToken()) {
                case "push":
                    push(Integer.parseInt(command.nextToken()));
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
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int x) {
        queue[end] = x;
        end++;
    }

    public static int pop() {
        if (end - start == 0) {
            return -1;
        } else {
            int result = queue[start];
            start++;
            return result;
        }
    }

    public static int size() {
        return end - start;
    }

    public static int empty() {
        if (end - start == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (end - start == 0) {
            return -1;
        } else {
            return queue[start];
        }
    }

    public static int back() {
        if (end - start == 0) {
            return -1;
        } else {
            return queue[end - 1];
        }
    }
}
