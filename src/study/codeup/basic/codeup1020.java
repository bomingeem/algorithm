package study.codeup.basic;

import java.util.Scanner;

public class codeup1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String[] arr = number.split("-");
        System.out.println(arr[0] + arr[1]);
    }
}
