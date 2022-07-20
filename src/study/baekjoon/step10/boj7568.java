package study.baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj7568 {
    static int[][] bulk;
    public static void main(String[] args) throws IOException {
        //[백준] 덩치
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        bulk = new int[N][2];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            bulk[i][0] = Integer.parseInt(st.nextToken());
            bulk[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<N; i++) {
            int score = 1;
            for (int j=0; j<N; j++) {
                if (i == j) continue;
                if (bulk[i][0] < bulk[j][0] && bulk[i][1] < bulk[j][1]) {
                    score++;
                }
            }
            System.out.print(score + " ");
        }
    }
}
