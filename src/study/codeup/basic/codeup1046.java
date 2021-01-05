package study.codeup.basic;

import java.util.Scanner;

public class codeup1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        System.out.println(a+b+c);
        double sum = a+b+c;
        System.out.printf("%.1f", sum/3);
    }
}
