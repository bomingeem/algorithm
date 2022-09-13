package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_12 {
    public static void main(String[] args) throws IOException {
        //[인프런] 암호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String password = br.readLine();
        System.out.println(solution(number, password));
    }

    public static String solution(int n, String str) {
        String answer = "";
        //TODO: 1. 이진수로 변경 2. 10진수화 3. 아스키 번호 65문자화
        for (int i=0; i<n; i++) {
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int number = Integer.parseInt(temp, 2);
            answer += (char)number;
            str = str.substring(7);
        }
        return answer;
    }
}
