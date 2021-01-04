package study.codeup.basic;

import java.util.Scanner;

public class codeup1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int number = Integer.valueOf(str, 16);
        String octal = Integer.toOctalString(number);

        System.out.println(octal);
    }
}
