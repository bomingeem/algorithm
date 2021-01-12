package study.codeup.basic;

import java.util.Scanner;

public class codeup1085 {
    public static void main(String[] args) {
        //8 bit(비트)             = 1byte(바이트)
        //1024 Byte(2의10승 byte) = 1KB(킬로 바이트)
        //1024 KB(2의10승 KB)     = 1MB(메가 바이트)
        Scanner scanner = new Scanner(System.in);
        long h = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long s = scanner.nextLong();

        double total = h*b*c*s;

        double result = ((total/8)/Math.pow(2, 10)/Math.pow(2, 10));
        System.out.format("%.1f MB", result);
    }
}
