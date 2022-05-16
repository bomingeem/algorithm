package study.baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj1926 {
    //NOTE: 실수하는 부분
    // 1. 시작점에 방문했다는 표시를 남기지 않는다.
    // 2. 큐에 넣을 때 방문했다는 표시를 하는 대신 큐에서 빼낼 때 방문했다는 표시를 남겼다.
    // 3. 이웃한 원소가 범위를 범어났는지에 대한 체크를 잘못했다.
    static int n, m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int max = 0;
    static int count = 0;
    public static void main(String[] args) {
        //[백준] 그림
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        BFS();
        System.out.println(count);
        System.out.println(max);
    }

    public static void BFS() {
        Queue<Picture> queue = new LinkedList<>();

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (graph[i][j] == 0 || visited[i][j]) continue;
                count++;
                visited[i][j] = true;
                int area = 0;
                queue.offer(new Picture(i, j));

                while (!queue.isEmpty()) {
                    area++;
                    Picture picture = queue.poll();

                    for (int k=0; k<4; k++) {
                        int px = picture.x + dx[k];
                        int py = picture.y + dy[k];

                        if (px < 0 || px >= n || py < 0 || py >= m) continue;
                        if (visited[px][py] || graph[px][py] == 0) continue;
                        visited[px][py] = true;
                        queue.offer(new Picture(px, py));
                    }
                }
                max = Math.max(max, area);
            }
        }
    }

    public static class Picture {
        int x;
        int y;

        public Picture(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
