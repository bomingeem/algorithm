package study.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj12605 {
    static int N; //전체 케이스의 개수
    public static void main(String[] args) throws IOException {
        //[백준] 단어순서 뒤집기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            String sentence = br.readLine();
            String[] words = sentence.split(" ");
            System.out.print("Case #" + (i+1) + ": ");
            for (int j= words.length-1; j>=0; j--) {
                System.out.print(words[j] + " ");
            }
            System.out.println();
        }
    }
}
