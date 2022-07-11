package study.baekjoon.step8;

import java.util.Scanner;

public class boj2581 {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        //[백준] 소수
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int sum = 0;

        for (int i=M; i<=N; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }
        System.out.println(sum == 0 ? -1 : sum);
        if (sum != 0) {
            System.out.println(min);
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i=2; i<=Math.sqrt(number); i++) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }
}
