package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1676 {
    public static void main(String[] args) throws IOException {
        //[백준] 팩토리얼 0의 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(br.readLine());
         int count = 0;

        /**
         * 뒷자리가 0이 n개 있다는 의미는 2와 5가 n개씩 짝지어 존재한다는 것이다
         * 모든 값들의 소인수 분해들은 2의 개수가 5의 개수보다 많다. 즉, 기본적으로 5의 개수에 따라 값이 변화한다
         */
        while (N >= 5) {
             count += N/5;
             N = N/5;
         }
        System.out.println(count);
    }
}
