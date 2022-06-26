package study.baekjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10871 {
    public static void main(String[] args) throws IOException {
        //[백준] X보다 작은 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (number < X) {
                sb.append(number).append(" ");
            }
        }

        System.out.println(sb);
    }
}
