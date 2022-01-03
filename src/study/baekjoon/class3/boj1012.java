package study.baekjoon.class3;

import java.util.Scanner;

public class boj1012 {
    static int T;
    static int M; //배추밭의 가로길이
    static int N; //배추밭의 세로길이
    static int K; //배추가 심어져 있는 위치의 개수
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) {
        //[백준] 유기농 배추
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        for (int i=0; i<T; i++) {
            M = scanner.nextInt();
            N = scanner.nextInt();
            K = scanner.nextInt();

            graph = new int[M][N];
            visited = new boolean[M][N];

            for (int j=0; j<K; j++) {
                int X = scanner.nextInt();
                int Y = scanner.nextInt();
                graph[X][Y] = 1;
            }

            int count = 0;
            for (int k=0; k<M; k++) {
                for (int l=0; l<N; l++) {
                    if (graph[k][l] == 1 && !visited[k][l]) {
                        count++;
                        DFS(k, l);
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void DFS(int x, int y) {
        visited[x][y] = true;

        for (int i=0; i<4; i++) {
            int px = x + dx[i];
            int py = y + dy[i];

            if (px >= 0 && px < M && py >= 0 && py < N) {
                if (graph[px][py] == 1 && !visited[px][py]) {
                    DFS(px, py);
                }
            }
        }
    }
}
