package study.codeup.basic;

import java.util.Scanner;

public class codeup1096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[19][19];

        for (int i=0; i<n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int j=0; j<arr.length; j++) {
                for (int k=0; k<arr.length; k++) {
                    arr[x-1][y-1] = 1;
                }
            }
        }

        for (int i=0; i<20; i++) {
            for (int j=0; j<20; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
