package study.programmers.level0;

public class prg136798 {
    public static void main(String[] args) {
        // 1번째 방법 풀이 시 number = 10000 → 84 소요
        // 2번째 방법 풀이 시 number = 10000 → 6 소요
        solution(10, 3, 2);
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i=0; i<number; i++) {
            int count = 0;
            int divisors = i+1;
            for (int j=1; j*j<=divisors; j++) {
                if (j*j == divisors) {
                    count++;
                } else if (divisors % j == 0) {
                    count += 2;
                }
            }
            if (count > limit) {
                count = power;
            }
            answer += count;
        }
        return answer;
    }
}
