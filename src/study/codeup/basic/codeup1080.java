package study.codeup.basic;

import java.util.Scanner;

public class codeup1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++) {
            sum = sum+i;
            if (sum >= n) {
                System.out.println(i);
                break;
            }
        }
    }
}
