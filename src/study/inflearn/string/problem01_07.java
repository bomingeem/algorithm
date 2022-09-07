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
        String answer = "YES";
        str = str.toLowerCase();

        /**
         * 1. 직접 비교를 통한 풀이
         */
        int length = str.length();
        for (int i=0; i<length/2; i++) {
            if (str.charAt(i) != str.charAt(length-i-1)) {
                return "NO";
            }
        }

        /**
         * 2. StringBuilder.reverse()를 통한 풀이
         */
//        String reverseStr = new StringBuilder(str).reverse().toString();
//        if (!str.equals(reverseStr)) {
//            answer = "NO";
//        }
        return answer;
    }
}
