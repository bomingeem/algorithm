package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_09 {
    public static void main(String[] args) throws IOException {
        //[인프런] 숫자만 추출
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(solution(word));
    }

    public static int solution(String str) {
        // '0'(48) ~ '9'(57)
        // String answer = str.replaceAll("[^0-9]", "").replaceFirst("^0+(?!$)", "");
        String answer = "";
        for (char ch : str.toCharArray()) {
            /**
             * 1. ASCII Number 를 이용한 풀이
             */
//            if (ch >= 48 && ch <= 57) {
//                answer = answer*10 + (ch - 48);
//            }

            /**
             * 2. Character.isDigit() 를 이용한 풀이
             */
            if (Character.isDigit(ch)) answer += ch;
        }

        return Integer.parseInt(answer);
    }
}
