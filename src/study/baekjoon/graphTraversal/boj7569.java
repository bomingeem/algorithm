package study.baekjoon.graphTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj7569 {
    static int M, N, H; //가로, 세로, 높이
    static int[][][] graph;
    static int day = 0;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    public static void main(String[] args) {
        //[백준] 토마토
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();
        H = scanner.nextInt();
        graph = new int[H][N][M];

        for (int i=0; i<H; i++) {
            for (int j=0; j<N; j++) {
                for (int k=0; k<M; k++) {
                    graph[i][j][k] = scanner.nextInt();
                }
            }
        }
        BFS();
    }

    static void BFS() {
        Queue<Position> queue = new LinkedList<Position>();

        for (int i=0; i<H; i++) {
            for (int j=0; j<N; j++) {
                for (int k=0; k<M; k++) {
                    if (graph[i][j][k] == 1) {
                        queue.offer(new Position(i, j, k, day));
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            Position position = queue.poll();
            day = position.day;

            for (int i=0; i<6; i++) {
                int px = position.x + dx[i];
                int py = position.y + dy[i];
                int pz = position.z + dz[i];

                if (px >= 0 && px < N && py >= 0 && py < M && pz >= 0 && pz < H) {
                    if (graph[pz][px][py] == 0) {
                        graph[pz][px][py] = 1;
                        queue.offer(new Position(pz, px, py, day+1));
                    }
                }
            }
        }
        if (checkVariable()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }

    static boolean checkVariable() {
        for (int i=0; i<H; i++) {
            for (int j=0; j<N; j++) {
                for (int k=0; k<M; k++) {
                    if (graph[i][j][k] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static class Position {
        int z;
        int x;
        int y;
        int day;

        public Position(int z, int x, int y, int day) {
            this.z = z;
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
}
