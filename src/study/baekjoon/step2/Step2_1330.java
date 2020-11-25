package study.baekjoon.step2;

import java.util.Scanner;

public class Step2_1330 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a > b) {
            System.out.print(">");
        } else if(a < b) {
            System.out.print("<");
        } else if (a == b) {
            System.out.print("==");
        }
    }
}
