package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_05 {
    public static void main(String[] args) throws IOException {
        //[인프런] 특정 문자 뒤집기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(solution(word));
    }

    public static String solution(String str) {
        String answer = "";
        char[] chars = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt < rt) {
            if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }
}
