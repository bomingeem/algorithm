package study.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10866 {
    static int N;
    static int[] deque;
    static int head, tail;
    public static void main(String[] args) throws IOException {
        //[백준] 덱
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer command;
        N = Integer.parseInt(br.readLine());

        deque = new int[N];
        head = tail = N/2;

        for (int i=0; i<N; i++) {
            command = new StringTokenizer(br.readLine(), " ");
            switch (command.nextToken()) {
                case "push_front":
                    push_front(Integer.parseInt(command.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(command.nextToken()));
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
        deque[head] = x;
        head--;
    }

    public static void push_back(int x) {
        tail++;
        deque[tail] = x;
    }

    public static int pop_front() {
        if (head == tail) {
            return -1;
        } else {
            int result = deque[head + 1];
            head++;
            return result;
        }
    }

    public static int pop_back() {
        if (head == tail) {
            return -1;
        } else {
            int result = deque[tail];
            tail--;
            return result;
        }
    }

    public static int size() {
        return tail - head;
    }

    public static int empty() {
        if (head == tail) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (head == tail) {
            return -1;
        } else {
            return deque[head + 1];
        }
    }

    public static int back() {
        if (head == tail) {
            return -1;
        } else {
            return deque[tail];
        }
    }
}
