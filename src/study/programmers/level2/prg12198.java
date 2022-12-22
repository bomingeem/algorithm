package study.programmers.level2;

import java.util.Arrays;

public class prg12198 {
    //[프로그래머스] 가장 큰 수
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];

        for (int i=0; i<numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (a, b) -> (b+a).compareTo(a+b));

        if (str[0].equals("0")) {
            return "0";
        }

        for (String s : str) {
            answer += s;
        }
        return answer;
    }
}
