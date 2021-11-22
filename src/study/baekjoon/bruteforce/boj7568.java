package study.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj7568 {
    public static void main(String[] args) throws IOException {
        //[백준] 덩치
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] bulks = new int[N][2];

        String[] separatedNumbers;
        for (int i=0; i<N; i++) {
            separatedNumbers = br.readLine().split(" ");
            bulks[i][0] = Integer.parseInt(separatedNumbers[0]);
            bulks[i][1] = Integer.parseInt(separatedNumbers[1]);
        }

        for (int i=0; i<N; i++) {
            int rank = 1;
            for (int j=0; j<N; j++) {
                //같은건 굳이 비교할 필요가 없다.
                if (i == j) continue;
                if (bulks[i][0] < bulks[j][0] && bulks[i][1] < bulks[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
