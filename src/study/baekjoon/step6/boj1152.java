package study.baekjoon.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1152 {
    public static void main(String[] args) throws IOException {
        //[백준] 단어의 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        StringTokenizer st = new StringTokenizer(sentence, " ");
        System.out.println(st.countTokens());
    }
}
