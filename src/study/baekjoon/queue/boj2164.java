package study.baekjoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj2164 {
    static int N;
    static Queue<Integer> queue = new LinkedList<Integer>();
    public static void main(String[] args) {
        //[백준] 카드2
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (int i=1; i<=N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
