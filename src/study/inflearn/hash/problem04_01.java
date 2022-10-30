package study.inflearn.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class problem04_01 {
    public static void main(String[] args) throws IOException {
        //[인프런] 학급 회장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String students = br.readLine();

        System.out.println(solution(N, students));
    }

    public static char solution(int n, String s) {
        char answer = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                answer = entry.getKey();
                max = entry.getValue();
            }
        }

        return answer;
    }
}
