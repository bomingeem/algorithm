package study.codeup.basic;

import java.util.Scanner;

public class codeup1097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[19][19];

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int n = scanner.nextInt();
        int x,y;

        for (int i=0; i<n; i++) {
            x = scanner.nextInt();
            for (int j=0; j<arr.length; j++) {
                if (arr[x-1][j] == 0) {
                    arr[x-1][j] = 1;
                } else {
                    arr[x-1][j] = 0;
                }
            }

            y = scanner.nextInt();
            for (int k=0; k<arr.length; k++) {
                if (arr[k][y-1] == 0) {
                    arr[k][y-1] = 1;
                } else {
                    arr[k][y-1] = 0;
                }
            }

            for (int k=0; k<arr.length; k++) {
                for (int j=0; j<arr.length; j++) {
                    System.out.print(arr[k][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
