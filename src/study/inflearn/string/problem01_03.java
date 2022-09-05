package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_03 {
    public static void main(String[] args) throws IOException {
        //[인프런] 문장 속 단어
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        System.out.println(solution(sentence));
    }

    public static String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int pos;

        /**
         * 1. indexOf(), substring()을 이용한 풀이
         */
        while ((pos = str.indexOf(' ')) != -1) {
            String temp = str.substring(0, pos);
            int length = temp.length();
            if (length > max) {
                max = length;
                answer = temp;
            }
            str = str.substring(pos + 1);
        }

        if (str.length() > max) {
            answer = str;
        }

        /**
         * 2. split()을 이용한 풀이
         */
//        String[] stringList = str.split(" ");
//        for (String x : stringList) {
//            int length = x.length();
//            if (length > max) {
//                max = length;
//                answer = x;
//            }
//        }
        return answer;
    }
}
