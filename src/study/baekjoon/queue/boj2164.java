package study.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class boj2164 {
    static int N;
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        //[백준] 카드2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            queue.offer(i + 1);
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.peek());
    }
}
