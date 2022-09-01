package study.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1212 {
    public static void main(String[] args) throws IOException {
        //[백준] 8진수 2진수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String octal = br.readLine();

        for (int i=0; i<octal.length(); i++) {
            String binaryString = Integer.toBinaryString(octal.charAt(i) - '0');
            if (binaryString.length() == 2 && i != 0) {
                binaryString = "0" + binaryString;
            } else if (binaryString.length() == 1 && i != 0) {
                binaryString = "00" + binaryString;
            }
            sb.append(binaryString);
        }
        System.out.println(sb);
    }
}
