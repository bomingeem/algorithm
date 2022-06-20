package study.baekjoon.step1;

import java.util.Scanner;

public class boj2588 {
    public static void main(String[] args) {
        //[백준] 곱셈
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(A*(B%10));
        System.out.println(A*((B%100)/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
    }
}
