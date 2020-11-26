package study.baekjoon.step3;

import java.util.Scanner;

public class Step3_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starNum = scanner.nextInt();
        for(int i=0; i<starNum; i++) {
            for(int j=i+1; j<starNum; j++) {
                System.out.print(" ");
            }
            for(int k=starNum-i; k<=starNum; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
