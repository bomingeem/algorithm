package study.baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj7569 {
    static int M, N, H;
    static int[][][] graph;
    static int day = 0;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        //[백준] 토마토
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        graph = new int[H][N][M];

        for (int i=0; i<H; i++) {
            for (int j=0; j<N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k=0; k<M; k++) {
                    graph[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
        BFS();
    }

    public static void BFS() {
        Queue<Tomato> queue = new LinkedList<>();

        for (int i=0; i<H; i++) {
            for (int j=0; j<N; j++) {
                for (int k=0; k<M; k++) {
                    if (graph[i][j][k] == 1) {
                        queue.offer(new Tomato(i, j, k, day));
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            day = tomato.day;

            for (int i=0; i<6; i++) {
                int tx = tomato.x + dx[i];
                int ty = tomato.y + dy[i];
                int tz = tomato.z + dz[i];

                if (tx >= 0 && tx < N && ty >= 0 && ty < M && tz >= 0 && tz < H) {
                    if (graph[tz][tx][ty] == 0) {
                        graph[tz][tx][ty] = 1;
                        queue.offer(new Tomato(tz, tx, ty, day+1));
                    }
                }
            }
        }

        if (checkAllTomato()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }

    public static boolean checkAllTomato() {
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

    public static class Tomato {
        int x;
        int y;
        int z;
        int day;

        public Tomato(int z, int x, int y, int day) {
            this.z = z;
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
}
