package study.baekjoon.backTracking;

import java.util.Scanner;

public class boj15649 {
    public static void main(String[] args) {
        //[백준] N과 M (1)
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        int[] result = new int[N];
        boolean[] visited = new boolean[N];

        //1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
        for (int i=0; i<N; i++) {
            arr[i] = i+1;
        }
        permutation(arr, result, visited, 0, N, M);
    }

    static void permutation(int[] arr, int[] result, boolean[] visited, int depth, int N, int M) {
        if (depth == M) {
            for (int i=0; i<M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i=0; i<N; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                result[depth] = arr[i];
                permutation(arr, result, visited, depth+1, N, M);
                visited[i] = false;
            }
        }
    }
}
