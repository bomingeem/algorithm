package study.baekjoon.step2;

import java.util.Scanner;

public class boj2525 {
    public static void main(String[] args) {
        //[백준] 오븐 시계
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        A = A + C/60;
        B = B + C%60;

        if (B > 59) {
            A++;
            B = B - 60;
        }

        if (A > 23) {
            A = A - 24;
        }

        System.out.println(A + " " + B);
    }
}
