package study.programmers.level0;

public class prg136798 {
    public static void main(String[] args) {
        //NOTE: 테스트 11~16,18,24,25 실패 (시간 초과)
        solution(10, 3, 2);
    }

    public static int solution(int number, int limit, int power) {
        int[] knights = new int[number];
        int answer = 0;
        for (int i=0; i<number; i++) {
            int count = 0;
            int divisors = i+1;
            for (int j=1; j<=divisors; j++) {
                if (divisors % j == 0) {
                    count++;
                }
            }
            knights[i] = count;
        }
        for (int knight : knights) {
            if (knight > limit) {
                answer += power;
            } else {
                answer += knight;
            }
        }
        return answer;
    }
}
