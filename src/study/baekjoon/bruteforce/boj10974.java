package study.baekjoon.bruteforce;


import java.util.Scanner;

public class boj10974 {
    static int N;
    static int[] arr;
    static int[] output;
    static boolean[] visited;
    public static void main(String[] args) {
        //[백준] 모든 순열
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        arr = new int[N];
        output = new int[N];
        visited = new boolean[N];

        for (int i=0; i<N; i++) {
            arr[i] = i+1;
        }

        permutation(arr, output, visited, 0, N, N);
    }

    public static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            for (int i=0; i<N; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i=0; i<N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth+1, n, r);
                visited[i] = false;
            }
        }
    }
}
