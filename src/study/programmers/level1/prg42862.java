package study.programmers.level1;

import java.util.Arrays;

public class prg42862 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
        System.out.println("answer : " + solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for (int i=0; i<lost.length; i++) {
            for (int j=0; j<reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i<lost.length; i++) {
            int lostStudent = lost[i];
            if (lostStudent == -1) continue;
            for (int j=0; j<reserve.length; j++) {
                int before = lostStudent - 1;
                int after = lostStudent + 1;
                if (reserve[j] == before || reserve[j] == after) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
