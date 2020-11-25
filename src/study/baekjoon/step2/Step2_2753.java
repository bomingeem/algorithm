package study.baekjoon.step2;

import java.util.Scanner;

public class Step2_2753 {
    public static void main(String[] args) {
        int yoonYear;

        Scanner scanner = new Scanner(System.in);

        yoonYear = scanner.nextInt();

        if(((yoonYear%4 == 0) && (yoonYear%100 != 0)) || (yoonYear%400 == 0)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
