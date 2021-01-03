package study.codeup.basic;

import java.util.Scanner;

public class codeup1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] arr = str.split(":");
        int minute = Integer.parseInt(arr[1]);

        if (minute <= 9) {
            System.out.printf("%1d", minute);
        } else {
            System.out.printf("%d", minute);
        }
    }
}
