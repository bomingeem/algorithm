package study.baekjoon.step1;

import java.util.Scanner;

public class Step1_2588 {
    public static void main(String[] args) {
        int a = 472;
        int b = 385;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a * ((b%100)%10));
        System.out.println(a * ((b%100)/10));
        System.out.println(a * (b/100));
        System.out.println(a * b);
    }
}
