package study.baekjoon.step3;

import java.util.Scanner;

public class Step3_2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starNum = scanner.nextInt();
        for(int i=1; i<=starNum; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
