package study.codeup.basic;

import java.util.Scanner;

public class codeup1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int exp = a > b ? b : a;
        System.out.println(exp > c ? c : exp);
    }
}
