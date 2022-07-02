package study.baekjoon.step6;

import java.util.Scanner;

public class boj2675 {
    public static void main(String[] args) {
        //[백준] 문자열 반복
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();


        for (int i=0; i<T; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();

            for (int j=0; j<S.length(); j++) {
                for (int k=0; k<R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
