package study.codeup.basic;

import java.util.Scanner;

public class codeup1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
