package study.programmers.level1;

public class prg86491 {
    //[프로그래머스] 최소직사각형
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;
        for (int i=0; i<sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }
        return answer = maxW * maxH;
    }
}
