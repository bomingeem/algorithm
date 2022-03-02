package study.baekjoon.bruteforce;

import java.util.Scanner;

public class boj14889 {
    static int N;
    static int[][] map;
    static boolean[] visited;
    static int minimum = Integer.MAX_VALUE;
    public static void main(String[] args) {
        //[백준] 스타트와 링크
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        map = new int[N][N];
        visited = new boolean[N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        combination(0, 0);
        System.out.println(minimum);
    }

    public static void combination(int index, int depth) {
        if (depth == N/2) {
            int startTeam = 0;
            int linkTeam = 0;

            for (int i=0; i<N-1; i++) {
                for (int j=i+1; j<N; j++) {
                    if (visited[i] && visited[j]) {
                        startTeam += map[i][j];
                        startTeam += map[j][i];
                    } else if (!visited[i] && !visited[j]) {
                        linkTeam += map[i][j];
                        linkTeam += map[j][i];
                    }
                }
            }
            int number = Math.abs(startTeam - linkTeam);

            //두 팀의 점수차가 0이라면 가장 낮은 최소값이기 때문에 더이상의 탐색 없이 0 출력 후 종료
            if (number == 0) {
                System.out.println(number);
                System.exit(0);
            }

            minimum = Math.min(number, minimum);
            return;
        }

        for (int i=index; i<N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(i+1, depth+1);
                visited[i] = false;
            }
        }
    }
}
