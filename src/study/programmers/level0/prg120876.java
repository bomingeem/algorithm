package study.programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class prg120876 {
    public static void main(String[] args) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        // -100 ≤ a < b ≤ 100
        // int[] count = new int[201];
        /**
             int[][] lines = {{0,1}, {2,5}, {3,9}};
             int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};
             int[][] lines = {{0,5}, {3,9}, {1,10}};
         */
        int[][] lines = {{0,1}, {2,5}, {3,9}};
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
                // count[j]++;
            }
        }

        // for (int i : count) {
            // if (i > 1 ) {
                // answer++;
            // }
        // }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                answer++;
            }
        }
        System.out.println(answer);
    }

}
