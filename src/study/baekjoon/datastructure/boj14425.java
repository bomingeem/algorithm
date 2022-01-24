package study.baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj14425 {
    static int N;
    static int M;
    static int count = 0;
    static String[] arr;
    public static void main(String[] args) throws IOException {
        //[백준] 문자열 집합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new String[N];
        for (int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }

        for (int i=0; i<M; i++) {
            String temp = br.readLine();
            for (int j=0; j<N; j++) {
                if (arr[j].equals(temp)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
