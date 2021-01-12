package study.codeup.basic;

import java.util.Scanner;

public class codeup1086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int b = scanner.nextInt();
        double total = w*h*b;

        double result = ((total/8)/Math.pow(2, 10)/Math.pow(2, 10));
        System.out.format("%.2f MB", result);
    }
}
