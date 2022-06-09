package study.baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj1012 {
    static int T;
    static int M, N, K;
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
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                graph[x][y] = 1;
            }

            int earthworm = 0;
            for (int k=0; k<M; k++) {
                for (int l=0; l<N; l++) {
                    if (graph[k][l] == 1 && !visited[k][l]) {
                        earthworm++;
                        BFS(k, l);
                    }
                }
            }
            System.out.println(earthworm);
        }
    }

    static void BFS(int x, int y) {
        Queue<Cabbage> queue = new LinkedList<>();
        queue.offer(new Cabbage(x, y));
        
        while (!queue.isEmpty()) {
            Cabbage cabbage = queue.poll();
             visited[cabbage.x][cabbage.y] = true;

             for (int i=0; i<4; i++) {
                 int nx = cabbage.x + dx[i];
                 int ny = cabbage.y + dy[i];

                 if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                     if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                         queue.offer(new Cabbage(nx, ny));
                         visited[nx][ny] = true;
                     }
                 }
             }
        }
    }

    public static class Cabbage {
        int x;
        int y;

        public Cabbage(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

