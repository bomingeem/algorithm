package study.baekjoon.implementation;

import java.util.Scanner;

public class boj10818 {
    static int N;
    static int min;
    static int max;
    static int number;
    public static void main(String[] args) {
        //[백준] 최소, 최대
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        min = scanner.nextInt();
        max = min;

        for (int i=1; i<N; i++) {
            number = scanner.nextInt();
            min = Math.min(number, min);
            max = Math.max(number, max);
        }
        System.out.println(min + " " + max);
    }
}
