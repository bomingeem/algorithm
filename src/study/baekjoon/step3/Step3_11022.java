package study.baekjoon.step3;

import java.util.Scanner;

public class Step3_11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();

        for(int i=0; i<caseNum; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = a+b;

            System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+sum);
        }
    }
}
