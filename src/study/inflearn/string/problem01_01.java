package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_01 {
    public static void main(String[] args) throws IOException {
        //[인프런] 문자 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toLowerCase();
        char character = br.readLine().toLowerCase().charAt(0);
        System.out.println(solution(word, character));
    }

    public static int solution(String str, char t) {
        int answer = 0;
        for (char ch : str.toCharArray()) {
            if (t == ch) answer++;
        }
        return answer;
    }
}
