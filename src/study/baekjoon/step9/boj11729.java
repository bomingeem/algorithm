package study.baekjoon.step9;

import java.io.*;
import java.util.Scanner;

public class boj11729 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        //[백준] 하노이 탑 이동 순서
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        sb.append((int)(Math.pow(2, N) - 1)).append("\n");
        hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    /**
     * @param N: 원판의 개수
     * @param start: 출발지
     * @param mid: 옮기기 위해 이동해야 할 장소
     * @param to: 목적지
     */
    public static void hanoi(int N, int start, int mid, int to) {
        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        hanoi(N-1, start, to, mid);

        sb.append(start + " " + to + "\n");

        hanoi(N-1, mid, start, to);
    }
}
