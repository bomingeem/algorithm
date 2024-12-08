package study.programmers.level2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class prg17680 {
    public static void main(String[] args) {
        //캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용
        //메모리 상에서 가장 최근에 사용된 적이 없는 캐시의 메모리부터 대체하며 새로운 데이터로 갱신 시켜준다
        //cache hit 일 경우 실행시간은 1 (= CPU 가 참조하고자 하는 메모리가 캐시에 존재할 경우)
        //cache miss 일 경우 실행시간은 5 (= CPU 가 참조하고자 하는 메모리가 캐시에 존재하지 않을 경우)
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        Solution solution = new Solution();
        System.out.println(solution.solution(cacheSize, cities));
    }

    static class Solution {
        static final int CACHE_HIT = 1;
        static final int CACHE_MISS = 5;
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;

            if (cacheSize == 0) {
                return cities.length*5;
            }
            LinkedHashSet<String> cache = new LinkedHashSet<>();
            for (int i=0; i< cities.length; i++) {
                String city = cities[i].toUpperCase();

                if(cache.contains(city)) {
                    cache.remove(city);
                    answer += CACHE_HIT;
                } else {
                    if (cache.size() == cacheSize) {
                        Iterator<String> iterator = cache.iterator();
                        iterator.next();
                        iterator.remove();
                    }
                    answer += CACHE_MISS;
                }
                cache.add(city);
            }
            return answer;
        }
    }
}
