package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_02 {
    public static void main(String[] args) throws IOException {
        //[인프런] 대소문자 변환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //StuDY
        String word = br.readLine();
        System.out.println(solution(word));
    }

    public static String solution(String str) {
        /**
         * 대문자 ASCII 넘버: 65~90
         * 소문자 ASCII 넘버: 97~122
         */
        String answer = "";
        for (char ch : str.toCharArray()) {
            if (ch >= 97 && ch <= 122) {
                answer += (char)(ch-32);
            } else {
                answer += (char)(ch+32);
            }
        }
        return answer;
    }
}
