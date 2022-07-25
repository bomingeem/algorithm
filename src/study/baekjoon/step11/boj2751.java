package study.baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class boj2751 {
    public static void main(String[] args) throws IOException {
        //[백준] 수 정렬하기 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<Integer> integers = new ArrayList<>();

        for (int i=0; i<N; i++) {
            integers.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(integers);

        for (Integer number : integers) {
            sb.append(number).append("\n");
        }

        System.out.println(sb);
    }
}
