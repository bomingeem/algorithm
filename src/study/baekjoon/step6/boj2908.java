package study.baekjoon.step6;

import java.util.Scanner;

public class boj2908 {
    public static void main(String[] args) {
        //[백준] 상수
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        A = Integer.parseInt(String.valueOf(new StringBuilder().append(A).reverse()));
        B = Integer.parseInt(String.valueOf(new StringBuilder().append(B).reverse()));

        System.out.println(A > B ? A : B);
    }
}
