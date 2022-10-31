package study.inflearn.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class problem04_04 {
    public static void main(String[] args) throws IOException {
        //[인프런] 모든 아나그램 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();
        System.out.println(solution(S, T));
    }

    public static int solution(String a, String b) {
        int answer = 0;
        Map<Character, Integer> am = new HashMap<>();
        Map<Character, Integer> bm = new HashMap<>();

        for (char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        int L = b.length() - 1;
        for (int i=0; i<L; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt=L; rt<a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if (am.equals(bm)) {
                answer++;
            }
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if (am.get(a.charAt(lt)) == 0) {
                am.remove(a.charAt(lt));
            }
            lt++;
        }
        return answer;
    }
}
