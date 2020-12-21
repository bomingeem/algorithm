package study.baekjoon.math;

import java.util.Scanner;

public class boj10872 {
    public static void main(String[] args) {
        //재귀 : 자신을 정의할 때 자기 자신을 재 참조하는 방법
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = factorial(n);
        System.out.println(sum);
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n-1);
    }
}
