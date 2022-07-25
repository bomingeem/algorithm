package study.baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2751 {
    public static void main(String[] args) throws IOException {
        //[백준] 수 정렬하기 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2000001];

        for (int i=0; i<N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (int i=0; i<2000001; i++) {
            if (arr[i]) {
                sb.append(i - 1000000).append("\n");
            }
        }
        System.out.println(sb);
    }
}
