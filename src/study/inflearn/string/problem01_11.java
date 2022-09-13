package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_11 {
    public static void main(String[] args) throws IOException {
        //[인프런] 문자열 압축
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(solution(word));
    }

    public static String solution(String str) {
        String answer = "";
        str += " ";
        int count = 1;
        for (int i=0; i<str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                answer += str.charAt(i);
                if (count > 1) {
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }
        return answer;
    }
}
