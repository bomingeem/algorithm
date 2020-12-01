package study.baekjoon.step7;

import java.util.Scanner;

public class Step7_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = scanner.nextInt();
        String strNum = scanner.next();

        for(int i=0; i<num; i++) {
            sum += strNum.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
