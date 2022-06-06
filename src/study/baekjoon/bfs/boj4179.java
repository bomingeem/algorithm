package study.baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class boj4179 {
    static int R, C;
    static char[][] graph;
    static Queue<Point> queue = new LinkedList<>();
    static Point jihoon;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        //[백준] 불!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        R = Integer.parseInt(str[0]);
        C = Integer.parseInt(str[1]);
        graph = new char[R][C];
        visited = new boolean[R][C];

        for (int i=0; i<R; i++) {
            str = br.readLine().split("");
            for (int j=0; j<C; j++) {
                graph[i][j] =  str[j].charAt(0);

                if (graph[i][j] == 'J') {
                    graph[i][j] = '.'; //지훈이가 이동했으니 지나갈 수 있는 공간으로 만든다.
                    jihoon = new Point(i, j, 0, 0); //지훈이의 type: 0
                } else if (graph[i][j] == 'F') {
                    queue.offer(new Point(i, j, 1, 0)); //불의 type: 1, 불의 경우 지훈이보다 먼저 queue 에 추가한다.
                }
            }
        }
        BFS(queue);
    }

    public static void BFS(Queue<Point> queue) {
        queue.offer(jihoon);
        visited[jihoon.x][jihoon.y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.x;
            int y = point.y;
            int count = point.count;

            //종료 조건: 지훈이가 가장자리일 경우 종료
            if (isEdge(x, y) && point.type == 0) {
                System.out.println(count + 1);
                return;
            }

            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (!isRange(nx, ny) || graph[nx][ny] == '#' || graph[nx][ny] == 'F') {
                    continue;
                }

                if (point.type == 0 && !visited[nx][ny]) {
                    queue.offer(new Point(nx, ny, point.type, count+1));
                    visited[nx][ny] = true;
                } else if (point.type == 1) {
                    graph[nx][ny] = 'F';
                    queue.offer(new Point(nx, ny, point.type, count+1));
                }
            }
        }
        System.out.println("IMPOSSIBLE");
    }

    public static boolean isEdge(int x, int y) {
        for (int i=0; i<4; i++) {
            int ex = x + dx[i];
            int ey = y + dy[i];

            if (!isRange(ex, ey)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < R && y >= 0 && y < C) {
            return true;
        }
        return false;
    }

    public static class Point {
        int x;
        int y;
        int type;
        int count;

        public Point(int x, int y, int type, int count) {
            this.x = x;
            this.y = y;
            this.type = type;
            this.count = count;
        }
    }
}
