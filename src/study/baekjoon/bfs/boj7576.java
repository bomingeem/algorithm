package study.baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj7576 {
    static int M, N;
    static int[][] graph;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        //[백준] 토마토
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[M][N];

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        BFS();
    }

    public static void BFS() {
        Queue<Tomato> queue = new LinkedList<>();
        int day = 0;

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (graph[i][j] == 1) {
                    queue.offer(new Tomato(i, j, 0));
                }
            }
        }

        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            day = tomato.day;

            for (int i=0; i<4; i++) {
                int tx = tomato.x + dx[i];
                int ty = tomato.y + dy[i];

                if (tx >= 0 && tx < M && ty >= 0 && ty < N) {
                    if (graph[tx][ty] == 0) {
                        graph[tx][ty] = 1;
                        queue.offer(new Tomato(tx, ty, day+1));
                    }
                }
            }
        }
        System.out.println(checkAllTomato() ? day : -1);
    }

    public static class Tomato {
        int x;
        int y;
        int day;

        public Tomato(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    public static boolean checkAllTomato() {
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (graph[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
