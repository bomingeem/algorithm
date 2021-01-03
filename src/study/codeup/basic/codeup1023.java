package study.codeup.basic;

import java.util.Scanner;

public class codeup1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split("\\.");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
