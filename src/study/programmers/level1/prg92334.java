package study.programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class prg92334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Set<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> countMap = new HashMap<>();

        for (String singo : report) {
            String[] s = singo.split(" ");
            String s1 = s[0]; // 신고자
            String s2 = s[1]; // 피신고자

            if (!reportMap.containsKey(s1)) {
                reportMap.put(s1, new HashSet<>());
            }
            reportMap.get(s1).add(s2);

        }

        for (Set<String> reported : reportMap.values()) {
            for (String target : reported) {
                countMap.put(target, countMap.getOrDefault(target, 0) + 1);
            }
        }

        for (int i=0; i<id_list.length; i++) {
            String id = id_list[i];
            Set<String> reported = reportMap.get(id);
            if (reported == null) continue;

            for (String target : reported) {
                if (countMap.getOrDefault(target, 0) >= k) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
