package study.codeup.basic;

import java.util.Scanner;

public class codeup1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        String[] arr = date.split("\\.");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
