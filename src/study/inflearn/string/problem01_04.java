package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class problem01_04 {
    static int N;
    public static void main(String[] args) throws IOException {
        //[인프런] 단어 뒤집기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] stringList = new String[N];

        for (int i=0; i<N; i++) {
            stringList[i] = br.readLine();
        }

        for (String x : solution(stringList)) {
            System.out.println(x);
        }

    }

    public static List<String> solution(String[] str) {
        List<String> answer = new ArrayList<>();
        /**
         * 2. 직접 뒤집는 방법
         */
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            String result = String.valueOf(s);
            answer.add(result);
        }
        /**
         * 1. StringBuilder.reverse()를 이용한 풀이
         */
//        for (String x : str) {
//            String temp = new StringBuilder(x).reverse().toString();
//            answer.add(temp);
//        }
        return answer;
    }
}
