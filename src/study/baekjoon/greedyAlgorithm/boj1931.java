package study.baekjoon.greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class boj1931 {
    public static void main(String[] args) {
        //활동 선택 문제
        //(1,4), (5,7), (8,11), (12,14)
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] time = new int[N][2];

        for (int i=0; i<N; i++) {
            time[i][0] = scanner.nextInt(); //시작시간
            time[i][1] = scanner.nextInt(); //종료시간
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int prevEndTime = 0;

        for (int i=0; i<N; i++) {
            if (prevEndTime <= time[i][0]) {
                prevEndTime = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
