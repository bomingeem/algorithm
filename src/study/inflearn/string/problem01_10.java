package study.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem01_10 {
    public static void main(String[] args) throws IOException {
        //[인프런] 가장 짧은 문자거리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String s = st.nextToken();
        char t = st.nextToken().charAt(0);

        for (int result : solution(s, t)) {
            System.out.print(result + " ");
        }
    }

    public static int[] solution(String str, char ch) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ch) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i=str.length()-1; i>=0; i--) {
            if (str.charAt(i) == ch) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }
}
