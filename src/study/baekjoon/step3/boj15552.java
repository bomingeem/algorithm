package study.baekjoon.step3;

import java.io.*;
import java.util.StringTokenizer;

public class boj15552 {
    public static void main(String[] args) throws IOException {
        //[백준] 빠른 A+B
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
