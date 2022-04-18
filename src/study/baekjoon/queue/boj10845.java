package study.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj10845 {
    //[백준] 큐
    static final int MAX = 1000005;
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer command;
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        int back = -1;

        while (number-- > 0) {
            command = new StringTokenizer(br.readLine(), " ");
            switch (command.nextToken()) {
                case "push":
                    back = Integer.parseInt(command.nextToken());
                    queue.offer(back);
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : back).append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb.toString());
    }

    /*
    public static void push(int x) {
        queue[++tail] = x;
    }

    public static int pop() {
        if (size() == 0) {
            return -1;
        } else {
            return queue[head++];
        }
    }

    public static int size() {
        return tail-head+1;
    }

    public static int empty() {
        if (size() == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (size() == 0) {
            return -1;
        } else {
            return queue[head];
        }
    }

    public static int back() {
        if (size() == 0) {
            return -1;
        } else {
            return queue[tail];
        }
    }
    */
}
