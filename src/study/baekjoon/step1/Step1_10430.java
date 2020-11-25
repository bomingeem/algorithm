package study.baekjoon.step1;

import java.util.Scanner;

public class Step1_10430 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
