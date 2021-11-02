package study.baekjoon.math;

import java.util.Scanner;

public class boj1712 {
    public static void main(String[] args) {
        //[백준] 손익분기점
        // n * 상품가격(C) > 고정비용(A) + (n * 가변비용(B))
        // n*C > A + (n*B)
        // (n*C) - (n*B) > A
        // n(C-B) > A
        // n = A/(C-B) + 1
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (C <= B) {
            System.out.println(-1);
        } else {
            System.out.println(A / (C-B) + 1);
        }
    }
}
