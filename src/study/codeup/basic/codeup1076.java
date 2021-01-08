package study.codeup.basic;

import java.util.Scanner;

public class codeup1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = 'a';
        char ch = scanner.next().charAt(0);

        do {
            System.out.println(start);
            start++;
        } while (start <= ch);
    }
}
