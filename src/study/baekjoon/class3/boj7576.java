package study.baekjoon.class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj7576 {
    static int M; //상자의 가로 칸의 수
    static int N; //상자의 세로 칸의 수
    static int[][] graph;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int day = 0;
    public static void main(String[] args) {
        //[백준] 토마토
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        graph = new int[M][N];

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        BFS();
    }

    public static void BFS() {
        Queue<Position> queue = new LinkedList<Position>();

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (graph[i][j] == 1) {
                    queue.offer(new Position(i, j, 0));
                }
            }
        }

        while (!queue.isEmpty()) {
            Position position = queue.poll();
            day = position.day;

            for (int i=0; i<4; i++) {
                int px = position.x + dx[i];
                int py = position.y + dy[i];

                if (px >= 0 && px < M && py >= 0 && py < N) {
                    if (graph[px][py] == 0) {
                        graph[px][py] = 1;
                        queue.offer(new Position(px, py, day+1));
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

    public static boolean checkVariable() {
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (graph[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static class Position {
        int x;
        int y;
        int day;

        public Position(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
}
