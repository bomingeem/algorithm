package study.baekjoon.graphTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2178 {
    static int N, M;
    static int[][] graph;
    static int[][] visited;
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

    static void BFS(int x, int y) {
        Queue<Coordinate> queue = new LinkedList<>();
        visited[x][y] = 1;
        queue.offer(new Coordinate(x, y));

        while (!queue.isEmpty()) {
            Coordinate coordinate = queue.poll();

            for (int i=0; i<4; i++) {
                int mx = coordinate.x + dx[i];
                int my = coordinate.y + dy[i];

                if (mx >= 0 && mx < N && my >= 0 && my < M) {
                    if (graph[mx][my] == 1 && visited[mx][my] == 0) {
                        queue.offer(new Coordinate(mx, my));
                        //탐색 시, 다음에 밟을 칸에 현재 칸까지의 가중치를 더해주면 된다.
                        //visited[다음칸.x][다음칸.y] = visited[이전칸.x][이전칸.y] + 1;
                        visited[mx][my] = visited[coordinate.x][coordinate.y] + 1;
                    }
                }
            }
        }
    }

    public static class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
