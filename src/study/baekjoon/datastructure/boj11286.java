package study.baekjoon.datastructure;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class boj11286 {
    static int N;
    public static void main(String[] args) {
        //[백준] 절댓값 힙
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) return o1 > o2 ? 1 : -1;
                return Math.abs(o1) - Math.abs(o2);
            }
        });

        for (int i=0; i<N; i++) {
            int number = scanner.nextInt();
            if (number == 0) {
                if (!heap.isEmpty()) System.out.println(heap.poll());
                else System.out.println(0);
                continue;
            }
            heap.add(number);
        }
    }
}
