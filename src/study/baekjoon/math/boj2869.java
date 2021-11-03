package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2869 {
    public static void main(String[] args) throws IOException {
        //[백준] 달팽이는 올라가고 싶다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); //낮에 A미터 올라갈 수 있다
        int B = Integer.parseInt(st.nextToken()); //밤에 B미터 미끄러진다
        int V = Integer.parseInt(st.nextToken()); //V미터 나무 막대
        int sum = 0;

        int day = (V - B) / (A - B);
        //잔여 블럭이 있을 경우
        if ((V - B) % (A - B) != 0) {
            day++;
        }

        //시간초과 풀이
        /*
        while (true) {
            day++;
            sum += A;
            if (sum >= V) {
                break;
            }
            sum -= B;
        }
        */
        System.out.println(day);
    }
}
