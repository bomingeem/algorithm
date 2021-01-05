package study.codeup.basic;

import java.util.Scanner;

public class codeup1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        double doubleA = (double)a;
        System.out.printf("%.2f", doubleA/b);
    }
}
