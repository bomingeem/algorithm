package study.programmers.level1;

import java.util.Arrays;

public class prg42748 {
    //[프로그래머스] K번째수
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i=0; i<commands.length; i++) {
            /**
             int[] temp = new int[commands[i][1] - commands[i][0] + 1];
             int index = 0;
             for (int j=commands[i][0] - 1; j<commands[i][1]; j++) {
                temp[index] = array[j];
                index++;
             }
             */

            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}
