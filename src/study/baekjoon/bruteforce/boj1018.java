package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj1018 {
    public static boolean[][] chessboard;
    public static int MIN = 64;

    public static void main(String[] args) {
        //[백준] 체스판 다시 칠하기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        chessboard = new boolean[N][M];

        //첫칸이 검은색일 경우의 올바르게 색칠하기 위해 변경되어야 할 색의 개수
        //첫칸이 흰색일 경우의 올바르게 색칠하기 위해 변경되어야 할 색의 개수
        //경우의 수 = 2 X (가로 칸 개수 - 7) X (세로 칸 개수 - 7)
        for (int i=0; i<N; i++) {
            String str = scanner.next();
            for (int j=0; j<M; j++) {
                if (str.charAt(j) == 'W') {
                    //흰색일 때 true
                    chessboard[i][j] = true;
                } else {
                    //검은색일 때 false
                    chessboard[i][j] = false;
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
        System.out.println(MIN);
    }

    public static void find(int x, int y) {
        int endX = x+8;
        int endY = y+8;
        int count = 0;

        boolean TF = chessboard[x][y];

        for (int i=x; i<endX; i++) {
            for (int j=y; j<endY; j++) {
                if (chessboard[i][j] != TF) {
                    count++;
                }

                //다음칸은 색이 바뀌므로 true 라면 false 로, false 라면 true 로 값 변경
                TF = !TF;
            }
            TF = !TF;
        }
        count = Math.min(count, 64-count);
        MIN = Math.min(MIN, count);
    }
}
