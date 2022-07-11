package study.baekjoon.step8;

import java.util.Scanner;

public class boj1978 {
    public static void main(String[] args) {
        //[백준] 소수 찾기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        for (int i=0; i<N; i++) {
            int number = scanner.nextInt();
            boolean prime = isPrime(number);
            if (prime) count++;
        }
        System.out.println(count);
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
