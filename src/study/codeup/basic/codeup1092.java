package study.codeup.basic;

import java.util.Scanner;

public class codeup1092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean find = true;
        int day = 1;
        while (day%a != 0 || day%b != 0 || day%c != 0) {
            day++;
            if (day >= Integer.MAX_VALUE) {
                find = false;
                break;
            }
        }

        if (find) {
            System.out.println(day);
        }
    }
}
