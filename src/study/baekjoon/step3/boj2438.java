package study.baekjoon.step3;

import java.util.Scanner;

public class boj2438 {
    public static void main(String[] args) {
        //[백준] 별 찍기 - 1
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        for (int i=1; i<=star; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
