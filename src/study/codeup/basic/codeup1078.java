package study.codeup.basic;

import java.util.Scanner;

public class codeup1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++) {
            if (i%2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
