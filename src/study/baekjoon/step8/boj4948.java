package study.baekjoon.step8;

import java.util.Scanner;

public class boj4948 {
    static int n;
    static boolean[] prime = new boolean[246913];
    public static void main(String[] args) {
        //[백준] 베르트랑 공준
        Scanner scanner = new Scanner(System.in);
        getPrime();

        while (true) {
            n = scanner.nextInt();
            if (n == 0) break;
            int count = 0;
            for (int i=n+1; i<=2*n; i++) {
                if (!prime[i]) count++;
            }
            System.out.println(count);
        }
    }

    public static void getPrime() {
        prime[1] = true;

        for (int i=2; i<=Math.sqrt(prime.length); i++) {
            for (int j=i*i; j<prime.length; j=j+i) {
                prime[j] = true;
            }
        }
    }
}
