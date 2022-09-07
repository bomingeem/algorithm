package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_08 {
    public static void main(String[] args) throws IOException {
        //[인프런] 유효한 팰린드롬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(solution(word));
    }

    public static String solution(String str) {
        String answer = "";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String temp = new StringBuilder(str).reverse().toString();
        if (str.equals(temp)) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }
}
