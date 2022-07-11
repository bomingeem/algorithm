package study.baekjoon.step8;

import java.util.Scanner;

public class boj2581 {
    static boolean[] primes;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        //[백준] 소수
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        primes = new boolean[N+1];
        int sum = 0;
        getPrime();

        for (int i=M; i<=N; i++) {
            if (primes[i] == false) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static void getPrime() {
        primes[0] = true;
        primes[1] = true;

        // 에라토스테네스의 체: k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다.
        for (int i=2; i<=Math.sqrt(primes.length); i++) {
            for (int j=i*i; j<primes.length; j=j+i) {
                primes[j] = true;
            }
        }
    }
}
