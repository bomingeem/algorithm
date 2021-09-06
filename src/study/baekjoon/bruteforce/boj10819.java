package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj10819 {
    static int N;
    static int[] A, temp;
    static boolean[] visited;
    static int result = 0;
    public static void main(String[] args) {
        //[백준] 차이를 최대로
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N];
        temp = new int[N];
        visited = new boolean[N];

        for (int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        permutation(0);
        System.out.println(result);
    }

    static void permutation(int index) {
        if (index == N) {
            int sum = 0;
            for (int i=0; i<N-1; i++) {
                sum += Math.abs(temp[i] - temp[i + 1]);
            }
            result = Math.max(result, sum);
            return;
        }

        for (int i=0; i<N; i++) {
            if (visited[i] == true) continue;
            visited[i] = true;
            temp[index] = A[i];
            permutation(index + 1);
            visited[i] = false;
        }
    }
}