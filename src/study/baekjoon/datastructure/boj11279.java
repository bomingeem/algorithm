package study.baekjoon.datastructure;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class boj11279 {
    static int N;
    static PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
    public static void main(String[] args) {
        //heap: 최솟값 또는 최댓값을 빠르게 찾아내기 위해 완전이진트리 형태로 만들어진 구조
        //[백준] 최대 힙
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

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
