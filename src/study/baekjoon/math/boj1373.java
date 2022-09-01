package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1373 {
    public static void main(String[] args) throws IOException {
        //[백준] 2진수 8진수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String binary = br.readLine();

        if (binary.length()%3 == 1) {
            sb.append(binary.charAt(0));
        }

        if (binary.length()%3 == 2) {
            sb.append((binary.charAt(0) - '0')*2 + (binary.charAt(1) - '0'));
        }

        for (int i=binary.length()%3; i<binary.length(); i+=3) {
            sb.append((binary.charAt(i) - '0')*4 + (binary.charAt(i+1) - '0')*2 + (binary.charAt(i+2) - '0'));
        }
        System.out.println(sb);
    }
}
