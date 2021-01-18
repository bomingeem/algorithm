package study.baekjoon.greedyAlgorithm;

import java.util.Scanner;

public class boj11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] coin = new int[n];

        for (int i=0; i<n; i++) {
            coin[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i=n-1; i>=0; i--) {
            if (coin[i] <= k) {
                count = count + (k/coin[i]);
                k = k%coin[i];
            }
        }
        System.out.println(count);
    }
}
