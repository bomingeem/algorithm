package study.baekjoon.recursion;

import java.io.*;

public class boj2447 {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        //[백준] 별 찍기 - 10
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
        star(0, 0, N, false);

        for (int i=0; i<N; i++) {
            bw.write(arr[i]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void star(int x, int y, int n, boolean blank) {
        //공백칸일 경우
        if (blank) {
            for (int i=x; i<x+n; i++) {
                for (int j=y; j<y+n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = n/3; //블록의 사이즈
        int count = 0; //별 출력 누적
        for (int i=x; i<x+n; i+=size) {
            for (int j=y; j<y+n; j+=size) {
                count++;
                if (count == 5) { //공백칸일 경우
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }
}
