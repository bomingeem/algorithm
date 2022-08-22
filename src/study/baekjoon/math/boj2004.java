package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2004 {
    public static void main(String[] args) throws IOException {
        //[백준] 조합 0의 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        /**
         * nCm = (n,m) = n!/(n-m)!m!
         * 2의 승수(a1 - b1 - c1) 와 5의 승수(a2 - b2 - c2)가 구해졌으면 겹치는 개수를 구하면 되므로
         * 2와 5의 승수 중 최솟값을 출력
         */
        long multiplierOfFiveCount = multiplierOfFive(n) - multiplierOfFive(n-m) - multiplierOfFive(m);
        long multiplierOfTwoCount = multiplierOfTwo(n) - multiplierOfTwo(n-m) - multiplierOfTwo(m);

        System.out.println(Math.min(multiplierOfFiveCount, multiplierOfTwoCount));
    }

    public static long multiplierOfFive(long number) {
        int count = 0;
        while (number >= 5) {
            count += number/5;
            number = number/5;
        }
        return count;
    }

    public static long multiplierOfTwo(long number) {
        int count = 0;
        while (number >= 2) {
            count += number/2;
            number = number/2;
        }
        return count;
    }
}
