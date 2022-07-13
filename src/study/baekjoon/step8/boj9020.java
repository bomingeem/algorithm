package study.baekjoon.step8;

import java.util.Scanner;

public class boj9020 {
    static boolean[] prime = new boolean[10001];
    public static void main(String[] args) {
        //[백준] 골드바흐의 추측
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        getPrime();

        for (int i=0; i<T; i++) {
            int n = scanner.nextInt();
            int p = n/2;
            int q = n/2;

            while (true) {
                if (!prime[p] && !prime[q]) {
                    System.out.println(p + " " + q);
                    break;
                }
                p--;
                q++;
            }
        }
    }

    public static void getPrime() {
        prime[0] = true;
        prime[1] = true;

        for (int i=2; i<=Math.sqrt(prime.length); i++) {
            for (int j=i*i; j<prime.length; j=j+i) {
                prime[j] = true;
            }
        }
    }
}
