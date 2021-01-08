package study.codeup.basic;

import java.util.Scanner;

public class codeup1073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        while (n != 0) {
            int num = scanner.nextInt();
            if (num == 0) break;
            System.out.println(num);
        }
    }
}
