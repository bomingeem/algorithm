package study.codeup.basic;

import java.util.Scanner;

public class codeup1034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int octal = Integer.valueOf(str, 8);
        System.out.println(octal);
    }
}
