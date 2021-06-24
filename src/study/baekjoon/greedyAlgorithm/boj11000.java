package study.baekjoon.greedyAlgorithm;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class boj11000 {
    public static void main(String[] args) {
        //[백준] 강의실 배정
        //많은 개념이 필요했던 문제라 아주 어렵다 ^_^!
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Lecture[] lectures = new Lecture[N];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i=0; i<N; i++) {
            int S = scanner.nextInt();
            int T = scanner.nextInt();
            lectures[i] = new Lecture(S,T);
        }
        Arrays.sort(lectures);
        priorityQueue.offer(lectures[0].end);

        for (int i=1; i<N; i++) {
            if (lectures[i].start >= priorityQueue.peek()) {
                priorityQueue.poll();
            }
            priorityQueue.offer(lectures[i].end);
        }

        System.out.println(priorityQueue.size());
    }
}

class Lecture implements Comparable<Lecture> {
    int start, end;

    public Lecture(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Lecture o) {
        if (start == o.start) {
            return end - o.end;
        }
        return start - o.start;
    }
}
