package study.baekjoon.step7;

import java.util.Scanner;

public class boj2775 {
    public static void main(String[] args) {
        //[백준] 부녀회장이 될테야
        Scanner scanner = new Scanner(System.in);
        int[][] apartment = new int[15][15];

        for (int i=0; i<15; i++) {
            apartment[i][1] = 1;
            apartment[0][i] = i;
        }

        for (int i=1; i<15; i++) {
            for (int j=2; j<15; j++) {
                apartment[i][j] = apartment[i][j-1] + apartment[i-1][j];
            }
        }

        int T = scanner.nextInt();
        for (int i=0; i<T; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(apartment[k][n]);
        }
    }
}
