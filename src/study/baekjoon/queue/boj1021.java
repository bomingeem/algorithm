package study.baekjoon.queue;

import java.util.LinkedList;
import java.util.Scanner;

public class boj1021 {
    static int N;
    static int M;
    static int count = 0;
    static LinkedList<Integer> deque = new LinkedList<>();
    public static void main(String[] args) {
        //[백준] 회전하는 큐
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        for (int i=0; i<N; i++) {
            deque.offer(i+1);
        }

        int[] sequence = new int[M];

        for (int i=0; i<M; i++) {
            sequence[i] = scanner.nextInt();
        }

        for (int i=0; i<M; i++) {
            int targetIndex = deque.indexOf(sequence[i]);
            int halfIndex;

            if (deque.size() % 2 == 0) {
                halfIndex = deque.size()/2-1;
            } else {
                halfIndex = deque.size()/2;
            }

            if (targetIndex <= halfIndex) { //목표 인덱스가 중간지점보다 앞에 있을 경우
                for (int j=0; j<targetIndex; j++) {
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            } else { //뒤에 있을 경우
                for (int j=0; j<deque.size() - targetIndex; j++) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst(); //연산이 끝나면 맨 앞 원소를 삭제
        }
        System.out.println(count);
    }
}
