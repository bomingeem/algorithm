package study.baekjoon.dp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj9465 {
    public static void main(String[] args) {
        //[백준] 스티커
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i=0; i<T; i++) {
            int n = scanner.nextInt();
            int[][] arr = new int[2][n+1];
            int[][] dp = new int[2][n+1];
            for (int j = 0; j < 2; j++) { //초기화
                for (int k = 1; k <= n; k++) {
                    arr[j][k] = scanner.nextInt();
                }
            }

            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];

            for (int k=2; k<=n; k++) {
                dp[0][k] = Math.max(dp[1][k-1], dp[1][k-2]) + arr[0][k];
                dp[1][k] = Math.max(dp[0][k-1], dp[0][k-2]) + arr[1][k];
            }
            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}
