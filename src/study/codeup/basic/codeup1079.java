package study.codeup.basic;

import java.util.Scanner;

public class codeup1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        while (true) {
            ch = scanner.next().charAt(0);
            System.out.println(ch);
            if (ch == 'q') {
                break;
            }
        }
    }
}
