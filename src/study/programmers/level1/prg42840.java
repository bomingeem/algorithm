package study.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class prg42840 {
    //[프로그래머스] 모의고사
    public int[] solution(int[] answers) {
        int[] number1 = {1, 2, 3, 4, 5};
        int[] number2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] number3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == number1[i%number1.length]) {
                count[0]++;
            }
            if (answers[i] == number2[i%number2.length]) {
                count[1]++;
            }
            if (answers[i] == number3[i%number3.length]) {
                count[2]++;
            }
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));

        List<Integer> result = new ArrayList<>();
        if (max == count[0]) {
            result.add(1);
        }
        if (max == count[1]) {
            result.add(2);
        }
        if (max == count[2]) {
            result.add(3);
        }

        int[] answer = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
