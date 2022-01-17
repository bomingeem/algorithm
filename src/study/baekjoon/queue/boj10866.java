package study.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj10866 {
    static Deque<Integer> deque = new ArrayDeque<Integer>();
    static int N;
    static int size = 0;
    public static void main(String[] args) throws IOException {
        //[백준] 덱
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer command;
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

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
            }
        }
        System.out.println(sb);
    }

    public static void push_front(Integer item) {
        deque.offerFirst(item);
        size++;
    }

    public static void push_back(Integer item) {
        deque.offerLast(item);
        size++;
    }

    public static Integer pop_front() {
        if (size == 0) {
            return -1;
        } else {
            size--;
            return deque.pollFirst();
        }
    }

    public static Integer pop_back() {
        if (size == 0) {
            return -1;
        } else {
            size--;
            return deque.pollLast();
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

    public static Integer front() {
        if (size == 0) {
            return -1;
        } else {
            return deque.peekFirst();
        }
    }

    public static Integer back() {
        if (size == 0) {
            return -1;
        } else {
            return deque.peekLast();
        }
    }
}
