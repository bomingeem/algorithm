package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj10974 {
    static int N;
    static int[] arr; //순열을 만들 배열
    static int[] result; //순열을 만든 후 배열
    static boolean[] visited; //방문 체크
    public static void main(String[] args) {
        //[백준] 모든 순열
        //문제에 주어진 보기는 n개 중 n개를 뽑는 경우이다 (= nPn)
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        arr = new int[N];
        result = new int[N];
        visited = new boolean[N];

        for (int i=0; i<N; i++) {
            arr[i] = i+1;
        }

        permutation(arr, result, visited, 0, N, N);
        //int n = 3;
        //int[] arr = {1, 2, 3};
        //permutation(arr, 0, n, 3);
    }

    //1. 순서를 지키면서 n개 중 r개를 뽑는 경우
    static void permutation(int[] arr, int[] result, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(result, r);
            return;
        }

        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                //이미 들어간 값은 visited 값을 true로 바꾸어 중복하여 넣지 않도록 한다.
                visited[i] = true;
                //DFS를 돌면서 모든 index를 방문하여 result에 값을 넣는다.
                result[depth] = arr[i];
                permutation(arr, result, visited, depth+1, n, r);
                visited[i] = false;
            }
        }
    }

    //2. swap을 이용한 순열: 순서를 보장하지 않음
    /*
    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            print(arr, r);
            return;
        }

        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth+1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
    */
    static void print(int[] arr, int r) {
        for (int i=0; i<r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
