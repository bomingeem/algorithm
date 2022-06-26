package study.baekjoon.step3;

import java.util.Scanner;

public class boj2439 {
    public static void main(String[] args) {
        //[백준] 별 찍기 - 2
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N-i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
