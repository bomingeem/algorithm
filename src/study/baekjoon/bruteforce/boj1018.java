package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj1018 {
    static int N, M;
    static boolean[][] chessBoard;
    static int minimum = 64;
    public static void main(String[] args) {
        //[백준] 체스판 다시 칠하기
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        chessBoard = new boolean[N][M];

        for (int i=0; i<N; i++) {
            String str = scanner.next();
            for (int j=0; j<M; j++) {
                if (str.charAt(j) == 'W') {
                    chessBoard[i][j] = true;
                } else {
                    chessBoard[i][j] = false;
                }
            }
        }

        int row = N-7;
        int col = M-7;

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                find(i, j);
            }
        }
        System.out.println(minimum);
    }

    public static void find(int x, int y) {
        int endX = x + 8;
        int endY = y + 8;
        int count = 0;

        boolean trueOrFalse = chessBoard[x][y];

        for (int i=x; i<endX; i++) {
            for (int j=y; j<endY; j++) {
                if (chessBoard[i][j] != trueOrFalse) {
                    count++;
                }
                trueOrFalse = (!trueOrFalse);
            }
            trueOrFalse = (!trueOrFalse);
        }
        count = Math.min(count, 64-count);
        minimum = Math.min(minimum, count);
    }
}
