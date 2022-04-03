package study.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class boj1158 {
    static int N;
    static int K;
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        //[백준] 요세푸스 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] commands = br.readLine().split(" ");
        N = Integer.parseInt(commands[0]);
        K = Integer.parseInt(commands[1]);
        for (int i=0; i<N; i++) {
            queue.offer(i+1);
        }

        sb.append("<");
        while (queue.size() > 1) {
            for (int i=0; i<K-1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
