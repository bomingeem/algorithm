package study.baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2869 {
    public static void main(String[] args) throws IOException {
        //[백준] 달팽이는 올라가고 싶다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
