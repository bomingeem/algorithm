package study.codeup.basic;

import java.util.Scanner;

public class codeup1089 {
    public static void main(String[] args) {
        //시작값 a
        //등차 d
        //몇번째 n
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int result = a;

        for (int i=1; i<n; i++) {
            result += d;
        }
        System.out.println(result);
    }
}
