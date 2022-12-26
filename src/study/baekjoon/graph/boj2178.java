package study.baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2178 {
    static int N, M;
    static int[][] visited;
    static int[][] graph;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        //[백준] 미로탐색
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new int[N][M];

        for (int i=0; i<N; i++) {
            String[] str = br.readLine().split("");
            for (int j=0; j<M; j++) {
                graph[i][j] = Integer.parseInt(str[j]);
            }
        }
        BFS(0, 0);
        System.out.println(visited[N-1][M-1]);
    }

    public static void BFS(int x, int y) {
        Queue<Maze> queue = new LinkedList<>();
        visited[x][y] = 1;
        queue.offer(new Maze(x, y));

        while (!queue.isEmpty()) {
            Maze maze = queue.poll();

            for (int k=0; k<4; k++) {
                int mx = maze.x + dx[k];
                int my = maze.y + dy[k];

                if (mx >= 0 && mx < N && my >= 0 && my < M) {
                    if (graph[mx][my] == 1 && visited[mx][my] == 0) {
                        queue.offer(new Maze(mx, my));
                        visited[mx][my] = visited[maze.x][maze.y] + 1;
                    }
                }
            }
        }
    }

    public static class Maze {
        int x;
        int y;

        public Maze(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
