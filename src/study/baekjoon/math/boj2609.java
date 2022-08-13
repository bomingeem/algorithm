package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2609 {
    public static void main(String[] args) throws IOException {
        //[백준] 최대공약수와 최대공배수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(GCD(a, b));
        System.out.println((a*b)/GCD(a, b));
    }

    /**
     * 두 수 A,B의 최대공약수를 G, 최소공배수를 L 이라고 하면 다음 식이 성립한다
     * AB = LG
     * 유클리드 호제법: A를 B로 나눈 몫을 Q라 하고, 나머지를 R이라 하자. 이 때 GCD(A,B) = GCD(B,R)
     */
    public static int GCD(int a, int b) {
        while (b != 0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
