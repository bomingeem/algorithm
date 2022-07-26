package study.baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10989 {
    public static void main(String[] args) throws IOException {
        //[백준] 수 정렬하기 3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[10001];

        for (int i=0; i<N; i++) {
            array[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        for (int i=1; i<10001; i++) {
            while (array[i] > 0) {
                sb.append(i).append("\n");
                array[i]--;
            }
        }
        System.out.println(sb);
    }
}
