package study.codeup.basic;

import java.util.Scanner;

public class codeup1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        String[] arr = date.split("\\.");
        int year = Integer.valueOf(arr[0]);
        int month = Integer.valueOf(arr[1]);
        int day = Integer.valueOf(arr[2]);

        System.out.printf("%04d.%02d.%02d", year,month,day);
    }
}
