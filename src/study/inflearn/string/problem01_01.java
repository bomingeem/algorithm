package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_01 {
    public static void main(String[] args) throws IOException {
        //[인프런] 문자 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String word = br.readLine().toLowerCase();
        char character = br.readLine().toLowerCase().charAt(0);
        for (char ch : word.toCharArray()) {
            if (character == ch) count++;
        }
        System.out.println(count);
    }
}
