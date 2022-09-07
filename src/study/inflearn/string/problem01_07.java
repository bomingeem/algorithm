package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_07 {
    public static void main(String[] args) throws IOException {
        //[인프런] 회문 문자열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(solution(word));
    }

    public static String solution(String str) {
        String answer = "";
        str = str.toLowerCase();
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }
}
