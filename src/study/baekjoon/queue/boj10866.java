package study.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10866 {
    static int N;
    static int[] deque;
    static int start, end;
    public static void main(String[] args) throws IOException {
        //[백준] 덱
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        deque = new int[N];
        start = end = N/2;

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
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

    public static void push_front(int x) {
        deque[start] = x;
        start--;
    }

    public static void push_back(int x) {
        end++;
        deque[end] = x;
    }

    public static int pop_front() {
        if (start == end) {
            return -1;
        } else {
            int result = deque[start + 1];
            start++;
            return result;
        }
    }

    public static int pop_back() {
        if (start == end) {
            return -1;
        } else {
            int result = deque[end];
            end--;
            return result;
        }
    }

    public static int size() {
        return end - start;
    }

    public static int empty() {
        if (start == end) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (start == end) {
            return -1;
        } else {
            return deque[start + 1];
        }
    }

    public static int back() {
        if (start == end) {
            return -1;
        } else {
            return deque[end];
        }
    }
}
