package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj10819 {
    static int N;
    static int[] A;
    static int[] temporaryA;
    static boolean[] visited;
    static int result = 0;
    public static void main(String[] args) {
        //[백준] 차이를 최대로
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N];
        temporaryA = new int[N]; //각 순열 케이스를 담아줄 임시 저장소
        visited = new boolean[N];

        for (int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }

        permutation(0);
        System.out.println(result);
    }

    public static void permutation(int count) {
        if (count == N) {
            int sum = 0;
            for (int i=0; i<N-1; i++) {
                sum += Math.abs(temporaryA[i] - temporaryA[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }

        for (int i=0; i<N; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            temporaryA[count] = A[i];
            permutation(count+1);
            visited[i] = false;
        }
    }
}