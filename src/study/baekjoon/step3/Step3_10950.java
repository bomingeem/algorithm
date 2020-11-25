package study.baekjoon.step3;

import java.util.Scanner;

public class Step3_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        int[] caseArr = new int[caseNum];

        for(int i=0; i<caseNum; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            caseArr[i] = a+b;
        }

        for (int i : caseArr) {
            System.out.println(i);
        }
    }
}
