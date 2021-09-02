package study.programmers.kakao;

public class RobotCompleteProduct {
    public static void main(String[] args) {
        //완제품을 만드는 데 필요한 부품의 정보
        int[][] needs = {{1,0,0}, {1,1,0}, {1,1,0}, {1,0,1}, {1,1,0}, {0,1,1}};
        //최대로 구매 가능한 로봇 수
        int r = 2;

        //'needs[x][y]값이 1이면 x번 물건을 만드는데 y번 부품이 필요하다' 의미
        //'needs[x][y]값이 0이면 x번 물건을 만드는데 y번 부품이 필요없다' 의미
        Solution solution = new Solution();
        solution.solution(needs, r);
    }

    static class Solution {
        public int solution(int[][] needs, int r) {
            int answer = 0;
            return answer;
        }
    }
}
