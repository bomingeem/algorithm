package study.baekjoon.step3;

import java.util.Scanner;

public class boj10952 {
    public static void main(String[] args) {
        //[백준] A+B - 5
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (A == 0 && B == 0) {
                break;
            }
            System.out.println(A+B);
        }
    }
}
