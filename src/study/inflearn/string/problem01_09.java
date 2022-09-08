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

    public static String solution(String str) {
        String answer = str.replaceAll("[^0-9]", "")
                .replaceFirst("^0+(?!$)", "");
        return answer;
    }
}
