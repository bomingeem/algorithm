package study.codeup.basic;

import java.util.Scanner;

public class codeup1056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a == 1 && b == 0) || (a == 0 && b == 1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
