package study.baekjoon.queue;

import java.util.*;

public class boj1158 {
    static int N;
    static int K;
    public static void main(String[] args) {
        //[백준] 요세푸스 문제
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        N = scanner.nextInt();
        K = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i=1; i<=N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            for (int i=0; i<K-1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll() + ">");
        System.out.println(sb);
    }
}
